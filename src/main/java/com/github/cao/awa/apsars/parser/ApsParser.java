package com.github.cao.awa.apsars.parser;

import com.github.cao.awa.apricot.util.collection.ApricotCollectionFactor;
import com.github.cao.awa.apsars.element.ApsElementType;
import com.github.cao.awa.apsars.parser.clazz.ApsClassParser;
import com.github.cao.awa.apsars.parser.clazz.ApsMemberParameterParser;
import com.github.cao.awa.apsars.parser.method.ApsMethodExtraParser;
import com.github.cao.awa.apsars.parser.method.ApsMethodParamParser;
import com.github.cao.awa.apsars.parser.method.ApsMethodParser;
import com.github.cao.awa.apsars.parser.method.statement.ApsCatchListParser;
import com.github.cao.awa.apsars.parser.method.statement.ApsMethodBodyParser;
import com.github.cao.awa.apsars.parser.method.statement.ApsMethodExtraCatchParser;
import com.github.cao.awa.apsars.parser.token.ApsTokens;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.catheter.pair.Pair;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.Stack;

@Accessors(fluent = true)
public abstract class ApsParser<T extends ApsAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsParser");
    private static final Map<ApsElementType, ApsParser<?>> elementParsers = Manipulate.operation(ApricotCollectionFactor.hashMap(), map -> {
        map.put(ApsElementType.FILE, new ApsFileParser());
        map.put(ApsElementType.KEYWORD_CLASS, new ApsClassParser());
        map.put(ApsElementType.MEMBER_PARAMETER, new ApsMemberParameterParser());
        map.put(ApsElementType.METHOD, new ApsMethodParser());
        map.put(ApsElementType.METHOD_PARAM, new ApsMethodParamParser());
        map.put(ApsElementType.METHOD_BODY, new ApsMethodBodyParser());
        map.put(ApsElementType.METHOD_EXTRA, new ApsMethodExtraParser());
        map.put(ApsElementType.METHOD_EXTRA_CATCH, new ApsMethodExtraCatchParser());
        map.put(ApsElementType.CATCH_LIST, new ApsCatchListParser());
    });
    private String codes;
    @Getter
    @Setter
    private int feedbackSkip = 0;
    @Getter
    @Setter
    private int stripedSkip = 0;

    public static ApsParser<?> parser(ApsElementType type) {
        return elementParsers.get(type);
    }

    public void reset(String codes) {
        this.feedbackSkip = 0;
        this.stripedSkip = 0;
        this.codes = codes;
    }

    public void accumulateFeedbackSkip(int length) {
        this.feedbackSkip += length;
    }

    public String codes() {
        return this.codes;
    }

    public abstract boolean canTryProcess(String codes);

    public void parse(String codes, T ast) {
        reset(codes);
        stripCodes();
        parse(ast);
    }

    public abstract void parse(T ast);

    public Pair<Integer, Boolean> findClosureBraces(boolean reserved) {
        stripCodes();

        if (this.codes.isEmpty()) {
            return new Pair<>(-1, true);
        }

        int curIndex = 0;
        String starter = this.codes.substring(curIndex++, curIndex);

        Stack<String> stacking = ApricotCollectionFactor.stack();
        stacking.push(starter);

        int codesLength = this.codes.length();
        while (curIndex < codesLength) {
            String curToken = this.codes.substring(curIndex, curIndex + 1);
            String brace = ApsTokens.BRACES.get(curToken);
            if (brace != null) {
                stacking.push(curToken);
            }

            String reverseBrace = ApsTokens.REVERSE_BRACES.get(curToken);
            if (reverseBrace != null && reverseBrace.equals(stacking.peek())) {
                stacking.pop();
            } else if (reverseBrace != null) {
                LOGGER.warn("Error brace happened");
                return new Pair<>(curIndex, true);
            }

            curIndex++;

            if (stacking.isEmpty()) {
                break;
            }
        }

        if (!stacking.isEmpty()) {
            LOGGER.warn("Error brace happened");
            return new Pair<>(curIndex, true);
        }

        return new Pair<>(reserved ? curIndex - 1 : curIndex, false);
    }

    public Pair<Integer, Boolean> findNext(String delimiter, boolean reserved) {
        int result = this.codes.indexOf(delimiter);
        if (result != -1) {
            return new Pair<>(reserved ? result - 1 : result, false);
        } else {
            return new Pair<>(-1, true);
        }
    }

    public Pair<String, Boolean> nextToken(String delimiter, boolean wantEnding) {
        stripCodes();

        if (delimiter.isEmpty()) {
            return new Pair<>(this.codes, false);
        }

        int delimiterIndex = this.codes.indexOf(delimiter);
        if (delimiterIndex != -1) {
            String token = this.codes.substring(0, delimiterIndex);

            return new Pair<>(token, false);
        } else {
            if (wantEnding) {
                return new Pair<>(this.codes, false);
            }
            return new Pair<>(null, true);
        }
    }

    public Pair<String, Boolean> nextToken(List<String> delimiters, boolean wantEnding) {
        List<Pair<String, Boolean>> founds = ApricotCollectionFactor.arrayList();

        for (String delimiter : delimiters.stream().distinct().toList()) {
            Pair<String, Boolean> nextToken = nextToken(delimiter, wantEnding);
            if (!nextToken.second()) {
                founds.add(nextToken);
            }
        }

        if (!founds.isEmpty()) {
            Pair<String, Boolean> result = founds.getFirst();
            int maxDistance = result.first().length();
            for (Pair<String, Boolean> found : founds) {
                int distance = found.first().length();
                if (distance < maxDistance) {
                    maxDistance = distance;
                    result = found;
                }
            }
            return result;
        }

        return new Pair<>(null, true);
    }

    public void stripCodes() {
        int oldLength = this.codes.length();
        this.codes = this.codes.strip().stripIndent().stripLeading().stripTrailing().replaceAll("\n", "").replaceAll("\r", "");
        this.stripedSkip += oldLength - this.codes.length();
    }

    public void skip(int length) {
        if (length > this.codes.length()) {
            this.codes = "";
            return;
        }
        substring(length, this.codes.length());
    }

    public void skipAndFeedback(int length) {
        skip(length);
        accumulateFeedbackSkip(length);
    }

    public String makeSubstring(int start, int end) {
        return this.codes.substring(start, end);
    }

    public void substring(int start, int end) {
        this.codes = makeSubstring(start, end);
    }

    public boolean readable() {
        return !this.codes.isEmpty();
    }

    public boolean startWith(String target) {
        stripCodes();

        return this.codes.startsWith(target);
    }
}
