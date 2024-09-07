// Generated from D:/Codes/Java/Apsars/grammar/Apsars.g4 by ANTLR 4.13.1
package com.github.cao.awa.apsars.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ApsarsParser extends Parser {
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
    public static final int
            RULE_program = 0, RULE_definePackage = 1, RULE_defineImport = 2, RULE_isPublic = 3,
            RULE_isPrivate = 4, RULE_isProtected = 5, RULE_isFinal = 6, RULE_isVal = 7,
            RULE_isUnique = 8, RULE_let = 9, RULE_packageAt = 10, RULE_importting = 11,
            RULE_isStatic = 12, RULE_class = 13, RULE_return = 14, RULE_isTransient = 15,
            RULE_isVolatile = 16, RULE_isHolder = 17, RULE_isGetHolder = 18, RULE_isSetHolder = 19,
            RULE_isOverridable = 20, RULE_isSync = 21, RULE_isSynchronized = 22, RULE_sync = 23,
            RULE_identifier = 24, RULE_fullName = 25, RULE_number = 26, RULE_leftBrace = 27,
            RULE_rightBrace = 28, RULE_leftAngleBracket = 29, RULE_rightAngleBracket = 30,
            RULE_lessThan = 31, RULE_moreThan = 32, RULE_leftBracket = 33, RULE_rightBracket = 34,
            RULE_leftParenthesis = 35, RULE_rightParenthesis = 36, RULE_leftParen = 37,
            RULE_rightParen = 38, RULE_colon = 39, RULE_semicolon = 40, RULE_comma = 41,
            RULE_and = 42, RULE_or = 43, RULE_argAnd = 44, RULE_argOr = 45, RULE_wordAnd = 46,
            RULE_wordOr = 47, RULE_assignment = 48, RULE_isEquals = 49, RULE_fieldModifiers = 50,
            RULE_methodModifiers = 51, RULE_makeAlternateLet = 52, RULE_optionalFieldAndMethodModifiers = 53,
            RULE_optionalFieldStaticAndFinal = 54, RULE_optionalStaticAndFinal = 55,
            RULE_permissionModifiers = 56, RULE_packageIdentifier = 57, RULE_fullNameIdentifier = 58,
            RULE_fieldFinal = 59, RULE_methodFinal = 60, RULE_classFinal = 61, RULE_defineMethod = 62,
            RULE_methodReturnType = 63, RULE_alternateStaticAndFinalAndSync = 64,
            RULE_defineMethodBody = 65, RULE_defineStatement = 66, RULE_methodParamListDefinition = 67,
            RULE_paramType = 68, RULE_argType = 69, RULE_extraArgTypes = 70, RULE_typedArgType = 71,
            RULE_arrayArgType = 72, RULE_arrayDefinition = 73, RULE_defineClass = 74,
            RULE_makeAlternateLetAndContent = 75, RULE_defineClassContent = 76, RULE_defineLet = 77,
            RULE_defineMemberField = 78;

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "definePackage", "defineImport", "isPublic", "isPrivate",
                "isProtected", "isFinal", "isVal", "isUnique", "let", "packageAt", "importting",
                "isStatic", "class", "return", "isTransient", "isVolatile", "isHolder",
                "isGetHolder", "isSetHolder", "isOverridable", "isSync", "isSynchronized",
                "sync", "identifier", "fullName", "number", "leftBrace", "rightBrace",
                "leftAngleBracket", "rightAngleBracket", "lessThan", "moreThan", "leftBracket",
                "rightBracket", "leftParenthesis", "rightParenthesis", "leftParen", "rightParen",
                "colon", "semicolon", "comma", "and", "or", "argAnd", "argOr", "wordAnd",
                "wordOr", "assignment", "isEquals", "fieldModifiers", "methodModifiers",
                "makeAlternateLet", "optionalFieldAndMethodModifiers", "optionalFieldStaticAndFinal",
                "optionalStaticAndFinal", "permissionModifiers", "packageIdentifier",
                "fullNameIdentifier", "fieldFinal", "methodFinal", "classFinal", "defineMethod",
                "methodReturnType", "alternateStaticAndFinalAndSync", "defineMethodBody",
                "defineStatement", "methodParamListDefinition", "paramType", "argType",
                "extraArgTypes", "typedArgType", "arrayArgType", "arrayDefinition", "defineClass",
                "makeAlternateLetAndContent", "defineClassContent", "defineLet", "defineMemberField"
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
    public ATN getATN() {
        return _ATN;
    }

    public ApsarsParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ProgramContext extends ParserRuleContext {
        public DefinePackageContext definePackage() {
            return getRuleContext(DefinePackageContext.class, 0);
        }

        public List<DefineImportContext> defineImport() {
            return getRuleContexts(DefineImportContext.class);
        }

        public DefineImportContext defineImport(int i) {
            return getRuleContext(DefineImportContext.class, i);
        }

        public List<DefineClassContext> defineClass() {
            return getRuleContexts(DefineClassContext.class);
        }

        public DefineClassContext defineClass(int i) {
            return getRuleContext(DefineClassContext.class, i);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(159);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Package) {
                    {
                        setState(158);
                        definePackage();
                    }
                }

                setState(164);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Import) {
                    {
                        {
                            setState(161);
                            defineImport();
                        }
                    }
                    setState(166);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(170);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1 + 1) {
                        {
                            {
                                setState(167);
                                defineClass();
                            }
                        }
                    }
                    setState(172);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefinePackageContext extends ParserRuleContext {
        public PackageAtContext packageAt() {
            return getRuleContext(PackageAtContext.class, 0);
        }

        public PackageIdentifierContext packageIdentifier() {
            return getRuleContext(PackageIdentifierContext.class, 0);
        }

        public SemicolonContext semicolon() {
            return getRuleContext(SemicolonContext.class, 0);
        }

        public DefinePackageContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_definePackage;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterDefinePackage(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitDefinePackage(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitDefinePackage(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefinePackageContext definePackage() throws RecognitionException {
        DefinePackageContext _localctx = new DefinePackageContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_definePackage);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(173);
                packageAt();
                setState(174);
                packageIdentifier();
                setState(175);
                semicolon();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefineImportContext extends ParserRuleContext {
        public ImporttingContext importting() {
            return getRuleContext(ImporttingContext.class, 0);
        }

        public FullNameIdentifierContext fullNameIdentifier() {
            return getRuleContext(FullNameIdentifierContext.class, 0);
        }

        public SemicolonContext semicolon() {
            return getRuleContext(SemicolonContext.class, 0);
        }

        public DefineImportContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defineImport;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterDefineImport(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitDefineImport(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitDefineImport(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefineImportContext defineImport() throws RecognitionException {
        DefineImportContext _localctx = new DefineImportContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_defineImport);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(177);
                importting();
                setState(178);
                fullNameIdentifier();
                setState(179);
                semicolon();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsPublicContext extends ParserRuleContext {
        public TerminalNode Public() {
            return getToken(ApsarsParser.Public, 0);
        }

        public IsPublicContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isPublic;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsPublic(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsPublic(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsPublic(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsPublicContext isPublic() throws RecognitionException {
        IsPublicContext _localctx = new IsPublicContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_isPublic);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(181);
                match(Public);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsPrivateContext extends ParserRuleContext {
        public TerminalNode Private() {
            return getToken(ApsarsParser.Private, 0);
        }

        public IsPrivateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isPrivate;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsPrivate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsPrivate(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsPrivate(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsPrivateContext isPrivate() throws RecognitionException {
        IsPrivateContext _localctx = new IsPrivateContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_isPrivate);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(183);
                match(Private);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsProtectedContext extends ParserRuleContext {
        public TerminalNode Protected() {
            return getToken(ApsarsParser.Protected, 0);
        }

        public IsProtectedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isProtected;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsProtected(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsProtected(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsProtected(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsProtectedContext isProtected() throws RecognitionException {
        IsProtectedContext _localctx = new IsProtectedContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_isProtected);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(185);
                match(Protected);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsFinalContext extends ParserRuleContext {
        public TerminalNode Final() {
            return getToken(ApsarsParser.Final, 0);
        }

        public IsFinalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isFinal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsFinal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsFinal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsFinal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsFinalContext isFinal() throws RecognitionException {
        IsFinalContext _localctx = new IsFinalContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_isFinal);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(187);
                match(Final);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsValContext extends ParserRuleContext {
        public TerminalNode Val() {
            return getToken(ApsarsParser.Val, 0);
        }

        public IsValContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isVal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsVal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsVal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsVal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsValContext isVal() throws RecognitionException {
        IsValContext _localctx = new IsValContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_isVal);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(189);
                match(Val);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsUniqueContext extends ParserRuleContext {
        public TerminalNode Unique() {
            return getToken(ApsarsParser.Unique, 0);
        }

        public IsUniqueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isUnique;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsUnique(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsUnique(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsUnique(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsUniqueContext isUnique() throws RecognitionException {
        IsUniqueContext _localctx = new IsUniqueContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_isUnique);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(191);
                match(Unique);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LetContext extends ParserRuleContext {
        public TerminalNode Let() {
            return getToken(ApsarsParser.Let, 0);
        }

        public LetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_let;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterLet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitLet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitLet(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LetContext let() throws RecognitionException {
        LetContext _localctx = new LetContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_let);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(193);
                match(Let);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PackageAtContext extends ParserRuleContext {
        public TerminalNode Package() {
            return getToken(ApsarsParser.Package, 0);
        }

        public PackageAtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_packageAt;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterPackageAt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitPackageAt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitPackageAt(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PackageAtContext packageAt() throws RecognitionException {
        PackageAtContext _localctx = new PackageAtContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_packageAt);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(195);
                match(Package);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ImporttingContext extends ParserRuleContext {
        public TerminalNode Import() {
            return getToken(ApsarsParser.Import, 0);
        }

        public ImporttingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importting;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterImportting(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitImportting(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitImportting(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ImporttingContext importting() throws RecognitionException {
        ImporttingContext _localctx = new ImporttingContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_importting);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(197);
                match(Import);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsStaticContext extends ParserRuleContext {
        public TerminalNode Static() {
            return getToken(ApsarsParser.Static, 0);
        }

        public IsStaticContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isStatic;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsStatic(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsStatic(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsStatic(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsStaticContext isStatic() throws RecognitionException {
        IsStaticContext _localctx = new IsStaticContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_isStatic);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(199);
                match(Static);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ClassContext extends ParserRuleContext {
        public TerminalNode Class() {
            return getToken(ApsarsParser.Class, 0);
        }

        public ClassContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_class;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterClass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitClass(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitClass(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ClassContext class_() throws RecognitionException {
        ClassContext _localctx = new ClassContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_class);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(201);
                match(Class);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ReturnContext extends ParserRuleContext {
        public TerminalNode Return() {
            return getToken(ApsarsParser.Return, 0);
        }

        public ReturnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_return;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterReturn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitReturn(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitReturn(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ReturnContext return_() throws RecognitionException {
        ReturnContext _localctx = new ReturnContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_return);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(203);
                match(Return);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsTransientContext extends ParserRuleContext {
        public TerminalNode Transient() {
            return getToken(ApsarsParser.Transient, 0);
        }

        public IsTransientContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isTransient;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsTransient(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsTransient(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsTransient(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsTransientContext isTransient() throws RecognitionException {
        IsTransientContext _localctx = new IsTransientContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_isTransient);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(205);
                match(Transient);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsVolatileContext extends ParserRuleContext {
        public TerminalNode Volatile() {
            return getToken(ApsarsParser.Volatile, 0);
        }

        public IsVolatileContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isVolatile;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsVolatile(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsVolatile(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsVolatile(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsVolatileContext isVolatile() throws RecognitionException {
        IsVolatileContext _localctx = new IsVolatileContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_isVolatile);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(207);
                match(Volatile);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsHolderContext extends ParserRuleContext {
        public TerminalNode Holder() {
            return getToken(ApsarsParser.Holder, 0);
        }

        public IsHolderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isHolder;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsHolder(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsHolder(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsHolder(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsHolderContext isHolder() throws RecognitionException {
        IsHolderContext _localctx = new IsHolderContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_isHolder);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(209);
                match(Holder);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsGetHolderContext extends ParserRuleContext {
        public TerminalNode HolderGet() {
            return getToken(ApsarsParser.HolderGet, 0);
        }

        public IsGetHolderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isGetHolder;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsGetHolder(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsGetHolder(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsGetHolder(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsGetHolderContext isGetHolder() throws RecognitionException {
        IsGetHolderContext _localctx = new IsGetHolderContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_isGetHolder);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(211);
                match(HolderGet);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsSetHolderContext extends ParserRuleContext {
        public TerminalNode HolderSet() {
            return getToken(ApsarsParser.HolderSet, 0);
        }

        public IsSetHolderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isSetHolder;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsSetHolder(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsSetHolder(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsSetHolder(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsSetHolderContext isSetHolder() throws RecognitionException {
        IsSetHolderContext _localctx = new IsSetHolderContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_isSetHolder);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(213);
                match(HolderSet);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsOverridableContext extends ParserRuleContext {
        public TerminalNode Overridable() {
            return getToken(ApsarsParser.Overridable, 0);
        }

        public IsOverridableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isOverridable;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsOverridable(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsOverridable(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitIsOverridable(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsOverridableContext isOverridable() throws RecognitionException {
        IsOverridableContext _localctx = new IsOverridableContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_isOverridable);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(215);
                match(Overridable);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsSyncContext extends ParserRuleContext {
        public TerminalNode Sync() {
            return getToken(ApsarsParser.Sync, 0);
        }

        public IsSyncContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isSync;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsSync(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsSync(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsSync(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsSyncContext isSync() throws RecognitionException {
        IsSyncContext _localctx = new IsSyncContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_isSync);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
                match(Sync);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsSynchronizedContext extends ParserRuleContext {
        public TerminalNode Synchronized() {
            return getToken(ApsarsParser.Synchronized, 0);
        }

        public IsSynchronizedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isSynchronized;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsSynchronized(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsSynchronized(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitIsSynchronized(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsSynchronizedContext isSynchronized() throws RecognitionException {
        IsSynchronizedContext _localctx = new IsSynchronizedContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_isSynchronized);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(219);
                match(Synchronized);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SyncContext extends ParserRuleContext {
        public IsSyncContext isSync() {
            return getRuleContext(IsSyncContext.class, 0);
        }

        public IsSynchronizedContext isSynchronized() {
            return getRuleContext(IsSynchronizedContext.class, 0);
        }

        public SyncContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_sync;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterSync(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitSync(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitSync(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SyncContext sync() throws RecognitionException {
        SyncContext _localctx = new SyncContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_sync);
        try {
            setState(223);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Sync:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(221);
                    isSync();
                }
                break;
                case Synchronized:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(222);
                    isSynchronized();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdentifierContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(ApsarsParser.Identifier, 0);
        }

        public IdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentifierContext identifier() throws RecognitionException {
        IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_identifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(225);
                match(Identifier);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FullNameContext extends ParserRuleContext {
        public TerminalNode FullName() {
            return getToken(ApsarsParser.FullName, 0);
        }

        public FullNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fullName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterFullName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitFullName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitFullName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FullNameContext fullName() throws RecognitionException {
        FullNameContext _localctx = new FullNameContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_fullName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(227);
                match(FullName);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NumberContext extends ParserRuleContext {
        public TerminalNode Number() {
            return getToken(ApsarsParser.Number, 0);
        }

        public NumberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_number;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterNumber(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitNumber(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitNumber(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NumberContext number() throws RecognitionException {
        NumberContext _localctx = new NumberContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_number);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(229);
                match(Number);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LeftBraceContext extends ParserRuleContext {
        public TerminalNode LeftBrace() {
            return getToken(ApsarsParser.LeftBrace, 0);
        }

        public LeftBraceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_leftBrace;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterLeftBrace(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitLeftBrace(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitLeftBrace(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LeftBraceContext leftBrace() throws RecognitionException {
        LeftBraceContext _localctx = new LeftBraceContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_leftBrace);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(231);
                match(LeftBrace);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RightBraceContext extends ParserRuleContext {
        public TerminalNode RightBrace() {
            return getToken(ApsarsParser.RightBrace, 0);
        }

        public RightBraceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rightBrace;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterRightBrace(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitRightBrace(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitRightBrace(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RightBraceContext rightBrace() throws RecognitionException {
        RightBraceContext _localctx = new RightBraceContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_rightBrace);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(233);
                match(RightBrace);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LeftAngleBracketContext extends ParserRuleContext {
        public TerminalNode LeftAngleBracket() {
            return getToken(ApsarsParser.LeftAngleBracket, 0);
        }

        public LeftAngleBracketContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_leftAngleBracket;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterLeftAngleBracket(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitLeftAngleBracket(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitLeftAngleBracket(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LeftAngleBracketContext leftAngleBracket() throws RecognitionException {
        LeftAngleBracketContext _localctx = new LeftAngleBracketContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_leftAngleBracket);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(235);
                match(LeftAngleBracket);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RightAngleBracketContext extends ParserRuleContext {
        public TerminalNode RightAngleBracket() {
            return getToken(ApsarsParser.RightAngleBracket, 0);
        }

        public RightAngleBracketContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rightAngleBracket;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterRightAngleBracket(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitRightAngleBracket(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitRightAngleBracket(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RightAngleBracketContext rightAngleBracket() throws RecognitionException {
        RightAngleBracketContext _localctx = new RightAngleBracketContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_rightAngleBracket);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(237);
                match(RightAngleBracket);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LessThanContext extends ParserRuleContext {
        public TerminalNode LeftAngleBracket() {
            return getToken(ApsarsParser.LeftAngleBracket, 0);
        }

        public LessThanContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_lessThan;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterLessThan(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitLessThan(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitLessThan(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LessThanContext lessThan() throws RecognitionException {
        LessThanContext _localctx = new LessThanContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_lessThan);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                match(LeftAngleBracket);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MoreThanContext extends ParserRuleContext {
        public TerminalNode RightAngleBracket() {
            return getToken(ApsarsParser.RightAngleBracket, 0);
        }

        public MoreThanContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_moreThan;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterMoreThan(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitMoreThan(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitMoreThan(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MoreThanContext moreThan() throws RecognitionException {
        MoreThanContext _localctx = new MoreThanContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_moreThan);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(241);
                match(RightAngleBracket);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LeftBracketContext extends ParserRuleContext {
        public TerminalNode LeftBracket() {
            return getToken(ApsarsParser.LeftBracket, 0);
        }

        public LeftBracketContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_leftBracket;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterLeftBracket(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitLeftBracket(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitLeftBracket(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LeftBracketContext leftBracket() throws RecognitionException {
        LeftBracketContext _localctx = new LeftBracketContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_leftBracket);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(243);
                match(LeftBracket);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RightBracketContext extends ParserRuleContext {
        public TerminalNode RightBracket() {
            return getToken(ApsarsParser.RightBracket, 0);
        }

        public RightBracketContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rightBracket;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterRightBracket(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitRightBracket(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitRightBracket(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RightBracketContext rightBracket() throws RecognitionException {
        RightBracketContext _localctx = new RightBracketContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_rightBracket);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
                match(RightBracket);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LeftParenthesisContext extends ParserRuleContext {
        public TerminalNode LeftParenthesis() {
            return getToken(ApsarsParser.LeftParenthesis, 0);
        }

        public LeftParenthesisContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_leftParenthesis;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterLeftParenthesis(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitLeftParenthesis(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitLeftParenthesis(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LeftParenthesisContext leftParenthesis() throws RecognitionException {
        LeftParenthesisContext _localctx = new LeftParenthesisContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_leftParenthesis);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(247);
                match(LeftParenthesis);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RightParenthesisContext extends ParserRuleContext {
        public TerminalNode RightParenthesis() {
            return getToken(ApsarsParser.RightParenthesis, 0);
        }

        public RightParenthesisContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rightParenthesis;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterRightParenthesis(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitRightParenthesis(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitRightParenthesis(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RightParenthesisContext rightParenthesis() throws RecognitionException {
        RightParenthesisContext _localctx = new RightParenthesisContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_rightParenthesis);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(249);
                match(RightParenthesis);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LeftParenContext extends ParserRuleContext {
        public TerminalNode LeftParenthesis() {
            return getToken(ApsarsParser.LeftParenthesis, 0);
        }

        public LeftParenContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_leftParen;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterLeftParen(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitLeftParen(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitLeftParen(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LeftParenContext leftParen() throws RecognitionException {
        LeftParenContext _localctx = new LeftParenContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_leftParen);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(251);
                match(LeftParenthesis);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RightParenContext extends ParserRuleContext {
        public TerminalNode RightParenthesis() {
            return getToken(ApsarsParser.RightParenthesis, 0);
        }

        public RightParenContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rightParen;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterRightParen(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitRightParen(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitRightParen(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RightParenContext rightParen() throws RecognitionException {
        RightParenContext _localctx = new RightParenContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_rightParen);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(253);
                match(RightParenthesis);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ColonContext extends ParserRuleContext {
        public TerminalNode Colon() {
            return getToken(ApsarsParser.Colon, 0);
        }

        public ColonContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_colon;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterColon(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitColon(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitColon(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ColonContext colon() throws RecognitionException {
        ColonContext _localctx = new ColonContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_colon);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(255);
                match(Colon);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SemicolonContext extends ParserRuleContext {
        public TerminalNode Semicolon() {
            return getToken(ApsarsParser.Semicolon, 0);
        }

        public SemicolonContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_semicolon;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterSemicolon(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitSemicolon(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitSemicolon(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SemicolonContext semicolon() throws RecognitionException {
        SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_semicolon);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(257);
                match(Semicolon);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CommaContext extends ParserRuleContext {
        public TerminalNode Comma() {
            return getToken(ApsarsParser.Comma, 0);
        }

        public CommaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comma;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterComma(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitComma(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitComma(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CommaContext comma() throws RecognitionException {
        CommaContext _localctx = new CommaContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_comma);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(259);
                match(Comma);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AndContext extends ParserRuleContext {
        public TerminalNode AndSign() {
            return getToken(ApsarsParser.AndSign, 0);
        }

        public AndContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_and;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterAnd(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitAnd(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitAnd(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AndContext and() throws RecognitionException {
        AndContext _localctx = new AndContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_and);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(261);
                match(AndSign);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OrContext extends ParserRuleContext {
        public TerminalNode OrSign() {
            return getToken(ApsarsParser.OrSign, 0);
        }

        public OrContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_or;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterOr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitOr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitOr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OrContext or() throws RecognitionException {
        OrContext _localctx = new OrContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_or);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(263);
                match(OrSign);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ArgAndContext extends ParserRuleContext {
        public TerminalNode ArgAnd() {
            return getToken(ApsarsParser.ArgAnd, 0);
        }

        public ArgAndContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_argAnd;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterArgAnd(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitArgAnd(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitArgAnd(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArgAndContext argAnd() throws RecognitionException {
        ArgAndContext _localctx = new ArgAndContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_argAnd);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(265);
                match(ArgAnd);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ArgOrContext extends ParserRuleContext {
        public TerminalNode ArgOr() {
            return getToken(ApsarsParser.ArgOr, 0);
        }

        public ArgOrContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_argOr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterArgOr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitArgOr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitArgOr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArgOrContext argOr() throws RecognitionException {
        ArgOrContext _localctx = new ArgOrContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_argOr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(267);
                match(ArgOr);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WordAndContext extends ParserRuleContext {
        public TerminalNode WordAnd() {
            return getToken(ApsarsParser.WordAnd, 0);
        }

        public WordAndContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_wordAnd;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterWordAnd(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitWordAnd(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitWordAnd(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WordAndContext wordAnd() throws RecognitionException {
        WordAndContext _localctx = new WordAndContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_wordAnd);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(269);
                match(WordAnd);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WordOrContext extends ParserRuleContext {
        public TerminalNode WordOr() {
            return getToken(ApsarsParser.WordOr, 0);
        }

        public WordOrContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_wordOr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterWordOr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitWordOr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitWordOr(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WordOrContext wordOr() throws RecognitionException {
        WordOrContext _localctx = new WordOrContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_wordOr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(271);
                match(WordOr);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AssignmentContext extends ParserRuleContext {
        public TerminalNode Equal() {
            return getToken(ApsarsParser.Equal, 0);
        }

        public TerminalNode LeftEquals() {
            return getToken(ApsarsParser.LeftEquals, 0);
        }

        public TerminalNode As() {
            return getToken(ApsarsParser.As, 0);
        }

        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterAssignment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitAssignment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitAssignment(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_assignment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(273);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsEqualsContext extends ParserRuleContext {
        public TerminalNode Equals() {
            return getToken(ApsarsParser.Equals, 0);
        }

        public IsEqualsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_isEquals;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterIsEquals(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitIsEquals(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitIsEquals(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IsEqualsContext isEquals() throws RecognitionException {
        IsEqualsContext _localctx = new IsEqualsContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_isEquals);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(275);
                match(Equals);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FieldModifiersContext extends ParserRuleContext {
        public IsTransientContext isTransient() {
            return getRuleContext(IsTransientContext.class, 0);
        }

        public IsVolatileContext isVolatile() {
            return getRuleContext(IsVolatileContext.class, 0);
        }

        public IsOverridableContext isOverridable() {
            return getRuleContext(IsOverridableContext.class, 0);
        }

        public IsHolderContext isHolder() {
            return getRuleContext(IsHolderContext.class, 0);
        }

        public IsGetHolderContext isGetHolder() {
            return getRuleContext(IsGetHolderContext.class, 0);
        }

        public IsSetHolderContext isSetHolder() {
            return getRuleContext(IsSetHolderContext.class, 0);
        }

        public FieldModifiersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldModifiers;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterFieldModifiers(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitFieldModifiers(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitFieldModifiers(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FieldModifiersContext fieldModifiers() throws RecognitionException {
        FieldModifiersContext _localctx = new FieldModifiersContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_fieldModifiers);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(278);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Transient) {
                    {
                        setState(277);
                        isTransient();
                    }
                }

                setState(281);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Volatile) {
                    {
                        setState(280);
                        isVolatile();
                    }
                }

                setState(292);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                    case 1: {
                        setState(284);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Holder) {
                            {
                                setState(283);
                                isHolder();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(287);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == HolderGet) {
                            {
                                setState(286);
                                isGetHolder();
                            }
                        }

                    }
                    break;
                    case 3: {
                        setState(290);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == HolderSet) {
                            {
                                setState(289);
                                isSetHolder();
                            }
                        }

                    }
                    break;
                }
                setState(295);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Overridable) {
                    {
                        setState(294);
                        isOverridable();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MethodModifiersContext extends ParserRuleContext {
        public IsSynchronizedContext isSynchronized() {
            return getRuleContext(IsSynchronizedContext.class, 0);
        }

        public IsSyncContext isSync() {
            return getRuleContext(IsSyncContext.class, 0);
        }

        public MethodModifiersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodModifiers;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterMethodModifiers(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitMethodModifiers(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitMethodModifiers(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MethodModifiersContext methodModifiers() throws RecognitionException {
        MethodModifiersContext _localctx = new MethodModifiersContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_methodModifiers);
        try {
            setState(299);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Synchronized:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(297);
                    isSynchronized();
                }
                break;
                case Sync:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(298);
                    isSync();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MakeAlternateLetContext extends ParserRuleContext {
        public PermissionModifiersContext permissionModifiers() {
            return getRuleContext(PermissionModifiersContext.class, 0);
        }

        public OptionalFieldStaticAndFinalContext optionalFieldStaticAndFinal() {
            return getRuleContext(OptionalFieldStaticAndFinalContext.class, 0);
        }

        public OptionalFieldAndMethodModifiersContext optionalFieldAndMethodModifiers() {
            return getRuleContext(OptionalFieldAndMethodModifiersContext.class, 0);
        }

        public MakeAlternateLetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_makeAlternateLet;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterMakeAlternateLet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitMakeAlternateLet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitMakeAlternateLet(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MakeAlternateLetContext makeAlternateLet() throws RecognitionException {
        MakeAlternateLetContext _localctx = new MakeAlternateLetContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_makeAlternateLet);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(302);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
                    {
                        setState(301);
                        permissionModifiers();
                    }
                }

                setState(310);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                    case 1: {
                        setState(305);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                            case 1: {
                                setState(304);
                                optionalFieldStaticAndFinal();
                            }
                            break;
                        }
                        setState(308);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                            case 1: {
                                setState(307);
                                optionalFieldAndMethodModifiers();
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OptionalFieldAndMethodModifiersContext extends ParserRuleContext {
        public FieldModifiersContext fieldModifiers() {
            return getRuleContext(FieldModifiersContext.class, 0);
        }

        public MethodModifiersContext methodModifiers() {
            return getRuleContext(MethodModifiersContext.class, 0);
        }

        public OptionalFieldAndMethodModifiersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_optionalFieldAndMethodModifiers;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener)
                ((ApsarsListener) listener).enterOptionalFieldAndMethodModifiers(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener)
                ((ApsarsListener) listener).exitOptionalFieldAndMethodModifiers(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitOptionalFieldAndMethodModifiers(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OptionalFieldAndMethodModifiersContext optionalFieldAndMethodModifiers() throws RecognitionException {
        OptionalFieldAndMethodModifiersContext _localctx = new OptionalFieldAndMethodModifiersContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_optionalFieldAndMethodModifiers);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(334);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                    case 1: {
                        setState(313);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                            case 1: {
                                setState(312);
                                fieldModifiers();
                            }
                            break;
                        }
                        setState(316);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Sync || _la == Synchronized) {
                            {
                                setState(315);
                                methodModifiers();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(319);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Sync || _la == Synchronized) {
                            {
                                setState(318);
                                methodModifiers();
                            }
                        }

                        setState(322);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                            case 1: {
                                setState(321);
                                fieldModifiers();
                            }
                            break;
                        }
                    }
                    break;
                    case 3: {
                        setState(327);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2088960L) != 0)) {
                            {
                                setState(324);
                                fieldModifiers();
                                setState(325);
                                methodModifiers();
                            }
                        }

                    }
                    break;
                    case 4: {
                        setState(332);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Sync || _la == Synchronized) {
                            {
                                setState(329);
                                methodModifiers();
                                setState(330);
                                fieldModifiers();
                            }
                        }

                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OptionalFieldStaticAndFinalContext extends ParserRuleContext {
        public FieldFinalContext fieldFinal() {
            return getRuleContext(FieldFinalContext.class, 0);
        }

        public IsStaticContext isStatic() {
            return getRuleContext(IsStaticContext.class, 0);
        }

        public OptionalFieldStaticAndFinalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_optionalFieldStaticAndFinal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterOptionalFieldStaticAndFinal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitOptionalFieldStaticAndFinal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitOptionalFieldStaticAndFinal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OptionalFieldStaticAndFinalContext optionalFieldStaticAndFinal() throws RecognitionException {
        OptionalFieldStaticAndFinalContext _localctx = new OptionalFieldStaticAndFinalContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_optionalFieldStaticAndFinal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(358);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
                    case 1: {
                        setState(337);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Final || _la == Val) {
                            {
                                setState(336);
                                fieldFinal();
                            }
                        }

                        setState(340);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Static) {
                            {
                                setState(339);
                                isStatic();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(343);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Static) {
                            {
                                setState(342);
                                isStatic();
                            }
                        }

                        setState(346);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Final || _la == Val) {
                            {
                                setState(345);
                                fieldFinal();
                            }
                        }

                    }
                    break;
                    case 3: {
                        setState(351);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Final || _la == Val) {
                            {
                                setState(348);
                                fieldFinal();
                                setState(349);
                                isStatic();
                            }
                        }

                    }
                    break;
                    case 4: {
                        setState(356);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Static) {
                            {
                                setState(353);
                                isStatic();
                                setState(354);
                                fieldFinal();
                            }
                        }

                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OptionalStaticAndFinalContext extends ParserRuleContext {
        public List<IsFinalContext> isFinal() {
            return getRuleContexts(IsFinalContext.class);
        }

        public IsFinalContext isFinal(int i) {
            return getRuleContext(IsFinalContext.class, i);
        }

        public List<IsStaticContext> isStatic() {
            return getRuleContexts(IsStaticContext.class);
        }

        public IsStaticContext isStatic(int i) {
            return getRuleContext(IsStaticContext.class, i);
        }

        public OptionalStaticAndFinalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_optionalStaticAndFinal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterOptionalStaticAndFinal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitOptionalStaticAndFinal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitOptionalStaticAndFinal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final OptionalStaticAndFinalContext optionalStaticAndFinal() throws RecognitionException {
        OptionalStaticAndFinalContext _localctx = new OptionalStaticAndFinalContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_optionalStaticAndFinal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(362);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(362);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case Final: {
                                setState(360);
                                isFinal();
                            }
                            break;
                            case Static: {
                                setState(361);
                                isStatic();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(364);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == Final || _la == Static);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PermissionModifiersContext extends ParserRuleContext {
        public IsPublicContext isPublic() {
            return getRuleContext(IsPublicContext.class, 0);
        }

        public IsPrivateContext isPrivate() {
            return getRuleContext(IsPrivateContext.class, 0);
        }

        public IsProtectedContext isProtected() {
            return getRuleContext(IsProtectedContext.class, 0);
        }

        public PermissionModifiersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_permissionModifiers;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterPermissionModifiers(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitPermissionModifiers(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitPermissionModifiers(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PermissionModifiersContext permissionModifiers() throws RecognitionException {
        PermissionModifiersContext _localctx = new PermissionModifiersContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_permissionModifiers);
        try {
            setState(369);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Public:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(366);
                    isPublic();
                }
                break;
                case Private:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(367);
                    isPrivate();
                }
                break;
                case Protected:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(368);
                    isProtected();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PackageIdentifierContext extends ParserRuleContext {
        public TerminalNode FullName() {
            return getToken(ApsarsParser.FullName, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public PackageIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_packageIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterPackageIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitPackageIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitPackageIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PackageIdentifierContext packageIdentifier() throws RecognitionException {
        PackageIdentifierContext _localctx = new PackageIdentifierContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_packageIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(373);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case FullName: {
                        setState(371);
                        match(FullName);
                    }
                    break;
                    case Identifier: {
                        setState(372);
                        identifier();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FullNameIdentifierContext extends ParserRuleContext {
        public TerminalNode FullName() {
            return getToken(ApsarsParser.FullName, 0);
        }

        public FullNameIdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fullNameIdentifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterFullNameIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitFullNameIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitFullNameIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FullNameIdentifierContext fullNameIdentifier() throws RecognitionException {
        FullNameIdentifierContext _localctx = new FullNameIdentifierContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_fullNameIdentifier);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(375);
                match(FullName);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FieldFinalContext extends ParserRuleContext {
        public IsValContext isVal() {
            return getRuleContext(IsValContext.class, 0);
        }

        public IsFinalContext isFinal() {
            return getRuleContext(IsFinalContext.class, 0);
        }

        public FieldFinalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldFinal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterFieldFinal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitFieldFinal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitFieldFinal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FieldFinalContext fieldFinal() throws RecognitionException {
        FieldFinalContext _localctx = new FieldFinalContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_fieldFinal);
        try {
            setState(379);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Val:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(377);
                    isVal();
                }
                break;
                case Final:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(378);
                    isFinal();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MethodFinalContext extends ParserRuleContext {
        public IsFinalContext isFinal() {
            return getRuleContext(IsFinalContext.class, 0);
        }

        public MethodFinalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodFinal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterMethodFinal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitMethodFinal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitMethodFinal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MethodFinalContext methodFinal() throws RecognitionException {
        MethodFinalContext _localctx = new MethodFinalContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_methodFinal);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(381);
                isFinal();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ClassFinalContext extends ParserRuleContext {
        public IsUniqueContext isUnique() {
            return getRuleContext(IsUniqueContext.class, 0);
        }

        public IsFinalContext isFinal() {
            return getRuleContext(IsFinalContext.class, 0);
        }

        public ClassFinalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classFinal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterClassFinal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitClassFinal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitClassFinal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ClassFinalContext classFinal() throws RecognitionException {
        ClassFinalContext _localctx = new ClassFinalContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_classFinal);
        try {
            setState(385);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Unique:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(383);
                    isUnique();
                }
                break;
                case Final:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(384);
                    isFinal();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefineMethodContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public LeftParenContext leftParen() {
            return getRuleContext(LeftParenContext.class, 0);
        }

        public LeftBraceContext leftBrace() {
            return getRuleContext(LeftBraceContext.class, 0);
        }

        public RightBraceContext rightBrace() {
            return getRuleContext(RightBraceContext.class, 0);
        }

        public RightParenContext rightParen() {
            return getRuleContext(RightParenContext.class, 0);
        }

        public PermissionModifiersContext permissionModifiers() {
            return getRuleContext(PermissionModifiersContext.class, 0);
        }

        public AlternateStaticAndFinalAndSyncContext alternateStaticAndFinalAndSync() {
            return getRuleContext(AlternateStaticAndFinalAndSyncContext.class, 0);
        }

        public MethodReturnTypeContext methodReturnType() {
            return getRuleContext(MethodReturnTypeContext.class, 0);
        }

        public MethodParamListDefinitionContext methodParamListDefinition() {
            return getRuleContext(MethodParamListDefinitionContext.class, 0);
        }

        public DefineMethodBodyContext defineMethodBody() {
            return getRuleContext(DefineMethodBodyContext.class, 0);
        }

        public DefineMethodContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defineMethod;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterDefineMethod(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitDefineMethod(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitDefineMethod(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefineMethodContext defineMethod() throws RecognitionException {
        DefineMethodContext _localctx = new DefineMethodContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_defineMethod);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(388);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
                    {
                        setState(387);
                        permissionModifiers();
                    }
                }

                setState(391);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
                    case 1: {
                        setState(390);
                        alternateStaticAndFinalAndSync();
                    }
                    break;
                }
                setState(393);
                identifier();
                setState(394);
                leftParen();
                setState(399);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case RightParenthesis: {
                        setState(395);
                        rightParen();
                    }
                    break;
                    case Identifier: {
                        {
                            setState(396);
                            methodParamListDefinition();
                            setState(397);
                            rightParen();
                        }
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(402);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Colon) {
                    {
                        setState(401);
                        methodReturnType();
                    }
                }

                setState(404);
                leftBrace();
                {
                    setState(406);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
                        case 1: {
                            setState(405);
                            defineMethodBody();
                        }
                        break;
                    }
                }
                setState(408);
                rightBrace();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MethodReturnTypeContext extends ParserRuleContext {
        public ColonContext colon() {
            return getRuleContext(ColonContext.class, 0);
        }

        public ArgTypeContext argType() {
            return getRuleContext(ArgTypeContext.class, 0);
        }

        public MethodReturnTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodReturnType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterMethodReturnType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitMethodReturnType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitMethodReturnType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MethodReturnTypeContext methodReturnType() throws RecognitionException {
        MethodReturnTypeContext _localctx = new MethodReturnTypeContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_methodReturnType);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(410);
                    colon();
                    setState(411);
                    argType();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AlternateStaticAndFinalAndSyncContext extends ParserRuleContext {
        public OptionalStaticAndFinalContext optionalStaticAndFinal() {
            return getRuleContext(OptionalStaticAndFinalContext.class, 0);
        }

        public SyncContext sync() {
            return getRuleContext(SyncContext.class, 0);
        }

        public AlternateStaticAndFinalAndSyncContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_alternateStaticAndFinalAndSync;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener)
                ((ApsarsListener) listener).enterAlternateStaticAndFinalAndSync(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener)
                ((ApsarsListener) listener).exitAlternateStaticAndFinalAndSync(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitAlternateStaticAndFinalAndSync(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AlternateStaticAndFinalAndSyncContext alternateStaticAndFinalAndSync() throws RecognitionException {
        AlternateStaticAndFinalAndSyncContext _localctx = new AlternateStaticAndFinalAndSyncContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_alternateStaticAndFinalAndSync);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(435);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                    case 1: {
                        setState(414);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Final || _la == Static) {
                            {
                                setState(413);
                                optionalStaticAndFinal();
                            }
                        }

                        setState(417);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Sync || _la == Synchronized) {
                            {
                                setState(416);
                                sync();
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(420);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Sync || _la == Synchronized) {
                            {
                                setState(419);
                                sync();
                            }
                        }

                        setState(423);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Final || _la == Static) {
                            {
                                setState(422);
                                optionalStaticAndFinal();
                            }
                        }

                    }
                    break;
                    case 3: {
                        setState(428);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Final || _la == Static) {
                            {
                                setState(425);
                                optionalStaticAndFinal();
                                setState(426);
                                sync();
                            }
                        }

                    }
                    break;
                    case 4: {
                        setState(433);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Sync || _la == Synchronized) {
                            {
                                setState(430);
                                sync();
                                setState(431);
                                optionalStaticAndFinal();
                            }
                        }

                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefineMethodBodyContext extends ParserRuleContext {
        public List<DefineStatementContext> defineStatement() {
            return getRuleContexts(DefineStatementContext.class);
        }

        public DefineStatementContext defineStatement(int i) {
            return getRuleContext(DefineStatementContext.class, i);
        }

        public DefineMethodBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defineMethodBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterDefineMethodBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitDefineMethodBody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitDefineMethodBody(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefineMethodBodyContext defineMethodBody() throws RecognitionException {
        DefineMethodBodyContext _localctx = new DefineMethodBodyContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_defineMethodBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(440);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Number) {
                    {
                        {
                            setState(437);
                            defineStatement();
                        }
                    }
                    setState(442);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefineStatementContext extends ParserRuleContext {
        public NumberContext number() {
            return getRuleContext(NumberContext.class, 0);
        }

        public DefineStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defineStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterDefineStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitDefineStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitDefineStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefineStatementContext defineStatement() throws RecognitionException {
        DefineStatementContext _localctx = new DefineStatementContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_defineStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(443);
                number();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MethodParamListDefinitionContext extends ParserRuleContext {
        public List<ParamTypeContext> paramType() {
            return getRuleContexts(ParamTypeContext.class);
        }

        public ParamTypeContext paramType(int i) {
            return getRuleContext(ParamTypeContext.class, i);
        }

        public List<CommaContext> comma() {
            return getRuleContexts(CommaContext.class);
        }

        public CommaContext comma(int i) {
            return getRuleContext(CommaContext.class, i);
        }

        public MethodParamListDefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_methodParamListDefinition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterMethodParamListDefinition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitMethodParamListDefinition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitMethodParamListDefinition(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MethodParamListDefinitionContext methodParamListDefinition() throws RecognitionException {
        MethodParamListDefinitionContext _localctx = new MethodParamListDefinitionContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_methodParamListDefinition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(445);
                paramType();
                setState(451);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(446);
                            comma();
                            setState(447);
                            paramType();
                        }
                    }
                    setState(453);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ParamTypeContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ColonContext colon() {
            return getRuleContext(ColonContext.class, 0);
        }

        public ArgTypeContext argType() {
            return getRuleContext(ArgTypeContext.class, 0);
        }

        public ParamTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_paramType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterParamType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitParamType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitParamType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParamTypeContext paramType() throws RecognitionException {
        ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_paramType);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(454);
                identifier();
                setState(455);
                colon();
                setState(456);
                argType();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ArgTypeContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TypedArgTypeContext typedArgType() {
            return getRuleContext(TypedArgTypeContext.class, 0);
        }

        public ArrayArgTypeContext arrayArgType() {
            return getRuleContext(ArrayArgTypeContext.class, 0);
        }

        public ArgTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_argType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterArgType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitArgType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitArgType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArgTypeContext argType() throws RecognitionException {
        ArgTypeContext _localctx = new ArgTypeContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_argType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(458);
                identifier();
                setState(460);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == LeftAngleBracket) {
                    {
                        setState(459);
                        typedArgType();
                    }
                }

                setState(463);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 51, _ctx)) {
                    case 1: {
                        setState(462);
                        arrayArgType();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExtraArgTypesContext extends ParserRuleContext {
        public ArgTypeContext argType() {
            return getRuleContext(ArgTypeContext.class, 0);
        }

        public CommaContext comma() {
            return getRuleContext(CommaContext.class, 0);
        }

        public AndContext and() {
            return getRuleContext(AndContext.class, 0);
        }

        public ArgAndContext argAnd() {
            return getRuleContext(ArgAndContext.class, 0);
        }

        public OrContext or() {
            return getRuleContext(OrContext.class, 0);
        }

        public ExtraArgTypesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_extraArgTypes;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterExtraArgTypes(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitExtraArgTypes(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitExtraArgTypes(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExtraArgTypesContext extraArgTypes() throws RecognitionException {
        ExtraArgTypesContext _localctx = new ExtraArgTypesContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_extraArgTypes);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(469);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case Comma: {
                        setState(465);
                        comma();
                    }
                    break;
                    case AndSign: {
                        setState(466);
                        and();
                    }
                    break;
                    case ArgAnd: {
                        setState(467);
                        argAnd();
                    }
                    break;
                    case OrSign: {
                        setState(468);
                        or();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(471);
                argType();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TypedArgTypeContext extends ParserRuleContext {
        public LeftAngleBracketContext leftAngleBracket() {
            return getRuleContext(LeftAngleBracketContext.class, 0);
        }

        public ArgTypeContext argType() {
            return getRuleContext(ArgTypeContext.class, 0);
        }

        public RightAngleBracketContext rightAngleBracket() {
            return getRuleContext(RightAngleBracketContext.class, 0);
        }

        public List<ExtraArgTypesContext> extraArgTypes() {
            return getRuleContexts(ExtraArgTypesContext.class);
        }

        public ExtraArgTypesContext extraArgTypes(int i) {
            return getRuleContext(ExtraArgTypesContext.class, i);
        }

        public TypedArgTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typedArgType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterTypedArgType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitTypedArgType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitTypedArgType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TypedArgTypeContext typedArgType() throws RecognitionException {
        TypedArgTypeContext _localctx = new TypedArgTypeContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_typedArgType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(473);
                leftAngleBracket();
                setState(474);
                argType();
                setState(478);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3865470566400L) != 0)) {
                    {
                        {
                            setState(475);
                            extraArgTypes();
                        }
                    }
                    setState(480);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(481);
                rightAngleBracket();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ArrayArgTypeContext extends ParserRuleContext {
        public List<ArrayDefinitionContext> arrayDefinition() {
            return getRuleContexts(ArrayDefinitionContext.class);
        }

        public ArrayDefinitionContext arrayDefinition(int i) {
            return getRuleContext(ArrayDefinitionContext.class, i);
        }

        public ArrayArgTypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayArgType;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterArrayArgType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitArrayArgType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitArrayArgType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArrayArgTypeContext arrayArgType() throws RecognitionException {
        ArrayArgTypeContext _localctx = new ArrayArgTypeContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_arrayArgType);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(486);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LeftBracket) {
                    {
                        {
                            setState(483);
                            arrayDefinition();
                        }
                    }
                    setState(488);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ArrayDefinitionContext extends ParserRuleContext {
        public LeftBracketContext leftBracket() {
            return getRuleContext(LeftBracketContext.class, 0);
        }

        public RightBracketContext rightBracket() {
            return getRuleContext(RightBracketContext.class, 0);
        }

        public NumberContext number() {
            return getRuleContext(NumberContext.class, 0);
        }

        public ArrayDefinitionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayDefinition;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterArrayDefinition(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitArrayDefinition(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitArrayDefinition(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArrayDefinitionContext arrayDefinition() throws RecognitionException {
        ArrayDefinitionContext _localctx = new ArrayDefinitionContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_arrayDefinition);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(489);
                leftBracket();
                setState(491);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Number) {
                    {
                        setState(490);
                        number();
                    }
                }

                setState(493);
                rightBracket();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefineClassContext extends ParserRuleContext {
        public ClassContext class_() {
            return getRuleContext(ClassContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public LeftBraceContext leftBrace() {
            return getRuleContext(LeftBraceContext.class, 0);
        }

        public RightBraceContext rightBrace() {
            return getRuleContext(RightBraceContext.class, 0);
        }

        public PermissionModifiersContext permissionModifiers() {
            return getRuleContext(PermissionModifiersContext.class, 0);
        }

        public ClassFinalContext classFinal() {
            return getRuleContext(ClassFinalContext.class, 0);
        }

        public MakeAlternateLetAndContentContext makeAlternateLetAndContent() {
            return getRuleContext(MakeAlternateLetAndContentContext.class, 0);
        }

        public DefineClassContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defineClass;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterDefineClass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitDefineClass(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitDefineClass(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefineClassContext defineClass() throws RecognitionException {
        DefineClassContext _localctx = new DefineClassContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_defineClass);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(496);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
                    {
                        setState(495);
                        permissionModifiers();
                    }
                }

                setState(499);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Final || _la == Unique) {
                    {
                        setState(498);
                        classFinal();
                    }
                }

                setState(501);
                class_();
                setState(502);
                identifier();
                setState(503);
                leftBrace();
                setState(509);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
                    case 1: {
                        setState(504);
                        rightBrace();
                    }
                    break;
                    case 2: {
                        setState(506);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3671230L) != 0)) {
                            {
                                setState(505);
                                makeAlternateLetAndContent();
                            }
                        }

                        setState(508);
                        rightBrace();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MakeAlternateLetAndContentContext extends ParserRuleContext {
        public List<DefineLetContext> defineLet() {
            return getRuleContexts(DefineLetContext.class);
        }

        public DefineLetContext defineLet(int i) {
            return getRuleContext(DefineLetContext.class, i);
        }

        public List<DefineClassContentContext> defineClassContent() {
            return getRuleContexts(DefineClassContentContext.class);
        }

        public DefineClassContentContext defineClassContent(int i) {
            return getRuleContext(DefineClassContentContext.class, i);
        }

        public MakeAlternateLetAndContentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_makeAlternateLetAndContent;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterMakeAlternateLetAndContent(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitMakeAlternateLetAndContent(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitMakeAlternateLetAndContent(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MakeAlternateLetAndContentContext makeAlternateLetAndContent() throws RecognitionException {
        MakeAlternateLetAndContentContext _localctx = new MakeAlternateLetAndContentContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_makeAlternateLetAndContent);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(513);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(513);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case Let: {
                                setState(511);
                                defineLet();
                            }
                            break;
                            case Public:
                            case Private:
                            case Protected:
                            case Final:
                            case Val:
                            case Static:
                            case Sync:
                            case Synchronized:
                            case Identifier: {
                                setState(512);
                                defineClassContent();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(515);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3671230L) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefineClassContentContext extends ParserRuleContext {
        public List<DefineMethodContext> defineMethod() {
            return getRuleContexts(DefineMethodContext.class);
        }

        public DefineMethodContext defineMethod(int i) {
            return getRuleContext(DefineMethodContext.class, i);
        }

        public List<DefineMemberFieldContext> defineMemberField() {
            return getRuleContexts(DefineMemberFieldContext.class);
        }

        public DefineMemberFieldContext defineMemberField(int i) {
            return getRuleContext(DefineMemberFieldContext.class, i);
        }

        public DefineClassContentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defineClassContent;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterDefineClassContent(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitDefineClassContent(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitDefineClassContent(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefineClassContentContext defineClassContent() throws RecognitionException {
        DefineClassContentContext _localctx = new DefineClassContentContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_defineClassContent);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(519);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            setState(519);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 62, _ctx)) {
                                case 1: {
                                    setState(517);
                                    defineMethod();
                                }
                                break;
                                case 2: {
                                    setState(518);
                                    defineMemberField();
                                }
                                break;
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(521);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 63, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefineLetContext extends ParserRuleContext {
        public LetContext let() {
            return getRuleContext(LetContext.class, 0);
        }

        public LeftBraceContext leftBrace() {
            return getRuleContext(LeftBraceContext.class, 0);
        }

        public RightBraceContext rightBrace() {
            return getRuleContext(RightBraceContext.class, 0);
        }

        public MakeAlternateLetContext makeAlternateLet() {
            return getRuleContext(MakeAlternateLetContext.class, 0);
        }

        public DefineClassContentContext defineClassContent() {
            return getRuleContext(DefineClassContentContext.class, 0);
        }

        public DefineLetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defineLet;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterDefineLet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitDefineLet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor) return ((ApsarsVisitor<? extends T>) visitor).visitDefineLet(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefineLetContext defineLet() throws RecognitionException {
        DefineLetContext _localctx = new DefineLetContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_defineLet);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(523);
                let();
                setState(525);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
                    case 1: {
                        setState(524);
                        makeAlternateLet();
                    }
                    break;
                }
                setState(527);
                leftBrace();
                setState(529);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3671102L) != 0)) {
                    {
                        setState(528);
                        defineClassContent();
                    }
                }

                setState(531);
                rightBrace();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DefineMemberFieldContext extends ParserRuleContext {
        public OptionalFieldStaticAndFinalContext optionalFieldStaticAndFinal() {
            return getRuleContext(OptionalFieldStaticAndFinalContext.class, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public ColonContext colon() {
            return getRuleContext(ColonContext.class, 0);
        }

        public SemicolonContext semicolon() {
            return getRuleContext(SemicolonContext.class, 0);
        }

        public PermissionModifiersContext permissionModifiers() {
            return getRuleContext(PermissionModifiersContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public DefineStatementContext defineStatement() {
            return getRuleContext(DefineStatementContext.class, 0);
        }

        public DefineMemberFieldContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_defineMemberField;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).enterDefineMemberField(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ApsarsListener) ((ApsarsListener) listener).exitDefineMemberField(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ApsarsVisitor)
                return ((ApsarsVisitor<? extends T>) visitor).visitDefineMemberField(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DefineMemberFieldContext defineMemberField() throws RecognitionException {
        DefineMemberFieldContext _localctx = new DefineMemberFieldContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_defineMemberField);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(534);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
                    {
                        setState(533);
                        permissionModifiers();
                    }
                }

                setState(536);
                optionalFieldStaticAndFinal();
                setState(537);
                identifier();
                setState(538);
                colon();
                setState(539);
                identifier();
                setState(543);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) {
                    {
                        setState(540);
                        assignment();
                        setState(541);
                        defineStatement();
                    }
                }

                setState(545);
                semicolon();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\u0004\u0001-\u0224\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
                    "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015" +
                    "\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018" +
                    "\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b" +
                    "\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e" +
                    "\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002" +
                    "#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002" +
                    "(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002" +
                    "-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002" +
                    "2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002" +
                    "7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002" +
                    "<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002" +
                    "A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002" +
                    "F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002" +
                    "K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0001\u0000\u0003\u0000" +
                    "\u00a0\b\u0000\u0001\u0000\u0005\u0000\u00a3\b\u0000\n\u0000\f\u0000\u00a6" +
                    "\t\u0000\u0001\u0000\u0005\u0000\u00a9\b\u0000\n\u0000\f\u0000\u00ac\t" +
                    "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001" +
                    "\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001" +
                    "\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001" +
                    "\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001" +
                    "\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f" +
                    "\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012" +
                    "\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015" +
                    "\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017" +
                    "\u00e0\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a" +
                    "\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d" +
                    "\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001" +
                    " \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001" +
                    "%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001" +
                    "*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001" +
                    "/\u00010\u00010\u00011\u00011\u00012\u00032\u0117\b2\u00012\u00032\u011a" +
                    "\b2\u00012\u00032\u011d\b2\u00012\u00032\u0120\b2\u00012\u00032\u0123" +
                    "\b2\u00032\u0125\b2\u00012\u00032\u0128\b2\u00013\u00013\u00033\u012c" +
                    "\b3\u00014\u00034\u012f\b4\u00014\u00034\u0132\b4\u00014\u00034\u0135" +
                    "\b4\u00034\u0137\b4\u00015\u00035\u013a\b5\u00015\u00035\u013d\b5\u0001" +
                    "5\u00035\u0140\b5\u00015\u00035\u0143\b5\u00015\u00015\u00015\u00035\u0148" +
                    "\b5\u00015\u00015\u00015\u00035\u014d\b5\u00035\u014f\b5\u00016\u0003" +
                    "6\u0152\b6\u00016\u00036\u0155\b6\u00016\u00036\u0158\b6\u00016\u0003" +
                    "6\u015b\b6\u00016\u00016\u00016\u00036\u0160\b6\u00016\u00016\u00016\u0003" +
                    "6\u0165\b6\u00036\u0167\b6\u00017\u00017\u00047\u016b\b7\u000b7\f7\u016c" +
                    "\u00018\u00018\u00018\u00038\u0172\b8\u00019\u00019\u00039\u0176\b9\u0001" +
                    ":\u0001:\u0001;\u0001;\u0003;\u017c\b;\u0001<\u0001<\u0001=\u0001=\u0003" +
                    "=\u0182\b=\u0001>\u0003>\u0185\b>\u0001>\u0003>\u0188\b>\u0001>\u0001" +
                    ">\u0001>\u0001>\u0001>\u0001>\u0003>\u0190\b>\u0001>\u0003>\u0193\b>\u0001" +
                    ">\u0001>\u0003>\u0197\b>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001@\u0003" +
                    "@\u019f\b@\u0001@\u0003@\u01a2\b@\u0001@\u0003@\u01a5\b@\u0001@\u0003" +
                    "@\u01a8\b@\u0001@\u0001@\u0001@\u0003@\u01ad\b@\u0001@\u0001@\u0001@\u0003" +
                    "@\u01b2\b@\u0003@\u01b4\b@\u0001A\u0005A\u01b7\bA\nA\fA\u01ba\tA\u0001" +
                    "B\u0001B\u0001C\u0001C\u0001C\u0001C\u0005C\u01c2\bC\nC\fC\u01c5\tC\u0001" +
                    "D\u0001D\u0001D\u0001D\u0001E\u0001E\u0003E\u01cd\bE\u0001E\u0003E\u01d0" +
                    "\bE\u0001F\u0001F\u0001F\u0001F\u0003F\u01d6\bF\u0001F\u0001F\u0001G\u0001" +
                    "G\u0001G\u0005G\u01dd\bG\nG\fG\u01e0\tG\u0001G\u0001G\u0001H\u0005H\u01e5" +
                    "\bH\nH\fH\u01e8\tH\u0001I\u0001I\u0003I\u01ec\bI\u0001I\u0001I\u0001J" +
                    "\u0003J\u01f1\bJ\u0001J\u0003J\u01f4\bJ\u0001J\u0001J\u0001J\u0001J\u0001" +
                    "J\u0003J\u01fb\bJ\u0001J\u0003J\u01fe\bJ\u0001K\u0001K\u0004K\u0202\b" +
                    "K\u000bK\fK\u0203\u0001L\u0001L\u0004L\u0208\bL\u000bL\fL\u0209\u0001" +
                    "M\u0001M\u0003M\u020e\bM\u0001M\u0001M\u0003M\u0212\bM\u0001M\u0001M\u0001" +
                    "N\u0003N\u0217\bN\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003" +
                    "N\u0220\bN\u0001N\u0001N\u0001N\u0001\u00aa\u0000O\u0000\u0002\u0004\u0006" +
                    "\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,." +
                    "02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088" +
                    "\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u0000\u0001" +
                    "\u0001\u0000$&\u0223\u0000\u009f\u0001\u0000\u0000\u0000\u0002\u00ad\u0001" +
                    "\u0000\u0000\u0000\u0004\u00b1\u0001\u0000\u0000\u0000\u0006\u00b5\u0001" +
                    "\u0000\u0000\u0000\b\u00b7\u0001\u0000\u0000\u0000\n\u00b9\u0001\u0000" +
                    "\u0000\u0000\f\u00bb\u0001\u0000\u0000\u0000\u000e\u00bd\u0001\u0000\u0000" +
                    "\u0000\u0010\u00bf\u0001\u0000\u0000\u0000\u0012\u00c1\u0001\u0000\u0000" +
                    "\u0000\u0014\u00c3\u0001\u0000\u0000\u0000\u0016\u00c5\u0001\u0000\u0000" +
                    "\u0000\u0018\u00c7\u0001\u0000\u0000\u0000\u001a\u00c9\u0001\u0000\u0000" +
                    "\u0000\u001c\u00cb\u0001\u0000\u0000\u0000\u001e\u00cd\u0001\u0000\u0000" +
                    "\u0000 \u00cf\u0001\u0000\u0000\u0000\"\u00d1\u0001\u0000\u0000\u0000" +
                    "$\u00d3\u0001\u0000\u0000\u0000&\u00d5\u0001\u0000\u0000\u0000(\u00d7" +
                    "\u0001\u0000\u0000\u0000*\u00d9\u0001\u0000\u0000\u0000,\u00db\u0001\u0000" +
                    "\u0000\u0000.\u00df\u0001\u0000\u0000\u00000\u00e1\u0001\u0000\u0000\u0000" +
                    "2\u00e3\u0001\u0000\u0000\u00004\u00e5\u0001\u0000\u0000\u00006\u00e7" +
                    "\u0001\u0000\u0000\u00008\u00e9\u0001\u0000\u0000\u0000:\u00eb\u0001\u0000" +
                    "\u0000\u0000<\u00ed\u0001\u0000\u0000\u0000>\u00ef\u0001\u0000\u0000\u0000" +
                    "@\u00f1\u0001\u0000\u0000\u0000B\u00f3\u0001\u0000\u0000\u0000D\u00f5" +
                    "\u0001\u0000\u0000\u0000F\u00f7\u0001\u0000\u0000\u0000H\u00f9\u0001\u0000" +
                    "\u0000\u0000J\u00fb\u0001\u0000\u0000\u0000L\u00fd\u0001\u0000\u0000\u0000" +
                    "N\u00ff\u0001\u0000\u0000\u0000P\u0101\u0001\u0000\u0000\u0000R\u0103" +
                    "\u0001\u0000\u0000\u0000T\u0105\u0001\u0000\u0000\u0000V\u0107\u0001\u0000" +
                    "\u0000\u0000X\u0109\u0001\u0000\u0000\u0000Z\u010b\u0001\u0000\u0000\u0000" +
                    "\\\u010d\u0001\u0000\u0000\u0000^\u010f\u0001\u0000\u0000\u0000`\u0111" +
                    "\u0001\u0000\u0000\u0000b\u0113\u0001\u0000\u0000\u0000d\u0116\u0001\u0000" +
                    "\u0000\u0000f\u012b\u0001\u0000\u0000\u0000h\u012e\u0001\u0000\u0000\u0000" +
                    "j\u014e\u0001\u0000\u0000\u0000l\u0166\u0001\u0000\u0000\u0000n\u016a" +
                    "\u0001\u0000\u0000\u0000p\u0171\u0001\u0000\u0000\u0000r\u0175\u0001\u0000" +
                    "\u0000\u0000t\u0177\u0001\u0000\u0000\u0000v\u017b\u0001\u0000\u0000\u0000" +
                    "x\u017d\u0001\u0000\u0000\u0000z\u0181\u0001\u0000\u0000\u0000|\u0184" +
                    "\u0001\u0000\u0000\u0000~\u019a\u0001\u0000\u0000\u0000\u0080\u01b3\u0001" +
                    "\u0000\u0000\u0000\u0082\u01b8\u0001\u0000\u0000\u0000\u0084\u01bb\u0001" +
                    "\u0000\u0000\u0000\u0086\u01bd\u0001\u0000\u0000\u0000\u0088\u01c6\u0001" +
                    "\u0000\u0000\u0000\u008a\u01ca\u0001\u0000\u0000\u0000\u008c\u01d5\u0001" +
                    "\u0000\u0000\u0000\u008e\u01d9\u0001\u0000\u0000\u0000\u0090\u01e6\u0001" +
                    "\u0000\u0000\u0000\u0092\u01e9\u0001\u0000\u0000\u0000\u0094\u01f0\u0001" +
                    "\u0000\u0000\u0000\u0096\u0201\u0001\u0000\u0000\u0000\u0098\u0207\u0001" +
                    "\u0000\u0000\u0000\u009a\u020b\u0001\u0000\u0000\u0000\u009c\u0216\u0001" +
                    "\u0000\u0000\u0000\u009e\u00a0\u0003\u0002\u0001\u0000\u009f\u009e\u0001" +
                    "\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a4\u0001" +
                    "\u0000\u0000\u0000\u00a1\u00a3\u0003\u0004\u0002\u0000\u00a2\u00a1\u0001" +
                    "\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001" +
                    "\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00aa\u0001" +
                    "\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003" +
                    "\u0094J\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000" +
                    "\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000" +
                    "\u0000\u0000\u00ab\u0001\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000" +
                    "\u0000\u0000\u00ad\u00ae\u0003\u0014\n\u0000\u00ae\u00af\u0003r9\u0000" +
                    "\u00af\u00b0\u0003P(\u0000\u00b0\u0003\u0001\u0000\u0000\u0000\u00b1\u00b2" +
                    "\u0003\u0016\u000b\u0000\u00b2\u00b3\u0003t:\u0000\u00b3\u00b4\u0003P" +
                    "(\u0000\u00b4\u0005\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0001\u0000" +
                    "\u0000\u00b6\u0007\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0002\u0000" +
                    "\u0000\u00b8\t\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000" +
                    "\u00ba\u000b\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0004\u0000\u0000" +
                    "\u00bc\r\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0005\u0000\u0000\u00be" +
                    "\u000f\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0006\u0000\u0000\u00c0" +
                    "\u0011\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0007\u0000\u0000\u00c2" +
                    "\u0013\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\b\u0000\u0000\u00c4\u0015" +
                    "\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\t\u0000\u0000\u00c6\u0017\u0001" +
                    "\u0000\u0000\u0000\u00c7\u00c8\u0005\n\u0000\u0000\u00c8\u0019\u0001\u0000" +
                    "\u0000\u0000\u00c9\u00ca\u0005\u000b\u0000\u0000\u00ca\u001b\u0001\u0000" +
                    "\u0000\u0000\u00cb\u00cc\u0005\f\u0000\u0000\u00cc\u001d\u0001\u0000\u0000" +
                    "\u0000\u00cd\u00ce\u0005\r\u0000\u0000\u00ce\u001f\u0001\u0000\u0000\u0000" +
                    "\u00cf\u00d0\u0005\u000e\u0000\u0000\u00d0!\u0001\u0000\u0000\u0000\u00d1" +
                    "\u00d2\u0005\u000f\u0000\u0000\u00d2#\u0001\u0000\u0000\u0000\u00d3\u00d4" +
                    "\u0005\u0010\u0000\u0000\u00d4%\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005" +
                    "\u0011\u0000\u0000\u00d6\'\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0012" +
                    "\u0000\u0000\u00d8)\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0013\u0000" +
                    "\u0000\u00da+\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0014\u0000\u0000" +
                    "\u00dc-\u0001\u0000\u0000\u0000\u00dd\u00e0\u0003*\u0015\u0000\u00de\u00e0" +
                    "\u0003,\u0016\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001" +
                    "\u0000\u0000\u0000\u00e0/\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0015" +
                    "\u0000\u0000\u00e21\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0016\u0000" +
                    "\u0000\u00e43\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0017\u0000\u0000" +
                    "\u00e65\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0018\u0000\u0000\u00e8" +
                    "7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0019\u0000\u0000\u00ea9\u0001" +
                    "\u0000\u0000\u0000\u00eb\u00ec\u0005\u001a\u0000\u0000\u00ec;\u0001\u0000" +
                    "\u0000\u0000\u00ed\u00ee\u0005\u001b\u0000\u0000\u00ee=\u0001\u0000\u0000" +
                    "\u0000\u00ef\u00f0\u0005\u001a\u0000\u0000\u00f0?\u0001\u0000\u0000\u0000" +
                    "\u00f1\u00f2\u0005\u001b\u0000\u0000\u00f2A\u0001\u0000\u0000\u0000\u00f3" +
                    "\u00f4\u0005\u001c\u0000\u0000\u00f4C\u0001\u0000\u0000\u0000\u00f5\u00f6" +
                    "\u0005\u001d\u0000\u0000\u00f6E\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005" +
                    "\u001e\u0000\u0000\u00f8G\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u001f" +
                    "\u0000\u0000\u00faI\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u001e\u0000" +
                    "\u0000\u00fcK\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u001f\u0000\u0000" +
                    "\u00feM\u0001\u0000\u0000\u0000\u00ff\u0100\u0005 \u0000\u0000\u0100O" +
                    "\u0001\u0000\u0000\u0000\u0101\u0102\u0005!\u0000\u0000\u0102Q\u0001\u0000" +
                    "\u0000\u0000\u0103\u0104\u0005\"\u0000\u0000\u0104S\u0001\u0000\u0000" +
                    "\u0000\u0105\u0106\u0005\'\u0000\u0000\u0106U\u0001\u0000\u0000\u0000" +
                    "\u0107\u0108\u0005(\u0000\u0000\u0108W\u0001\u0000\u0000\u0000\u0109\u010a" +
                    "\u0005)\u0000\u0000\u010aY\u0001\u0000\u0000\u0000\u010b\u010c\u0005*" +
                    "\u0000\u0000\u010c[\u0001\u0000\u0000\u0000\u010d\u010e\u0005+\u0000\u0000" +
                    "\u010e]\u0001\u0000\u0000\u0000\u010f\u0110\u0005,\u0000\u0000\u0110_" +
                    "\u0001\u0000\u0000\u0000\u0111\u0112\u0007\u0000\u0000\u0000\u0112a\u0001" +
                    "\u0000\u0000\u0000\u0113\u0114\u0005#\u0000\u0000\u0114c\u0001\u0000\u0000" +
                    "\u0000\u0115\u0117\u0003\u001e\u000f\u0000\u0116\u0115\u0001\u0000\u0000" +
                    "\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000" +
                    "\u0000\u0118\u011a\u0003 \u0010\u0000\u0119\u0118\u0001\u0000\u0000\u0000" +
                    "\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u0124\u0001\u0000\u0000\u0000" +
                    "\u011b\u011d\u0003\"\u0011\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c" +
                    "\u011d\u0001\u0000\u0000\u0000\u011d\u0125\u0001\u0000\u0000\u0000\u011e" +
                    "\u0120\u0003$\u0012\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120" +
                    "\u0001\u0000\u0000\u0000\u0120\u0125\u0001\u0000\u0000\u0000\u0121\u0123" +
                    "\u0003&\u0013\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001" +
                    "\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u011c\u0001" +
                    "\u0000\u0000\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0122\u0001" +
                    "\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0001" +
                    "\u0000\u0000\u0000\u0126\u0128\u0003(\u0014\u0000\u0127\u0126\u0001\u0000" +
                    "\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128e\u0001\u0000\u0000" +
                    "\u0000\u0129\u012c\u0003,\u0016\u0000\u012a\u012c\u0003*\u0015\u0000\u012b" +
                    "\u0129\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c" +
                    "g\u0001\u0000\u0000\u0000\u012d\u012f\u0003p8\u0000\u012e\u012d\u0001" +
                    "\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0136\u0001" +
                    "\u0000\u0000\u0000\u0130\u0132\u0003l6\u0000\u0131\u0130\u0001\u0000\u0000" +
                    "\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000" +
                    "\u0000\u0133\u0135\u0003j5\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134" +
                    "\u0135\u0001\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136" +
                    "\u0131\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137" +
                    "i\u0001\u0000\u0000\u0000\u0138\u013a\u0003d2\u0000\u0139\u0138\u0001" +
                    "\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0001" +
                    "\u0000\u0000\u0000\u013b\u013d\u0003f3\u0000\u013c\u013b\u0001\u0000\u0000" +
                    "\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u014f\u0001\u0000\u0000" +
                    "\u0000\u013e\u0140\u0003f3\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f" +
                    "\u0140\u0001\u0000\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141" +
                    "\u0143\u0003d2\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001" +
                    "\u0000\u0000\u0000\u0143\u014f\u0001\u0000\u0000\u0000\u0144\u0145\u0003" +
                    "d2\u0000\u0145\u0146\u0003f3\u0000\u0146\u0148\u0001\u0000\u0000\u0000" +
                    "\u0147\u0144\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000" +
                    "\u0148\u014f\u0001\u0000\u0000\u0000\u0149\u014a\u0003f3\u0000\u014a\u014b" +
                    "\u0003d2\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u0149\u0001\u0000" +
                    "\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000" +
                    "\u0000\u0000\u014e\u0139\u0001\u0000\u0000\u0000\u014e\u013f\u0001\u0000" +
                    "\u0000\u0000\u014e\u0147\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000" +
                    "\u0000\u0000\u014fk\u0001\u0000\u0000\u0000\u0150\u0152\u0003v;\u0000" +
                    "\u0151\u0150\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000" +
                    "\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0155\u0003\u0018\f\u0000\u0154" +
                    "\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155" +
                    "\u0167\u0001\u0000\u0000\u0000\u0156\u0158\u0003\u0018\f\u0000\u0157\u0156" +
                    "\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a" +
                    "\u0001\u0000\u0000\u0000\u0159\u015b\u0003v;\u0000\u015a\u0159\u0001\u0000" +
                    "\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u0167\u0001\u0000" +
                    "\u0000\u0000\u015c\u015d\u0003v;\u0000\u015d\u015e\u0003\u0018\f\u0000" +
                    "\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015c\u0001\u0000\u0000\u0000" +
                    "\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0167\u0001\u0000\u0000\u0000" +
                    "\u0161\u0162\u0003\u0018\f\u0000\u0162\u0163\u0003v;\u0000\u0163\u0165" +
                    "\u0001\u0000\u0000\u0000\u0164\u0161\u0001\u0000\u0000\u0000\u0164\u0165" +
                    "\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u0151" +
                    "\u0001\u0000\u0000\u0000\u0166\u0157\u0001\u0000\u0000\u0000\u0166\u015f" +
                    "\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167m\u0001" +
                    "\u0000\u0000\u0000\u0168\u016b\u0003\f\u0006\u0000\u0169\u016b\u0003\u0018" +
                    "\f\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000" +
                    "\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000" +
                    "\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016do\u0001\u0000\u0000\u0000" +
                    "\u016e\u0172\u0003\u0006\u0003\u0000\u016f\u0172\u0003\b\u0004\u0000\u0170" +
                    "\u0172\u0003\n\u0005\u0000\u0171\u016e\u0001\u0000\u0000\u0000\u0171\u016f" +
                    "\u0001\u0000\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172q\u0001" +
                    "\u0000\u0000\u0000\u0173\u0176\u0005\u0016\u0000\u0000\u0174\u0176\u0003" +
                    "0\u0018\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0174\u0001\u0000" +
                    "\u0000\u0000\u0176s\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u0016\u0000" +
                    "\u0000\u0178u\u0001\u0000\u0000\u0000\u0179\u017c\u0003\u000e\u0007\u0000" +
                    "\u017a\u017c\u0003\f\u0006\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b" +
                    "\u017a\u0001\u0000\u0000\u0000\u017cw\u0001\u0000\u0000\u0000\u017d\u017e" +
                    "\u0003\f\u0006\u0000\u017ey\u0001\u0000\u0000\u0000\u017f\u0182\u0003" +
                    "\u0010\b\u0000\u0180\u0182\u0003\f\u0006\u0000\u0181\u017f\u0001\u0000" +
                    "\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182{\u0001\u0000\u0000" +
                    "\u0000\u0183\u0185\u0003p8\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184" +
                    "\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186" +
                    "\u0188\u0003\u0080@\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0187\u0188" +
                    "\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a" +
                    "\u00030\u0018\u0000\u018a\u018f\u0003J%\u0000\u018b\u0190\u0003L&\u0000" +
                    "\u018c\u018d\u0003\u0086C\u0000\u018d\u018e\u0003L&\u0000\u018e\u0190" +
                    "\u0001\u0000\u0000\u0000\u018f\u018b\u0001\u0000\u0000\u0000\u018f\u018c" +
                    "\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u0193" +
                    "\u0003~?\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000" +
                    "\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0196\u00036\u001b" +
                    "\u0000\u0195\u0197\u0003\u0082A\u0000\u0196\u0195\u0001\u0000\u0000\u0000" +
                    "\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000" +
                    "\u0198\u0199\u00038\u001c\u0000\u0199}\u0001\u0000\u0000\u0000\u019a\u019b" +
                    "\u0003N\'\u0000\u019b\u019c\u0003\u008aE\u0000\u019c\u007f\u0001\u0000" +
                    "\u0000\u0000\u019d\u019f\u0003n7\u0000\u019e\u019d\u0001\u0000\u0000\u0000" +
                    "\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000" +
                    "\u01a0\u01a2\u0003.\u0017\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1" +
                    "\u01a2\u0001\u0000\u0000\u0000\u01a2\u01b4\u0001\u0000\u0000\u0000\u01a3" +
                    "\u01a5\u0003.\u0017\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5" +
                    "\u0001\u0000\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a8" +
                    "\u0003n7\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000" +
                    "\u0000\u0000\u01a8\u01b4\u0001\u0000\u0000\u0000\u01a9\u01aa\u0003n7\u0000" +
                    "\u01aa\u01ab\u0003.\u0017\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac" +
                    "\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad" +
                    "\u01b4\u0001\u0000\u0000\u0000\u01ae\u01af\u0003.\u0017\u0000\u01af\u01b0" +
                    "\u0003n7\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01ae\u0001\u0000" +
                    "\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000" +
                    "\u0000\u0000\u01b3\u019e\u0001\u0000\u0000\u0000\u01b3\u01a4\u0001\u0000" +
                    "\u0000\u0000\u01b3\u01ac\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000" +
                    "\u0000\u0000\u01b4\u0081\u0001\u0000\u0000\u0000\u01b5\u01b7\u0003\u0084" +
                    "B\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000" +
                    "\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000" +
                    "\u0000\u01b9\u0083\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000" +
                    "\u0000\u01bb\u01bc\u00034\u001a\u0000\u01bc\u0085\u0001\u0000\u0000\u0000" +
                    "\u01bd\u01c3\u0003\u0088D\u0000\u01be\u01bf\u0003R)\u0000\u01bf\u01c0" +
                    "\u0003\u0088D\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01be\u0001" +
                    "\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001" +
                    "\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u0087\u0001" +
                    "\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003" +
                    "0\u0018\u0000\u01c7\u01c8\u0003N\'\u0000\u01c8\u01c9\u0003\u008aE\u0000" +
                    "\u01c9\u0089\u0001\u0000\u0000\u0000\u01ca\u01cc\u00030\u0018\u0000\u01cb" +
                    "\u01cd\u0003\u008eG\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd" +
                    "\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01d0" +
                    "\u0003\u0090H\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001" +
                    "\u0000\u0000\u0000\u01d0\u008b\u0001\u0000\u0000\u0000\u01d1\u01d6\u0003" +
                    "R)\u0000\u01d2\u01d6\u0003T*\u0000\u01d3\u01d6\u0003X,\u0000\u01d4\u01d6" +
                    "\u0003V+\u0000\u01d5\u01d1\u0001\u0000\u0000\u0000\u01d5\u01d2\u0001\u0000" +
                    "\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000" +
                    "\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0003\u008a" +
                    "E\u0000\u01d8\u008d\u0001\u0000\u0000\u0000\u01d9\u01da\u0003:\u001d\u0000" +
                    "\u01da\u01de\u0003\u008aE\u0000\u01db\u01dd\u0003\u008cF\u0000\u01dc\u01db" +
                    "\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc" +
                    "\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e1" +
                    "\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e2" +
                    "\u0003<\u001e\u0000\u01e2\u008f\u0001\u0000\u0000\u0000\u01e3\u01e5\u0003" +
                    "\u0092I\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001\u0000" +
                    "\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000" +
                    "\u0000\u0000\u01e7\u0091\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000" +
                    "\u0000\u0000\u01e9\u01eb\u0003B!\u0000\u01ea\u01ec\u00034\u001a\u0000" +
                    "\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000" +
                    "\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003D\"\u0000\u01ee" +
                    "\u0093\u0001\u0000\u0000\u0000\u01ef\u01f1\u0003p8\u0000\u01f0\u01ef\u0001" +
                    "\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f3\u0001" +
                    "\u0000\u0000\u0000\u01f2\u01f4\u0003z=\u0000\u01f3\u01f2\u0001\u0000\u0000" +
                    "\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000" +
                    "\u0000\u01f5\u01f6\u0003\u001a\r\u0000\u01f6\u01f7\u00030\u0018\u0000" +
                    "\u01f7\u01fd\u00036\u001b\u0000\u01f8\u01fe\u00038\u001c\u0000\u01f9\u01fb" +
                    "\u0003\u0096K\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001" +
                    "\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0003" +
                    "8\u001c\u0000\u01fd\u01f8\u0001\u0000\u0000\u0000\u01fd\u01fa\u0001\u0000" +
                    "\u0000\u0000\u01fe\u0095\u0001\u0000\u0000\u0000\u01ff\u0202\u0003\u009a" +
                    "M\u0000\u0200\u0202\u0003\u0098L\u0000\u0201\u01ff\u0001\u0000\u0000\u0000" +
                    "\u0201\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000" +
                    "\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000" +
                    "\u0204\u0097\u0001\u0000\u0000\u0000\u0205\u0208\u0003|>\u0000\u0206\u0208" +
                    "\u0003\u009cN\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0206\u0001" +
                    "\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u0207\u0001" +
                    "\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u0099\u0001" +
                    "\u0000\u0000\u0000\u020b\u020d\u0003\u0012\t\u0000\u020c\u020e\u0003h" +
                    "4\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000" +
                    "\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0211\u00036\u001b\u0000" +
                    "\u0210\u0212\u0003\u0098L\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0211" +
                    "\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213" +
                    "\u0214\u00038\u001c\u0000\u0214\u009b\u0001\u0000\u0000\u0000\u0215\u0217" +
                    "\u0003p8\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000" +
                    "\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0003l6\u0000" +
                    "\u0219\u021a\u00030\u0018\u0000\u021a\u021b\u0003N\'\u0000\u021b\u021f" +
                    "\u00030\u0018\u0000\u021c\u021d\u0003`0\u0000\u021d\u021e\u0003\u0084" +
                    "B\u0000\u021e\u0220\u0001\u0000\u0000\u0000\u021f\u021c\u0001\u0000\u0000" +
                    "\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000" +
                    "\u0000\u0221\u0222\u0003P(\u0000\u0222\u009d\u0001\u0000\u0000\u0000D" +
                    "\u009f\u00a4\u00aa\u00df\u0116\u0119\u011c\u011f\u0122\u0124\u0127\u012b" +
                    "\u012e\u0131\u0134\u0136\u0139\u013c\u013f\u0142\u0147\u014c\u014e\u0151" +
                    "\u0154\u0157\u015a\u015f\u0164\u0166\u016a\u016c\u0171\u0175\u017b\u0181" +
                    "\u0184\u0187\u018f\u0192\u0196\u019e\u01a1\u01a4\u01a7\u01ac\u01b1\u01b3" +
                    "\u01b8\u01c3\u01cc\u01cf\u01d5\u01de\u01e6\u01eb\u01f0\u01f3\u01fa\u01fd" +
                    "\u0201\u0203\u0207\u0209\u020d\u0211\u0216\u021f";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}