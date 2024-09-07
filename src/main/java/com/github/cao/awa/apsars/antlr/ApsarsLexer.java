// Generated from D:/Codes/Java/Apsars/grammar/Apsars.g4 by ANTLR 4.13.1
package com.github.cao.awa.apsars.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ApsarsLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            Public = 1, Private = 2, Protected = 3, Final = 4, Val = 5, Unique = 6, Let = 7, Package = 8,
            Import = 9, Static = 10, Class = 11, Return = 12, Transient = 13, Volatile = 14, Holder = 15,
            HolderGet = 16, HolderSet = 17, Overridable = 18, Sync = 19, Synchronized = 20,
            Identifier = 21, FullName = 22, Number = 23, LeftBrace = 24, RightBrace = 25, LeftAngleBracket = 26,
            RightAngleBracket = 27, LeftBracket = 28, RightBracket = 29, LeftParenthesis = 30,
            RightParenthesis = 31, Colon = 32, Semicolon = 33, Comma = 34, Equals = 35, Equal = 36,
            LeftEquals = 37, As = 38, AndSign = 39, OrSign = 40, ArgAnd = 41, ArgOr = 42, WordAnd = 43,
            WordOr = 44, WHITESPACES = 45;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "Public", "Private", "Protected", "Final", "Val", "Unique", "Let", "Package",
                "Import", "Static", "Class", "Return", "Transient", "Volatile", "Holder",
                "HolderGet", "HolderSet", "Overridable", "Sync", "Synchronized", "Identifier",
                "FullName", "Number", "LeftBrace", "RightBrace", "LeftAngleBracket",
                "RightAngleBracket", "LeftBracket", "RightBracket", "LeftParenthesis",
                "RightParenthesis", "Colon", "Semicolon", "Comma", "Equals", "Equal",
                "LeftEquals", "As", "AndSign", "OrSign", "ArgAnd", "ArgOr", "WordAnd",
                "WordOr", "WHITESPACES"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'public'", "'private'", "'protected'", "'final'", "'val'", "'unique'",
                "'let'", "'package'", "'import'", "'static'", "'class'", "'return'",
                "'transient'", "'volatile'", "'holder'", "'holder-get'", "'holder-set'",
                "'overridable'", "'sync'", "'synchronized'", null, null, null, "'{'",
                "'}'", "'<'", "'>'", "'['", "']'", "'('", "')'", "':'", "';'", "','",
                "'=='", "'='", "'<-'", "' as '", "'&'", "'|'", "' and '", "' or '", "'and'",
                "'or'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "Public", "Private", "Protected", "Final", "Val", "Unique", "Let",
                "Package", "Import", "Static", "Class", "Return", "Transient", "Volatile",
                "Holder", "HolderGet", "HolderSet", "Overridable", "Sync", "Synchronized",
                "Identifier", "FullName", "Number", "LeftBrace", "RightBrace", "LeftAngleBracket",
                "RightAngleBracket", "LeftBracket", "RightBracket", "LeftParenthesis",
                "RightParenthesis", "Colon", "Semicolon", "Comma", "Equals", "Equal",
                "LeftEquals", "As", "AndSign", "OrSign", "ArgAnd", "ArgOr", "WordAnd",
                "WordOr", "WHITESPACES"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }


    public ApsarsLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Apsars.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\u0004\u0000-\u0154\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
                    "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
                    "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
                    "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
                    "\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002" +
                    "\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002" +
                    "\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002" +
                    "\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002" +
                    "\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002" +
                    "\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002" +
                    "\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007" +
                    "!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007" +
                    "&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007" +
                    "+\u0002,\u0007,\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001" +
                    "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001" +
                    "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
                    "\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001" +
                    "\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001" +
                    "\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b" +
                    "\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001" +
                    "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001" +
                    "\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e" +
                    "\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e" +
                    "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f" +
                    "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010" +
                    "\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010" +
                    "\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011" +
                    "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011" +
                    "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012" +
                    "\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013" +
                    "\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013" +
                    "\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014" +
                    "\u0005\u0014\u00fd\b\u0014\n\u0014\f\u0014\u0100\t\u0014\u0001\u0015\u0004" +
                    "\u0015\u0103\b\u0015\u000b\u0015\f\u0015\u0104\u0001\u0015\u0001\u0015" +
                    "\u0005\u0015\u0109\b\u0015\n\u0015\f\u0015\u010c\t\u0015\u0001\u0015\u0001" +
                    "\u0015\u0001\u0016\u0004\u0016\u0111\b\u0016\u000b\u0016\f\u0016\u0112" +
                    "\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019" +
                    "\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c" +
                    "\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f" +
                    "\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001" +
                    "$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001" +
                    "\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001" +
                    ")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001" +
                    ",\u0004,\u014f\b,\u000b,\f,\u0150\u0001,\u0001,\u0000\u0000-\u0001\u0001" +
                    "\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f" +
                    "\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f" +
                    "\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018" +
                    "1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(" +
                    "Q)S*U+W,Y-\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001" +
                    "\u000009\u0003\u0000\t\n\r\r  \u0158\u0000\u0001\u0001\u0000\u0000\u0000" +
                    "\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000" +
                    "\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000" +
                    "\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f" +
                    "\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013" +
                    "\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017" +
                    "\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b" +
                    "\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f" +
                    "\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000" +
                    "\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000" +
                    "\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000" +
                    "-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001" +
                    "\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000" +
                    "\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000" +
                    ";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001" +
                    "\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000" +
                    "\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000" +
                    "I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001" +
                    "\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000" +
                    "\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000" +
                    "W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0001[\u0001" +
                    "\u0000\u0000\u0000\u0003b\u0001\u0000\u0000\u0000\u0005j\u0001\u0000\u0000" +
                    "\u0000\u0007t\u0001\u0000\u0000\u0000\tz\u0001\u0000\u0000\u0000\u000b" +
                    "~\u0001\u0000\u0000\u0000\r\u0085\u0001\u0000\u0000\u0000\u000f\u0089" +
                    "\u0001\u0000\u0000\u0000\u0011\u0091\u0001\u0000\u0000\u0000\u0013\u0098" +
                    "\u0001\u0000\u0000\u0000\u0015\u009f\u0001\u0000\u0000\u0000\u0017\u00a5" +
                    "\u0001\u0000\u0000\u0000\u0019\u00ac\u0001\u0000\u0000\u0000\u001b\u00b6" +
                    "\u0001\u0000\u0000\u0000\u001d\u00bf\u0001\u0000\u0000\u0000\u001f\u00c6" +
                    "\u0001\u0000\u0000\u0000!\u00d1\u0001\u0000\u0000\u0000#\u00dc\u0001\u0000" +
                    "\u0000\u0000%\u00e8\u0001\u0000\u0000\u0000\'\u00ed\u0001\u0000\u0000" +
                    "\u0000)\u00fa\u0001\u0000\u0000\u0000+\u010a\u0001\u0000\u0000\u0000-" +
                    "\u0110\u0001\u0000\u0000\u0000/\u0114\u0001\u0000\u0000\u00001\u0116\u0001" +
                    "\u0000\u0000\u00003\u0118\u0001\u0000\u0000\u00005\u011a\u0001\u0000\u0000" +
                    "\u00007\u011c\u0001\u0000\u0000\u00009\u011e\u0001\u0000\u0000\u0000;" +
                    "\u0120\u0001\u0000\u0000\u0000=\u0122\u0001\u0000\u0000\u0000?\u0124\u0001" +
                    "\u0000\u0000\u0000A\u0126\u0001\u0000\u0000\u0000C\u0128\u0001\u0000\u0000" +
                    "\u0000E\u012a\u0001\u0000\u0000\u0000G\u012d\u0001\u0000\u0000\u0000I" +
                    "\u012f\u0001\u0000\u0000\u0000K\u0132\u0001\u0000\u0000\u0000M\u0137\u0001" +
                    "\u0000\u0000\u0000O\u0139\u0001\u0000\u0000\u0000Q\u013b\u0001\u0000\u0000" +
                    "\u0000S\u0141\u0001\u0000\u0000\u0000U\u0146\u0001\u0000\u0000\u0000W" +
                    "\u014a\u0001\u0000\u0000\u0000Y\u014e\u0001\u0000\u0000\u0000[\\\u0005" +
                    "p\u0000\u0000\\]\u0005u\u0000\u0000]^\u0005b\u0000\u0000^_\u0005l\u0000" +
                    "\u0000_`\u0005i\u0000\u0000`a\u0005c\u0000\u0000a\u0002\u0001\u0000\u0000" +
                    "\u0000bc\u0005p\u0000\u0000cd\u0005r\u0000\u0000de\u0005i\u0000\u0000" +
                    "ef\u0005v\u0000\u0000fg\u0005a\u0000\u0000gh\u0005t\u0000\u0000hi\u0005" +
                    "e\u0000\u0000i\u0004\u0001\u0000\u0000\u0000jk\u0005p\u0000\u0000kl\u0005" +
                    "r\u0000\u0000lm\u0005o\u0000\u0000mn\u0005t\u0000\u0000no\u0005e\u0000" +
                    "\u0000op\u0005c\u0000\u0000pq\u0005t\u0000\u0000qr\u0005e\u0000\u0000" +
                    "rs\u0005d\u0000\u0000s\u0006\u0001\u0000\u0000\u0000tu\u0005f\u0000\u0000" +
                    "uv\u0005i\u0000\u0000vw\u0005n\u0000\u0000wx\u0005a\u0000\u0000xy\u0005" +
                    "l\u0000\u0000y\b\u0001\u0000\u0000\u0000z{\u0005v\u0000\u0000{|\u0005" +
                    "a\u0000\u0000|}\u0005l\u0000\u0000}\n\u0001\u0000\u0000\u0000~\u007f\u0005" +
                    "u\u0000\u0000\u007f\u0080\u0005n\u0000\u0000\u0080\u0081\u0005i\u0000" +
                    "\u0000\u0081\u0082\u0005q\u0000\u0000\u0082\u0083\u0005u\u0000\u0000\u0083" +
                    "\u0084\u0005e\u0000\u0000\u0084\f\u0001\u0000\u0000\u0000\u0085\u0086" +
                    "\u0005l\u0000\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u0088\u0005t" +
                    "\u0000\u0000\u0088\u000e\u0001\u0000\u0000\u0000\u0089\u008a\u0005p\u0000" +
                    "\u0000\u008a\u008b\u0005a\u0000\u0000\u008b\u008c\u0005c\u0000\u0000\u008c" +
                    "\u008d\u0005k\u0000\u0000\u008d\u008e\u0005a\u0000\u0000\u008e\u008f\u0005" +
                    "g\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090\u0010\u0001\u0000\u0000" +
                    "\u0000\u0091\u0092\u0005i\u0000\u0000\u0092\u0093\u0005m\u0000\u0000\u0093" +
                    "\u0094\u0005p\u0000\u0000\u0094\u0095\u0005o\u0000\u0000\u0095\u0096\u0005" +
                    "r\u0000\u0000\u0096\u0097\u0005t\u0000\u0000\u0097\u0012\u0001\u0000\u0000" +
                    "\u0000\u0098\u0099\u0005s\u0000\u0000\u0099\u009a\u0005t\u0000\u0000\u009a" +
                    "\u009b\u0005a\u0000\u0000\u009b\u009c\u0005t\u0000\u0000\u009c\u009d\u0005" +
                    "i\u0000\u0000\u009d\u009e\u0005c\u0000\u0000\u009e\u0014\u0001\u0000\u0000" +
                    "\u0000\u009f\u00a0\u0005c\u0000\u0000\u00a0\u00a1\u0005l\u0000\u0000\u00a1" +
                    "\u00a2\u0005a\u0000\u0000\u00a2\u00a3\u0005s\u0000\u0000\u00a3\u00a4\u0005" +
                    "s\u0000\u0000\u00a4\u0016\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005r\u0000" +
                    "\u0000\u00a6\u00a7\u0005e\u0000\u0000\u00a7\u00a8\u0005t\u0000\u0000\u00a8" +
                    "\u00a9\u0005u\u0000\u0000\u00a9\u00aa\u0005r\u0000\u0000\u00aa\u00ab\u0005" +
                    "n\u0000\u0000\u00ab\u0018\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005t\u0000" +
                    "\u0000\u00ad\u00ae\u0005r\u0000\u0000\u00ae\u00af\u0005a\u0000\u0000\u00af" +
                    "\u00b0\u0005n\u0000\u0000\u00b0\u00b1\u0005s\u0000\u0000\u00b1\u00b2\u0005" +
                    "i\u0000\u0000\u00b2\u00b3\u0005e\u0000\u0000\u00b3\u00b4\u0005n\u0000" +
                    "\u0000\u00b4\u00b5\u0005t\u0000\u0000\u00b5\u001a\u0001\u0000\u0000\u0000" +
                    "\u00b6\u00b7\u0005v\u0000\u0000\u00b7\u00b8\u0005o\u0000\u0000\u00b8\u00b9" +
                    "\u0005l\u0000\u0000\u00b9\u00ba\u0005a\u0000\u0000\u00ba\u00bb\u0005t" +
                    "\u0000\u0000\u00bb\u00bc\u0005i\u0000\u0000\u00bc\u00bd\u0005l\u0000\u0000" +
                    "\u00bd\u00be\u0005e\u0000\u0000\u00be\u001c\u0001\u0000\u0000\u0000\u00bf" +
                    "\u00c0\u0005h\u0000\u0000\u00c0\u00c1\u0005o\u0000\u0000\u00c1\u00c2\u0005" +
                    "l\u0000\u0000\u00c2\u00c3\u0005d\u0000\u0000\u00c3\u00c4\u0005e\u0000" +
                    "\u0000\u00c4\u00c5\u0005r\u0000\u0000\u00c5\u001e\u0001\u0000\u0000\u0000" +
                    "\u00c6\u00c7\u0005h\u0000\u0000\u00c7\u00c8\u0005o\u0000\u0000\u00c8\u00c9" +
                    "\u0005l\u0000\u0000\u00c9\u00ca\u0005d\u0000\u0000\u00ca\u00cb\u0005e" +
                    "\u0000\u0000\u00cb\u00cc\u0005r\u0000\u0000\u00cc\u00cd\u0005-\u0000\u0000" +
                    "\u00cd\u00ce\u0005g\u0000\u0000\u00ce\u00cf\u0005e\u0000\u0000\u00cf\u00d0" +
                    "\u0005t\u0000\u0000\u00d0 \u0001\u0000\u0000\u0000\u00d1\u00d2\u0005h" +
                    "\u0000\u0000\u00d2\u00d3\u0005o\u0000\u0000\u00d3\u00d4\u0005l\u0000\u0000" +
                    "\u00d4\u00d5\u0005d\u0000\u0000\u00d5\u00d6\u0005e\u0000\u0000\u00d6\u00d7" +
                    "\u0005r\u0000\u0000\u00d7\u00d8\u0005-\u0000\u0000\u00d8\u00d9\u0005s" +
                    "\u0000\u0000\u00d9\u00da\u0005e\u0000\u0000\u00da\u00db\u0005t\u0000\u0000" +
                    "\u00db\"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005o\u0000\u0000\u00dd" +
                    "\u00de\u0005v\u0000\u0000\u00de\u00df\u0005e\u0000\u0000\u00df\u00e0\u0005" +
                    "r\u0000\u0000\u00e0\u00e1\u0005r\u0000\u0000\u00e1\u00e2\u0005i\u0000" +
                    "\u0000\u00e2\u00e3\u0005d\u0000\u0000\u00e3\u00e4\u0005a\u0000\u0000\u00e4" +
                    "\u00e5\u0005b\u0000\u0000\u00e5\u00e6\u0005l\u0000\u0000\u00e6\u00e7\u0005" +
                    "e\u0000\u0000\u00e7$\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005s\u0000" +
                    "\u0000\u00e9\u00ea\u0005y\u0000\u0000\u00ea\u00eb\u0005n\u0000\u0000\u00eb" +
                    "\u00ec\u0005c\u0000\u0000\u00ec&\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005" +
                    "s\u0000\u0000\u00ee\u00ef\u0005y\u0000\u0000\u00ef\u00f0\u0005n\u0000" +
                    "\u0000\u00f0\u00f1\u0005c\u0000\u0000\u00f1\u00f2\u0005h\u0000\u0000\u00f2" +
                    "\u00f3\u0005r\u0000\u0000\u00f3\u00f4\u0005o\u0000\u0000\u00f4\u00f5\u0005" +
                    "n\u0000\u0000\u00f5\u00f6\u0005i\u0000\u0000\u00f6\u00f7\u0005z\u0000" +
                    "\u0000\u00f7\u00f8\u0005e\u0000\u0000\u00f8\u00f9\u0005d\u0000\u0000\u00f9" +
                    "(\u0001\u0000\u0000\u0000\u00fa\u00fe\u0007\u0000\u0000\u0000\u00fb\u00fd" +
                    "\u0007\u0001\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100" +
                    "\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff" +
                    "\u0001\u0000\u0000\u0000\u00ff*\u0001\u0000\u0000\u0000\u0100\u00fe\u0001" +
                    "\u0000\u0000\u0000\u0101\u0103\u0003)\u0014\u0000\u0102\u0101\u0001\u0000" +
                    "\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000" +
                    "\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000" +
                    "\u0000\u0000\u0106\u0107\u0005.\u0000\u0000\u0107\u0109\u0001\u0000\u0000" +
                    "\u0000\u0108\u0102\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000" +
                    "\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000" +
                    "\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000" +
                    "\u0000\u010d\u010e\u0003)\u0014\u0000\u010e,\u0001\u0000\u0000\u0000\u010f" +
                    "\u0111\u0007\u0002\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111" +
                    "\u0112\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112" +
                    "\u0113\u0001\u0000\u0000\u0000\u0113.\u0001\u0000\u0000\u0000\u0114\u0115" +
                    "\u0005{\u0000\u0000\u01150\u0001\u0000\u0000\u0000\u0116\u0117\u0005}" +
                    "\u0000\u0000\u01172\u0001\u0000\u0000\u0000\u0118\u0119\u0005<\u0000\u0000" +
                    "\u01194\u0001\u0000\u0000\u0000\u011a\u011b\u0005>\u0000\u0000\u011b6" +
                    "\u0001\u0000\u0000\u0000\u011c\u011d\u0005[\u0000\u0000\u011d8\u0001\u0000" +
                    "\u0000\u0000\u011e\u011f\u0005]\u0000\u0000\u011f:\u0001\u0000\u0000\u0000" +
                    "\u0120\u0121\u0005(\u0000\u0000\u0121<\u0001\u0000\u0000\u0000\u0122\u0123" +
                    "\u0005)\u0000\u0000\u0123>\u0001\u0000\u0000\u0000\u0124\u0125\u0005:" +
                    "\u0000\u0000\u0125@\u0001\u0000\u0000\u0000\u0126\u0127\u0005;\u0000\u0000" +
                    "\u0127B\u0001\u0000\u0000\u0000\u0128\u0129\u0005,\u0000\u0000\u0129D" +
                    "\u0001\u0000\u0000\u0000\u012a\u012b\u0005=\u0000\u0000\u012b\u012c\u0005" +
                    "=\u0000\u0000\u012cF\u0001\u0000\u0000\u0000\u012d\u012e\u0005=\u0000" +
                    "\u0000\u012eH\u0001\u0000\u0000\u0000\u012f\u0130\u0005<\u0000\u0000\u0130" +
                    "\u0131\u0005-\u0000\u0000\u0131J\u0001\u0000\u0000\u0000\u0132\u0133\u0005" +
                    " \u0000\u0000\u0133\u0134\u0005a\u0000\u0000\u0134\u0135\u0005s\u0000" +
                    "\u0000\u0135\u0136\u0005 \u0000\u0000\u0136L\u0001\u0000\u0000\u0000\u0137" +
                    "\u0138\u0005&\u0000\u0000\u0138N\u0001\u0000\u0000\u0000\u0139\u013a\u0005" +
                    "|\u0000\u0000\u013aP\u0001\u0000\u0000\u0000\u013b\u013c\u0005 \u0000" +
                    "\u0000\u013c\u013d\u0005a\u0000\u0000\u013d\u013e\u0005n\u0000\u0000\u013e" +
                    "\u013f\u0005d\u0000\u0000\u013f\u0140\u0005 \u0000\u0000\u0140R\u0001" +
                    "\u0000\u0000\u0000\u0141\u0142\u0005 \u0000\u0000\u0142\u0143\u0005o\u0000" +
                    "\u0000\u0143\u0144\u0005r\u0000\u0000\u0144\u0145\u0005 \u0000\u0000\u0145" +
                    "T\u0001\u0000\u0000\u0000\u0146\u0147\u0005a\u0000\u0000\u0147\u0148\u0005" +
                    "n\u0000\u0000\u0148\u0149\u0005d\u0000\u0000\u0149V\u0001\u0000\u0000" +
                    "\u0000\u014a\u014b\u0005o\u0000\u0000\u014b\u014c\u0005r\u0000\u0000\u014c" +
                    "X\u0001\u0000\u0000\u0000\u014d\u014f\u0007\u0003\u0000\u0000\u014e\u014d" +
                    "\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u014e" +
                    "\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152" +
                    "\u0001\u0000\u0000\u0000\u0152\u0153\u0006,\u0000\u0000\u0153Z\u0001\u0000" +
                    "\u0000\u0000\u0006\u0000\u00fe\u0104\u010a\u0112\u0150\u0001\u0006\u0000" +
                    "\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}