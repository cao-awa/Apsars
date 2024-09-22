// Generated from D:/Codes/Java/Apsars/grammar/pure/PureApsars.g4 by ANTLR 4.13.1
package com.github.cao.awa.apsars.antlr.pure;

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
public class PureApsarsParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, Public = 5, Private = 6, Protected = 7, Final = 8,
			Val = 9, Unique = 10, Inline = 11, Let = 12, Package = 13, Import = 14, Static = 15,
			Class = 16, Return = 17, Yield = 18, Transient = 19, Volatile = 20, Holder = 21, HolderGet = 22,
			HolderSet = 23, Overridable = 24, Sync = 25, Synchronized = 26, Try = 27, Catch = 28,
			Ignored = 29, Print = 30, Deliver = 31, With = 32, Template = 33, Constructor = 34,
			Point = 35, LeftBrace = 36, RightBrace = 37, LeftAngleBracket = 38, RightAngleBracket = 39,
			LeftBracket = 40, RightBracket = 41, LeftParenthesis = 42, RightParenthesis = 43,
			Colon = 44, Semicolon = 45, Comma = 46, Equals = 47, Equal = 48, LeftPointing = 49,
			RightPointing = 50, As = 51, AndSign = 52, OrSign = 53, ArgAnd = 54, ArgOr = 55, WordAnd = 56,
			WordOr = 57, AddisionAssignment = 58, SubtractionAssignment = 59, MultiplicationAssignment = 60,
			DivisionAssignment = 61, PowAssignment = 62, Plus = 63, Minus = 64, Multiply = 65,
			Divide = 66, Pow = 67, BreakingAndSign = 68, BreakingOrSign = 69, Not = 70, AtSign = 71,
			Quotation = 72, Null = 73, True = 74, False = 75, Identifier = 76, FullName = 77,
			Number = 78, WHITESPACES = 79;
	public static final int
			RULE_program = 0, RULE_definePackage = 1, RULE_defineImport = 2, RULE_isPublic = 3,
			RULE_isPrivate = 4, RULE_isProtected = 5, RULE_isFinal = 6, RULE_isVal = 7,
			RULE_isUnique = 8, RULE_isInline = 9, RULE_let = 10, RULE_packageAt = 11,
			RULE_importting = 12, RULE_isStatic = 13, RULE_classKeyword = 14, RULE_returnKeyword = 15,
			RULE_yieldKeyword = 16, RULE_isTransient = 17, RULE_isVolatile = 18, RULE_isHolder = 19,
			RULE_isGetHolder = 20, RULE_isSetHolder = 21, RULE_isOverridable = 22,
			RULE_catching = 23, RULE_ignored = 24, RULE_print = 25, RULE_deliver = 26,
			RULE_with = 27, RULE_isSync = 28, RULE_isSynchronized = 29, RULE_sync = 30,
			RULE_template = 31, RULE_constructor = 32, RULE_newKeyword = 33, RULE_ifKeyword = 34,
			RULE_elseKeyword = 35, RULE_point = 36, RULE_leftBrace = 37, RULE_rightBrace = 38,
			RULE_leftAngleBracket = 39, RULE_rightAngleBracket = 40, RULE_leftBracket = 41,
			RULE_rightBracket = 42, RULE_leftParenthesis = 43, RULE_rightParenthesis = 44,
			RULE_leftParen = 45, RULE_rightParen = 46, RULE_colon = 47, RULE_semicolon = 48,
			RULE_comma = 49, RULE_and = 50, RULE_or = 51, RULE_argAnd = 52, RULE_argOr = 53,
			RULE_wordAnd = 54, RULE_wordOr = 55, RULE_addisionAssignment = 56, RULE_subtractionAssignment = 57,
			RULE_multiplicationAssignment = 58, RULE_divisionAssignment = 59, RULE_powAssignment = 60,
			RULE_plus = 61, RULE_minus = 62, RULE_multiply = 63, RULE_divide = 64,
			RULE_pow = 65, RULE_operator = 66, RULE_arithmetic = 67, RULE_breakingAnd = 68,
			RULE_breakingOr = 69, RULE_not = 70, RULE_lessThan = 71, RULE_moreThan = 72,
			RULE_comparingAnd = 73, RULE_comparingOr = 74, RULE_comparing = 75, RULE_atSign = 76,
			RULE_null = 77, RULE_bool = 78, RULE_assignment = 79, RULE_isEquals = 80,
			RULE_fullNameOrIdentifier = 81, RULE_identifier = 82, RULE_fullName = 83,
			RULE_number = 84, RULE_fieldModifiers = 85, RULE_methodModifiers = 86,
			RULE_makeAlternateLet = 87, RULE_optionalFieldAndMethodModifiers = 88,
			RULE_optionalFieldStaticAndFinal = 89, RULE_optionalStaticAndFinal = 90,
			RULE_permissionModifiers = 91, RULE_packageIdentifier = 92, RULE_fullNameIdentifier = 93,
			RULE_fieldFinal = 94, RULE_methodFinal = 95, RULE_classFinal = 96, RULE_assignmentIdentifier = 97,
			RULE_variableModifiers = 98, RULE_defineMethodUsingTemplate = 99, RULE_defineMethod = 100,
			RULE_defineConstructor = 101, RULE_defineLetMethod = 102, RULE_methodReturnType = 103,
			RULE_alternateMethodModifiers = 104, RULE_defineMethodBody = 105, RULE_methodParamListDefinition = 106,
			RULE_paramType = 107, RULE_argType = 108, RULE_extraArgTypes = 109, RULE_typedArgType = 110,
			RULE_arrayArgType = 111, RULE_arrayDefinition = 112, RULE_tokenList = 113,
			RULE_validToken = 114, RULE_extraToken = 115, RULE_constant = 116, RULE_string = 117,
			RULE_identifierOrSpace = 118, RULE_spacing = 119, RULE_annotation = 120,
			RULE_defineStatement = 121, RULE_theStatement = 122, RULE_resultPresenting = 123,
			RULE_resultingStatement = 124, RULE_calculatableResultPresenting = 125,
			RULE_ifStatement = 126, RULE_elseIfStatement = 127, RULE_elseStatement = 128,
			RULE_statementBlock = 129, RULE_calculateStatementWithParen = 130, RULE_calculateLeftStatementWithParen = 131,
			RULE_calculateStatement = 132, RULE_calculateStatementWithTotalParen = 133,
			RULE_calculateLeft = 134, RULE_extraCalculateStatement = 135, RULE_returnStatement = 136,
			RULE_yieldStatement = 137, RULE_invokeStatement = 138, RULE_fluentInvokeStatement = 139,
			RULE_newInstanceStatement = 140, RULE_tryStatement = 141, RULE_refCall = 142,
			RULE_refCallFrom = 143, RULE_refCallMethod = 144, RULE_withMessage = 145,
			RULE_tryStatementBody = 146, RULE_catchingStatementBody = 147, RULE_tryCatchList = 148,
			RULE_tryCatchListExtraType = 149, RULE_invokeParamList = 150, RULE_validInvokeParam = 151,
			RULE_validExtraInvokeParam = 152, RULE_defineVariableStatement = 153,
			RULE_variableName = 154, RULE_defineClass = 155, RULE_makeAlternateLetAndContent = 156,
			RULE_defineClassContent = 157, RULE_defineLetClassContent = 158, RULE_defineLet = 159,
			RULE_defineMemberField = 160, RULE_defineLetMemberField = 161, RULE_fieldName = 162;

	private static String[] makeRuleNames() {
		return new String[]{
				"program", "definePackage", "defineImport", "isPublic", "isPrivate",
				"isProtected", "isFinal", "isVal", "isUnique", "isInline", "let", "packageAt",
				"importting", "isStatic", "classKeyword", "returnKeyword", "yieldKeyword",
				"isTransient", "isVolatile", "isHolder", "isGetHolder", "isSetHolder",
				"isOverridable", "catching", "ignored", "print", "deliver", "with", "isSync",
				"isSynchronized", "sync", "template", "constructor", "newKeyword", "ifKeyword",
				"elseKeyword", "point", "leftBrace", "rightBrace", "leftAngleBracket",
				"rightAngleBracket", "leftBracket", "rightBracket", "leftParenthesis",
				"rightParenthesis", "leftParen", "rightParen", "colon", "semicolon",
				"comma", "and", "or", "argAnd", "argOr", "wordAnd", "wordOr", "addisionAssignment",
				"subtractionAssignment", "multiplicationAssignment", "divisionAssignment",
				"powAssignment", "plus", "minus", "multiply", "divide", "pow", "operator",
				"arithmetic", "breakingAnd", "breakingOr", "not", "lessThan", "moreThan",
				"comparingAnd", "comparingOr", "comparing", "atSign", "null", "bool",
				"assignment", "isEquals", "fullNameOrIdentifier", "identifier", "fullName",
				"number", "fieldModifiers", "methodModifiers", "makeAlternateLet", "optionalFieldAndMethodModifiers",
				"optionalFieldStaticAndFinal", "optionalStaticAndFinal", "permissionModifiers",
				"packageIdentifier", "fullNameIdentifier", "fieldFinal", "methodFinal",
				"classFinal", "assignmentIdentifier", "variableModifiers", "defineMethodUsingTemplate",
				"defineMethod", "defineConstructor", "defineLetMethod", "methodReturnType",
				"alternateMethodModifiers", "defineMethodBody", "methodParamListDefinition",
				"paramType", "argType", "extraArgTypes", "typedArgType", "arrayArgType",
				"arrayDefinition", "tokenList", "validToken", "extraToken", "constant",
				"string", "identifierOrSpace", "spacing", "annotation", "defineStatement",
				"theStatement", "resultPresenting", "resultingStatement", "calculatableResultPresenting",
				"ifStatement", "elseIfStatement", "elseStatement", "statementBlock",
				"calculateStatementWithParen", "calculateLeftStatementWithParen", "calculateStatement",
				"calculateStatementWithTotalParen", "calculateLeft", "extraCalculateStatement",
				"returnStatement", "yieldStatement", "invokeStatement", "fluentInvokeStatement",
				"newInstanceStatement", "tryStatement", "refCall", "refCallFrom", "refCallMethod",
				"withMessage", "tryStatementBody", "catchingStatementBody", "tryCatchList",
				"tryCatchListExtraType", "invokeParamList", "validInvokeParam", "validExtraInvokeParam",
				"defineVariableStatement", "variableName", "defineClass", "makeAlternateLetAndContent",
				"defineClassContent", "defineLetClassContent", "defineLet", "defineMemberField",
				"defineLetMemberField", "fieldName"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "'new'", "'if'", "'else'", "'\\{'", "'public'", "'private'", "'protected'",
				"'final'", "'val'", "'unique'", "'inline'", "'let'", "'package'", "'import'",
				"'static'", "'class'", "'return'", "'yield'", "'transient'", "'volatile'",
				"'holder'", "'holder-get'", "'holder-set'", "'overridable'", "'sync'",
				"'synchronized'", "'try'", "'catch'", "'ignored'", "'print'", "'deliver'",
				"'with'", "'template'", "'constructor'", "'.'", "'{'", "'}'", "'<'",
				"'>'", "'['", "']'", "'('", "')'", "':'", "';'", "','", "'=='", "'='",
				"'<-'", "'->'", "' as '", "'&'", "'|'", "' and '", "' or '", "'and'",
				"'or'", "'+='", "'-='", "'*='", "'/='", "'^='", "'+'", "'-'", "'*'",
				"'/'", "'^'", "'&&'", "'||'", "'!'", "'@'", "'\"'", null, "'true'", "'false'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, null, null, null, "Public", "Private", "Protected", "Final",
				"Val", "Unique", "Inline", "Let", "Package", "Import", "Static", "Class",
				"Return", "Yield", "Transient", "Volatile", "Holder", "HolderGet", "HolderSet",
				"Overridable", "Sync", "Synchronized", "Try", "Catch", "Ignored", "Print",
				"Deliver", "With", "Template", "Constructor", "Point", "LeftBrace", "RightBrace",
				"LeftAngleBracket", "RightAngleBracket", "LeftBracket", "RightBracket",
				"LeftParenthesis", "RightParenthesis", "Colon", "Semicolon", "Comma",
				"Equals", "Equal", "LeftPointing", "RightPointing", "As", "AndSign",
				"OrSign", "ArgAnd", "ArgOr", "WordAnd", "WordOr", "AddisionAssignment",
				"SubtractionAssignment", "MultiplicationAssignment", "DivisionAssignment",
				"PowAssignment", "Plus", "Minus", "Multiply", "Divide", "Pow", "BreakingAndSign",
				"BreakingOrSign", "Not", "AtSign", "Quotation", "Null", "True", "False",
				"Identifier", "FullName", "Number", "WHITESPACES"
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
		return "PureApsars.g4";
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

	public PureApsarsParser(TokenStream input) {
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterProgram(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitProgram(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitProgram(this);
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
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Package) {
					{
						setState(326);
						definePackage();
					}
				}

				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Import) {
					{
						{
							setState(329);
							defineImport();
						}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
				while (_alt != 1 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1 + 1) {
						{
							{
								setState(335);
								defineClass();
							}
						}
					}
					setState(340);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefinePackage(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefinePackage(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefinePackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinePackageContext definePackage() throws RecognitionException {
		DefinePackageContext _localctx = new DefinePackageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definePackage);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(341);
				packageAt();
				setState(342);
				packageIdentifier();
				setState(343);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineImport(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineImport(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineImportContext defineImport() throws RecognitionException {
		DefineImportContext _localctx = new DefineImportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defineImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(345);
				importting();
				setState(346);
				fullNameIdentifier();
				setState(347);
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
			return getToken(PureApsarsParser.Public, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsPublic(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsPublic(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsPublic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsPublicContext isPublic() throws RecognitionException {
		IsPublicContext _localctx = new IsPublicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_isPublic);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(349);
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
			return getToken(PureApsarsParser.Private, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsPrivate(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsPrivate(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsPrivate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsPrivateContext isPrivate() throws RecognitionException {
		IsPrivateContext _localctx = new IsPrivateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_isPrivate);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(351);
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
			return getToken(PureApsarsParser.Protected, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsProtected(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsProtected(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsProtected(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsProtectedContext isProtected() throws RecognitionException {
		IsProtectedContext _localctx = new IsProtectedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_isProtected);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(353);
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
			return getToken(PureApsarsParser.Final, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsFinal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsFinal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsFinalContext isFinal() throws RecognitionException {
		IsFinalContext _localctx = new IsFinalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_isFinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(355);
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
			return getToken(PureApsarsParser.Val, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsVal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsVal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsValContext isVal() throws RecognitionException {
		IsValContext _localctx = new IsValContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_isVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(357);
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
			return getToken(PureApsarsParser.Unique, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsUnique(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsUnique(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsUnique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsUniqueContext isUnique() throws RecognitionException {
		IsUniqueContext _localctx = new IsUniqueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_isUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(359);
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
	public static class IsInlineContext extends ParserRuleContext {
		public TerminalNode Inline() {
			return getToken(PureApsarsParser.Inline, 0);
		}

		public IsInlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_isInline;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsInline(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsInline(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsInline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsInlineContext isInline() throws RecognitionException {
		IsInlineContext _localctx = new IsInlineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_isInline);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(361);
				match(Inline);
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
			return getToken(PureApsarsParser.Let, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterLet(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitLet(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor) return ((PureApsarsVisitor<? extends T>) visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(363);
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
			return getToken(PureApsarsParser.Package, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterPackageAt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitPackageAt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitPackageAt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageAtContext packageAt() throws RecognitionException {
		PackageAtContext _localctx = new PackageAtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_packageAt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(365);
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
			return getToken(PureApsarsParser.Import, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterImportting(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitImportting(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitImportting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImporttingContext importting() throws RecognitionException {
		ImporttingContext _localctx = new ImporttingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_importting);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(367);
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
			return getToken(PureApsarsParser.Static, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsStatic(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsStatic(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsStatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsStaticContext isStatic() throws RecognitionException {
		IsStaticContext _localctx = new IsStaticContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_isStatic);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(369);
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
	public static class ClassKeywordContext extends ParserRuleContext {
		public TerminalNode Class() {
			return getToken(PureApsarsParser.Class, 0);
		}

		public ClassKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_classKeyword;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterClassKeyword(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitClassKeyword(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitClassKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassKeywordContext classKeyword() throws RecognitionException {
		ClassKeywordContext _localctx = new ClassKeywordContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(371);
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
	public static class ReturnKeywordContext extends ParserRuleContext {
		public TerminalNode Return() {
			return getToken(PureApsarsParser.Return, 0);
		}

		public ReturnKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_returnKeyword;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterReturnKeyword(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitReturnKeyword(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitReturnKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnKeywordContext returnKeyword() throws RecognitionException {
		ReturnKeywordContext _localctx = new ReturnKeywordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(373);
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
	public static class YieldKeywordContext extends ParserRuleContext {
		public TerminalNode Yield() {
			return getToken(PureApsarsParser.Yield, 0);
		}

		public YieldKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_yieldKeyword;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterYieldKeyword(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitYieldKeyword(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitYieldKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldKeywordContext yieldKeyword() throws RecognitionException {
		YieldKeywordContext _localctx = new YieldKeywordContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_yieldKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(375);
				match(Yield);
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
			return getToken(PureApsarsParser.Transient, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsTransient(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsTransient(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsTransient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsTransientContext isTransient() throws RecognitionException {
		IsTransientContext _localctx = new IsTransientContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_isTransient);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(377);
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
			return getToken(PureApsarsParser.Volatile, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsVolatile(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsVolatile(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsVolatile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsVolatileContext isVolatile() throws RecognitionException {
		IsVolatileContext _localctx = new IsVolatileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_isVolatile);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(379);
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
			return getToken(PureApsarsParser.Holder, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsHolder(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsHolder(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsHolder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsHolderContext isHolder() throws RecognitionException {
		IsHolderContext _localctx = new IsHolderContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_isHolder);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(381);
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
			return getToken(PureApsarsParser.HolderGet, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsGetHolder(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsGetHolder(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsGetHolder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsGetHolderContext isGetHolder() throws RecognitionException {
		IsGetHolderContext _localctx = new IsGetHolderContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_isGetHolder);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(383);
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
			return getToken(PureApsarsParser.HolderSet, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsSetHolder(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsSetHolder(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsSetHolder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsSetHolderContext isSetHolder() throws RecognitionException {
		IsSetHolderContext _localctx = new IsSetHolderContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_isSetHolder);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(385);
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
			return getToken(PureApsarsParser.Overridable, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsOverridable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsOverridable(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsOverridable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsOverridableContext isOverridable() throws RecognitionException {
		IsOverridableContext _localctx = new IsOverridableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_isOverridable);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(387);
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
	public static class CatchingContext extends ParserRuleContext {
		public TerminalNode Catch() {
			return getToken(PureApsarsParser.Catch, 0);
		}

		public CatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_catching;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterCatching(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitCatching(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitCatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchingContext catching() throws RecognitionException {
		CatchingContext _localctx = new CatchingContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_catching);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(389);
				match(Catch);
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
	public static class IgnoredContext extends ParserRuleContext {
		public TerminalNode Ignored() {
			return getToken(PureApsarsParser.Ignored, 0);
		}

		public IgnoredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ignored;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIgnored(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIgnored(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIgnored(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredContext ignored() throws RecognitionException {
		IgnoredContext _localctx = new IgnoredContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ignored);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(391);
				match(Ignored);
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Print() {
			return getToken(PureApsarsParser.Print, 0);
		}

		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_print;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterPrint(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitPrint(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(393);
				match(Print);
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
	public static class DeliverContext extends ParserRuleContext {
		public TerminalNode Deliver() {
			return getToken(PureApsarsParser.Deliver, 0);
		}

		public DeliverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_deliver;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDeliver(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDeliver(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDeliver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeliverContext deliver() throws RecognitionException {
		DeliverContext _localctx = new DeliverContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_deliver);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(395);
				match(Deliver);
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
	public static class WithContext extends ParserRuleContext {
		public TerminalNode With() {
			return getToken(PureApsarsParser.With, 0);
		}

		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_with;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterWith(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitWith(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor) return ((PureApsarsVisitor<? extends T>) visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_with);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(397);
				match(With);
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
			return getToken(PureApsarsParser.Sync, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsSync(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsSync(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsSync(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsSyncContext isSync() throws RecognitionException {
		IsSyncContext _localctx = new IsSyncContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_isSync);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(399);
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
			return getToken(PureApsarsParser.Synchronized, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsSynchronized(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsSynchronized(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsSynchronized(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsSynchronizedContext isSynchronized() throws RecognitionException {
		IsSynchronizedContext _localctx = new IsSynchronizedContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_isSynchronized);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(401);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterSync(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitSync(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor) return ((PureApsarsVisitor<? extends T>) visitor).visitSync(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyncContext sync() throws RecognitionException {
		SyncContext _localctx = new SyncContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sync);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Sync:
					enterOuterAlt(_localctx, 1);
				{
					setState(403);
					isSync();
				}
				break;
				case Synchronized:
					enterOuterAlt(_localctx, 2);
				{
					setState(404);
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
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode Template() {
			return getToken(PureApsarsParser.Template, 0);
		}

		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_template;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterTemplate(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitTemplate(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(407);
				match(Template);
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode Constructor() {
			return getToken(PureApsarsParser.Constructor, 0);
		}

		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constructor;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterConstructor(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitConstructor(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(409);
				match(Constructor);
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
	public static class NewKeywordContext extends ParserRuleContext {
		public NewKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_newKeyword;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterNewKeyword(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitNewKeyword(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitNewKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewKeywordContext newKeyword() throws RecognitionException {
		NewKeywordContext _localctx = new NewKeywordContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_newKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(411);
				match(T__0);
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
	public static class IfKeywordContext extends ParserRuleContext {
		public IfKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifKeyword;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIfKeyword(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIfKeyword(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIfKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfKeywordContext ifKeyword() throws RecognitionException {
		IfKeywordContext _localctx = new IfKeywordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(413);
				match(T__1);
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
	public static class ElseKeywordContext extends ParserRuleContext {
		public ElseKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elseKeyword;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterElseKeyword(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitElseKeyword(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitElseKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseKeywordContext elseKeyword() throws RecognitionException {
		ElseKeywordContext _localctx = new ElseKeywordContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elseKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(415);
				match(T__2);
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
	public static class PointContext extends ParserRuleContext {
		public TerminalNode Point() {
			return getToken(PureApsarsParser.Point, 0);
		}

		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_point;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterPoint(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitPoint(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(417);
				match(Point);
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
			return getToken(PureApsarsParser.LeftBrace, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterLeftBrace(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitLeftBrace(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitLeftBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftBraceContext leftBrace() throws RecognitionException {
		LeftBraceContext _localctx = new LeftBraceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_leftBrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(419);
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
			return getToken(PureApsarsParser.RightBrace, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterRightBrace(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitRightBrace(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitRightBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightBraceContext rightBrace() throws RecognitionException {
		RightBraceContext _localctx = new RightBraceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rightBrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(421);
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
			return getToken(PureApsarsParser.LeftAngleBracket, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterLeftAngleBracket(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitLeftAngleBracket(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitLeftAngleBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftAngleBracketContext leftAngleBracket() throws RecognitionException {
		LeftAngleBracketContext _localctx = new LeftAngleBracketContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_leftAngleBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(423);
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
			return getToken(PureApsarsParser.RightAngleBracket, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterRightAngleBracket(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitRightAngleBracket(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitRightAngleBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightAngleBracketContext rightAngleBracket() throws RecognitionException {
		RightAngleBracketContext _localctx = new RightAngleBracketContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_rightAngleBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(425);
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
			return getToken(PureApsarsParser.LeftBracket, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterLeftBracket(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitLeftBracket(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitLeftBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftBracketContext leftBracket() throws RecognitionException {
		LeftBracketContext _localctx = new LeftBracketContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_leftBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(427);
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
			return getToken(PureApsarsParser.RightBracket, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterRightBracket(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitRightBracket(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitRightBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightBracketContext rightBracket() throws RecognitionException {
		RightBracketContext _localctx = new RightBracketContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_rightBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(429);
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
			return getToken(PureApsarsParser.LeftParenthesis, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterLeftParenthesis(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitLeftParenthesis(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitLeftParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftParenthesisContext leftParenthesis() throws RecognitionException {
		LeftParenthesisContext _localctx = new LeftParenthesisContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_leftParenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(431);
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
			return getToken(PureApsarsParser.RightParenthesis, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterRightParenthesis(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitRightParenthesis(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitRightParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightParenthesisContext rightParenthesis() throws RecognitionException {
		RightParenthesisContext _localctx = new RightParenthesisContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_rightParenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(433);
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
			return getToken(PureApsarsParser.LeftParenthesis, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterLeftParen(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitLeftParen(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitLeftParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftParenContext leftParen() throws RecognitionException {
		LeftParenContext _localctx = new LeftParenContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_leftParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(435);
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
			return getToken(PureApsarsParser.RightParenthesis, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterRightParen(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitRightParen(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitRightParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightParenContext rightParen() throws RecognitionException {
		RightParenContext _localctx = new RightParenContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_rightParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(437);
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
			return getToken(PureApsarsParser.Colon, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterColon(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitColon(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitColon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(439);
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
			return getToken(PureApsarsParser.Semicolon, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterSemicolon(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitSemicolon(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(441);
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
			return getToken(PureApsarsParser.Comma, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterComma(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitComma(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(443);
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
			return getToken(PureApsarsParser.AndSign, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterAnd(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitAnd(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor) return ((PureApsarsVisitor<? extends T>) visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(445);
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
			return getToken(PureApsarsParser.OrSign, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterOr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitOr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor) return ((PureApsarsVisitor<? extends T>) visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(447);
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
			return getToken(PureApsarsParser.ArgAnd, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterArgAnd(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitArgAnd(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitArgAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgAndContext argAnd() throws RecognitionException {
		ArgAndContext _localctx = new ArgAndContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_argAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(449);
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
			return getToken(PureApsarsParser.ArgOr, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterArgOr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitArgOr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitArgOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgOrContext argOr() throws RecognitionException {
		ArgOrContext _localctx = new ArgOrContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_argOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(451);
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
			return getToken(PureApsarsParser.WordAnd, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterWordAnd(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitWordAnd(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitWordAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordAndContext wordAnd() throws RecognitionException {
		WordAndContext _localctx = new WordAndContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_wordAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(453);
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
			return getToken(PureApsarsParser.WordOr, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterWordOr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitWordOr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitWordOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordOrContext wordOr() throws RecognitionException {
		WordOrContext _localctx = new WordOrContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_wordOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(455);
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
	public static class AddisionAssignmentContext extends ParserRuleContext {
		public TerminalNode AddisionAssignment() {
			return getToken(PureApsarsParser.AddisionAssignment, 0);
		}

		public AddisionAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_addisionAssignment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterAddisionAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitAddisionAssignment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitAddisionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddisionAssignmentContext addisionAssignment() throws RecognitionException {
		AddisionAssignmentContext _localctx = new AddisionAssignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_addisionAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(457);
				match(AddisionAssignment);
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
	public static class SubtractionAssignmentContext extends ParserRuleContext {
		public TerminalNode SubtractionAssignment() {
			return getToken(PureApsarsParser.SubtractionAssignment, 0);
		}

		public SubtractionAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_subtractionAssignment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterSubtractionAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitSubtractionAssignment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitSubtractionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtractionAssignmentContext subtractionAssignment() throws RecognitionException {
		SubtractionAssignmentContext _localctx = new SubtractionAssignmentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_subtractionAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(459);
				match(SubtractionAssignment);
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
	public static class MultiplicationAssignmentContext extends ParserRuleContext {
		public TerminalNode MultiplicationAssignment() {
			return getToken(PureApsarsParser.MultiplicationAssignment, 0);
		}

		public MultiplicationAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_multiplicationAssignment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterMultiplicationAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitMultiplicationAssignment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitMultiplicationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationAssignmentContext multiplicationAssignment() throws RecognitionException {
		MultiplicationAssignmentContext _localctx = new MultiplicationAssignmentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_multiplicationAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(461);
				match(MultiplicationAssignment);
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
	public static class DivisionAssignmentContext extends ParserRuleContext {
		public TerminalNode DivisionAssignment() {
			return getToken(PureApsarsParser.DivisionAssignment, 0);
		}

		public DivisionAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_divisionAssignment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDivisionAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDivisionAssignment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDivisionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionAssignmentContext divisionAssignment() throws RecognitionException {
		DivisionAssignmentContext _localctx = new DivisionAssignmentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_divisionAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(463);
				match(DivisionAssignment);
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
	public static class PowAssignmentContext extends ParserRuleContext {
		public TerminalNode PowAssignment() {
			return getToken(PureApsarsParser.PowAssignment, 0);
		}

		public PowAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_powAssignment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterPowAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitPowAssignment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitPowAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowAssignmentContext powAssignment() throws RecognitionException {
		PowAssignmentContext _localctx = new PowAssignmentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_powAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(465);
				match(PowAssignment);
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
	public static class PlusContext extends ParserRuleContext {
		public TerminalNode Plus() {
			return getToken(PureApsarsParser.Plus, 0);
		}

		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_plus;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterPlus(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitPlus(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor) return ((PureApsarsVisitor<? extends T>) visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(467);
				match(Plus);
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
	public static class MinusContext extends ParserRuleContext {
		public TerminalNode Minus() {
			return getToken(PureApsarsParser.Minus, 0);
		}

		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_minus;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterMinus(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitMinus(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(469);
				match(Minus);
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
	public static class MultiplyContext extends ParserRuleContext {
		public TerminalNode Multiply() {
			return getToken(PureApsarsParser.Multiply, 0);
		}

		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_multiply;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterMultiply(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitMultiply(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_multiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(471);
				match(Multiply);
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
	public static class DivideContext extends ParserRuleContext {
		public TerminalNode Divide() {
			return getToken(PureApsarsParser.Divide, 0);
		}

		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_divide;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDivide(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDivide(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_divide);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(473);
				match(Divide);
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
	public static class PowContext extends ParserRuleContext {
		public TerminalNode Pow() {
			return getToken(PureApsarsParser.Pow, 0);
		}

		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_pow;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterPow(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitPow(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor) return ((PureApsarsVisitor<? extends T>) visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_pow);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(475);
				match(Pow);
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
	public static class OperatorContext extends ParserRuleContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class, 0);
		}

		public ComparingContext comparing() {
			return getRuleContext(ComparingContext.class, 0);
		}

		public NotContext not() {
			return getRuleContext(NotContext.class, 0);
		}

		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_operator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterOperator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitOperator(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_operator);
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AddisionAssignment:
				case Plus:
				case Minus:
				case Multiply:
				case Divide:
				case Pow:
					enterOuterAlt(_localctx, 1);
				{
					setState(477);
					arithmetic();
				}
				break;
				case LeftAngleBracket:
				case RightAngleBracket:
				case Equals:
				case AndSign:
				case OrSign:
				case BreakingAndSign:
				case BreakingOrSign:
					enterOuterAlt(_localctx, 2);
				{
					setState(478);
					comparing();
				}
				break;
				case Not:
					enterOuterAlt(_localctx, 3);
				{
					setState(479);
					not();
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
	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode AddisionAssignment() {
			return getToken(PureApsarsParser.AddisionAssignment, 0);
		}

		public TerminalNode Plus() {
			return getToken(PureApsarsParser.Plus, 0);
		}

		public TerminalNode SubtractionAssignment() {
			return getToken(PureApsarsParser.SubtractionAssignment, 0);
		}

		public TerminalNode Minus() {
			return getToken(PureApsarsParser.Minus, 0);
		}

		public TerminalNode MultiplicationAssignment() {
			return getToken(PureApsarsParser.MultiplicationAssignment, 0);
		}

		public TerminalNode Multiply() {
			return getToken(PureApsarsParser.Multiply, 0);
		}

		public TerminalNode DivisionAssignment() {
			return getToken(PureApsarsParser.DivisionAssignment, 0);
		}

		public TerminalNode Divide() {
			return getToken(PureApsarsParser.Divide, 0);
		}

		public TerminalNode PowAssignment() {
			return getToken(PureApsarsParser.PowAssignment, 0);
		}

		public TerminalNode Pow() {
			return getToken(PureApsarsParser.Pow, 0);
		}

		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_arithmetic;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterArithmetic(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitArithmetic(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_arithmetic);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AddisionAssignment:
					enterOuterAlt(_localctx, 1);
				{
					setState(482);
					match(AddisionAssignment);
				}
				break;
				case Plus:
					enterOuterAlt(_localctx, 2);
				{
					setState(483);
					match(Plus);
					setState(484);
					match(SubtractionAssignment);
				}
				break;
				case Minus:
					enterOuterAlt(_localctx, 3);
				{
					setState(485);
					match(Minus);
					setState(486);
					match(MultiplicationAssignment);
				}
				break;
				case Multiply:
					enterOuterAlt(_localctx, 4);
				{
					setState(487);
					match(Multiply);
					setState(488);
					match(DivisionAssignment);
				}
				break;
				case Divide:
					enterOuterAlt(_localctx, 5);
				{
					setState(489);
					match(Divide);
					setState(490);
					match(PowAssignment);
				}
				break;
				case Pow:
					enterOuterAlt(_localctx, 6);
				{
					setState(491);
					match(Pow);
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
	public static class BreakingAndContext extends ParserRuleContext {
		public TerminalNode BreakingAndSign() {
			return getToken(PureApsarsParser.BreakingAndSign, 0);
		}

		public BreakingAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_breakingAnd;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterBreakingAnd(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitBreakingAnd(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitBreakingAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakingAndContext breakingAnd() throws RecognitionException {
		BreakingAndContext _localctx = new BreakingAndContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_breakingAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(494);
				match(BreakingAndSign);
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
	public static class BreakingOrContext extends ParserRuleContext {
		public TerminalNode BreakingOrSign() {
			return getToken(PureApsarsParser.BreakingOrSign, 0);
		}

		public BreakingOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_breakingOr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterBreakingOr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitBreakingOr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitBreakingOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakingOrContext breakingOr() throws RecognitionException {
		BreakingOrContext _localctx = new BreakingOrContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_breakingOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(496);
				match(BreakingOrSign);
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
	public static class NotContext extends ParserRuleContext {
		public TerminalNode Not() {
			return getToken(PureApsarsParser.Not, 0);
		}

		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_not;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterNot(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitNot(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor) return ((PureApsarsVisitor<? extends T>) visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(498);
				match(Not);
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
			return getToken(PureApsarsParser.LeftAngleBracket, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterLessThan(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitLessThan(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessThanContext lessThan() throws RecognitionException {
		LessThanContext _localctx = new LessThanContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_lessThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(500);
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
			return getToken(PureApsarsParser.RightAngleBracket, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterMoreThan(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitMoreThan(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitMoreThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreThanContext moreThan() throws RecognitionException {
		MoreThanContext _localctx = new MoreThanContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_moreThan);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(502);
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
	public static class ComparingAndContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class, 0);
		}

		public BreakingAndContext breakingAnd() {
			return getRuleContext(BreakingAndContext.class, 0);
		}

		public ComparingAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_comparingAnd;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterComparingAnd(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitComparingAnd(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitComparingAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparingAndContext comparingAnd() throws RecognitionException {
		ComparingAndContext _localctx = new ComparingAndContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_comparingAnd);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case AndSign:
					enterOuterAlt(_localctx, 1);
				{
					setState(504);
					and();
				}
				break;
				case BreakingAndSign:
					enterOuterAlt(_localctx, 2);
				{
					setState(505);
					breakingAnd();
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
	public static class ComparingOrContext extends ParserRuleContext {
		public OrContext or() {
			return getRuleContext(OrContext.class, 0);
		}

		public BreakingOrContext breakingOr() {
			return getRuleContext(BreakingOrContext.class, 0);
		}

		public ComparingOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_comparingOr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterComparingOr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitComparingOr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitComparingOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparingOrContext comparingOr() throws RecognitionException {
		ComparingOrContext _localctx = new ComparingOrContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_comparingOr);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case OrSign:
					enterOuterAlt(_localctx, 1);
				{
					setState(508);
					or();
				}
				break;
				case BreakingOrSign:
					enterOuterAlt(_localctx, 2);
				{
					setState(509);
					breakingOr();
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
	public static class ComparingContext extends ParserRuleContext {
		public ComparingAndContext comparingAnd() {
			return getRuleContext(ComparingAndContext.class, 0);
		}

		public ComparingOrContext comparingOr() {
			return getRuleContext(ComparingOrContext.class, 0);
		}

		public MoreThanContext moreThan() {
			return getRuleContext(MoreThanContext.class, 0);
		}

		public LessThanContext lessThan() {
			return getRuleContext(LessThanContext.class, 0);
		}

		public TerminalNode Equals() {
			return getToken(PureApsarsParser.Equals, 0);
		}

		public ComparingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_comparing;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterComparing(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitComparing(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitComparing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparingContext comparing() throws RecognitionException {
		ComparingContext _localctx = new ComparingContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_comparing);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(517);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case AndSign:
					case BreakingAndSign: {
						setState(512);
						comparingAnd();
					}
					break;
					case OrSign:
					case BreakingOrSign: {
						setState(513);
						comparingOr();
					}
					break;
					case RightAngleBracket: {
						setState(514);
						moreThan();
					}
					break;
					case LeftAngleBracket: {
						setState(515);
						lessThan();
					}
					break;
					case Equals: {
						setState(516);
						match(Equals);
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
	public static class AtSignContext extends ParserRuleContext {
		public TerminalNode AtSign() {
			return getToken(PureApsarsParser.AtSign, 0);
		}

		public AtSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_atSign;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterAtSign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitAtSign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitAtSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtSignContext atSign() throws RecognitionException {
		AtSignContext _localctx = new AtSignContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_atSign);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(519);
				match(AtSign);
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
	public static class NullContext extends ParserRuleContext {
		public TerminalNode Null() {
			return getToken(PureApsarsParser.Null, 0);
		}

		public NullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_null;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterNull(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitNull(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor) return ((PureApsarsVisitor<? extends T>) visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullContext null_() throws RecognitionException {
		NullContext _localctx = new NullContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(521);
				match(Null);
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
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode True() {
			return getToken(PureApsarsParser.True, 0);
		}

		public TerminalNode False() {
			return getToken(PureApsarsParser.False, 0);
		}

		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_bool;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterBool(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitBool(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor) return ((PureApsarsVisitor<? extends T>) visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(523);
				_la = _input.LA(1);
				if (!(_la == True || _la == False)) {
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Equal() {
			return getToken(PureApsarsParser.Equal, 0);
		}

		public TerminalNode LeftPointing() {
			return getToken(PureApsarsParser.LeftPointing, 0);
		}

		public TerminalNode As() {
			return getToken(PureApsarsParser.As, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitAssignment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(525);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 3096224743817216L) != 0))) {
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
			return getToken(PureApsarsParser.Equals, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIsEquals(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIsEquals(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIsEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsEqualsContext isEquals() throws RecognitionException {
		IsEqualsContext _localctx = new IsEqualsContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_isEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(527);
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
	public static class FullNameOrIdentifierContext extends ParserRuleContext {
		public TerminalNode FullName() {
			return getToken(PureApsarsParser.FullName, 0);
		}

		public TerminalNode Identifier() {
			return getToken(PureApsarsParser.Identifier, 0);
		}

		public FullNameOrIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fullNameOrIdentifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterFullNameOrIdentifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitFullNameOrIdentifier(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitFullNameOrIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullNameOrIdentifierContext fullNameOrIdentifier() throws RecognitionException {
		FullNameOrIdentifierContext _localctx = new FullNameOrIdentifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_fullNameOrIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(529);
				_la = _input.LA(1);
				if (!(_la == Identifier || _la == FullName)) {
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() {
			return getToken(PureApsarsParser.Identifier, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIdentifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIdentifier(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(531);
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
			return getToken(PureApsarsParser.FullName, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterFullName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitFullName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitFullName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullNameContext fullName() throws RecognitionException {
		FullNameContext _localctx = new FullNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_fullName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(533);
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
			return getToken(PureApsarsParser.Number, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterNumber(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitNumber(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(535);
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
	public static class FieldModifiersContext extends ParserRuleContext {
		public List<IsTransientContext> isTransient() {
			return getRuleContexts(IsTransientContext.class);
		}

		public IsTransientContext isTransient(int i) {
			return getRuleContext(IsTransientContext.class, i);
		}

		public List<IsVolatileContext> isVolatile() {
			return getRuleContexts(IsVolatileContext.class);
		}

		public IsVolatileContext isVolatile(int i) {
			return getRuleContext(IsVolatileContext.class, i);
		}

		public List<IsOverridableContext> isOverridable() {
			return getRuleContexts(IsOverridableContext.class);
		}

		public IsOverridableContext isOverridable(int i) {
			return getRuleContext(IsOverridableContext.class, i);
		}

		public List<IsHolderContext> isHolder() {
			return getRuleContexts(IsHolderContext.class);
		}

		public IsHolderContext isHolder(int i) {
			return getRuleContext(IsHolderContext.class, i);
		}

		public List<IsGetHolderContext> isGetHolder() {
			return getRuleContexts(IsGetHolderContext.class);
		}

		public IsGetHolderContext isGetHolder(int i) {
			return getRuleContext(IsGetHolderContext.class, i);
		}

		public List<IsSetHolderContext> isSetHolder() {
			return getRuleContexts(IsSetHolderContext.class);
		}

		public IsSetHolderContext isSetHolder(int i) {
			return getRuleContext(IsSetHolderContext.class, i);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterFieldModifiers(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitFieldModifiers(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitFieldModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifiersContext fieldModifiers() throws RecognitionException {
		FieldModifiersContext _localctx = new FieldModifiersContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_fieldModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(549);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							setState(549);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
								case Transient: {
									setState(537);
									isTransient();
								}
								break;
								case Volatile: {
									setState(538);
									isVolatile();
								}
								break;
								case Holder:
								case HolderGet:
								case HolderSet: {
									setState(546);
									_errHandler.sync(this);
									switch (_input.LA(1)) {
										case Holder: {
											setState(539);
											isHolder();
										}
										break;
										case HolderGet:
										case HolderSet: {
											setState(542);
											_errHandler.sync(this);
											_alt = 1;
											do {
												switch (_alt) {
													case 1: {
														setState(542);
														_errHandler.sync(this);
														switch (_input.LA(1)) {
															case HolderGet: {
																setState(540);
																isGetHolder();
															}
															break;
															case HolderSet: {
																setState(541);
																isSetHolder();
															}
															break;
															default:
																throw new NoViableAltException(this);
														}
													}
													break;
													default:
														throw new NoViableAltException(this);
												}
												setState(544);
												_errHandler.sync(this);
												_alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
											} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
										}
										break;
										default:
											throw new NoViableAltException(this);
									}
								}
								break;
								case Overridable: {
									setState(548);
									isOverridable();
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(551);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterMethodModifiers(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitMethodModifiers(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitMethodModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifiersContext methodModifiers() throws RecognitionException {
		MethodModifiersContext _localctx = new MethodModifiersContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_methodModifiers);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Synchronized:
					enterOuterAlt(_localctx, 1);
				{
					setState(553);
					isSynchronized();
				}
				break;
				case Sync:
					enterOuterAlt(_localctx, 2);
				{
					setState(554);
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

		public List<OptionalFieldStaticAndFinalContext> optionalFieldStaticAndFinal() {
			return getRuleContexts(OptionalFieldStaticAndFinalContext.class);
		}

		public OptionalFieldStaticAndFinalContext optionalFieldStaticAndFinal(int i) {
			return getRuleContext(OptionalFieldStaticAndFinalContext.class, i);
		}

		public List<OptionalFieldAndMethodModifiersContext> optionalFieldAndMethodModifiers() {
			return getRuleContexts(OptionalFieldAndMethodModifiersContext.class);
		}

		public OptionalFieldAndMethodModifiersContext optionalFieldAndMethodModifiers(int i) {
			return getRuleContext(OptionalFieldAndMethodModifiersContext.class, i);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterMakeAlternateLet(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitMakeAlternateLet(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitMakeAlternateLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MakeAlternateLetContext makeAlternateLet() throws RecognitionException {
		MakeAlternateLetContext _localctx = new MakeAlternateLetContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_makeAlternateLet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) {
					{
						setState(557);
						permissionModifiers();
					}
				}

				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(562);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case Final:
							case Val:
							case Static: {
								setState(560);
								optionalFieldStaticAndFinal();
							}
							break;
							case Transient:
							case Volatile:
							case Holder:
							case HolderGet:
							case HolderSet:
							case Overridable:
							case Sync:
							case Synchronized: {
								setState(561);
								optionalFieldAndMethodModifiers();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133726976L) != 0));
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
		public List<FieldModifiersContext> fieldModifiers() {
			return getRuleContexts(FieldModifiersContext.class);
		}

		public FieldModifiersContext fieldModifiers(int i) {
			return getRuleContext(FieldModifiersContext.class, i);
		}

		public List<MethodModifiersContext> methodModifiers() {
			return getRuleContexts(MethodModifiersContext.class);
		}

		public MethodModifiersContext methodModifiers(int i) {
			return getRuleContext(MethodModifiersContext.class, i);
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
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterOptionalFieldAndMethodModifiers(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitOptionalFieldAndMethodModifiers(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitOptionalFieldAndMethodModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalFieldAndMethodModifiersContext optionalFieldAndMethodModifiers() throws RecognitionException {
		OptionalFieldAndMethodModifiersContext _localctx = new OptionalFieldAndMethodModifiersContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_optionalFieldAndMethodModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(568);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							setState(568);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
								case Transient:
								case Volatile:
								case Holder:
								case HolderGet:
								case HolderSet:
								case Overridable: {
									setState(566);
									fieldModifiers();
								}
								break;
								case Sync:
								case Synchronized: {
									setState(567);
									methodModifiers();
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(570);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
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
	public static class OptionalFieldStaticAndFinalContext extends ParserRuleContext {
		public List<FieldFinalContext> fieldFinal() {
			return getRuleContexts(FieldFinalContext.class);
		}

		public FieldFinalContext fieldFinal(int i) {
			return getRuleContext(FieldFinalContext.class, i);
		}

		public List<IsStaticContext> isStatic() {
			return getRuleContexts(IsStaticContext.class);
		}

		public IsStaticContext isStatic(int i) {
			return getRuleContext(IsStaticContext.class, i);
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
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterOptionalFieldStaticAndFinal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitOptionalFieldStaticAndFinal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitOptionalFieldStaticAndFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalFieldStaticAndFinalContext optionalFieldStaticAndFinal() throws RecognitionException {
		OptionalFieldStaticAndFinalContext _localctx = new OptionalFieldStaticAndFinalContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_optionalFieldStaticAndFinal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(574);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							setState(574);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
								case Final:
								case Val: {
									setState(572);
									fieldFinal();
								}
								break;
								case Static: {
									setState(573);
									isStatic();
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(576);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
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
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterOptionalStaticAndFinal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitOptionalStaticAndFinal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitOptionalStaticAndFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalStaticAndFinalContext optionalStaticAndFinal() throws RecognitionException {
		OptionalStaticAndFinalContext _localctx = new OptionalStaticAndFinalContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_optionalStaticAndFinal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(580);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case Final: {
								setState(578);
								isFinal();
							}
							break;
							case Static: {
								setState(579);
								isStatic();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(582);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterPermissionModifiers(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitPermissionModifiers(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitPermissionModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermissionModifiersContext permissionModifiers() throws RecognitionException {
		PermissionModifiersContext _localctx = new PermissionModifiersContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_permissionModifiers);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Public:
					enterOuterAlt(_localctx, 1);
				{
					setState(584);
					isPublic();
				}
				break;
				case Private:
					enterOuterAlt(_localctx, 2);
				{
					setState(585);
					isPrivate();
				}
				break;
				case Protected:
					enterOuterAlt(_localctx, 3);
				{
					setState(586);
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
			return getToken(PureApsarsParser.FullName, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterPackageIdentifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitPackageIdentifier(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitPackageIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageIdentifierContext packageIdentifier() throws RecognitionException {
		PackageIdentifierContext _localctx = new PackageIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_packageIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(591);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case FullName: {
						setState(589);
						match(FullName);
					}
					break;
					case Identifier: {
						setState(590);
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
			return getToken(PureApsarsParser.FullName, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterFullNameIdentifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitFullNameIdentifier(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitFullNameIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullNameIdentifierContext fullNameIdentifier() throws RecognitionException {
		FullNameIdentifierContext _localctx = new FullNameIdentifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_fullNameIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(593);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterFieldFinal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitFieldFinal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitFieldFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldFinalContext fieldFinal() throws RecognitionException {
		FieldFinalContext _localctx = new FieldFinalContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_fieldFinal);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Val:
					enterOuterAlt(_localctx, 1);
				{
					setState(595);
					isVal();
				}
				break;
				case Final:
					enterOuterAlt(_localctx, 2);
				{
					setState(596);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterMethodFinal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitMethodFinal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitMethodFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodFinalContext methodFinal() throws RecognitionException {
		MethodFinalContext _localctx = new MethodFinalContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_methodFinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(599);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterClassFinal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitClassFinal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitClassFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassFinalContext classFinal() throws RecognitionException {
		ClassFinalContext _localctx = new ClassFinalContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_classFinal);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Unique:
					enterOuterAlt(_localctx, 1);
				{
					setState(601);
					isUnique();
				}
				break;
				case Final:
					enterOuterAlt(_localctx, 2);
				{
					setState(602);
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
	public static class AssignmentIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public AssignmentIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignmentIdentifier;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterAssignmentIdentifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitAssignmentIdentifier(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitAssignmentIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentIdentifierContext assignmentIdentifier() throws RecognitionException {
		AssignmentIdentifierContext _localctx = new AssignmentIdentifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_assignmentIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(605);
				identifier();
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
	public static class VariableModifiersContext extends ParserRuleContext {
		public List<FieldFinalContext> fieldFinal() {
			return getRuleContexts(FieldFinalContext.class);
		}

		public FieldFinalContext fieldFinal(int i) {
			return getRuleContext(FieldFinalContext.class, i);
		}

		public List<SyncContext> sync() {
			return getRuleContexts(SyncContext.class);
		}

		public SyncContext sync(int i) {
			return getRuleContext(SyncContext.class, i);
		}

		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableModifiers;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterVariableModifiers(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitVariableModifiers(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitVariableModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(609);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case Final:
							case Val: {
								setState(607);
								fieldFinal();
							}
							break;
							case Sync:
							case Synchronized: {
								setState(608);
								sync();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 100664064L) != 0));
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
	public static class DefineMethodUsingTemplateContext extends ParserRuleContext {
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class, 0);
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

		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class, 0);
		}

		public DefineMethodBodyContext defineMethodBody() {
			return getRuleContext(DefineMethodBodyContext.class, 0);
		}

		public DefineMethodUsingTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_defineMethodUsingTemplate;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterDefineMethodUsingTemplate(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitDefineMethodUsingTemplate(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineMethodUsingTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineMethodUsingTemplateContext defineMethodUsingTemplate() throws RecognitionException {
		DefineMethodUsingTemplateContext _localctx = new DefineMethodUsingTemplateContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_defineMethodUsingTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(613);
				template();
				setState(614);
				identifier();
				setState(615);
				leftBrace();
				{
					setState(617);
					_errHandler.sync(this);
					switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
						case 1: {
							setState(616);
							defineMethodBody();
						}
						break;
					}
				}
				setState(619);
				rightBrace();
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Semicolon) {
					{
						setState(620);
						semicolon();
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
	public static class DefineMethodContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
		}

		public PermissionModifiersContext permissionModifiers() {
			return getRuleContext(PermissionModifiersContext.class, 0);
		}

		public AlternateMethodModifiersContext alternateMethodModifiers() {
			return getRuleContext(AlternateMethodModifiersContext.class, 0);
		}

		public MethodReturnTypeContext methodReturnType() {
			return getRuleContext(MethodReturnTypeContext.class, 0);
		}

		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class, 0);
		}

		public MethodParamListDefinitionContext methodParamListDefinition() {
			return getRuleContext(MethodParamListDefinitionContext.class, 0);
		}

		public LeftBraceContext leftBrace() {
			return getRuleContext(LeftBraceContext.class, 0);
		}

		public RightBraceContext rightBrace() {
			return getRuleContext(RightBraceContext.class, 0);
		}

		public TerminalNode Equal() {
			return getToken(PureApsarsParser.Equal, 0);
		}

		public TerminalNode RightPointing() {
			return getToken(PureApsarsParser.RightPointing, 0);
		}

		public ResultPresentingContext resultPresenting() {
			return getRuleContext(ResultPresentingContext.class, 0);
		}

		public DefineVariableStatementContext defineVariableStatement() {
			return getRuleContext(DefineVariableStatementContext.class, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineMethod(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineMethod(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineMethodContext defineMethod() throws RecognitionException {
		DefineMethodContext _localctx = new DefineMethodContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_defineMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) {
					{
						setState(623);
						permissionModifiers();
					}
				}

				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 100698368L) != 0)) {
					{
						setState(626);
						alternateMethodModifiers();
					}
				}

				setState(629);
				identifier();
				setState(630);
				leftParen();
				setState(635);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case RightParenthesis: {
						setState(631);
						rightParen();
					}
					break;
					case Identifier: {
						{
							setState(632);
							methodParamListDefinition();
							setState(633);
							rightParen();
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Colon) {
					{
						setState(637);
						methodReturnType();
					}
				}

				setState(651);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Equal:
					case RightPointing: {
						{
							setState(640);
							_la = _input.LA(1);
							if (!(_la == Equal || _la == RightPointing)) {
								_errHandler.recoverInline(this);
							} else {
								if (_input.LA(1) == Token.EOF) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							setState(643);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
								case 1: {
									setState(641);
									resultPresenting();
								}
								break;
								case 2: {
									setState(642);
									defineVariableStatement();
								}
								break;
							}
						}
					}
					break;
					case LeftBrace: {
						{
							setState(645);
							leftBrace();
							{
								setState(647);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
									case 1: {
										setState(646);
										defineMethodBody();
									}
									break;
								}
							}
							setState(649);
							rightBrace();
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Semicolon) {
					{
						setState(653);
						semicolon();
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
	public static class DefineConstructorContext extends ParserRuleContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class, 0);
		}

		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
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

		public MethodParamListDefinitionContext methodParamListDefinition() {
			return getRuleContext(MethodParamListDefinitionContext.class, 0);
		}

		public DefineMethodBodyContext defineMethodBody() {
			return getRuleContext(DefineMethodBodyContext.class, 0);
		}

		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class, 0);
		}

		public DefineConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_defineConstructor;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineConstructor(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineConstructor(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineConstructorContext defineConstructor() throws RecognitionException {
		DefineConstructorContext _localctx = new DefineConstructorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_defineConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) {
					{
						setState(656);
						permissionModifiers();
					}
				}

				setState(659);
				constructor();
				setState(660);
				leftParen();
				setState(665);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case RightParenthesis: {
						setState(661);
						rightParen();
					}
					break;
					case Identifier: {
						{
							setState(662);
							methodParamListDefinition();
							setState(663);
							rightParen();
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				{
					setState(667);
					leftBrace();
					{
						setState(668);
						defineMethodBody();
					}
					setState(669);
					rightBrace();
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == Semicolon) {
						{
							setState(670);
							semicolon();
						}
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
	public static class DefineLetMethodContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
		}

		public LeftBraceContext leftBrace() {
			return getRuleContext(LeftBraceContext.class, 0);
		}

		public RightBraceContext rightBrace() {
			return getRuleContext(RightBraceContext.class, 0);
		}

		public MethodReturnTypeContext methodReturnType() {
			return getRuleContext(MethodReturnTypeContext.class, 0);
		}

		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class, 0);
		}

		public MethodParamListDefinitionContext methodParamListDefinition() {
			return getRuleContext(MethodParamListDefinitionContext.class, 0);
		}

		public DefineMethodBodyContext defineMethodBody() {
			return getRuleContext(DefineMethodBodyContext.class, 0);
		}

		public DefineLetMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_defineLetMethod;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineLetMethod(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineLetMethod(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineLetMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineLetMethodContext defineLetMethod() throws RecognitionException {
		DefineLetMethodContext _localctx = new DefineLetMethodContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_defineLetMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(673);
				identifier();
				setState(674);
				leftParen();
				setState(679);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case RightParenthesis: {
						setState(675);
						rightParen();
					}
					break;
					case Identifier: {
						{
							setState(676);
							methodParamListDefinition();
							setState(677);
							rightParen();
						}
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Colon) {
					{
						setState(681);
						methodReturnType();
					}
				}

				{
					setState(684);
					leftBrace();
					{
						setState(686);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 45, _ctx)) {
							case 1: {
								setState(685);
								defineMethodBody();
							}
							break;
						}
					}
					setState(688);
					rightBrace();
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Semicolon) {
					{
						setState(690);
						semicolon();
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterMethodReturnType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitMethodReturnType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitMethodReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReturnTypeContext methodReturnType() throws RecognitionException {
		MethodReturnTypeContext _localctx = new MethodReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_methodReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(693);
					colon();
					setState(694);
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
	public static class AlternateMethodModifiersContext extends ParserRuleContext {
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

		public List<IsInlineContext> isInline() {
			return getRuleContexts(IsInlineContext.class);
		}

		public IsInlineContext isInline(int i) {
			return getRuleContext(IsInlineContext.class, i);
		}

		public List<SyncContext> sync() {
			return getRuleContexts(SyncContext.class);
		}

		public SyncContext sync(int i) {
			return getRuleContext(SyncContext.class, i);
		}

		public AlternateMethodModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_alternateMethodModifiers;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterAlternateMethodModifiers(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitAlternateMethodModifiers(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitAlternateMethodModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternateMethodModifiersContext alternateMethodModifiers() throws RecognitionException {
		AlternateMethodModifiersContext _localctx = new AlternateMethodModifiersContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_alternateMethodModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(700);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case Final: {
								setState(696);
								isFinal();
							}
							break;
							case Static: {
								setState(697);
								isStatic();
							}
							break;
							case Inline: {
								setState(698);
								isInline();
							}
							break;
							case Sync:
							case Synchronized: {
								setState(699);
								sync();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 100698368L) != 0));
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineMethodBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineMethodBody(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineMethodBodyContext defineMethodBody() throws RecognitionException {
		DefineMethodBodyContext _localctx = new DefineMethodBodyContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_defineMethodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398281786118L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 127L) != 0)) {
					{
						{
							setState(704);
							defineStatement();
						}
					}
					setState(709);
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
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterMethodParamListDefinition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitMethodParamListDefinition(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitMethodParamListDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParamListDefinitionContext methodParamListDefinition() throws RecognitionException {
		MethodParamListDefinitionContext _localctx = new MethodParamListDefinitionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_methodParamListDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(710);
				paramType();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(711);
							comma();
							setState(712);
							paramType();
						}
					}
					setState(718);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterParamType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitParamType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitParamType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_paramType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(719);
				identifier();
				setState(720);
				colon();
				setState(721);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterArgType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitArgType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitArgType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgTypeContext argType() throws RecognitionException {
		ArgTypeContext _localctx = new ArgTypeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_argType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(723);
				identifier();
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LeftAngleBracket) {
					{
						setState(724);
						typedArgType();
					}
				}

				setState(728);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 52, _ctx)) {
					case 1: {
						setState(727);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterExtraArgTypes(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitExtraArgTypes(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitExtraArgTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraArgTypesContext extraArgTypes() throws RecognitionException {
		ExtraArgTypesContext _localctx = new ExtraArgTypesContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_extraArgTypes);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(734);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Comma: {
						setState(730);
						comma();
					}
					break;
					case AndSign: {
						setState(731);
						and();
					}
					break;
					case ArgAnd: {
						setState(732);
						argAnd();
					}
					break;
					case OrSign: {
						setState(733);
						or();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(736);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterTypedArgType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitTypedArgType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitTypedArgType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedArgTypeContext typedArgType() throws RecognitionException {
		TypedArgTypeContext _localctx = new TypedArgTypeContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_typedArgType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(738);
				leftAngleBracket();
				setState(739);
				argType();
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31595566135771136L) != 0)) {
					{
						{
							setState(740);
							extraArgTypes();
						}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(746);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterArrayArgType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitArrayArgType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitArrayArgType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayArgTypeContext arrayArgType() throws RecognitionException {
		ArrayArgTypeContext _localctx = new ArrayArgTypeContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_arrayArgType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LeftBracket) {
					{
						{
							setState(748);
							arrayDefinition();
						}
					}
					setState(753);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterArrayDefinition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitArrayDefinition(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitArrayDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDefinitionContext arrayDefinition() throws RecognitionException {
		ArrayDefinitionContext _localctx = new ArrayDefinitionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_arrayDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(754);
				leftBracket();
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Number) {
					{
						setState(755);
						number();
					}
				}

				setState(758);
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
	public static class TokenListContext extends ParserRuleContext {
		public ValidTokenContext validToken() {
			return getRuleContext(ValidTokenContext.class, 0);
		}

		public List<ExtraTokenContext> extraToken() {
			return getRuleContexts(ExtraTokenContext.class);
		}

		public ExtraTokenContext extraToken(int i) {
			return getRuleContext(ExtraTokenContext.class, i);
		}

		public TokenListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tokenList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterTokenList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitTokenList(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitTokenList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenListContext tokenList() throws RecognitionException {
		TokenListContext _localctx = new TokenListContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_tokenList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(760);
				validToken();
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(761);
							extraToken();
						}
					}
					setState(766);
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
	public static class ValidTokenContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class, 0);
		}

		public ValidTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_validToken;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterValidToken(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitValidToken(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitValidToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidTokenContext validToken() throws RecognitionException {
		ValidTokenContext _localctx = new ValidTokenContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_validToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(769);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Identifier: {
						setState(767);
						identifier();
					}
					break;
					case Quotation:
					case Null:
					case True:
					case False:
					case Number: {
						setState(768);
						constant();
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
	public static class ExtraTokenContext extends ParserRuleContext {
		public CommaContext comma() {
			return getRuleContext(CommaContext.class, 0);
		}

		public ValidTokenContext validToken() {
			return getRuleContext(ValidTokenContext.class, 0);
		}

		public ExtraTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_extraToken;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterExtraToken(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitExtraToken(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitExtraToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraTokenContext extraToken() throws RecognitionException {
		ExtraTokenContext _localctx = new ExtraTokenContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_extraToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(771);
				comma();
				setState(772);
				validToken();
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
	public static class ConstantContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class, 0);
		}

		public NumberContext number() {
			return getRuleContext(NumberContext.class, 0);
		}

		public NullContext null_() {
			return getRuleContext(NullContext.class, 0);
		}

		public BoolContext bool() {
			return getRuleContext(BoolContext.class, 0);
		}

		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constant;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitConstant(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(778);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Quotation: {
						setState(774);
						string();
					}
					break;
					case Number: {
						setState(775);
						number();
					}
					break;
					case Null: {
						setState(776);
						null_();
					}
					break;
					case True:
					case False: {
						setState(777);
						bool();
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
	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> Quotation() {
			return getTokens(PureApsarsParser.Quotation);
		}

		public TerminalNode Quotation(int i) {
			return getToken(PureApsarsParser.Quotation, i);
		}

		public List<IdentifierOrSpaceContext> identifierOrSpace() {
			return getRuleContexts(IdentifierOrSpaceContext.class);
		}

		public IdentifierOrSpaceContext identifierOrSpace(int i) {
			return getRuleContext(IdentifierOrSpaceContext.class, i);
		}

		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_string;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterString(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitString(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(780);
				match(Quotation);
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__3 || _la == Identifier) {
					{
						{
							setState(781);
							identifierOrSpace();
						}
					}
					setState(786);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(787);
				match(Quotation);
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
	public static class IdentifierOrSpaceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public SpacingContext spacing() {
			return getRuleContext(SpacingContext.class, 0);
		}

		public IdentifierOrSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_identifierOrSpace;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIdentifierOrSpace(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIdentifierOrSpace(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIdentifierOrSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrSpaceContext identifierOrSpace() throws RecognitionException {
		IdentifierOrSpaceContext _localctx = new IdentifierOrSpaceContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_identifierOrSpace);
		try {
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Identifier:
					enterOuterAlt(_localctx, 1);
				{
					setState(789);
					identifier();
				}
				break;
				case T__3:
					enterOuterAlt(_localctx, 2);
				{
					setState(790);
					spacing();
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
	public static class SpacingContext extends ParserRuleContext {
		public TerminalNode RightBrace() {
			return getToken(PureApsarsParser.RightBrace, 0);
		}

		public NumberContext number() {
			return getRuleContext(NumberContext.class, 0);
		}

		public SpacingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_spacing;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterSpacing(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitSpacing(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitSpacing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpacingContext spacing() throws RecognitionException {
		SpacingContext _localctx = new SpacingContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_spacing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(793);
				match(T__3);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Number) {
					{
						setState(794);
						number();
					}
				}

				setState(797);
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
	public static class AnnotationContext extends ParserRuleContext {
		public AtSignContext atSign() {
			return getRuleContext(AtSignContext.class, 0);
		}

		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
		}

		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_annotation;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterAnnotation(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitAnnotation(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(799);
				atSign();
				setState(800);
				identifier();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == LeftParenthesis) {
					{
						setState(801);
						leftParen();
						setState(802);
						rightParen();
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
	public static class DefineStatementContext extends ParserRuleContext {
		public List<TheStatementContext> theStatement() {
			return getRuleContexts(TheStatementContext.class);
		}

		public TheStatementContext theStatement(int i) {
			return getRuleContext(TheStatementContext.class, i);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineStatementContext defineStatement() throws RecognitionException {
		DefineStatementContext _localctx = new DefineStatementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_defineStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(807);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(806);
								theStatement();
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(809);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 64, _ctx);
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
	public static class TheStatementContext extends ParserRuleContext {
		public DefineVariableStatementContext defineVariableStatement() {
			return getRuleContext(DefineVariableStatementContext.class, 0);
		}

		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class, 0);
		}

		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class, 0);
		}

		public YieldStatementContext yieldStatement() {
			return getRuleContext(YieldStatementContext.class, 0);
		}

		public ResultingStatementContext resultingStatement() {
			return getRuleContext(ResultingStatementContext.class, 0);
		}

		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class, 0);
		}

		public TheStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_theStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterTheStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitTheStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitTheStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheStatementContext theStatement() throws RecognitionException {
		TheStatementContext _localctx = new TheStatementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_theStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(816);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 65, _ctx)) {
					case 1: {
						setState(811);
						defineVariableStatement();
					}
					break;
					case 2: {
						setState(812);
						tryStatement();
					}
					break;
					case 3: {
						setState(813);
						returnStatement();
					}
					break;
					case 4: {
						setState(814);
						yieldStatement();
					}
					break;
					case 5: {
						setState(815);
						resultingStatement();
					}
					break;
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Semicolon) {
					{
						setState(818);
						semicolon();
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
	public static class ResultPresentingContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class, 0);
		}

		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public FullNameContext fullName() {
			return getRuleContext(FullNameContext.class, 0);
		}

		public ResultingStatementContext resultingStatement() {
			return getRuleContext(ResultingStatementContext.class, 0);
		}

		public ResultPresentingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_resultPresenting;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterResultPresenting(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitResultPresenting(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitResultPresenting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultPresentingContext resultPresenting() throws RecognitionException {
		ResultPresentingContext _localctx = new ResultPresentingContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_resultPresenting);
		try {
			setState(825);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 67, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(821);
					constant();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(822);
					identifier();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(823);
					fullName();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(824);
					resultingStatement();
				}
				break;
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
	public static class ResultingStatementContext extends ParserRuleContext {
		public InvokeStatementContext invokeStatement() {
			return getRuleContext(InvokeStatementContext.class, 0);
		}

		public NewInstanceStatementContext newInstanceStatement() {
			return getRuleContext(NewInstanceStatementContext.class, 0);
		}

		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class, 0);
		}

		public CalculateStatementContext calculateStatement() {
			return getRuleContext(CalculateStatementContext.class, 0);
		}

		public ResultingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_resultingStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterResultingStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitResultingStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitResultingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultingStatementContext resultingStatement() throws RecognitionException {
		ResultingStatementContext _localctx = new ResultingStatementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_resultingStatement);
		try {
			setState(831);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 68, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(827);
					invokeStatement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(828);
					newInstanceStatement();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(829);
					ifStatement();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(830);
					calculateStatement();
				}
				break;
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
	public static class CalculatableResultPresentingContext extends ParserRuleContext {
		public CalculateStatementWithParenContext calculateStatementWithParen() {
			return getRuleContext(CalculateStatementWithParenContext.class, 0);
		}

		public InvokeStatementContext invokeStatement() {
			return getRuleContext(InvokeStatementContext.class, 0);
		}

		public NewInstanceStatementContext newInstanceStatement() {
			return getRuleContext(NewInstanceStatementContext.class, 0);
		}

		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class, 0);
		}

		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public FullNameContext fullName() {
			return getRuleContext(FullNameContext.class, 0);
		}

		public CalculatableResultPresentingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_calculatableResultPresenting;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterCalculatableResultPresenting(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitCalculatableResultPresenting(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitCalculatableResultPresenting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculatableResultPresentingContext calculatableResultPresenting() throws RecognitionException {
		CalculatableResultPresentingContext _localctx = new CalculatableResultPresentingContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_calculatableResultPresenting);
		try {
			setState(839);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(833);
					calculateStatementWithParen();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(834);
					invokeStatement();
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(835);
					newInstanceStatement();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(836);
					constant();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(837);
					identifier();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(838);
					fullName();
				}
				break;
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
	public static class IfStatementContext extends ParserRuleContext {
		public IfKeywordContext ifKeyword() {
			return getRuleContext(IfKeywordContext.class, 0);
		}

		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
		}

		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class, 0);
		}

		public ResultPresentingContext resultPresenting() {
			return getRuleContext(ResultPresentingContext.class, 0);
		}

		public CalculateStatementContext calculateStatement() {
			return getRuleContext(CalculateStatementContext.class, 0);
		}

		public ElseIfStatementContext elseIfStatement() {
			return getRuleContext(ElseIfStatementContext.class, 0);
		}

		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class, 0);
		}

		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterIfStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitIfStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(841);
				ifKeyword();
				setState(842);
				leftParen();
				setState(845);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 70, _ctx)) {
					case 1: {
						setState(843);
						resultPresenting();
					}
					break;
					case 2: {
						setState(844);
						calculateStatement();
					}
					break;
				}
				setState(847);
				rightParen();
				setState(848);
				statementBlock();
				setState(851);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 71, _ctx)) {
					case 1: {
						{
							setState(849);
							elseIfStatement();
						}
					}
					break;
					case 2: {
						{
							setState(850);
							elseStatement();
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
	public static class ElseIfStatementContext extends ParserRuleContext {
		public ElseKeywordContext elseKeyword() {
			return getRuleContext(ElseKeywordContext.class, 0);
		}

		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class, 0);
		}

		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elseIfStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterElseIfStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitElseIfStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(853);
				elseKeyword();
				setState(854);
				ifStatement();
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
	public static class ElseStatementContext extends ParserRuleContext {
		public ElseKeywordContext elseKeyword() {
			return getRuleContext(ElseKeywordContext.class, 0);
		}

		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class, 0);
		}

		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_elseStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterElseStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitElseStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(856);
				elseKeyword();
				setState(857);
				statementBlock();
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
	public static class StatementBlockContext extends ParserRuleContext {
		public LeftBraceContext leftBrace() {
			return getRuleContext(LeftBraceContext.class, 0);
		}

		public RightBraceContext rightBrace() {
			return getRuleContext(RightBraceContext.class, 0);
		}

		public DefineMethodBodyContext defineMethodBody() {
			return getRuleContext(DefineMethodBodyContext.class, 0);
		}

		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statementBlock;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterStatementBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitStatementBlock(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(859);
				leftBrace();
				{
					setState(860);
					defineMethodBody();
				}
				setState(861);
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
	public static class CalculateStatementWithParenContext extends ParserRuleContext {
		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
		}

		public CalculateLeftStatementWithParenContext calculateLeftStatementWithParen() {
			return getRuleContext(CalculateLeftStatementWithParenContext.class, 0);
		}

		public List<ExtraCalculateStatementContext> extraCalculateStatement() {
			return getRuleContexts(ExtraCalculateStatementContext.class);
		}

		public ExtraCalculateStatementContext extraCalculateStatement(int i) {
			return getRuleContext(ExtraCalculateStatementContext.class, i);
		}

		public CalculateStatementWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_calculateStatementWithParen;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterCalculateStatementWithParen(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitCalculateStatementWithParen(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitCalculateStatementWithParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculateStatementWithParenContext calculateStatementWithParen() throws RecognitionException {
		CalculateStatementWithParenContext _localctx = new CalculateStatementWithParenContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_calculateStatementWithParen);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(863);
				leftParen();
				{
					setState(864);
					calculateLeftStatementWithParen();
				}
				setState(865);
				rightParen();
				setState(869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 72, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(866);
								extraCalculateStatement();
							}
						}
					}
					setState(871);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 72, _ctx);
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
	public static class CalculateLeftStatementWithParenContext extends ParserRuleContext {
		public CalculateStatementContext calculateStatement() {
			return getRuleContext(CalculateStatementContext.class, 0);
		}

		public CalculatableResultPresentingContext calculatableResultPresenting() {
			return getRuleContext(CalculatableResultPresentingContext.class, 0);
		}

		public CalculateLeftStatementWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_calculateLeftStatementWithParen;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterCalculateLeftStatementWithParen(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitCalculateLeftStatementWithParen(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitCalculateLeftStatementWithParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculateLeftStatementWithParenContext calculateLeftStatementWithParen() throws RecognitionException {
		CalculateLeftStatementWithParenContext _localctx = new CalculateLeftStatementWithParenContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_calculateLeftStatementWithParen);
		try {
			setState(874);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 73, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(872);
					calculateStatement();
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(873);
					calculatableResultPresenting();
				}
				break;
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
	public static class CalculateStatementContext extends ParserRuleContext {
		public CalculateLeftContext calculateLeft() {
			return getRuleContext(CalculateLeftContext.class, 0);
		}

		public List<ExtraCalculateStatementContext> extraCalculateStatement() {
			return getRuleContexts(ExtraCalculateStatementContext.class);
		}

		public ExtraCalculateStatementContext extraCalculateStatement(int i) {
			return getRuleContext(ExtraCalculateStatementContext.class, i);
		}

		public CalculateStatementWithTotalParenContext calculateStatementWithTotalParen() {
			return getRuleContext(CalculateStatementWithTotalParenContext.class, 0);
		}

		public CalculateStatementWithParenContext calculateStatementWithParen() {
			return getRuleContext(CalculateStatementWithParenContext.class, 0);
		}

		public CalculateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_calculateStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterCalculateStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitCalculateStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitCalculateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculateStatementContext calculateStatement() throws RecognitionException {
		CalculateStatementContext _localctx = new CalculateStatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_calculateStatement);
		int _la;
		try {
			setState(891);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 76, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					{
						setState(876);
						calculateLeft();
						setState(880);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 8557478403L) != 0)) {
							{
								{
									setState(877);
									extraCalculateStatement();
								}
							}
							setState(882);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					{
						setState(883);
						calculateStatementWithTotalParen();
						setState(887);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 8557478403L) != 0)) {
							{
								{
									setState(884);
									extraCalculateStatement();
								}
							}
							setState(889);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(890);
					calculateStatementWithParen();
				}
				break;
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
	public static class CalculateStatementWithTotalParenContext extends ParserRuleContext {
		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public CalculateLeftContext calculateLeft() {
			return getRuleContext(CalculateLeftContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
		}

		public List<ExtraCalculateStatementContext> extraCalculateStatement() {
			return getRuleContexts(ExtraCalculateStatementContext.class);
		}

		public ExtraCalculateStatementContext extraCalculateStatement(int i) {
			return getRuleContext(ExtraCalculateStatementContext.class, i);
		}

		public CalculateStatementWithTotalParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_calculateStatementWithTotalParen;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterCalculateStatementWithTotalParen(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitCalculateStatementWithTotalParen(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitCalculateStatementWithTotalParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculateStatementWithTotalParenContext calculateStatementWithTotalParen() throws RecognitionException {
		CalculateStatementWithTotalParenContext _localctx = new CalculateStatementWithTotalParenContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_calculateStatementWithTotalParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(893);
				leftParen();
				setState(894);
				calculateLeft();
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 8557478403L) != 0)) {
					{
						{
							setState(895);
							extraCalculateStatement();
						}
					}
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(901);
				rightParen();
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
	public static class CalculateLeftContext extends ParserRuleContext {
		public CalculatableResultPresentingContext calculatableResultPresenting() {
			return getRuleContext(CalculatableResultPresentingContext.class, 0);
		}

		public CalculateLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_calculateLeft;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterCalculateLeft(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitCalculateLeft(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitCalculateLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculateLeftContext calculateLeft() throws RecognitionException {
		CalculateLeftContext _localctx = new CalculateLeftContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_calculateLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(903);
				calculatableResultPresenting();
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
	public static class ExtraCalculateStatementContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class, 0);
		}

		public CalculatableResultPresentingContext calculatableResultPresenting() {
			return getRuleContext(CalculatableResultPresentingContext.class, 0);
		}

		public ExtraCalculateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_extraCalculateStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterExtraCalculateStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitExtraCalculateStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitExtraCalculateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraCalculateStatementContext extraCalculateStatement() throws RecognitionException {
		ExtraCalculateStatementContext _localctx = new ExtraCalculateStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_extraCalculateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(905);
				operator();
				setState(906);
				calculatableResultPresenting();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnKeywordContext returnKeyword() {
			return getRuleContext(ReturnKeywordContext.class, 0);
		}

		public ResultPresentingContext resultPresenting() {
			return getRuleContext(ResultPresentingContext.class, 0);
		}

		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_returnStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterReturnStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitReturnStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(908);
				returnKeyword();
				setState(909);
				resultPresenting();
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
	public static class YieldStatementContext extends ParserRuleContext {
		public YieldKeywordContext yieldKeyword() {
			return getRuleContext(YieldKeywordContext.class, 0);
		}

		public ResultPresentingContext resultPresenting() {
			return getRuleContext(ResultPresentingContext.class, 0);
		}

		public YieldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_yieldStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterYieldStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitYieldStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitYieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStatementContext yieldStatement() throws RecognitionException {
		YieldStatementContext _localctx = new YieldStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_yieldStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(911);
				yieldKeyword();
				setState(912);
				resultPresenting();
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
	public static class InvokeStatementContext extends ParserRuleContext {
		public FullNameOrIdentifierContext fullNameOrIdentifier() {
			return getRuleContext(FullNameOrIdentifierContext.class, 0);
		}

		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
		}

		public InvokeParamListContext invokeParamList() {
			return getRuleContext(InvokeParamListContext.class, 0);
		}

		public List<FluentInvokeStatementContext> fluentInvokeStatement() {
			return getRuleContexts(FluentInvokeStatementContext.class);
		}

		public FluentInvokeStatementContext fluentInvokeStatement(int i) {
			return getRuleContext(FluentInvokeStatementContext.class, i);
		}

		public InvokeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_invokeStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterInvokeStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitInvokeStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitInvokeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeStatementContext invokeStatement() throws RecognitionException {
		InvokeStatementContext _localctx = new InvokeStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_invokeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(914);
				fullNameOrIdentifier();
				setState(915);
				leftParen();
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046511110L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 127L) != 0)) {
					{
						setState(916);
						invokeParamList();
					}
				}

				setState(919);
				rightParen();
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Point) {
					{
						{
							setState(920);
							fluentInvokeStatement();
						}
					}
					setState(925);
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
	public static class FluentInvokeStatementContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class, 0);
		}

		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
		}

		public InvokeParamListContext invokeParamList() {
			return getRuleContext(InvokeParamListContext.class, 0);
		}

		public FluentInvokeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fluentInvokeStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterFluentInvokeStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitFluentInvokeStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitFluentInvokeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FluentInvokeStatementContext fluentInvokeStatement() throws RecognitionException {
		FluentInvokeStatementContext _localctx = new FluentInvokeStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_fluentInvokeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(926);
				point();
				setState(927);
				identifier();
				setState(928);
				leftParen();
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046511110L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 127L) != 0)) {
					{
						setState(929);
						invokeParamList();
					}
				}

				setState(932);
				rightParen();
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
	public static class NewInstanceStatementContext extends ParserRuleContext {
		public NewKeywordContext newKeyword() {
			return getRuleContext(NewKeywordContext.class, 0);
		}

		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
		}

		public InvokeParamListContext invokeParamList() {
			return getRuleContext(InvokeParamListContext.class, 0);
		}

		public NewInstanceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_newInstanceStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterNewInstanceStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitNewInstanceStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitNewInstanceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewInstanceStatementContext newInstanceStatement() throws RecognitionException {
		NewInstanceStatementContext _localctx = new NewInstanceStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_newInstanceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(934);
				newKeyword();
				setState(935);
				identifier();
				setState(936);
				leftParen();
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046511110L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 127L) != 0)) {
					{
						setState(937);
						invokeParamList();
					}
				}

				setState(940);
				rightParen();
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
	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() {
			return getToken(PureApsarsParser.Try, 0);
		}

		public List<LeftBraceContext> leftBrace() {
			return getRuleContexts(LeftBraceContext.class);
		}

		public LeftBraceContext leftBrace(int i) {
			return getRuleContext(LeftBraceContext.class, i);
		}

		public List<RightBraceContext> rightBrace() {
			return getRuleContexts(RightBraceContext.class);
		}

		public RightBraceContext rightBrace(int i) {
			return getRuleContext(RightBraceContext.class, i);
		}

		public TryStatementBodyContext tryStatementBody() {
			return getRuleContext(TryStatementBodyContext.class, 0);
		}

		public CatchingContext catching() {
			return getRuleContext(CatchingContext.class, 0);
		}

		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class, 0);
		}

		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class, 0);
		}

		public IgnoredContext ignored() {
			return getRuleContext(IgnoredContext.class, 0);
		}

		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class, 0);
		}

		public PrintContext print() {
			return getRuleContext(PrintContext.class, 0);
		}

		public DeliverContext deliver() {
			return getRuleContext(DeliverContext.class, 0);
		}

		public RefCallContext refCall() {
			return getRuleContext(RefCallContext.class, 0);
		}

		public TryCatchListContext tryCatchList() {
			return getRuleContext(TryCatchListContext.class, 0);
		}

		public WithContext with() {
			return getRuleContext(WithContext.class, 0);
		}

		public WithMessageContext withMessage() {
			return getRuleContext(WithMessageContext.class, 0);
		}

		public CatchingStatementBodyContext catchingStatementBody() {
			return getRuleContext(CatchingStatementBodyContext.class, 0);
		}

		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tryStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterTryStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitTryStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(942);
				match(Try);
				setState(943);
				leftBrace();
				{
					setState(944);
					tryStatementBody();
				}
				setState(945);
				rightBrace();
				setState(969);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case Catch: {
						{
							setState(946);
							catching();
							setState(947);
							leftParen();
							{
								setState(948);
								tryCatchList();
							}
							setState(949);
							rightParen();
							setState(950);
							leftBrace();
							{
								setState(952);
								_errHandler.sync(this);
								switch (getInterpreter().adaptivePredict(_input, 82, _ctx)) {
									case 1: {
										setState(951);
										catchingStatementBody();
									}
									break;
								}
							}
							setState(954);
							rightBrace();
						}
					}
					break;
					case Ignored: {
						{
							setState(956);
							ignored();
							setState(957);
							semicolon();
						}
					}
					break;
					case Print: {
						{
							setState(959);
							print();
							setState(960);
							semicolon();
						}
					}
					break;
					case Deliver: {
						{
							setState(962);
							deliver();
							setState(963);
							refCall();
							setState(967);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la == With) {
								{
									setState(964);
									with();
									setState(965);
									withMessage();
								}
							}

						}
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
	public static class RefCallContext extends ParserRuleContext {
		public RefCallFromContext refCallFrom() {
			return getRuleContext(RefCallFromContext.class, 0);
		}

		public List<ColonContext> colon() {
			return getRuleContexts(ColonContext.class);
		}

		public ColonContext colon(int i) {
			return getRuleContext(ColonContext.class, i);
		}

		public RefCallMethodContext refCallMethod() {
			return getRuleContext(RefCallMethodContext.class, 0);
		}

		public RefCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_refCall;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterRefCall(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitRefCall(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitRefCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefCallContext refCall() throws RecognitionException {
		RefCallContext _localctx = new RefCallContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_refCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(971);
				refCallFrom();
				setState(972);
				colon();
				setState(973);
				colon();
				setState(974);
				refCallMethod();
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
	public static class RefCallFromContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public RefCallFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_refCallFrom;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterRefCallFrom(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitRefCallFrom(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitRefCallFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefCallFromContext refCallFrom() throws RecognitionException {
		RefCallFromContext _localctx = new RefCallFromContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_refCallFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(976);
				identifier();
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
	public static class RefCallMethodContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public RefCallMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_refCallMethod;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterRefCallMethod(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitRefCallMethod(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitRefCallMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefCallMethodContext refCallMethod() throws RecognitionException {
		RefCallMethodContext _localctx = new RefCallMethodContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_refCallMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(978);
				identifier();
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
	public static class WithMessageContext extends ParserRuleContext {
		public ValidInvokeParamContext validInvokeParam() {
			return getRuleContext(ValidInvokeParamContext.class, 0);
		}

		public WithMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_withMessage;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterWithMessage(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitWithMessage(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitWithMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithMessageContext withMessage() throws RecognitionException {
		WithMessageContext _localctx = new WithMessageContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_withMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(980);
				validInvokeParam();
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
	public static class TryStatementBodyContext extends ParserRuleContext {
		public DefineMethodBodyContext defineMethodBody() {
			return getRuleContext(DefineMethodBodyContext.class, 0);
		}

		public TryStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tryStatementBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterTryStatementBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitTryStatementBody(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitTryStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementBodyContext tryStatementBody() throws RecognitionException {
		TryStatementBodyContext _localctx = new TryStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_tryStatementBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(982);
				defineMethodBody();
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
	public static class CatchingStatementBodyContext extends ParserRuleContext {
		public DefineMethodBodyContext defineMethodBody() {
			return getRuleContext(DefineMethodBodyContext.class, 0);
		}

		public CatchingStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_catchingStatementBody;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterCatchingStatementBody(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitCatchingStatementBody(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitCatchingStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchingStatementBodyContext catchingStatementBody() throws RecognitionException {
		CatchingStatementBodyContext _localctx = new CatchingStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_catchingStatementBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(984);
				defineMethodBody();
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
	public static class TryCatchListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public ColonContext colon() {
			return getRuleContext(ColonContext.class, 0);
		}

		public ArgTypeContext argType() {
			return getRuleContext(ArgTypeContext.class, 0);
		}

		public List<TryCatchListExtraTypeContext> tryCatchListExtraType() {
			return getRuleContexts(TryCatchListExtraTypeContext.class);
		}

		public TryCatchListExtraTypeContext tryCatchListExtraType(int i) {
			return getRuleContext(TryCatchListExtraTypeContext.class, i);
		}

		public TryCatchListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tryCatchList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterTryCatchList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitTryCatchList(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitTryCatchList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchListContext tryCatchList() throws RecognitionException {
		TryCatchListContext _localctx = new TryCatchListContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_tryCatchList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(986);
				identifier();
				setState(987);
				colon();
				setState(988);
				argType();
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == OrSign || _la == WordOr) {
					{
						{
							setState(989);
							tryCatchListExtraType();
						}
					}
					setState(994);
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
	public static class TryCatchListExtraTypeContext extends ParserRuleContext {
		public ArgTypeContext argType() {
			return getRuleContext(ArgTypeContext.class, 0);
		}

		public OrContext or() {
			return getRuleContext(OrContext.class, 0);
		}

		public WordOrContext wordOr() {
			return getRuleContext(WordOrContext.class, 0);
		}

		public TryCatchListExtraTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_tryCatchListExtraType;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterTryCatchListExtraType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitTryCatchListExtraType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitTryCatchListExtraType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchListExtraTypeContext tryCatchListExtraType() throws RecognitionException {
		TryCatchListExtraTypeContext _localctx = new TryCatchListExtraTypeContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_tryCatchListExtraType);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(997);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
					case OrSign: {
						setState(995);
						or();
					}
					break;
					case WordOr: {
						setState(996);
						wordOr();
					}
					break;
					default:
						throw new NoViableAltException(this);
				}
				setState(999);
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
	public static class InvokeParamListContext extends ParserRuleContext {
		public ValidInvokeParamContext validInvokeParam() {
			return getRuleContext(ValidInvokeParamContext.class, 0);
		}

		public List<ValidExtraInvokeParamContext> validExtraInvokeParam() {
			return getRuleContexts(ValidExtraInvokeParamContext.class);
		}

		public ValidExtraInvokeParamContext validExtraInvokeParam(int i) {
			return getRuleContext(ValidExtraInvokeParamContext.class, i);
		}

		public InvokeParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_invokeParamList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterInvokeParamList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitInvokeParamList(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitInvokeParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeParamListContext invokeParamList() throws RecognitionException {
		InvokeParamListContext _localctx = new InvokeParamListContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_invokeParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1001);
				validInvokeParam();
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == Comma) {
					{
						{
							setState(1002);
							validExtraInvokeParam();
						}
					}
					setState(1007);
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
	public static class ValidInvokeParamContext extends ParserRuleContext {
		public ValidTokenContext validToken() {
			return getRuleContext(ValidTokenContext.class, 0);
		}

		public ResultPresentingContext resultPresenting() {
			return getRuleContext(ResultPresentingContext.class, 0);
		}

		public ValidInvokeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_validInvokeParam;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterValidInvokeParam(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitValidInvokeParam(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitValidInvokeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidInvokeParamContext validInvokeParam() throws RecognitionException {
		ValidInvokeParamContext _localctx = new ValidInvokeParamContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_validInvokeParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1010);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 88, _ctx)) {
					case 1: {
						setState(1008);
						validToken();
					}
					break;
					case 2: {
						setState(1009);
						resultPresenting();
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
	public static class ValidExtraInvokeParamContext extends ParserRuleContext {
		public CommaContext comma() {
			return getRuleContext(CommaContext.class, 0);
		}

		public ValidInvokeParamContext validInvokeParam() {
			return getRuleContext(ValidInvokeParamContext.class, 0);
		}

		public ValidExtraInvokeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_validExtraInvokeParam;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterValidExtraInvokeParam(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitValidExtraInvokeParam(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitValidExtraInvokeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidExtraInvokeParamContext validExtraInvokeParam() throws RecognitionException {
		ValidExtraInvokeParamContext _localctx = new ValidExtraInvokeParamContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_validExtraInvokeParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1012);
				comma();
				setState(1013);
				validInvokeParam();
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
	public static class DefineVariableStatementContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class, 0);
		}

		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class, 0);
		}

		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class, 0);
		}

		public ArgTypeContext argType() {
			return getRuleContext(ArgTypeContext.class, 0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public ResultPresentingContext resultPresenting() {
			return getRuleContext(ResultPresentingContext.class, 0);
		}

		public AssignmentIdentifierContext assignmentIdentifier() {
			return getRuleContext(AssignmentIdentifierContext.class, 0);
		}

		public DefineVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_defineVariableStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterDefineVariableStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitDefineVariableStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineVariableStatementContext defineVariableStatement() throws RecognitionException {
		DefineVariableStatementContext _localctx = new DefineVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_defineVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 100664064L) != 0)) {
					{
						setState(1015);
						variableModifiers();
					}
				}

				setState(1019);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 90, _ctx)) {
					case 1: {
						setState(1018);
						argType();
					}
					break;
				}
				setState(1021);
				variableName();
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3096224743817216L) != 0)) {
					{
						setState(1022);
						assignment();
						setState(1025);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 91, _ctx)) {
							case 1: {
								setState(1023);
								resultPresenting();
							}
							break;
							case 2: {
								setState(1024);
								assignmentIdentifier();
							}
							break;
						}
					}
				}

				setState(1029);
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
	public static class VariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public FullNameContext fullName() {
			return getRuleContext(FullNameContext.class, 0);
		}

		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variableName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterVariableName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitVariableName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_variableName);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case Identifier:
					enterOuterAlt(_localctx, 1);
				{
					setState(1031);
					identifier();
				}
				break;
				case FullName:
					enterOuterAlt(_localctx, 2);
				{
					setState(1032);
					fullName();
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
	public static class DefineClassContext extends ParserRuleContext {
		public ClassKeywordContext classKeyword() {
			return getRuleContext(ClassKeywordContext.class, 0);
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

		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}

		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class, i);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineClass(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineClass(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineClassContext defineClass() throws RecognitionException {
		DefineClassContext _localctx = new DefineClassContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_defineClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == AtSign) {
					{
						{
							setState(1035);
							annotation();
						}
					}
					setState(1040);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) {
					{
						setState(1041);
						permissionModifiers();
					}
				}

				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Final || _la == Unique) {
					{
						setState(1044);
						classFinal();
					}
				}

				setState(1047);
				classKeyword();
				setState(1048);
				identifier();
				setState(1049);
				leftBrace();
				setState(1055);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 98, _ctx)) {
					case 1: {
						setState(1050);
						rightBrace();
					}
					break;
					case 2: {
						setState(1052);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25870506976L) != 0) || _la == Identifier) {
							{
								setState(1051);
								makeAlternateLetAndContent();
							}
						}

						setState(1054);
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
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterMakeAlternateLetAndContent(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).exitMakeAlternateLetAndContent(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitMakeAlternateLetAndContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MakeAlternateLetAndContentContext makeAlternateLetAndContent() throws RecognitionException {
		MakeAlternateLetAndContentContext _localctx = new MakeAlternateLetAndContentContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_makeAlternateLetAndContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(1059);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
							case Let: {
								setState(1057);
								defineLet();
							}
							break;
							case Public:
							case Private:
							case Protected:
							case Final:
							case Val:
							case Inline:
							case Static:
							case Sync:
							case Synchronized:
							case Template:
							case Constructor:
							case Identifier: {
								setState(1058);
								defineClassContent();
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					setState(1061);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25870506976L) != 0) || _la == Identifier);
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
		public List<DefineMethodUsingTemplateContext> defineMethodUsingTemplate() {
			return getRuleContexts(DefineMethodUsingTemplateContext.class);
		}

		public DefineMethodUsingTemplateContext defineMethodUsingTemplate(int i) {
			return getRuleContext(DefineMethodUsingTemplateContext.class, i);
		}

		public List<DefineMemberFieldContext> defineMemberField() {
			return getRuleContexts(DefineMemberFieldContext.class);
		}

		public DefineMemberFieldContext defineMemberField(int i) {
			return getRuleContext(DefineMemberFieldContext.class, i);
		}

		public List<DefineConstructorContext> defineConstructor() {
			return getRuleContexts(DefineConstructorContext.class);
		}

		public DefineConstructorContext defineConstructor(int i) {
			return getRuleContext(DefineConstructorContext.class, i);
		}

		public List<DefineMethodContext> defineMethod() {
			return getRuleContexts(DefineMethodContext.class);
		}

		public DefineMethodContext defineMethod(int i) {
			return getRuleContext(DefineMethodContext.class, i);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineClassContent(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineClassContent(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineClassContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineClassContentContext defineClassContent() throws RecognitionException {
		DefineClassContentContext _localctx = new DefineClassContentContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_defineClassContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1067);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							setState(1067);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 101, _ctx)) {
								case 1: {
									setState(1063);
									defineMethodUsingTemplate();
								}
								break;
								case 2: {
									setState(1064);
									defineMemberField();
								}
								break;
								case 3: {
									setState(1065);
									defineConstructor();
								}
								break;
								case 4: {
									setState(1066);
									defineMethod();
								}
								break;
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(1069);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 102, _ctx);
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
	public static class DefineLetClassContentContext extends ParserRuleContext {
		public List<DefineLetMemberFieldContext> defineLetMemberField() {
			return getRuleContexts(DefineLetMemberFieldContext.class);
		}

		public DefineLetMemberFieldContext defineLetMemberField(int i) {
			return getRuleContext(DefineLetMemberFieldContext.class, i);
		}

		public List<DefineLetMethodContext> defineLetMethod() {
			return getRuleContexts(DefineLetMethodContext.class);
		}

		public DefineLetMethodContext defineLetMethod(int i) {
			return getRuleContext(DefineLetMethodContext.class, i);
		}

		public DefineLetClassContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_defineLetClassContent;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener)
				((PureApsarsListener) listener).enterDefineLetClassContent(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineLetClassContent(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineLetClassContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineLetClassContentContext defineLetClassContent() throws RecognitionException {
		DefineLetClassContentContext _localctx = new DefineLetClassContentContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_defineLetClassContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(1073);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 103, _ctx)) {
							case 1: {
								setState(1071);
								defineLetMemberField();
							}
							break;
							case 2: {
								setState(1072);
								defineLetMethod();
							}
							break;
						}
					}
					setState(1075);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == Identifier);
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

		public DefineLetClassContentContext defineLetClassContent() {
			return getRuleContext(DefineLetClassContentContext.class, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineLet(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineLet(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineLetContext defineLet() throws RecognitionException {
		DefineLetContext _localctx = new DefineLetContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_defineLet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1077);
				let();
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 133727200L) != 0)) {
					{
						setState(1078);
						makeAlternateLet();
					}
				}

				setState(1081);
				leftBrace();
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == Identifier) {
					{
						setState(1082);
						defineLetClassContent();
					}
				}

				setState(1085);
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
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class, 0);
		}

		public ColonContext colon() {
			return getRuleContext(ColonContext.class, 0);
		}

		public ArgTypeContext argType() {
			return getRuleContext(ArgTypeContext.class, 0);
		}

		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class, 0);
		}

		public PermissionModifiersContext permissionModifiers() {
			return getRuleContext(PermissionModifiersContext.class, 0);
		}

		public OptionalFieldStaticAndFinalContext optionalFieldStaticAndFinal() {
			return getRuleContext(OptionalFieldStaticAndFinalContext.class, 0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public ResultPresentingContext resultPresenting() {
			return getRuleContext(ResultPresentingContext.class, 0);
		}

		public AssignmentIdentifierContext assignmentIdentifier() {
			return getRuleContext(AssignmentIdentifierContext.class, 0);
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
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineMemberField(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineMemberField(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineMemberField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineMemberFieldContext defineMemberField() throws RecognitionException {
		DefineMemberFieldContext _localctx = new DefineMemberFieldContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_defineMemberField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) {
					{
						setState(1087);
						permissionModifiers();
					}
				}

				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33536L) != 0)) {
					{
						setState(1090);
						optionalFieldStaticAndFinal();
					}
				}

				setState(1093);
				fieldName();
				setState(1094);
				colon();
				setState(1095);
				argType();
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3096224743817216L) != 0)) {
					{
						setState(1096);
						assignment();
						setState(1099);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 109, _ctx)) {
							case 1: {
								setState(1097);
								resultPresenting();
							}
							break;
							case 2: {
								setState(1098);
								assignmentIdentifier();
							}
							break;
						}
					}
				}

				setState(1103);
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
	public static class DefineLetMemberFieldContext extends ParserRuleContext {
		public ArgTypeContext argType() {
			return getRuleContext(ArgTypeContext.class, 0);
		}

		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class, 0);
		}

		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class, 0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public ResultPresentingContext resultPresenting() {
			return getRuleContext(ResultPresentingContext.class, 0);
		}

		public AssignmentIdentifierContext assignmentIdentifier() {
			return getRuleContext(AssignmentIdentifierContext.class, 0);
		}

		public DefineLetMemberFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_defineLetMemberField;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterDefineLetMemberField(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitDefineLetMemberField(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitDefineLetMemberField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineLetMemberFieldContext defineLetMemberField() throws RecognitionException {
		DefineLetMemberFieldContext _localctx = new DefineLetMemberFieldContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_defineLetMemberField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1105);
				argType();
				setState(1106);
				fieldName();
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3096224743817216L) != 0)) {
					{
						setState(1107);
						assignment();
						setState(1110);
						_errHandler.sync(this);
						switch (getInterpreter().adaptivePredict(_input, 111, _ctx)) {
							case 1: {
								setState(1108);
								resultPresenting();
							}
							break;
							case 2: {
								setState(1109);
								assignmentIdentifier();
							}
							break;
						}
					}
				}

				setState(1114);
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
	public static class FieldNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class, 0);
		}

		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldName;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).enterFieldName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof PureApsarsListener) ((PureApsarsListener) listener).exitFieldName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof PureApsarsVisitor)
				return ((PureApsarsVisitor<? extends T>) visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1116);
				identifier();
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
			"\u0004\u0001O\u045f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
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
					"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002" +
					"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002" +
					"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002" +
					"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002" +
					"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002" +
					"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002" +
					"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002" +
					"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007r\u0002" +
					"s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007w\u0002" +
					"x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007|\u0002" +
					"}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007\u0080" +
					"\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007\u0083" +
					"\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007\u0086" +
					"\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007\u0089" +
					"\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007\u008c" +
					"\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007\u008f" +
					"\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007\u0092" +
					"\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007\u0095" +
					"\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007\u0098" +
					"\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007\u009b" +
					"\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007\u009e" +
					"\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007\u00a1" +
					"\u0002\u00a2\u0007\u00a2\u0001\u0000\u0003\u0000\u0148\b\u0000\u0001\u0000" +
					"\u0005\u0000\u014b\b\u0000\n\u0000\f\u0000\u014e\t\u0000\u0001\u0000\u0005" +
					"\u0000\u0151\b\u0000\n\u0000\f\u0000\u0154\t\u0000\u0001\u0001\u0001\u0001" +
					"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
					"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005" +
					"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001" +
					"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001" +
					"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010" +
					"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013" +
					"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016" +
					"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019" +
					"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c" +
					"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e" +
					"\u0196\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001" +
					"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001" +
					"\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001" +
					",\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u0001" +
					"1\u00011\u00012\u00012\u00013\u00013\u00014\u00014\u00015\u00015\u0001" +
					"6\u00016\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001" +
					";\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001" +
					"@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001B\u0003B\u01e1\bB\u0001C\u0001" +
					"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u01ed" +
					"\bC\u0001D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001H\u0001" +
					"H\u0001I\u0001I\u0003I\u01fb\bI\u0001J\u0001J\u0003J\u01ff\bJ\u0001K\u0001" +
					"K\u0001K\u0001K\u0001K\u0003K\u0206\bK\u0001L\u0001L\u0001M\u0001M\u0001" +
					"N\u0001N\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0001" +
					"S\u0001S\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0004U\u021f" +
					"\bU\u000bU\fU\u0220\u0003U\u0223\bU\u0001U\u0004U\u0226\bU\u000bU\fU\u0227" +
					"\u0001V\u0001V\u0003V\u022c\bV\u0001W\u0003W\u022f\bW\u0001W\u0001W\u0004" +
					"W\u0233\bW\u000bW\fW\u0234\u0001X\u0001X\u0004X\u0239\bX\u000bX\fX\u023a" +
					"\u0001Y\u0001Y\u0004Y\u023f\bY\u000bY\fY\u0240\u0001Z\u0001Z\u0004Z\u0245" +
					"\bZ\u000bZ\fZ\u0246\u0001[\u0001[\u0001[\u0003[\u024c\b[\u0001\\\u0001" +
					"\\\u0003\\\u0250\b\\\u0001]\u0001]\u0001^\u0001^\u0003^\u0256\b^\u0001" +
					"_\u0001_\u0001`\u0001`\u0003`\u025c\b`\u0001a\u0001a\u0001b\u0001b\u0004" +
					"b\u0262\bb\u000bb\fb\u0263\u0001c\u0001c\u0001c\u0001c\u0003c\u026a\b" +
					"c\u0001c\u0001c\u0003c\u026e\bc\u0001d\u0003d\u0271\bd\u0001d\u0003d\u0274" +
					"\bd\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u027c\bd\u0001d\u0003" +
					"d\u027f\bd\u0001d\u0001d\u0001d\u0003d\u0284\bd\u0001d\u0001d\u0003d\u0288" +
					"\bd\u0001d\u0001d\u0003d\u028c\bd\u0001d\u0003d\u028f\bd\u0001e\u0003" +
					"e\u0292\be\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0003e\u029a\be\u0001" +
					"e\u0001e\u0001e\u0001e\u0003e\u02a0\be\u0001f\u0001f\u0001f\u0001f\u0001" +
					"f\u0001f\u0003f\u02a8\bf\u0001f\u0003f\u02ab\bf\u0001f\u0001f\u0003f\u02af" +
					"\bf\u0001f\u0001f\u0001f\u0003f\u02b4\bf\u0001g\u0001g\u0001g\u0001h\u0001" +
					"h\u0001h\u0001h\u0004h\u02bd\bh\u000bh\fh\u02be\u0001i\u0005i\u02c2\b" +
					"i\ni\fi\u02c5\ti\u0001j\u0001j\u0001j\u0001j\u0005j\u02cb\bj\nj\fj\u02ce" +
					"\tj\u0001k\u0001k\u0001k\u0001k\u0001l\u0001l\u0003l\u02d6\bl\u0001l\u0003" +
					"l\u02d9\bl\u0001m\u0001m\u0001m\u0001m\u0003m\u02df\bm\u0001m\u0001m\u0001" +
					"n\u0001n\u0001n\u0005n\u02e6\bn\nn\fn\u02e9\tn\u0001n\u0001n\u0001o\u0005" +
					"o\u02ee\bo\no\fo\u02f1\to\u0001p\u0001p\u0003p\u02f5\bp\u0001p\u0001p" +
					"\u0001q\u0001q\u0005q\u02fb\bq\nq\fq\u02fe\tq\u0001r\u0001r\u0003r\u0302" +
					"\br\u0001s\u0001s\u0001s\u0001t\u0001t\u0001t\u0001t\u0003t\u030b\bt\u0001" +
					"u\u0001u\u0005u\u030f\bu\nu\fu\u0312\tu\u0001u\u0001u\u0001v\u0001v\u0003" +
					"v\u0318\bv\u0001w\u0001w\u0003w\u031c\bw\u0001w\u0001w\u0001x\u0001x\u0001" +
					"x\u0001x\u0001x\u0003x\u0325\bx\u0001y\u0004y\u0328\by\u000by\fy\u0329" +
					"\u0001z\u0001z\u0001z\u0001z\u0001z\u0003z\u0331\bz\u0001z\u0003z\u0334" +
					"\bz\u0001{\u0001{\u0001{\u0001{\u0003{\u033a\b{\u0001|\u0001|\u0001|\u0001" +
					"|\u0003|\u0340\b|\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0003}\u0348" +
					"\b}\u0001~\u0001~\u0001~\u0001~\u0003~\u034e\b~\u0001~\u0001~\u0001~\u0001" +
					"~\u0003~\u0354\b~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u0080\u0001" +
					"\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001" +
					"\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0005\u0082\u0364\b\u0082\n" +
					"\u0082\f\u0082\u0367\t\u0082\u0001\u0083\u0001\u0083\u0003\u0083\u036b" +
					"\b\u0083\u0001\u0084\u0001\u0084\u0005\u0084\u036f\b\u0084\n\u0084\f\u0084" +
					"\u0372\t\u0084\u0001\u0084\u0001\u0084\u0005\u0084\u0376\b\u0084\n\u0084" +
					"\f\u0084\u0379\t\u0084\u0001\u0084\u0003\u0084\u037c\b\u0084\u0001\u0085" +
					"\u0001\u0085\u0001\u0085\u0005\u0085\u0381\b\u0085\n\u0085\f\u0085\u0384" +
					"\t\u0085\u0001\u0085\u0001\u0085\u0001\u0086\u0001\u0086\u0001\u0087\u0001" +
					"\u0087\u0001\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001" +
					"\u0089\u0001\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u0396" +
					"\b\u008a\u0001\u008a\u0001\u008a\u0005\u008a\u039a\b\u008a\n\u008a\f\u008a" +
					"\u039d\t\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b" +
					"\u03a3\b\u008b\u0001\u008b\u0001\u008b\u0001\u008c\u0001\u008c\u0001\u008c" +
					"\u0001\u008c\u0003\u008c\u03ab\b\u008c\u0001\u008c\u0001\u008c\u0001\u008d" +
					"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d" +
					"\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u03b9\b\u008d\u0001\u008d" +
					"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d" +
					"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d" +
					"\u0003\u008d\u03c8\b\u008d\u0003\u008d\u03ca\b\u008d\u0001\u008e\u0001" +
					"\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008f\u0001\u008f\u0001" +
					"\u0090\u0001\u0090\u0001\u0091\u0001\u0091\u0001\u0092\u0001\u0092\u0001" +
					"\u0093\u0001\u0093\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0005" +
					"\u0094\u03df\b\u0094\n\u0094\f\u0094\u03e2\t\u0094\u0001\u0095\u0001\u0095" +
					"\u0003\u0095\u03e6\b\u0095\u0001\u0095\u0001\u0095\u0001\u0096\u0001\u0096" +
					"\u0005\u0096\u03ec\b\u0096\n\u0096\f\u0096\u03ef\t\u0096\u0001\u0097\u0001" +
					"\u0097\u0003\u0097\u03f3\b\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0001" +
					"\u0099\u0003\u0099\u03f9\b\u0099\u0001\u0099\u0003\u0099\u03fc\b\u0099" +
					"\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0003\u0099\u0402\b\u0099" +
					"\u0003\u0099\u0404\b\u0099\u0001\u0099\u0001\u0099\u0001\u009a\u0001\u009a" +
					"\u0003\u009a\u040a\b\u009a\u0001\u009b\u0005\u009b\u040d\b\u009b\n\u009b" +
					"\f\u009b\u0410\t\u009b\u0001\u009b\u0003\u009b\u0413\b\u009b\u0001\u009b" +
					"\u0003\u009b\u0416\b\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b" +
					"\u0001\u009b\u0003\u009b\u041d\b\u009b\u0001\u009b\u0003\u009b\u0420\b" +
					"\u009b\u0001\u009c\u0001\u009c\u0004\u009c\u0424\b\u009c\u000b\u009c\f" +
					"\u009c\u0425\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0004\u009d" +
					"\u042c\b\u009d\u000b\u009d\f\u009d\u042d\u0001\u009e\u0001\u009e\u0004" +
					"\u009e\u0432\b\u009e\u000b\u009e\f\u009e\u0433\u0001\u009f\u0001\u009f" +
					"\u0003\u009f\u0438\b\u009f\u0001\u009f\u0001\u009f\u0003\u009f\u043c\b" +
					"\u009f\u0001\u009f\u0001\u009f\u0001\u00a0\u0003\u00a0\u0441\b\u00a0\u0001" +
					"\u00a0\u0003\u00a0\u0444\b\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001" +
					"\u00a0\u0001\u00a0\u0001\u00a0\u0003\u00a0\u044c\b\u00a0\u0003\u00a0\u044e" +
					"\b\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001" +
					"\u00a1\u0001\u00a1\u0003\u00a1\u0457\b\u00a1\u0003\u00a1\u0459\b\u00a1" +
					"\u0001\u00a1\u0001\u00a1\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u0152" +
					"\u0000\u00a3\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016" +
					"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt" +
					"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094" +
					"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac" +
					"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4" +
					"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc" +
					"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4" +
					"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c" +
					"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124" +
					"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c" +
					"\u013e\u0140\u0142\u0144\u0000\u0004\u0001\u0000JK\u0002\u00000133\u0001" +
					"\u0000LM\u0002\u00000022\u044e\u0000\u0147\u0001\u0000\u0000\u0000\u0002" +
					"\u0155\u0001\u0000\u0000\u0000\u0004\u0159\u0001\u0000\u0000\u0000\u0006" +
					"\u015d\u0001\u0000\u0000\u0000\b\u015f\u0001\u0000\u0000\u0000\n\u0161" +
					"\u0001\u0000\u0000\u0000\f\u0163\u0001\u0000\u0000\u0000\u000e\u0165\u0001" +
					"\u0000\u0000\u0000\u0010\u0167\u0001\u0000\u0000\u0000\u0012\u0169\u0001" +
					"\u0000\u0000\u0000\u0014\u016b\u0001\u0000\u0000\u0000\u0016\u016d\u0001" +
					"\u0000\u0000\u0000\u0018\u016f\u0001\u0000\u0000\u0000\u001a\u0171\u0001" +
					"\u0000\u0000\u0000\u001c\u0173\u0001\u0000\u0000\u0000\u001e\u0175\u0001" +
					"\u0000\u0000\u0000 \u0177\u0001\u0000\u0000\u0000\"\u0179\u0001\u0000" +
					"\u0000\u0000$\u017b\u0001\u0000\u0000\u0000&\u017d\u0001\u0000\u0000\u0000" +
					"(\u017f\u0001\u0000\u0000\u0000*\u0181\u0001\u0000\u0000\u0000,\u0183" +
					"\u0001\u0000\u0000\u0000.\u0185\u0001\u0000\u0000\u00000\u0187\u0001\u0000" +
					"\u0000\u00002\u0189\u0001\u0000\u0000\u00004\u018b\u0001\u0000\u0000\u0000" +
					"6\u018d\u0001\u0000\u0000\u00008\u018f\u0001\u0000\u0000\u0000:\u0191" +
					"\u0001\u0000\u0000\u0000<\u0195\u0001\u0000\u0000\u0000>\u0197\u0001\u0000" +
					"\u0000\u0000@\u0199\u0001\u0000\u0000\u0000B\u019b\u0001\u0000\u0000\u0000" +
					"D\u019d\u0001\u0000\u0000\u0000F\u019f\u0001\u0000\u0000\u0000H\u01a1" +
					"\u0001\u0000\u0000\u0000J\u01a3\u0001\u0000\u0000\u0000L\u01a5\u0001\u0000" +
					"\u0000\u0000N\u01a7\u0001\u0000\u0000\u0000P\u01a9\u0001\u0000\u0000\u0000" +
					"R\u01ab\u0001\u0000\u0000\u0000T\u01ad\u0001\u0000\u0000\u0000V\u01af" +
					"\u0001\u0000\u0000\u0000X\u01b1\u0001\u0000\u0000\u0000Z\u01b3\u0001\u0000" +
					"\u0000\u0000\\\u01b5\u0001\u0000\u0000\u0000^\u01b7\u0001\u0000\u0000" +
					"\u0000`\u01b9\u0001\u0000\u0000\u0000b\u01bb\u0001\u0000\u0000\u0000d" +
					"\u01bd\u0001\u0000\u0000\u0000f\u01bf\u0001\u0000\u0000\u0000h\u01c1\u0001" +
					"\u0000\u0000\u0000j\u01c3\u0001\u0000\u0000\u0000l\u01c5\u0001\u0000\u0000" +
					"\u0000n\u01c7\u0001\u0000\u0000\u0000p\u01c9\u0001\u0000\u0000\u0000r" +
					"\u01cb\u0001\u0000\u0000\u0000t\u01cd\u0001\u0000\u0000\u0000v\u01cf\u0001" +
					"\u0000\u0000\u0000x\u01d1\u0001\u0000\u0000\u0000z\u01d3\u0001\u0000\u0000" +
					"\u0000|\u01d5\u0001\u0000\u0000\u0000~\u01d7\u0001\u0000\u0000\u0000\u0080" +
					"\u01d9\u0001\u0000\u0000\u0000\u0082\u01db\u0001\u0000\u0000\u0000\u0084" +
					"\u01e0\u0001\u0000\u0000\u0000\u0086\u01ec\u0001\u0000\u0000\u0000\u0088" +
					"\u01ee\u0001\u0000\u0000\u0000\u008a\u01f0\u0001\u0000\u0000\u0000\u008c" +
					"\u01f2\u0001\u0000\u0000\u0000\u008e\u01f4\u0001\u0000\u0000\u0000\u0090" +
					"\u01f6\u0001\u0000\u0000\u0000\u0092\u01fa\u0001\u0000\u0000\u0000\u0094" +
					"\u01fe\u0001\u0000\u0000\u0000\u0096\u0205\u0001\u0000\u0000\u0000\u0098" +
					"\u0207\u0001\u0000\u0000\u0000\u009a\u0209\u0001\u0000\u0000\u0000\u009c" +
					"\u020b\u0001\u0000\u0000\u0000\u009e\u020d\u0001\u0000\u0000\u0000\u00a0" +
					"\u020f\u0001\u0000\u0000\u0000\u00a2\u0211\u0001\u0000\u0000\u0000\u00a4" +
					"\u0213\u0001\u0000\u0000\u0000\u00a6\u0215\u0001\u0000\u0000\u0000\u00a8" +
					"\u0217\u0001\u0000\u0000\u0000\u00aa\u0225\u0001\u0000\u0000\u0000\u00ac" +
					"\u022b\u0001\u0000\u0000\u0000\u00ae\u022e\u0001\u0000\u0000\u0000\u00b0" +
					"\u0238\u0001\u0000\u0000\u0000\u00b2\u023e\u0001\u0000\u0000\u0000\u00b4" +
					"\u0244\u0001\u0000\u0000\u0000\u00b6\u024b\u0001\u0000\u0000\u0000\u00b8" +
					"\u024f\u0001\u0000\u0000\u0000\u00ba\u0251\u0001\u0000\u0000\u0000\u00bc" +
					"\u0255\u0001\u0000\u0000\u0000\u00be\u0257\u0001\u0000\u0000\u0000\u00c0" +
					"\u025b\u0001\u0000\u0000\u0000\u00c2\u025d\u0001\u0000\u0000\u0000\u00c4" +
					"\u0261\u0001\u0000\u0000\u0000\u00c6\u0265\u0001\u0000\u0000\u0000\u00c8" +
					"\u0270\u0001\u0000\u0000\u0000\u00ca\u0291\u0001\u0000\u0000\u0000\u00cc" +
					"\u02a1\u0001\u0000\u0000\u0000\u00ce\u02b5\u0001\u0000\u0000\u0000\u00d0" +
					"\u02bc\u0001\u0000\u0000\u0000\u00d2\u02c3\u0001\u0000\u0000\u0000\u00d4" +
					"\u02c6\u0001\u0000\u0000\u0000\u00d6\u02cf\u0001\u0000\u0000\u0000\u00d8" +
					"\u02d3\u0001\u0000\u0000\u0000\u00da\u02de\u0001\u0000\u0000\u0000\u00dc" +
					"\u02e2\u0001\u0000\u0000\u0000\u00de\u02ef\u0001\u0000\u0000\u0000\u00e0" +
					"\u02f2\u0001\u0000\u0000\u0000\u00e2\u02f8\u0001\u0000\u0000\u0000\u00e4" +
					"\u0301\u0001\u0000\u0000\u0000\u00e6\u0303\u0001\u0000\u0000\u0000\u00e8" +
					"\u030a\u0001\u0000\u0000\u0000\u00ea\u030c\u0001\u0000\u0000\u0000\u00ec" +
					"\u0317\u0001\u0000\u0000\u0000\u00ee\u0319\u0001\u0000\u0000\u0000\u00f0" +
					"\u031f\u0001\u0000\u0000\u0000\u00f2\u0327\u0001\u0000\u0000\u0000\u00f4" +
					"\u0330\u0001\u0000\u0000\u0000\u00f6\u0339\u0001\u0000\u0000\u0000\u00f8" +
					"\u033f\u0001\u0000\u0000\u0000\u00fa\u0347\u0001\u0000\u0000\u0000\u00fc" +
					"\u0349\u0001\u0000\u0000\u0000\u00fe\u0355\u0001\u0000\u0000\u0000\u0100" +
					"\u0358\u0001\u0000\u0000\u0000\u0102\u035b\u0001\u0000\u0000\u0000\u0104" +
					"\u035f\u0001\u0000\u0000\u0000\u0106\u036a\u0001\u0000\u0000\u0000\u0108" +
					"\u037b\u0001\u0000\u0000\u0000\u010a\u037d\u0001\u0000\u0000\u0000\u010c" +
					"\u0387\u0001\u0000\u0000\u0000\u010e\u0389\u0001\u0000\u0000\u0000\u0110" +
					"\u038c\u0001\u0000\u0000\u0000\u0112\u038f\u0001\u0000\u0000\u0000\u0114" +
					"\u0392\u0001\u0000\u0000\u0000\u0116\u039e\u0001\u0000\u0000\u0000\u0118" +
					"\u03a6\u0001\u0000\u0000\u0000\u011a\u03ae\u0001\u0000\u0000\u0000\u011c" +
					"\u03cb\u0001\u0000\u0000\u0000\u011e\u03d0\u0001\u0000\u0000\u0000\u0120" +
					"\u03d2\u0001\u0000\u0000\u0000\u0122\u03d4\u0001\u0000\u0000\u0000\u0124" +
					"\u03d6\u0001\u0000\u0000\u0000\u0126\u03d8\u0001\u0000\u0000\u0000\u0128" +
					"\u03da\u0001\u0000\u0000\u0000\u012a\u03e5\u0001\u0000\u0000\u0000\u012c" +
					"\u03e9\u0001\u0000\u0000\u0000\u012e\u03f2\u0001\u0000\u0000\u0000\u0130" +
					"\u03f4\u0001\u0000\u0000\u0000\u0132\u03f8\u0001\u0000\u0000\u0000\u0134" +
					"\u0409\u0001\u0000\u0000\u0000\u0136\u040e\u0001\u0000\u0000\u0000\u0138" +
					"\u0423\u0001\u0000\u0000\u0000\u013a\u042b\u0001\u0000\u0000\u0000\u013c" +
					"\u0431\u0001\u0000\u0000\u0000\u013e\u0435\u0001\u0000\u0000\u0000\u0140" +
					"\u0440\u0001\u0000\u0000\u0000\u0142\u0451\u0001\u0000\u0000\u0000\u0144" +
					"\u045c\u0001\u0000\u0000\u0000\u0146\u0148\u0003\u0002\u0001\u0000\u0147" +
					"\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148" +
					"\u014c\u0001\u0000\u0000\u0000\u0149\u014b\u0003\u0004\u0002\u0000\u014a" +
					"\u0149\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c" +
					"\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d" +
					"\u0152\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f" +
					"\u0151\u0003\u0136\u009b\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151" +
					"\u0154\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0152" +
					"\u0150\u0001\u0000\u0000\u0000\u0153\u0001\u0001\u0000\u0000\u0000\u0154" +
					"\u0152\u0001\u0000\u0000\u0000\u0155\u0156\u0003\u0016\u000b\u0000\u0156" +
					"\u0157\u0003\u00b8\\\u0000\u0157\u0158\u0003`0\u0000\u0158\u0003\u0001" +
					"\u0000\u0000\u0000\u0159\u015a\u0003\u0018\f\u0000\u015a\u015b\u0003\u00ba" +
					"]\u0000\u015b\u015c\u0003`0\u0000\u015c\u0005\u0001\u0000\u0000\u0000" +
					"\u015d\u015e\u0005\u0005\u0000\u0000\u015e\u0007\u0001\u0000\u0000\u0000" +
					"\u015f\u0160\u0005\u0006\u0000\u0000\u0160\t\u0001\u0000\u0000\u0000\u0161" +
					"\u0162\u0005\u0007\u0000\u0000\u0162\u000b\u0001\u0000\u0000\u0000\u0163" +
					"\u0164\u0005\b\u0000\u0000\u0164\r\u0001\u0000\u0000\u0000\u0165\u0166" +
					"\u0005\t\u0000\u0000\u0166\u000f\u0001\u0000\u0000\u0000\u0167\u0168\u0005" +
					"\n\u0000\u0000\u0168\u0011\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u000b" +
					"\u0000\u0000\u016a\u0013\u0001\u0000\u0000\u0000\u016b\u016c\u0005\f\u0000" +
					"\u0000\u016c\u0015\u0001\u0000\u0000\u0000\u016d\u016e\u0005\r\u0000\u0000" +
					"\u016e\u0017\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u000e\u0000\u0000" +
					"\u0170\u0019\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u000f\u0000\u0000" +
					"\u0172\u001b\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u0010\u0000\u0000" +
					"\u0174\u001d\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u0011\u0000\u0000" +
					"\u0176\u001f\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u0012\u0000\u0000" +
					"\u0178!\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u0013\u0000\u0000\u017a" +
					"#\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0014\u0000\u0000\u017c%\u0001" +
					"\u0000\u0000\u0000\u017d\u017e\u0005\u0015\u0000\u0000\u017e\'\u0001\u0000" +
					"\u0000\u0000\u017f\u0180\u0005\u0016\u0000\u0000\u0180)\u0001\u0000\u0000" +
					"\u0000\u0181\u0182\u0005\u0017\u0000\u0000\u0182+\u0001\u0000\u0000\u0000" +
					"\u0183\u0184\u0005\u0018\u0000\u0000\u0184-\u0001\u0000\u0000\u0000\u0185" +
					"\u0186\u0005\u001c\u0000\u0000\u0186/\u0001\u0000\u0000\u0000\u0187\u0188" +
					"\u0005\u001d\u0000\u0000\u01881\u0001\u0000\u0000\u0000\u0189\u018a\u0005" +
					"\u001e\u0000\u0000\u018a3\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u001f" +
					"\u0000\u0000\u018c5\u0001\u0000\u0000\u0000\u018d\u018e\u0005 \u0000\u0000" +
					"\u018e7\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0019\u0000\u0000\u0190" +
					"9\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u001a\u0000\u0000\u0192;\u0001" +
					"\u0000\u0000\u0000\u0193\u0196\u00038\u001c\u0000\u0194\u0196\u0003:\u001d" +
					"\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000" +
					"\u0000\u0196=\u0001\u0000\u0000\u0000\u0197\u0198\u0005!\u0000\u0000\u0198" +
					"?\u0001\u0000\u0000\u0000\u0199\u019a\u0005\"\u0000\u0000\u019aA\u0001" +
					"\u0000\u0000\u0000\u019b\u019c\u0005\u0001\u0000\u0000\u019cC\u0001\u0000" +
					"\u0000\u0000\u019d\u019e\u0005\u0002\u0000\u0000\u019eE\u0001\u0000\u0000" +
					"\u0000\u019f\u01a0\u0005\u0003\u0000\u0000\u01a0G\u0001\u0000\u0000\u0000" +
					"\u01a1\u01a2\u0005#\u0000\u0000\u01a2I\u0001\u0000\u0000\u0000\u01a3\u01a4" +
					"\u0005$\u0000\u0000\u01a4K\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005%" +
					"\u0000\u0000\u01a6M\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005&\u0000\u0000" +
					"\u01a8O\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\'\u0000\u0000\u01aa" +
					"Q\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005(\u0000\u0000\u01acS\u0001" +
					"\u0000\u0000\u0000\u01ad\u01ae\u0005)\u0000\u0000\u01aeU\u0001\u0000\u0000" +
					"\u0000\u01af\u01b0\u0005*\u0000\u0000\u01b0W\u0001\u0000\u0000\u0000\u01b1" +
					"\u01b2\u0005+\u0000\u0000\u01b2Y\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005" +
					"*\u0000\u0000\u01b4[\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005+\u0000" +
					"\u0000\u01b6]\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005,\u0000\u0000\u01b8" +
					"_\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005-\u0000\u0000\u01baa\u0001" +
					"\u0000\u0000\u0000\u01bb\u01bc\u0005.\u0000\u0000\u01bcc\u0001\u0000\u0000" +
					"\u0000\u01bd\u01be\u00054\u0000\u0000\u01bee\u0001\u0000\u0000\u0000\u01bf" +
					"\u01c0\u00055\u0000\u0000\u01c0g\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005" +
					"6\u0000\u0000\u01c2i\u0001\u0000\u0000\u0000\u01c3\u01c4\u00057\u0000" +
					"\u0000\u01c4k\u0001\u0000\u0000\u0000\u01c5\u01c6\u00058\u0000\u0000\u01c6" +
					"m\u0001\u0000\u0000\u0000\u01c7\u01c8\u00059\u0000\u0000\u01c8o\u0001" +
					"\u0000\u0000\u0000\u01c9\u01ca\u0005:\u0000\u0000\u01caq\u0001\u0000\u0000" +
					"\u0000\u01cb\u01cc\u0005;\u0000\u0000\u01ccs\u0001\u0000\u0000\u0000\u01cd" +
					"\u01ce\u0005<\u0000\u0000\u01ceu\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005" +
					"=\u0000\u0000\u01d0w\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005>\u0000" +
					"\u0000\u01d2y\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005?\u0000\u0000\u01d4" +
					"{\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005@\u0000\u0000\u01d6}\u0001" +
					"\u0000\u0000\u0000\u01d7\u01d8\u0005A\u0000\u0000\u01d8\u007f\u0001\u0000" +
					"\u0000\u0000\u01d9\u01da\u0005B\u0000\u0000\u01da\u0081\u0001\u0000\u0000" +
					"\u0000\u01db\u01dc\u0005C\u0000\u0000\u01dc\u0083\u0001\u0000\u0000\u0000" +
					"\u01dd\u01e1\u0003\u0086C\u0000\u01de\u01e1\u0003\u0096K\u0000\u01df\u01e1" +
					"\u0003\u008cF\u0000\u01e0\u01dd\u0001\u0000\u0000\u0000\u01e0\u01de\u0001" +
					"\u0000\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e1\u0085\u0001" +
					"\u0000\u0000\u0000\u01e2\u01ed\u0005:\u0000\u0000\u01e3\u01e4\u0005?\u0000" +
					"\u0000\u01e4\u01ed\u0005;\u0000\u0000\u01e5\u01e6\u0005@\u0000\u0000\u01e6" +
					"\u01ed\u0005<\u0000\u0000\u01e7\u01e8\u0005A\u0000\u0000\u01e8\u01ed\u0005" +
					"=\u0000\u0000\u01e9\u01ea\u0005B\u0000\u0000\u01ea\u01ed\u0005>\u0000" +
					"\u0000\u01eb\u01ed\u0005C\u0000\u0000\u01ec\u01e2\u0001\u0000\u0000\u0000" +
					"\u01ec\u01e3\u0001\u0000\u0000\u0000\u01ec\u01e5\u0001\u0000\u0000\u0000" +
					"\u01ec\u01e7\u0001\u0000\u0000\u0000\u01ec\u01e9\u0001\u0000\u0000\u0000" +
					"\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed\u0087\u0001\u0000\u0000\u0000" +
					"\u01ee\u01ef\u0005D\u0000\u0000\u01ef\u0089\u0001\u0000\u0000\u0000\u01f0" +
					"\u01f1\u0005E\u0000\u0000\u01f1\u008b\u0001\u0000\u0000\u0000\u01f2\u01f3" +
					"\u0005F\u0000\u0000\u01f3\u008d\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005" +
					"&\u0000\u0000\u01f5\u008f\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\'" +
					"\u0000\u0000\u01f7\u0091\u0001\u0000\u0000\u0000\u01f8\u01fb\u0003d2\u0000" +
					"\u01f9\u01fb\u0003\u0088D\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa" +
					"\u01f9\u0001\u0000\u0000\u0000\u01fb\u0093\u0001\u0000\u0000\u0000\u01fc" +
					"\u01ff\u0003f3\u0000\u01fd\u01ff\u0003\u008aE\u0000\u01fe\u01fc\u0001" +
					"\u0000\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ff\u0095\u0001" +
					"\u0000\u0000\u0000\u0200\u0206\u0003\u0092I\u0000\u0201\u0206\u0003\u0094" +
					"J\u0000\u0202\u0206\u0003\u0090H\u0000\u0203\u0206\u0003\u008eG\u0000" +
					"\u0204\u0206\u0005/\u0000\u0000\u0205\u0200\u0001\u0000\u0000\u0000\u0205" +
					"\u0201\u0001\u0000\u0000\u0000\u0205\u0202\u0001\u0000\u0000\u0000\u0205" +
					"\u0203\u0001\u0000\u0000\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0206" +
					"\u0097\u0001\u0000\u0000\u0000\u0207\u0208\u0005G\u0000\u0000\u0208\u0099" +
					"\u0001\u0000\u0000\u0000\u0209\u020a\u0005I\u0000\u0000\u020a\u009b\u0001" +
					"\u0000\u0000\u0000\u020b\u020c\u0007\u0000\u0000\u0000\u020c\u009d\u0001" +
					"\u0000\u0000\u0000\u020d\u020e\u0007\u0001\u0000\u0000\u020e\u009f\u0001" +
					"\u0000\u0000\u0000\u020f\u0210\u0005/\u0000\u0000\u0210\u00a1\u0001\u0000" +
					"\u0000\u0000\u0211\u0212\u0007\u0002\u0000\u0000\u0212\u00a3\u0001\u0000" +
					"\u0000\u0000\u0213\u0214\u0005L\u0000\u0000\u0214\u00a5\u0001\u0000\u0000" +
					"\u0000\u0215\u0216\u0005M\u0000\u0000\u0216\u00a7\u0001\u0000\u0000\u0000" +
					"\u0217\u0218\u0005N\u0000\u0000\u0218\u00a9\u0001\u0000\u0000\u0000\u0219" +
					"\u0226\u0003\"\u0011\u0000\u021a\u0226\u0003$\u0012\u0000\u021b\u0223" +
					"\u0003&\u0013\u0000\u021c\u021f\u0003(\u0014\u0000\u021d\u021f\u0003*" +
					"\u0015\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021d\u0001\u0000" +
					"\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000" +
					"\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0223\u0001\u0000" +
					"\u0000\u0000\u0222\u021b\u0001\u0000\u0000\u0000\u0222\u021e\u0001\u0000" +
					"\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0226\u0003,\u0016" +
					"\u0000\u0225\u0219\u0001\u0000\u0000\u0000\u0225\u021a\u0001\u0000\u0000" +
					"\u0000\u0225\u0222\u0001\u0000\u0000\u0000\u0225\u0224\u0001\u0000\u0000" +
					"\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000" +
					"\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u00ab\u0001\u0000\u0000" +
					"\u0000\u0229\u022c\u0003:\u001d\u0000\u022a\u022c\u00038\u001c\u0000\u022b" +
					"\u0229\u0001\u0000\u0000\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c" +
					"\u00ad\u0001\u0000\u0000\u0000\u022d\u022f\u0003\u00b6[\u0000\u022e\u022d" +
					"\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0232" +
					"\u0001\u0000\u0000\u0000\u0230\u0233\u0003\u00b2Y\u0000\u0231\u0233\u0003" +
					"\u00b0X\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0231\u0001\u0000" +
					"\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000" +
					"\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u00af\u0001\u0000" +
					"\u0000\u0000\u0236\u0239\u0003\u00aaU\u0000\u0237\u0239\u0003\u00acV\u0000" +
					"\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000" +
					"\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000" +
					"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u00b1\u0001\u0000\u0000\u0000" +
					"\u023c\u023f\u0003\u00bc^\u0000\u023d\u023f\u0003\u001a\r\u0000\u023e" +
					"\u023c\u0001\u0000\u0000\u0000\u023e\u023d\u0001\u0000\u0000\u0000\u023f" +
					"\u0240\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240" +
					"\u0241\u0001\u0000\u0000\u0000\u0241\u00b3\u0001\u0000\u0000\u0000\u0242" +
					"\u0245\u0003\f\u0006\u0000\u0243\u0245\u0003\u001a\r\u0000\u0244\u0242" +
					"\u0001\u0000\u0000\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0245\u0246" +
					"\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0246\u0247" +
					"\u0001\u0000\u0000\u0000\u0247\u00b5\u0001\u0000\u0000\u0000\u0248\u024c" +
					"\u0003\u0006\u0003\u0000\u0249\u024c\u0003\b\u0004\u0000\u024a\u024c\u0003" +
					"\n\u0005\u0000\u024b\u0248\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000" +
					"\u0000\u0000\u024b\u024a\u0001\u0000\u0000\u0000\u024c\u00b7\u0001\u0000" +
					"\u0000\u0000\u024d\u0250\u0005M\u0000\u0000\u024e\u0250\u0003\u00a4R\u0000" +
					"\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u024e\u0001\u0000\u0000\u0000" +
					"\u0250\u00b9\u0001\u0000\u0000\u0000\u0251\u0252\u0005M\u0000\u0000\u0252" +
					"\u00bb\u0001\u0000\u0000\u0000\u0253\u0256\u0003\u000e\u0007\u0000\u0254" +
					"\u0256\u0003\f\u0006\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0254" +
					"\u0001\u0000\u0000\u0000\u0256\u00bd\u0001\u0000\u0000\u0000\u0257\u0258" +
					"\u0003\f\u0006\u0000\u0258\u00bf\u0001\u0000\u0000\u0000\u0259\u025c\u0003" +
					"\u0010\b\u0000\u025a\u025c\u0003\f\u0006\u0000\u025b\u0259\u0001\u0000" +
					"\u0000\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025c\u00c1\u0001\u0000" +
					"\u0000\u0000\u025d\u025e\u0003\u00a4R\u0000\u025e\u00c3\u0001\u0000\u0000" +
					"\u0000\u025f\u0262\u0003\u00bc^\u0000\u0260\u0262\u0003<\u001e\u0000\u0261" +
					"\u025f\u0001\u0000\u0000\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0262" +
					"\u0263\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263" +
					"\u0264\u0001\u0000\u0000\u0000\u0264\u00c5\u0001\u0000\u0000\u0000\u0265" +
					"\u0266\u0003>\u001f\u0000\u0266\u0267\u0003\u00a4R\u0000\u0267\u0269\u0003" +
					"J%\u0000\u0268\u026a\u0003\u00d2i\u0000\u0269\u0268\u0001\u0000\u0000" +
					"\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000" +
					"\u0000\u026b\u026d\u0003L&\u0000\u026c\u026e\u0003`0\u0000\u026d\u026c" +
					"\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u00c7" +
					"\u0001\u0000\u0000\u0000\u026f\u0271\u0003\u00b6[\u0000\u0270\u026f\u0001" +
					"\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0273\u0001" +
					"\u0000\u0000\u0000\u0272\u0274\u0003\u00d0h\u0000\u0273\u0272\u0001\u0000" +
					"\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000" +
					"\u0000\u0000\u0275\u0276\u0003\u00a4R\u0000\u0276\u027b\u0003Z-\u0000" +
					"\u0277\u027c\u0003\\.\u0000\u0278\u0279\u0003\u00d4j\u0000\u0279\u027a" +
					"\u0003\\.\u0000\u027a\u027c\u0001\u0000\u0000\u0000\u027b\u0277\u0001" +
					"\u0000\u0000\u0000\u027b\u0278\u0001\u0000\u0000\u0000\u027c\u027e\u0001" +
					"\u0000\u0000\u0000\u027d\u027f\u0003\u00ceg\u0000\u027e\u027d\u0001\u0000" +
					"\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u028b\u0001\u0000" +
					"\u0000\u0000\u0280\u0283\u0007\u0003\u0000\u0000\u0281\u0284\u0003\u00f6" +
					"{\u0000\u0282\u0284\u0003\u0132\u0099\u0000\u0283\u0281\u0001\u0000\u0000" +
					"\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0284\u028c\u0001\u0000\u0000" +
					"\u0000\u0285\u0287\u0003J%\u0000\u0286\u0288\u0003\u00d2i\u0000\u0287" +
					"\u0286\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288" +
					"\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0003L&\u0000\u028a\u028c\u0001" +
					"\u0000\u0000\u0000\u028b\u0280\u0001\u0000\u0000\u0000\u028b\u0285\u0001" +
					"\u0000\u0000\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d\u028f\u0003" +
					"`0\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000" +
					"\u0000\u028f\u00c9\u0001\u0000\u0000\u0000\u0290\u0292\u0003\u00b6[\u0000" +
					"\u0291\u0290\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000" +
					"\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0294\u0003@ \u0000\u0294\u0299" +
					"\u0003Z-\u0000\u0295\u029a\u0003\\.\u0000\u0296\u0297\u0003\u00d4j\u0000" +
					"\u0297\u0298\u0003\\.\u0000\u0298\u029a\u0001\u0000\u0000\u0000\u0299" +
					"\u0295\u0001\u0000\u0000\u0000\u0299\u0296\u0001\u0000\u0000\u0000\u029a" +
					"\u029b\u0001\u0000\u0000\u0000\u029b\u029c\u0003J%\u0000\u029c\u029d\u0003" +
					"\u00d2i\u0000\u029d\u029f\u0003L&\u0000\u029e\u02a0\u0003`0\u0000\u029f" +
					"\u029e\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0" +
					"\u00cb\u0001\u0000\u0000\u0000\u02a1\u02a2\u0003\u00a4R\u0000\u02a2\u02a7" +
					"\u0003Z-\u0000\u02a3\u02a8\u0003\\.\u0000\u02a4\u02a5\u0003\u00d4j\u0000" +
					"\u02a5\u02a6\u0003\\.\u0000\u02a6\u02a8\u0001\u0000\u0000\u0000\u02a7" +
					"\u02a3\u0001\u0000\u0000\u0000\u02a7\u02a4\u0001\u0000\u0000\u0000\u02a8" +
					"\u02aa\u0001\u0000\u0000\u0000\u02a9\u02ab\u0003\u00ceg\u0000\u02aa\u02a9" +
					"\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac" +
					"\u0001\u0000\u0000\u0000\u02ac\u02ae\u0003J%\u0000\u02ad\u02af\u0003\u00d2" +
					"i\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000" +
					"\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0003L&\u0000\u02b1" +
					"\u02b3\u0001\u0000\u0000\u0000\u02b2\u02b4\u0003`0\u0000\u02b3\u02b2\u0001" +
					"\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u00cd\u0001" +
					"\u0000\u0000\u0000\u02b5\u02b6\u0003^/\u0000\u02b6\u02b7\u0003\u00d8l" +
					"\u0000\u02b7\u00cf\u0001\u0000\u0000\u0000\u02b8\u02bd\u0003\f\u0006\u0000" +
					"\u02b9\u02bd\u0003\u001a\r\u0000\u02ba\u02bd\u0003\u0012\t\u0000\u02bb" +
					"\u02bd\u0003<\u001e\u0000\u02bc\u02b8\u0001\u0000\u0000\u0000\u02bc\u02b9" +
					"\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bb" +
					"\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02bc" +
					"\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u00d1" +
					"\u0001\u0000\u0000\u0000\u02c0\u02c2\u0003\u00f2y\u0000\u02c1\u02c0\u0001" +
					"\u0000\u0000\u0000\u02c2\u02c5\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001" +
					"\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u00d3\u0001" +
					"\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6\u02cc\u0003" +
					"\u00d6k\u0000\u02c7\u02c8\u0003b1\u0000\u02c8\u02c9\u0003\u00d6k\u0000" +
					"\u02c9\u02cb\u0001\u0000\u0000\u0000\u02ca\u02c7\u0001\u0000\u0000\u0000" +
					"\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000" +
					"\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u00d5\u0001\u0000\u0000\u0000" +
					"\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d0\u0003\u00a4R\u0000\u02d0" +
					"\u02d1\u0003^/\u0000\u02d1\u02d2\u0003\u00d8l\u0000\u02d2\u00d7\u0001" +
					"\u0000\u0000\u0000\u02d3\u02d5\u0003\u00a4R\u0000\u02d4\u02d6\u0003\u00dc" +
					"n\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000" +
					"\u0000\u02d6\u02d8\u0001\u0000\u0000\u0000\u02d7\u02d9\u0003\u00deo\u0000" +
					"\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000" +
					"\u02d9\u00d9\u0001\u0000\u0000\u0000\u02da\u02df\u0003b1\u0000\u02db\u02df" +
					"\u0003d2\u0000\u02dc\u02df\u0003h4\u0000\u02dd\u02df\u0003f3\u0000\u02de" +
					"\u02da\u0001\u0000\u0000\u0000\u02de\u02db\u0001\u0000\u0000\u0000\u02de" +
					"\u02dc\u0001\u0000\u0000\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02df" +
					"\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e1\u0003\u00d8l\u0000\u02e1\u00db" +
					"\u0001\u0000\u0000\u0000\u02e2\u02e3\u0003N\'\u0000\u02e3\u02e7\u0003" +
					"\u00d8l\u0000\u02e4\u02e6\u0003\u00dam\u0000\u02e5\u02e4\u0001\u0000\u0000" +
					"\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000" +
					"\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02ea\u0001\u0000\u0000" +
					"\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02ea\u02eb\u0003P(\u0000\u02eb" +
					"\u00dd\u0001\u0000\u0000\u0000\u02ec\u02ee\u0003\u00e0p\u0000\u02ed\u02ec" +
					"\u0001\u0000\u0000\u0000\u02ee\u02f1\u0001\u0000\u0000\u0000\u02ef\u02ed" +
					"\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u00df" +
					"\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f2\u02f4" +
					"\u0003R)\u0000\u02f3\u02f5\u0003\u00a8T\u0000\u02f4\u02f3\u0001\u0000" +
					"\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000" +
					"\u0000\u0000\u02f6\u02f7\u0003T*\u0000\u02f7\u00e1\u0001\u0000\u0000\u0000" +
					"\u02f8\u02fc\u0003\u00e4r\u0000\u02f9\u02fb\u0003\u00e6s\u0000\u02fa\u02f9" +
					"\u0001\u0000\u0000\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc\u02fa" +
					"\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u00e3" +
					"\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff\u0302" +
					"\u0003\u00a4R\u0000\u0300\u0302\u0003\u00e8t\u0000\u0301\u02ff\u0001\u0000" +
					"\u0000\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0302\u00e5\u0001\u0000" +
					"\u0000\u0000\u0303\u0304\u0003b1\u0000\u0304\u0305\u0003\u00e4r\u0000" +
					"\u0305\u00e7\u0001\u0000\u0000\u0000\u0306\u030b\u0003\u00eau\u0000\u0307" +
					"\u030b\u0003\u00a8T\u0000\u0308\u030b\u0003\u009aM\u0000\u0309\u030b\u0003" +
					"\u009cN\u0000\u030a\u0306\u0001\u0000\u0000\u0000\u030a\u0307\u0001\u0000" +
					"\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030a\u0309\u0001\u0000" +
					"\u0000\u0000\u030b\u00e9\u0001\u0000\u0000\u0000\u030c\u0310\u0005H\u0000" +
					"\u0000\u030d\u030f\u0003\u00ecv\u0000\u030e\u030d\u0001\u0000\u0000\u0000" +
					"\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u030e\u0001\u0000\u0000\u0000" +
					"\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0313\u0001\u0000\u0000\u0000" +
					"\u0312\u0310\u0001\u0000\u0000\u0000\u0313\u0314\u0005H\u0000\u0000\u0314" +
					"\u00eb\u0001\u0000\u0000\u0000\u0315\u0318\u0003\u00a4R\u0000\u0316\u0318" +
					"\u0003\u00eew\u0000\u0317\u0315\u0001\u0000\u0000\u0000\u0317\u0316\u0001" +
					"\u0000\u0000\u0000\u0318\u00ed\u0001\u0000\u0000\u0000\u0319\u031b\u0005" +
					"\u0004\u0000\u0000\u031a\u031c\u0003\u00a8T\u0000\u031b\u031a\u0001\u0000" +
					"\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000" +
					"\u0000\u0000\u031d\u031e\u0005%\u0000\u0000\u031e\u00ef\u0001\u0000\u0000" +
					"\u0000\u031f\u0320\u0003\u0098L\u0000\u0320\u0324\u0003\u00a4R\u0000\u0321" +
					"\u0322\u0003Z-\u0000\u0322\u0323\u0003\\.\u0000\u0323\u0325\u0001\u0000" +
					"\u0000\u0000\u0324\u0321\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000" +
					"\u0000\u0000\u0325\u00f1\u0001\u0000\u0000\u0000\u0326\u0328\u0003\u00f4" +
					"z\u0000\u0327\u0326\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000" +
					"\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000" +
					"\u0000\u032a\u00f3\u0001\u0000\u0000\u0000\u032b\u0331\u0003\u0132\u0099" +
					"\u0000\u032c\u0331\u0003\u011a\u008d\u0000\u032d\u0331\u0003\u0110\u0088" +
					"\u0000\u032e\u0331\u0003\u0112\u0089\u0000\u032f\u0331\u0003\u00f8|\u0000" +
					"\u0330\u032b\u0001\u0000\u0000\u0000\u0330\u032c\u0001\u0000\u0000\u0000" +
					"\u0330\u032d\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000" +
					"\u0330\u032f\u0001\u0000\u0000\u0000\u0331\u0333\u0001\u0000\u0000\u0000" +
					"\u0332\u0334\u0003`0\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333\u0334" +
					"\u0001\u0000\u0000\u0000\u0334\u00f5\u0001\u0000\u0000\u0000\u0335\u033a" +
					"\u0003\u00e8t\u0000\u0336\u033a\u0003\u00a4R\u0000\u0337\u033a\u0003\u00a6" +
					"S\u0000\u0338\u033a\u0003\u00f8|\u0000\u0339\u0335\u0001\u0000\u0000\u0000" +
					"\u0339\u0336\u0001\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000" +
					"\u0339\u0338\u0001\u0000\u0000\u0000\u033a\u00f7\u0001\u0000\u0000\u0000" +
					"\u033b\u0340\u0003\u0114\u008a\u0000\u033c\u0340\u0003\u0118\u008c\u0000" +
					"\u033d\u0340\u0003\u00fc~\u0000\u033e\u0340\u0003\u0108\u0084\u0000\u033f" +
					"\u033b\u0001\u0000\u0000\u0000\u033f\u033c\u0001\u0000\u0000\u0000\u033f" +
					"\u033d\u0001\u0000\u0000\u0000\u033f\u033e\u0001\u0000\u0000\u0000\u0340" +
					"\u00f9\u0001\u0000\u0000\u0000\u0341\u0348\u0003\u0104\u0082\u0000\u0342" +
					"\u0348\u0003\u0114\u008a\u0000\u0343\u0348\u0003\u0118\u008c\u0000\u0344" +
					"\u0348\u0003\u00e8t\u0000\u0345\u0348\u0003\u00a4R\u0000\u0346\u0348\u0003" +
					"\u00a6S\u0000\u0347\u0341\u0001\u0000\u0000\u0000\u0347\u0342\u0001\u0000" +
					"\u0000\u0000\u0347\u0343\u0001\u0000\u0000\u0000\u0347\u0344\u0001\u0000" +
					"\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0346\u0001\u0000" +
					"\u0000\u0000\u0348\u00fb\u0001\u0000\u0000\u0000\u0349\u034a\u0003D\"" +
					"\u0000\u034a\u034d\u0003Z-\u0000\u034b\u034e\u0003\u00f6{\u0000\u034c" +
					"\u034e\u0003\u0108\u0084\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d" +
					"\u034c\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000\u034f" +
					"\u0350\u0003\\.\u0000\u0350\u0353\u0003\u0102\u0081\u0000\u0351\u0354" +
					"\u0003\u00fe\u007f\u0000\u0352\u0354\u0003\u0100\u0080\u0000\u0353\u0351" +
					"\u0001\u0000\u0000\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0353\u0354" +
					"\u0001\u0000\u0000\u0000\u0354\u00fd\u0001\u0000\u0000\u0000\u0355\u0356" +
					"\u0003F#\u0000\u0356\u0357\u0003\u00fc~\u0000\u0357\u00ff\u0001\u0000" +
					"\u0000\u0000\u0358\u0359\u0003F#\u0000\u0359\u035a\u0003\u0102\u0081\u0000" +
					"\u035a\u0101\u0001\u0000\u0000\u0000\u035b\u035c\u0003J%\u0000\u035c\u035d" +
					"\u0003\u00d2i\u0000\u035d\u035e\u0003L&\u0000\u035e\u0103\u0001\u0000" +
					"\u0000\u0000\u035f\u0360\u0003Z-\u0000\u0360\u0361\u0003\u0106\u0083\u0000" +
					"\u0361\u0365\u0003\\.\u0000\u0362\u0364\u0003\u010e\u0087\u0000\u0363" +
					"\u0362\u0001\u0000\u0000\u0000\u0364\u0367\u0001\u0000\u0000\u0000\u0365" +
					"\u0363\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366" +
					"\u0105\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0368" +
					"\u036b\u0003\u0108\u0084\u0000\u0369\u036b\u0003\u00fa}\u0000\u036a\u0368" +
					"\u0001\u0000\u0000\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036b\u0107" +
					"\u0001\u0000\u0000\u0000\u036c\u0370\u0003\u010c\u0086\u0000\u036d\u036f" +
					"\u0003\u010e\u0087\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036f\u0372" +
					"\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0370\u0371" +
					"\u0001\u0000\u0000\u0000\u0371\u037c\u0001\u0000\u0000\u0000\u0372\u0370" +
					"\u0001\u0000\u0000\u0000\u0373\u0377\u0003\u010a\u0085\u0000\u0374\u0376" +
					"\u0003\u010e\u0087\u0000\u0375\u0374\u0001\u0000\u0000\u0000\u0376\u0379" +
					"\u0001\u0000\u0000\u0000\u0377\u0375\u0001\u0000\u0000\u0000\u0377\u0378" +
					"\u0001\u0000\u0000\u0000\u0378\u037c\u0001\u0000\u0000\u0000\u0379\u0377" +
					"\u0001\u0000\u0000\u0000\u037a\u037c\u0003\u0104\u0082\u0000\u037b\u036c" +
					"\u0001\u0000\u0000\u0000\u037b\u0373\u0001\u0000\u0000\u0000\u037b\u037a" +
					"\u0001\u0000\u0000\u0000\u037c\u0109\u0001\u0000\u0000\u0000\u037d\u037e" +
					"\u0003Z-\u0000\u037e\u0382\u0003\u010c\u0086\u0000\u037f\u0381\u0003\u010e" +
					"\u0087\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0381\u0384\u0001\u0000" +
					"\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000" +
					"\u0000\u0000\u0383\u0385\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000" +
					"\u0000\u0000\u0385\u0386\u0003\\.\u0000\u0386\u010b\u0001\u0000\u0000" +
					"\u0000\u0387\u0388\u0003\u00fa}\u0000\u0388\u010d\u0001\u0000\u0000\u0000" +
					"\u0389\u038a\u0003\u0084B\u0000\u038a\u038b\u0003\u00fa}\u0000\u038b\u010f" +
					"\u0001\u0000\u0000\u0000\u038c\u038d\u0003\u001e\u000f\u0000\u038d\u038e" +
					"\u0003\u00f6{\u0000\u038e\u0111\u0001\u0000\u0000\u0000\u038f\u0390\u0003" +
					" \u0010\u0000\u0390\u0391\u0003\u00f6{\u0000\u0391\u0113\u0001\u0000\u0000" +
					"\u0000\u0392\u0393\u0003\u00a2Q\u0000\u0393\u0395\u0003Z-\u0000\u0394" +
					"\u0396\u0003\u012c\u0096\u0000\u0395\u0394\u0001\u0000\u0000\u0000\u0395" +
					"\u0396\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397" +
					"\u039b\u0003\\.\u0000\u0398\u039a\u0003\u0116\u008b\u0000\u0399\u0398" +
					"\u0001\u0000\u0000\u0000\u039a\u039d\u0001\u0000\u0000\u0000\u039b\u0399" +
					"\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u0115" +
					"\u0001\u0000\u0000\u0000\u039d\u039b\u0001\u0000\u0000\u0000\u039e\u039f" +
					"\u0003H$\u0000\u039f\u03a0\u0003\u00a4R\u0000\u03a0\u03a2\u0003Z-\u0000" +
					"\u03a1\u03a3\u0003\u012c\u0096\u0000\u03a2\u03a1\u0001\u0000\u0000\u0000" +
					"\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000" +
					"\u03a4\u03a5\u0003\\.\u0000\u03a5\u0117\u0001\u0000\u0000\u0000\u03a6" +
					"\u03a7\u0003B!\u0000\u03a7\u03a8\u0003\u00a4R\u0000\u03a8\u03aa\u0003" +
					"Z-\u0000\u03a9\u03ab\u0003\u012c\u0096\u0000\u03aa\u03a9\u0001\u0000\u0000" +
					"\u0000\u03aa\u03ab\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000" +
					"\u0000\u03ac\u03ad\u0003\\.\u0000\u03ad\u0119\u0001\u0000\u0000\u0000" +
					"\u03ae\u03af\u0005\u001b\u0000\u0000\u03af\u03b0\u0003J%\u0000\u03b0\u03b1" +
					"\u0003\u0124\u0092\u0000\u03b1\u03c9\u0003L&\u0000\u03b2\u03b3\u0003." +
					"\u0017\u0000\u03b3\u03b4\u0003Z-\u0000\u03b4\u03b5\u0003\u0128\u0094\u0000" +
					"\u03b5\u03b6\u0003\\.\u0000\u03b6\u03b8\u0003J%\u0000\u03b7\u03b9\u0003" +
					"\u0126\u0093\u0000\u03b8\u03b7\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001" +
					"\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba\u03bb\u0003" +
					"L&\u0000\u03bb\u03ca\u0001\u0000\u0000\u0000\u03bc\u03bd\u00030\u0018" +
					"\u0000\u03bd\u03be\u0003`0\u0000\u03be\u03ca\u0001\u0000\u0000\u0000\u03bf" +
					"\u03c0\u00032\u0019\u0000\u03c0\u03c1\u0003`0\u0000\u03c1\u03ca\u0001" +
					"\u0000\u0000\u0000\u03c2\u03c3\u00034\u001a\u0000\u03c3\u03c7\u0003\u011c" +
					"\u008e\u0000\u03c4\u03c5\u00036\u001b\u0000\u03c5\u03c6\u0003\u0122\u0091" +
					"\u0000\u03c6\u03c8\u0001\u0000\u0000\u0000\u03c7\u03c4\u0001\u0000\u0000" +
					"\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03ca\u0001\u0000\u0000" +
					"\u0000\u03c9\u03b2\u0001\u0000\u0000\u0000\u03c9\u03bc\u0001\u0000\u0000" +
					"\u0000\u03c9\u03bf\u0001\u0000\u0000\u0000\u03c9\u03c2\u0001\u0000\u0000" +
					"\u0000\u03ca\u011b\u0001\u0000\u0000\u0000\u03cb\u03cc\u0003\u011e\u008f" +
					"\u0000\u03cc\u03cd\u0003^/\u0000\u03cd\u03ce\u0003^/\u0000\u03ce\u03cf" +
					"\u0003\u0120\u0090\u0000\u03cf\u011d\u0001\u0000\u0000\u0000\u03d0\u03d1" +
					"\u0003\u00a4R\u0000\u03d1\u011f\u0001\u0000\u0000\u0000\u03d2\u03d3\u0003" +
					"\u00a4R\u0000\u03d3\u0121\u0001\u0000\u0000\u0000\u03d4\u03d5\u0003\u012e" +
					"\u0097\u0000\u03d5\u0123\u0001\u0000\u0000\u0000\u03d6\u03d7\u0003\u00d2" +
					"i\u0000\u03d7\u0125\u0001\u0000\u0000\u0000\u03d8\u03d9\u0003\u00d2i\u0000" +
					"\u03d9\u0127\u0001\u0000\u0000\u0000\u03da\u03db\u0003\u00a4R\u0000\u03db" +
					"\u03dc\u0003^/\u0000\u03dc\u03e0\u0003\u00d8l\u0000\u03dd\u03df\u0003" +
					"\u012a\u0095\u0000\u03de\u03dd\u0001\u0000\u0000\u0000\u03df\u03e2\u0001" +
					"\u0000\u0000\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001" +
					"\u0000\u0000\u0000\u03e1\u0129\u0001\u0000\u0000\u0000\u03e2\u03e0\u0001" +
					"\u0000\u0000\u0000\u03e3\u03e6\u0003f3\u0000\u03e4\u03e6\u0003n7\u0000" +
					"\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000" +
					"\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7\u03e8\u0003\u00d8l\u0000\u03e8" +
					"\u012b\u0001\u0000\u0000\u0000\u03e9\u03ed\u0003\u012e\u0097\u0000\u03ea" +
					"\u03ec\u0003\u0130\u0098\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03ec" +
					"\u03ef\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ed" +
					"\u03ee\u0001\u0000\u0000\u0000\u03ee\u012d\u0001\u0000\u0000\u0000\u03ef" +
					"\u03ed\u0001\u0000\u0000\u0000\u03f0\u03f3\u0003\u00e4r\u0000\u03f1\u03f3" +
					"\u0003\u00f6{\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f1\u0001" +
					"\u0000\u0000\u0000\u03f3\u012f\u0001\u0000\u0000\u0000\u03f4\u03f5\u0003" +
					"b1\u0000\u03f5\u03f6\u0003\u012e\u0097\u0000\u03f6\u0131\u0001\u0000\u0000" +
					"\u0000\u03f7\u03f9\u0003\u00c4b\u0000\u03f8\u03f7\u0001\u0000\u0000\u0000" +
					"\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fb\u0001\u0000\u0000\u0000" +
					"\u03fa\u03fc\u0003\u00d8l\u0000\u03fb\u03fa\u0001\u0000\u0000\u0000\u03fb" +
					"\u03fc\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd" +
					"\u0403\u0003\u0134\u009a\u0000\u03fe\u0401\u0003\u009eO\u0000\u03ff\u0402" +
					"\u0003\u00f6{\u0000\u0400\u0402\u0003\u00c2a\u0000\u0401\u03ff\u0001\u0000" +
					"\u0000\u0000\u0401\u0400\u0001\u0000\u0000\u0000\u0402\u0404\u0001\u0000" +
					"\u0000\u0000\u0403\u03fe\u0001\u0000\u0000\u0000\u0403\u0404\u0001\u0000" +
					"\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0406\u0003`0\u0000" +
					"\u0406\u0133\u0001\u0000\u0000\u0000\u0407\u040a\u0003\u00a4R\u0000\u0408" +
					"\u040a\u0003\u00a6S\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u0409\u0408" +
					"\u0001\u0000\u0000\u0000\u040a\u0135\u0001\u0000\u0000\u0000\u040b\u040d" +
					"\u0003\u00f0x\u0000\u040c\u040b\u0001\u0000\u0000\u0000\u040d\u0410\u0001" +
					"\u0000\u0000\u0000\u040e\u040c\u0001\u0000\u0000\u0000\u040e\u040f\u0001" +
					"\u0000\u0000\u0000\u040f\u0412\u0001\u0000\u0000\u0000\u0410\u040e\u0001" +
					"\u0000\u0000\u0000\u0411\u0413\u0003\u00b6[\u0000\u0412\u0411\u0001\u0000" +
					"\u0000\u0000\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u0415\u0001\u0000" +
					"\u0000\u0000\u0414\u0416\u0003\u00c0`\u0000\u0415\u0414\u0001\u0000\u0000" +
					"\u0000\u0415\u0416\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000" +
					"\u0000\u0417\u0418\u0003\u001c\u000e\u0000\u0418\u0419\u0003\u00a4R\u0000" +
					"\u0419\u041f\u0003J%\u0000\u041a\u0420\u0003L&\u0000\u041b\u041d\u0003" +
					"\u0138\u009c\u0000\u041c\u041b\u0001\u0000\u0000\u0000\u041c\u041d\u0001" +
					"\u0000\u0000\u0000\u041d\u041e\u0001\u0000\u0000\u0000\u041e\u0420\u0003" +
					"L&\u0000\u041f\u041a\u0001\u0000\u0000\u0000\u041f\u041c\u0001\u0000\u0000" +
					"\u0000\u0420\u0137\u0001\u0000\u0000\u0000\u0421\u0424\u0003\u013e\u009f" +
					"\u0000\u0422\u0424\u0003\u013a\u009d\u0000\u0423\u0421\u0001\u0000\u0000" +
					"\u0000\u0423\u0422\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000" +
					"\u0000\u0425\u0423\u0001\u0000\u0000\u0000\u0425\u0426\u0001\u0000\u0000" +
					"\u0000\u0426\u0139\u0001\u0000\u0000\u0000\u0427\u042c\u0003\u00c6c\u0000" +
					"\u0428\u042c\u0003\u0140\u00a0\u0000\u0429\u042c\u0003\u00cae\u0000\u042a" +
					"\u042c\u0003\u00c8d\u0000\u042b\u0427\u0001\u0000\u0000\u0000\u042b\u0428" +
					"\u0001\u0000\u0000\u0000\u042b\u0429\u0001\u0000\u0000\u0000\u042b\u042a" +
					"\u0001\u0000\u0000\u0000\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u042b" +
					"\u0001\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u013b" +
					"\u0001\u0000\u0000\u0000\u042f\u0432\u0003\u0142\u00a1\u0000\u0430\u0432" +
					"\u0003\u00ccf\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0431\u0430\u0001" +
					"\u0000\u0000\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0431\u0001" +
					"\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u013d\u0001" +
					"\u0000\u0000\u0000\u0435\u0437\u0003\u0014\n\u0000\u0436\u0438\u0003\u00ae" +
					"W\u0000\u0437\u0436\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000" +
					"\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u043b\u0003J%\u0000\u043a" +
					"\u043c\u0003\u013c\u009e\u0000\u043b\u043a\u0001\u0000\u0000\u0000\u043b" +
					"\u043c\u0001\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000\u0000\u043d" +
					"\u043e\u0003L&\u0000\u043e\u013f\u0001\u0000\u0000\u0000\u043f\u0441\u0003" +
					"\u00b6[\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000" +
					"\u0000\u0000\u0441\u0443\u0001\u0000\u0000\u0000\u0442\u0444\u0003\u00b2" +
					"Y\u0000\u0443\u0442\u0001\u0000\u0000\u0000\u0443\u0444\u0001\u0000\u0000" +
					"\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445\u0446\u0003\u0144\u00a2" +
					"\u0000\u0446\u0447\u0003^/\u0000\u0447\u044d\u0003\u00d8l\u0000\u0448" +
					"\u044b\u0003\u009eO\u0000\u0449\u044c\u0003\u00f6{\u0000\u044a\u044c\u0003" +
					"\u00c2a\u0000\u044b\u0449\u0001\u0000\u0000\u0000\u044b\u044a\u0001\u0000" +
					"\u0000\u0000\u044c\u044e\u0001\u0000\u0000\u0000\u044d\u0448\u0001\u0000" +
					"\u0000\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000" +
					"\u0000\u0000\u044f\u0450\u0003`0\u0000\u0450\u0141\u0001\u0000\u0000\u0000" +
					"\u0451\u0452\u0003\u00d8l\u0000\u0452\u0458\u0003\u0144\u00a2\u0000\u0453" +
					"\u0456\u0003\u009eO\u0000\u0454\u0457\u0003\u00f6{\u0000\u0455\u0457\u0003" +
					"\u00c2a\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0456\u0455\u0001\u0000" +
					"\u0000\u0000\u0457\u0459\u0001\u0000\u0000\u0000\u0458\u0453\u0001\u0000" +
					"\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u045a\u0001\u0000" +
					"\u0000\u0000\u045a\u045b\u0003`0\u0000\u045b\u0143\u0001\u0000\u0000\u0000" +
					"\u045c\u045d\u0003\u00a4R\u0000\u045d\u0145\u0001\u0000\u0000\u0000q\u0147" +
					"\u014c\u0152\u0195\u01e0\u01ec\u01fa\u01fe\u0205\u021e\u0220\u0222\u0225" +
					"\u0227\u022b\u022e\u0232\u0234\u0238\u023a\u023e\u0240\u0244\u0246\u024b" +
					"\u024f\u0255\u025b\u0261\u0263\u0269\u026d\u0270\u0273\u027b\u027e\u0283" +
					"\u0287\u028b\u028e\u0291\u0299\u029f\u02a7\u02aa\u02ae\u02b3\u02bc\u02be" +
					"\u02c3\u02cc\u02d5\u02d8\u02de\u02e7\u02ef\u02f4\u02fc\u0301\u030a\u0310" +
					"\u0317\u031b\u0324\u0329\u0330\u0333\u0339\u033f\u0347\u034d\u0353\u0365" +
					"\u036a\u0370\u0377\u037b\u0382\u0395\u039b\u03a2\u03aa\u03b8\u03c7\u03c9" +
					"\u03e0\u03e5\u03ed\u03f2\u03f8\u03fb\u0401\u0403\u0409\u040e\u0412\u0415" +
					"\u041c\u041f\u0423\u0425\u042b\u042d\u0431\u0433\u0437\u043b\u0440\u0443" +
					"\u044b\u044d\u0456\u0458";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}