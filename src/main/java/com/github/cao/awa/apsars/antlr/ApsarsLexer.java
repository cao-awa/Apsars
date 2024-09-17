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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, Public = 6, Private = 7, Protected = 8,
            Final = 9, Val = 10, Unique = 11, Inline = 12, Let = 13, Package = 14, Import = 15,
            Static = 16, Class = 17, Return = 18, Yield = 19, Transient = 20, Volatile = 21, Holder = 22,
            HolderGet = 23, HolderSet = 24, Overridable = 25, Sync = 26, Synchronized = 27,
            Try = 28, Catch = 29, Ignored = 30, Print = 31, Deliver = 32, With = 33, Point = 34,
            LeftBrace = 35, RightBrace = 36, LeftAngleBracket = 37, RightAngleBracket = 38,
            LeftBracket = 39, RightBracket = 40, LeftParenthesis = 41, RightParenthesis = 42,
            Colon = 43, Semicolon = 44, Comma = 45, Equals = 46, Equal = 47, LeftEquals = 48,
            As = 49, AndSign = 50, OrSign = 51, ArgAnd = 52, ArgOr = 53, WordAnd = 54, WordOr = 55,
            Plus = 56, Minus = 57, Multiply = 58, Devide = 59, Pow = 60, Quotation = 61, Null = 62,
            True = 63, False = 64, Identifier = 65, FullName = 66, Number = 67, WHITESPACES = 68;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "Public", "Private", "Protected",
                "Final", "Val", "Unique", "Inline", "Let", "Package", "Import", "Static",
                "Class", "Return", "Yield", "Transient", "Volatile", "Holder", "HolderGet",
                "HolderSet", "Overridable", "Sync", "Synchronized", "Try", "Catch", "Ignored",
                "Print", "Deliver", "With", "Point", "LeftBrace", "RightBrace", "LeftAngleBracket",
                "RightAngleBracket", "LeftBracket", "RightBracket", "LeftParenthesis",
                "RightParenthesis", "Colon", "Semicolon", "Comma", "Equals", "Equal",
                "LeftEquals", "As", "AndSign", "OrSign", "ArgAnd", "ArgOr", "WordAnd",
                "WordOr", "Plus", "Minus", "Multiply", "Devide", "Pow", "Quotation",
                "Null", "True", "False", "Identifier", "FullName", "Number", "WHITESPACES"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'template'", "'new'", "'if'", "'else'", "'\\{'", "'public'", "'private'",
                "'protected'", "'final'", "'val'", "'unique'", "'inline'", "'let'", "'package'",
                "'import'", "'static'", "'class'", "'return'", "'yield'", "'transient'",
                "'volatile'", "'holder'", "'holder-get'", "'holder-set'", "'overridable'",
                "'sync'", "'synchronized'", "'try'", "'catch'", "'ignored'", "'print'",
                "'deliver'", "'with'", "'.'", "'{'", "'}'", "'<'", "'>'", "'['", "']'",
                "'('", "')'", "':'", "';'", "','", "'=='", "'='", "'<-'", "' as '", "'&'",
                "'|'", "' and '", "' or '", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'",
                "'^'", "'\"'", null, "'true'", "'false'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, "Public", "Private", "Protected",
                "Final", "Val", "Unique", "Inline", "Let", "Package", "Import", "Static",
                "Class", "Return", "Yield", "Transient", "Volatile", "Holder", "HolderGet",
                "HolderSet", "Overridable", "Sync", "Synchronized", "Try", "Catch", "Ignored",
                "Print", "Deliver", "With", "Point", "LeftBrace", "RightBrace", "LeftAngleBracket",
                "RightAngleBracket", "LeftBracket", "RightBracket", "LeftParenthesis",
                "RightParenthesis", "Colon", "Semicolon", "Comma", "Equals", "Equal",
                "LeftEquals", "As", "AndSign", "OrSign", "ArgAnd", "ArgOr", "WordAnd",
                "WordOr", "Plus", "Minus", "Multiply", "Devide", "Pow", "Quotation",
                "Null", "True", "False", "Identifier", "FullName", "Number", "WHITESPACES"
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
            "\u0004\u0000D\u01f2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
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
                    "+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007" +
                    "0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007" +
                    "5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007" +
                    ":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007" +
                    "?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0001\u0000" +
                    "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005" +
                    "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005" +
                    "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
                    "\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001" +
                    "\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001" +
                    "\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r" +
                    "\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001" +
                    "\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001" +
                    "\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001" +
                    "\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001" +
                    "\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001" +
                    "\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001" +
                    "\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001" +
                    "\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001" +
                    "\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001" +
                    "\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001" +
                    "\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001" +
                    "\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001" +
                    "\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001" +
                    "\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001" +
                    "\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001" +
                    "\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001" +
                    "\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001" +
                    "\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001" +
                    "\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001" +
                    "\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001" +
                    "\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001" +
                    "\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001" +
                    "\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001" +
                    "\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001" +
                    "\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001" +
                    "\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001" +
                    "\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001" +
                    ",\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001/\u0001" +
                    "0\u00010\u00010\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u0001" +
                    "3\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u0001" +
                    "5\u00015\u00015\u00015\u00016\u00016\u00016\u00017\u00017\u00018\u0001" +
                    "8\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001" +
                    "=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001" +
                    "=\u0001=\u0001=\u0001=\u0001=\u0003=\u01ca\b=\u0001>\u0001>\u0001>\u0001" +
                    ">\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0005" +
                    "@\u01d9\b@\n@\f@\u01dc\t@\u0001A\u0001A\u0001A\u0004A\u01e1\bA\u000bA" +
                    "\fA\u01e2\u0001A\u0001A\u0001B\u0004B\u01e8\bB\u000bB\fB\u01e9\u0001C" +
                    "\u0004C\u01ed\bC\u000bC\fC\u01ee\u0001C\u0001C\u0000\u0000D\u0001\u0001" +
                    "\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f" +
                    "\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f" +
                    "\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018" +
                    "1\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(" +
                    "Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f@\u0081A\u0083B\u0085" +
                    "C\u0087D\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001" +
                    "\u000009\u0003\u0000\t\n\r\r  \u01f7\u0000\u0001\u0001\u0000\u0000\u0000" +
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
                    "W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001" +
                    "\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000" +
                    "\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000" +
                    "e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001" +
                    "\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000" +
                    "\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000" +
                    "s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001" +
                    "\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000" +
                    "\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000" +
                    "\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001\u0000\u0000\u0000" +
                    "\u0000\u0085\u0001\u0000\u0000\u0000\u0000\u0087\u0001\u0000\u0000\u0000" +
                    "\u0001\u0089\u0001\u0000\u0000\u0000\u0003\u0092\u0001\u0000\u0000\u0000" +
                    "\u0005\u0096\u0001\u0000\u0000\u0000\u0007\u0099\u0001\u0000\u0000\u0000" +
                    "\t\u009e\u0001\u0000\u0000\u0000\u000b\u00a1\u0001\u0000\u0000\u0000\r" +
                    "\u00a8\u0001\u0000\u0000\u0000\u000f\u00b0\u0001\u0000\u0000\u0000\u0011" +
                    "\u00ba\u0001\u0000\u0000\u0000\u0013\u00c0\u0001\u0000\u0000\u0000\u0015" +
                    "\u00c4\u0001\u0000\u0000\u0000\u0017\u00cb\u0001\u0000\u0000\u0000\u0019" +
                    "\u00d2\u0001\u0000\u0000\u0000\u001b\u00d6\u0001\u0000\u0000\u0000\u001d" +
                    "\u00de\u0001\u0000\u0000\u0000\u001f\u00e5\u0001\u0000\u0000\u0000!\u00ec" +
                    "\u0001\u0000\u0000\u0000#\u00f2\u0001\u0000\u0000\u0000%\u00f9\u0001\u0000" +
                    "\u0000\u0000\'\u00ff\u0001\u0000\u0000\u0000)\u0109\u0001\u0000\u0000" +
                    "\u0000+\u0112\u0001\u0000\u0000\u0000-\u0119\u0001\u0000\u0000\u0000/" +
                    "\u0124\u0001\u0000\u0000\u00001\u012f\u0001\u0000\u0000\u00003\u013b\u0001" +
                    "\u0000\u0000\u00005\u0140\u0001\u0000\u0000\u00007\u014d\u0001\u0000\u0000" +
                    "\u00009\u0151\u0001\u0000\u0000\u0000;\u0157\u0001\u0000\u0000\u0000=" +
                    "\u015f\u0001\u0000\u0000\u0000?\u0165\u0001\u0000\u0000\u0000A\u016d\u0001" +
                    "\u0000\u0000\u0000C\u0172\u0001\u0000\u0000\u0000E\u0174\u0001\u0000\u0000" +
                    "\u0000G\u0176\u0001\u0000\u0000\u0000I\u0178\u0001\u0000\u0000\u0000K" +
                    "\u017a\u0001\u0000\u0000\u0000M\u017c\u0001\u0000\u0000\u0000O\u017e\u0001" +
                    "\u0000\u0000\u0000Q\u0180\u0001\u0000\u0000\u0000S\u0182\u0001\u0000\u0000" +
                    "\u0000U\u0184\u0001\u0000\u0000\u0000W\u0186\u0001\u0000\u0000\u0000Y" +
                    "\u0188\u0001\u0000\u0000\u0000[\u018a\u0001\u0000\u0000\u0000]\u018d\u0001" +
                    "\u0000\u0000\u0000_\u018f\u0001\u0000\u0000\u0000a\u0192\u0001\u0000\u0000" +
                    "\u0000c\u0197\u0001\u0000\u0000\u0000e\u0199\u0001\u0000\u0000\u0000g" +
                    "\u019b\u0001\u0000\u0000\u0000i\u01a1\u0001\u0000\u0000\u0000k\u01a6\u0001" +
                    "\u0000\u0000\u0000m\u01aa\u0001\u0000\u0000\u0000o\u01ad\u0001\u0000\u0000" +
                    "\u0000q\u01af\u0001\u0000\u0000\u0000s\u01b1\u0001\u0000\u0000\u0000u" +
                    "\u01b3\u0001\u0000\u0000\u0000w\u01b5\u0001\u0000\u0000\u0000y\u01b7\u0001" +
                    "\u0000\u0000\u0000{\u01c9\u0001\u0000\u0000\u0000}\u01cb\u0001\u0000\u0000" +
                    "\u0000\u007f\u01d0\u0001\u0000\u0000\u0000\u0081\u01d6\u0001\u0000\u0000" +
                    "\u0000\u0083\u01e0\u0001\u0000\u0000\u0000\u0085\u01e7\u0001\u0000\u0000" +
                    "\u0000\u0087\u01ec\u0001\u0000\u0000\u0000\u0089\u008a\u0005t\u0000\u0000" +
                    "\u008a\u008b\u0005e\u0000\u0000\u008b\u008c\u0005m\u0000\u0000\u008c\u008d" +
                    "\u0005p\u0000\u0000\u008d\u008e\u0005l\u0000\u0000\u008e\u008f\u0005a" +
                    "\u0000\u0000\u008f\u0090\u0005t\u0000\u0000\u0090\u0091\u0005e\u0000\u0000" +
                    "\u0091\u0002\u0001\u0000\u0000\u0000\u0092\u0093\u0005n\u0000\u0000\u0093" +
                    "\u0094\u0005e\u0000\u0000\u0094\u0095\u0005w\u0000\u0000\u0095\u0004\u0001" +
                    "\u0000\u0000\u0000\u0096\u0097\u0005i\u0000\u0000\u0097\u0098\u0005f\u0000" +
                    "\u0000\u0098\u0006\u0001\u0000\u0000\u0000\u0099\u009a\u0005e\u0000\u0000" +
                    "\u009a\u009b\u0005l\u0000\u0000\u009b\u009c\u0005s\u0000\u0000\u009c\u009d" +
                    "\u0005e\u0000\u0000\u009d\b\u0001\u0000\u0000\u0000\u009e\u009f\u0005" +
                    "\\\u0000\u0000\u009f\u00a0\u0005{\u0000\u0000\u00a0\n\u0001\u0000\u0000" +
                    "\u0000\u00a1\u00a2\u0005p\u0000\u0000\u00a2\u00a3\u0005u\u0000\u0000\u00a3" +
                    "\u00a4\u0005b\u0000\u0000\u00a4\u00a5\u0005l\u0000\u0000\u00a5\u00a6\u0005" +
                    "i\u0000\u0000\u00a6\u00a7\u0005c\u0000\u0000\u00a7\f\u0001\u0000\u0000" +
                    "\u0000\u00a8\u00a9\u0005p\u0000\u0000\u00a9\u00aa\u0005r\u0000\u0000\u00aa" +
                    "\u00ab\u0005i\u0000\u0000\u00ab\u00ac\u0005v\u0000\u0000\u00ac\u00ad\u0005" +
                    "a\u0000\u0000\u00ad\u00ae\u0005t\u0000\u0000\u00ae\u00af\u0005e\u0000" +
                    "\u0000\u00af\u000e\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005p\u0000\u0000" +
                    "\u00b1\u00b2\u0005r\u0000\u0000\u00b2\u00b3\u0005o\u0000\u0000\u00b3\u00b4" +
                    "\u0005t\u0000\u0000\u00b4\u00b5\u0005e\u0000\u0000\u00b5\u00b6\u0005c" +
                    "\u0000\u0000\u00b6\u00b7\u0005t\u0000\u0000\u00b7\u00b8\u0005e\u0000\u0000" +
                    "\u00b8\u00b9\u0005d\u0000\u0000\u00b9\u0010\u0001\u0000\u0000\u0000\u00ba" +
                    "\u00bb\u0005f\u0000\u0000\u00bb\u00bc\u0005i\u0000\u0000\u00bc\u00bd\u0005" +
                    "n\u0000\u0000\u00bd\u00be\u0005a\u0000\u0000\u00be\u00bf\u0005l\u0000" +
                    "\u0000\u00bf\u0012\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005v\u0000\u0000" +
                    "\u00c1\u00c2\u0005a\u0000\u0000\u00c2\u00c3\u0005l\u0000\u0000\u00c3\u0014" +
                    "\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005u\u0000\u0000\u00c5\u00c6\u0005" +
                    "n\u0000\u0000\u00c6\u00c7\u0005i\u0000\u0000\u00c7\u00c8\u0005q\u0000" +
                    "\u0000\u00c8\u00c9\u0005u\u0000\u0000\u00c9\u00ca\u0005e\u0000\u0000\u00ca" +
                    "\u0016\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005i\u0000\u0000\u00cc\u00cd" +
                    "\u0005n\u0000\u0000\u00cd\u00ce\u0005l\u0000\u0000\u00ce\u00cf\u0005i" +
                    "\u0000\u0000\u00cf\u00d0\u0005n\u0000\u0000\u00d0\u00d1\u0005e\u0000\u0000" +
                    "\u00d1\u0018\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005l\u0000\u0000\u00d3" +
                    "\u00d4\u0005e\u0000\u0000\u00d4\u00d5\u0005t\u0000\u0000\u00d5\u001a\u0001" +
                    "\u0000\u0000\u0000\u00d6\u00d7\u0005p\u0000\u0000\u00d7\u00d8\u0005a\u0000" +
                    "\u0000\u00d8\u00d9\u0005c\u0000\u0000\u00d9\u00da\u0005k\u0000\u0000\u00da" +
                    "\u00db\u0005a\u0000\u0000\u00db\u00dc\u0005g\u0000\u0000\u00dc\u00dd\u0005" +
                    "e\u0000\u0000\u00dd\u001c\u0001\u0000\u0000\u0000\u00de\u00df\u0005i\u0000" +
                    "\u0000\u00df\u00e0\u0005m\u0000\u0000\u00e0\u00e1\u0005p\u0000\u0000\u00e1" +
                    "\u00e2\u0005o\u0000\u0000\u00e2\u00e3\u0005r\u0000\u0000\u00e3\u00e4\u0005" +
                    "t\u0000\u0000\u00e4\u001e\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005s\u0000" +
                    "\u0000\u00e6\u00e7\u0005t\u0000\u0000\u00e7\u00e8\u0005a\u0000\u0000\u00e8" +
                    "\u00e9\u0005t\u0000\u0000\u00e9\u00ea\u0005i\u0000\u0000\u00ea\u00eb\u0005" +
                    "c\u0000\u0000\u00eb \u0001\u0000\u0000\u0000\u00ec\u00ed\u0005c\u0000" +
                    "\u0000\u00ed\u00ee\u0005l\u0000\u0000\u00ee\u00ef\u0005a\u0000\u0000\u00ef" +
                    "\u00f0\u0005s\u0000\u0000\u00f0\u00f1\u0005s\u0000\u0000\u00f1\"\u0001" +
                    "\u0000\u0000\u0000\u00f2\u00f3\u0005r\u0000\u0000\u00f3\u00f4\u0005e\u0000" +
                    "\u0000\u00f4\u00f5\u0005t\u0000\u0000\u00f5\u00f6\u0005u\u0000\u0000\u00f6" +
                    "\u00f7\u0005r\u0000\u0000\u00f7\u00f8\u0005n\u0000\u0000\u00f8$\u0001" +
                    "\u0000\u0000\u0000\u00f9\u00fa\u0005y\u0000\u0000\u00fa\u00fb\u0005i\u0000" +
                    "\u0000\u00fb\u00fc\u0005e\u0000\u0000\u00fc\u00fd\u0005l\u0000\u0000\u00fd" +
                    "\u00fe\u0005d\u0000\u0000\u00fe&\u0001\u0000\u0000\u0000\u00ff\u0100\u0005" +
                    "t\u0000\u0000\u0100\u0101\u0005r\u0000\u0000\u0101\u0102\u0005a\u0000" +
                    "\u0000\u0102\u0103\u0005n\u0000\u0000\u0103\u0104\u0005s\u0000\u0000\u0104" +
                    "\u0105\u0005i\u0000\u0000\u0105\u0106\u0005e\u0000\u0000\u0106\u0107\u0005" +
                    "n\u0000\u0000\u0107\u0108\u0005t\u0000\u0000\u0108(\u0001\u0000\u0000" +
                    "\u0000\u0109\u010a\u0005v\u0000\u0000\u010a\u010b\u0005o\u0000\u0000\u010b" +
                    "\u010c\u0005l\u0000\u0000\u010c\u010d\u0005a\u0000\u0000\u010d\u010e\u0005" +
                    "t\u0000\u0000\u010e\u010f\u0005i\u0000\u0000\u010f\u0110\u0005l\u0000" +
                    "\u0000\u0110\u0111\u0005e\u0000\u0000\u0111*\u0001\u0000\u0000\u0000\u0112" +
                    "\u0113\u0005h\u0000\u0000\u0113\u0114\u0005o\u0000\u0000\u0114\u0115\u0005" +
                    "l\u0000\u0000\u0115\u0116\u0005d\u0000\u0000\u0116\u0117\u0005e\u0000" +
                    "\u0000\u0117\u0118\u0005r\u0000\u0000\u0118,\u0001\u0000\u0000\u0000\u0119" +
                    "\u011a\u0005h\u0000\u0000\u011a\u011b\u0005o\u0000\u0000\u011b\u011c\u0005" +
                    "l\u0000\u0000\u011c\u011d\u0005d\u0000\u0000\u011d\u011e\u0005e\u0000" +
                    "\u0000\u011e\u011f\u0005r\u0000\u0000\u011f\u0120\u0005-\u0000\u0000\u0120" +
                    "\u0121\u0005g\u0000\u0000\u0121\u0122\u0005e\u0000\u0000\u0122\u0123\u0005" +
                    "t\u0000\u0000\u0123.\u0001\u0000\u0000\u0000\u0124\u0125\u0005h\u0000" +
                    "\u0000\u0125\u0126\u0005o\u0000\u0000\u0126\u0127\u0005l\u0000\u0000\u0127" +
                    "\u0128\u0005d\u0000\u0000\u0128\u0129\u0005e\u0000\u0000\u0129\u012a\u0005" +
                    "r\u0000\u0000\u012a\u012b\u0005-\u0000\u0000\u012b\u012c\u0005s\u0000" +
                    "\u0000\u012c\u012d\u0005e\u0000\u0000\u012d\u012e\u0005t\u0000\u0000\u012e" +
                    "0\u0001\u0000\u0000\u0000\u012f\u0130\u0005o\u0000\u0000\u0130\u0131\u0005" +
                    "v\u0000\u0000\u0131\u0132\u0005e\u0000\u0000\u0132\u0133\u0005r\u0000" +
                    "\u0000\u0133\u0134\u0005r\u0000\u0000\u0134\u0135\u0005i\u0000\u0000\u0135" +
                    "\u0136\u0005d\u0000\u0000\u0136\u0137\u0005a\u0000\u0000\u0137\u0138\u0005" +
                    "b\u0000\u0000\u0138\u0139\u0005l\u0000\u0000\u0139\u013a\u0005e\u0000" +
                    "\u0000\u013a2\u0001\u0000\u0000\u0000\u013b\u013c\u0005s\u0000\u0000\u013c" +
                    "\u013d\u0005y\u0000\u0000\u013d\u013e\u0005n\u0000\u0000\u013e\u013f\u0005" +
                    "c\u0000\u0000\u013f4\u0001\u0000\u0000\u0000\u0140\u0141\u0005s\u0000" +
                    "\u0000\u0141\u0142\u0005y\u0000\u0000\u0142\u0143\u0005n\u0000\u0000\u0143" +
                    "\u0144\u0005c\u0000\u0000\u0144\u0145\u0005h\u0000\u0000\u0145\u0146\u0005" +
                    "r\u0000\u0000\u0146\u0147\u0005o\u0000\u0000\u0147\u0148\u0005n\u0000" +
                    "\u0000\u0148\u0149\u0005i\u0000\u0000\u0149\u014a\u0005z\u0000\u0000\u014a" +
                    "\u014b\u0005e\u0000\u0000\u014b\u014c\u0005d\u0000\u0000\u014c6\u0001" +
                    "\u0000\u0000\u0000\u014d\u014e\u0005t\u0000\u0000\u014e\u014f\u0005r\u0000" +
                    "\u0000\u014f\u0150\u0005y\u0000\u0000\u01508\u0001\u0000\u0000\u0000\u0151" +
                    "\u0152\u0005c\u0000\u0000\u0152\u0153\u0005a\u0000\u0000\u0153\u0154\u0005" +
                    "t\u0000\u0000\u0154\u0155\u0005c\u0000\u0000\u0155\u0156\u0005h\u0000" +
                    "\u0000\u0156:\u0001\u0000\u0000\u0000\u0157\u0158\u0005i\u0000\u0000\u0158" +
                    "\u0159\u0005g\u0000\u0000\u0159\u015a\u0005n\u0000\u0000\u015a\u015b\u0005" +
                    "o\u0000\u0000\u015b\u015c\u0005r\u0000\u0000\u015c\u015d\u0005e\u0000" +
                    "\u0000\u015d\u015e\u0005d\u0000\u0000\u015e<\u0001\u0000\u0000\u0000\u015f" +
                    "\u0160\u0005p\u0000\u0000\u0160\u0161\u0005r\u0000\u0000\u0161\u0162\u0005" +
                    "i\u0000\u0000\u0162\u0163\u0005n\u0000\u0000\u0163\u0164\u0005t\u0000" +
                    "\u0000\u0164>\u0001\u0000\u0000\u0000\u0165\u0166\u0005d\u0000\u0000\u0166" +
                    "\u0167\u0005e\u0000\u0000\u0167\u0168\u0005l\u0000\u0000\u0168\u0169\u0005" +
                    "i\u0000\u0000\u0169\u016a\u0005v\u0000\u0000\u016a\u016b\u0005e\u0000" +
                    "\u0000\u016b\u016c\u0005r\u0000\u0000\u016c@\u0001\u0000\u0000\u0000\u016d" +
                    "\u016e\u0005w\u0000\u0000\u016e\u016f\u0005i\u0000\u0000\u016f\u0170\u0005" +
                    "t\u0000\u0000\u0170\u0171\u0005h\u0000\u0000\u0171B\u0001\u0000\u0000" +
                    "\u0000\u0172\u0173\u0005.\u0000\u0000\u0173D\u0001\u0000\u0000\u0000\u0174" +
                    "\u0175\u0005{\u0000\u0000\u0175F\u0001\u0000\u0000\u0000\u0176\u0177\u0005" +
                    "}\u0000\u0000\u0177H\u0001\u0000\u0000\u0000\u0178\u0179\u0005<\u0000" +
                    "\u0000\u0179J\u0001\u0000\u0000\u0000\u017a\u017b\u0005>\u0000\u0000\u017b" +
                    "L\u0001\u0000\u0000\u0000\u017c\u017d\u0005[\u0000\u0000\u017dN\u0001" +
                    "\u0000\u0000\u0000\u017e\u017f\u0005]\u0000\u0000\u017fP\u0001\u0000\u0000" +
                    "\u0000\u0180\u0181\u0005(\u0000\u0000\u0181R\u0001\u0000\u0000\u0000\u0182" +
                    "\u0183\u0005)\u0000\u0000\u0183T\u0001\u0000\u0000\u0000\u0184\u0185\u0005" +
                    ":\u0000\u0000\u0185V\u0001\u0000\u0000\u0000\u0186\u0187\u0005;\u0000" +
                    "\u0000\u0187X\u0001\u0000\u0000\u0000\u0188\u0189\u0005,\u0000\u0000\u0189" +
                    "Z\u0001\u0000\u0000\u0000\u018a\u018b\u0005=\u0000\u0000\u018b\u018c\u0005" +
                    "=\u0000\u0000\u018c\\\u0001\u0000\u0000\u0000\u018d\u018e\u0005=\u0000" +
                    "\u0000\u018e^\u0001\u0000\u0000\u0000\u018f\u0190\u0005<\u0000\u0000\u0190" +
                    "\u0191\u0005-\u0000\u0000\u0191`\u0001\u0000\u0000\u0000\u0192\u0193\u0005" +
                    " \u0000\u0000\u0193\u0194\u0005a\u0000\u0000\u0194\u0195\u0005s\u0000" +
                    "\u0000\u0195\u0196\u0005 \u0000\u0000\u0196b\u0001\u0000\u0000\u0000\u0197" +
                    "\u0198\u0005&\u0000\u0000\u0198d\u0001\u0000\u0000\u0000\u0199\u019a\u0005" +
                    "|\u0000\u0000\u019af\u0001\u0000\u0000\u0000\u019b\u019c\u0005 \u0000" +
                    "\u0000\u019c\u019d\u0005a\u0000\u0000\u019d\u019e\u0005n\u0000\u0000\u019e" +
                    "\u019f\u0005d\u0000\u0000\u019f\u01a0\u0005 \u0000\u0000\u01a0h\u0001" +
                    "\u0000\u0000\u0000\u01a1\u01a2\u0005 \u0000\u0000\u01a2\u01a3\u0005o\u0000" +
                    "\u0000\u01a3\u01a4\u0005r\u0000\u0000\u01a4\u01a5\u0005 \u0000\u0000\u01a5" +
                    "j\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005a\u0000\u0000\u01a7\u01a8\u0005" +
                    "n\u0000\u0000\u01a8\u01a9\u0005d\u0000\u0000\u01a9l\u0001\u0000\u0000" +
                    "\u0000\u01aa\u01ab\u0005o\u0000\u0000\u01ab\u01ac\u0005r\u0000\u0000\u01ac" +
                    "n\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005+\u0000\u0000\u01aep\u0001" +
                    "\u0000\u0000\u0000\u01af\u01b0\u0005-\u0000\u0000\u01b0r\u0001\u0000\u0000" +
                    "\u0000\u01b1\u01b2\u0005*\u0000\u0000\u01b2t\u0001\u0000\u0000\u0000\u01b3" +
                    "\u01b4\u0005/\u0000\u0000\u01b4v\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005" +
                    "^\u0000\u0000\u01b6x\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\"\u0000" +
                    "\u0000\u01b8z\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005 \u0000\u0000\u01ba" +
                    "\u01bb\u0005n\u0000\u0000\u01bb\u01bc\u0005u\u0000\u0000\u01bc\u01bd\u0005" +
                    "l\u0000\u0000\u01bd\u01ca\u0005l\u0000\u0000\u01be\u01bf\u0005 \u0000" +
                    "\u0000\u01bf\u01c0\u0005n\u0000\u0000\u01c0\u01c1\u0005u\u0000\u0000\u01c1" +
                    "\u01c2\u0005l\u0000\u0000\u01c2\u01c3\u0005l\u0000\u0000\u01c3\u01ca\u0005" +
                    " \u0000\u0000\u01c4\u01c5\u0005n\u0000\u0000\u01c5\u01c6\u0005u\u0000" +
                    "\u0000\u01c6\u01c7\u0005l\u0000\u0000\u01c7\u01c8\u0005l\u0000\u0000\u01c8" +
                    "\u01ca\u0005 \u0000\u0000\u01c9\u01b9\u0001\u0000\u0000\u0000\u01c9\u01be" +
                    "\u0001\u0000\u0000\u0000\u01c9\u01c4\u0001\u0000\u0000\u0000\u01ca|\u0001" +
                    "\u0000\u0000\u0000\u01cb\u01cc\u0005t\u0000\u0000\u01cc\u01cd\u0005r\u0000" +
                    "\u0000\u01cd\u01ce\u0005u\u0000\u0000\u01ce\u01cf\u0005e\u0000\u0000\u01cf" +
                    "~\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005f\u0000\u0000\u01d1\u01d2\u0005" +
                    "a\u0000\u0000\u01d2\u01d3\u0005l\u0000\u0000\u01d3\u01d4\u0005s\u0000" +
                    "\u0000\u01d4\u01d5\u0005e\u0000\u0000\u01d5\u0080\u0001\u0000\u0000\u0000" +
                    "\u01d6\u01da\u0007\u0000\u0000\u0000\u01d7\u01d9\u0007\u0001\u0000\u0000" +
                    "\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000" +
                    "\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000" +
                    "\u01db\u0082\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000" +
                    "\u01dd\u01de\u0003\u0081@\u0000\u01de\u01df\u0005.\u0000\u0000\u01df\u01e1" +
                    "\u0001\u0000\u0000\u0000\u01e0\u01dd\u0001\u0000\u0000\u0000\u01e1\u01e2" +
                    "\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3" +
                    "\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5" +
                    "\u0003\u0081@\u0000\u01e5\u0084\u0001\u0000\u0000\u0000\u01e6\u01e8\u0007" +
                    "\u0002\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001" +
                    "\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001" +
                    "\u0000\u0000\u0000\u01ea\u0086\u0001\u0000\u0000\u0000\u01eb\u01ed\u0007" +
                    "\u0003\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001" +
                    "\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001" +
                    "\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0006" +
                    "C\u0000\u0000\u01f1\u0088\u0001\u0000\u0000\u0000\u0006\u0000\u01c9\u01da" +
                    "\u01e2\u01e9\u01ee\u0001\u0006\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}