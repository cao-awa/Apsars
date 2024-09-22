// Generated from D:/Codes/Java/Apsars/grammar/pure/PureApsars.g4 by ANTLR 4.13.1
package com.github.cao.awa.apsars.antlr.pure;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PureApsarsParser}.
 */
public interface PureApsarsListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link PureApsarsParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(PureApsarsParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(PureApsarsParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#definePackage}.
     *
     * @param ctx the parse tree
     */
    void enterDefinePackage(PureApsarsParser.DefinePackageContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#definePackage}.
     *
     * @param ctx the parse tree
     */
    void exitDefinePackage(PureApsarsParser.DefinePackageContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineImport}.
     *
     * @param ctx the parse tree
     */
    void enterDefineImport(PureApsarsParser.DefineImportContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineImport}.
     *
     * @param ctx the parse tree
     */
    void exitDefineImport(PureApsarsParser.DefineImportContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isPublic}.
     *
     * @param ctx the parse tree
     */
    void enterIsPublic(PureApsarsParser.IsPublicContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isPublic}.
     *
     * @param ctx the parse tree
     */
    void exitIsPublic(PureApsarsParser.IsPublicContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isPrivate}.
     *
     * @param ctx the parse tree
     */
    void enterIsPrivate(PureApsarsParser.IsPrivateContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isPrivate}.
     *
     * @param ctx the parse tree
     */
    void exitIsPrivate(PureApsarsParser.IsPrivateContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isProtected}.
     *
     * @param ctx the parse tree
     */
    void enterIsProtected(PureApsarsParser.IsProtectedContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isProtected}.
     *
     * @param ctx the parse tree
     */
    void exitIsProtected(PureApsarsParser.IsProtectedContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isFinal}.
     *
     * @param ctx the parse tree
     */
    void enterIsFinal(PureApsarsParser.IsFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isFinal}.
     *
     * @param ctx the parse tree
     */
    void exitIsFinal(PureApsarsParser.IsFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isVal}.
     *
     * @param ctx the parse tree
     */
    void enterIsVal(PureApsarsParser.IsValContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isVal}.
     *
     * @param ctx the parse tree
     */
    void exitIsVal(PureApsarsParser.IsValContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isUnique}.
     *
     * @param ctx the parse tree
     */
    void enterIsUnique(PureApsarsParser.IsUniqueContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isUnique}.
     *
     * @param ctx the parse tree
     */
    void exitIsUnique(PureApsarsParser.IsUniqueContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isInline}.
     *
     * @param ctx the parse tree
     */
    void enterIsInline(PureApsarsParser.IsInlineContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isInline}.
     *
     * @param ctx the parse tree
     */
    void exitIsInline(PureApsarsParser.IsInlineContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#let}.
     *
     * @param ctx the parse tree
     */
    void enterLet(PureApsarsParser.LetContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#let}.
     *
     * @param ctx the parse tree
     */
    void exitLet(PureApsarsParser.LetContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#packageAt}.
     *
     * @param ctx the parse tree
     */
    void enterPackageAt(PureApsarsParser.PackageAtContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#packageAt}.
     *
     * @param ctx the parse tree
     */
    void exitPackageAt(PureApsarsParser.PackageAtContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#importting}.
     *
     * @param ctx the parse tree
     */
    void enterImportting(PureApsarsParser.ImporttingContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#importting}.
     *
     * @param ctx the parse tree
     */
    void exitImportting(PureApsarsParser.ImporttingContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isStatic}.
     *
     * @param ctx the parse tree
     */
    void enterIsStatic(PureApsarsParser.IsStaticContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isStatic}.
     *
     * @param ctx the parse tree
     */
    void exitIsStatic(PureApsarsParser.IsStaticContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#classKeyword}.
     *
     * @param ctx the parse tree
     */
    void enterClassKeyword(PureApsarsParser.ClassKeywordContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#classKeyword}.
     *
     * @param ctx the parse tree
     */
    void exitClassKeyword(PureApsarsParser.ClassKeywordContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#returnKeyword}.
     *
     * @param ctx the parse tree
     */
    void enterReturnKeyword(PureApsarsParser.ReturnKeywordContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#returnKeyword}.
     *
     * @param ctx the parse tree
     */
    void exitReturnKeyword(PureApsarsParser.ReturnKeywordContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#yieldKeyword}.
     *
     * @param ctx the parse tree
     */
    void enterYieldKeyword(PureApsarsParser.YieldKeywordContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#yieldKeyword}.
     *
     * @param ctx the parse tree
     */
    void exitYieldKeyword(PureApsarsParser.YieldKeywordContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isTransient}.
     *
     * @param ctx the parse tree
     */
    void enterIsTransient(PureApsarsParser.IsTransientContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isTransient}.
     *
     * @param ctx the parse tree
     */
    void exitIsTransient(PureApsarsParser.IsTransientContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isVolatile}.
     *
     * @param ctx the parse tree
     */
    void enterIsVolatile(PureApsarsParser.IsVolatileContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isVolatile}.
     *
     * @param ctx the parse tree
     */
    void exitIsVolatile(PureApsarsParser.IsVolatileContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isHolder}.
     *
     * @param ctx the parse tree
     */
    void enterIsHolder(PureApsarsParser.IsHolderContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isHolder}.
     *
     * @param ctx the parse tree
     */
    void exitIsHolder(PureApsarsParser.IsHolderContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isGetHolder}.
     *
     * @param ctx the parse tree
     */
    void enterIsGetHolder(PureApsarsParser.IsGetHolderContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isGetHolder}.
     *
     * @param ctx the parse tree
     */
    void exitIsGetHolder(PureApsarsParser.IsGetHolderContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isSetHolder}.
     *
     * @param ctx the parse tree
     */
    void enterIsSetHolder(PureApsarsParser.IsSetHolderContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isSetHolder}.
     *
     * @param ctx the parse tree
     */
    void exitIsSetHolder(PureApsarsParser.IsSetHolderContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isOverridable}.
     *
     * @param ctx the parse tree
     */
    void enterIsOverridable(PureApsarsParser.IsOverridableContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isOverridable}.
     *
     * @param ctx the parse tree
     */
    void exitIsOverridable(PureApsarsParser.IsOverridableContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#catching}.
     *
     * @param ctx the parse tree
     */
    void enterCatching(PureApsarsParser.CatchingContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#catching}.
     *
     * @param ctx the parse tree
     */
    void exitCatching(PureApsarsParser.CatchingContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#ignored}.
     *
     * @param ctx the parse tree
     */
    void enterIgnored(PureApsarsParser.IgnoredContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#ignored}.
     *
     * @param ctx the parse tree
     */
    void exitIgnored(PureApsarsParser.IgnoredContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#print}.
     *
     * @param ctx the parse tree
     */
    void enterPrint(PureApsarsParser.PrintContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#print}.
     *
     * @param ctx the parse tree
     */
    void exitPrint(PureApsarsParser.PrintContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#deliver}.
     *
     * @param ctx the parse tree
     */
    void enterDeliver(PureApsarsParser.DeliverContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#deliver}.
     *
     * @param ctx the parse tree
     */
    void exitDeliver(PureApsarsParser.DeliverContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#with}.
     *
     * @param ctx the parse tree
     */
    void enterWith(PureApsarsParser.WithContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#with}.
     *
     * @param ctx the parse tree
     */
    void exitWith(PureApsarsParser.WithContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isSync}.
     *
     * @param ctx the parse tree
     */
    void enterIsSync(PureApsarsParser.IsSyncContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isSync}.
     *
     * @param ctx the parse tree
     */
    void exitIsSync(PureApsarsParser.IsSyncContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isSynchronized}.
     *
     * @param ctx the parse tree
     */
    void enterIsSynchronized(PureApsarsParser.IsSynchronizedContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isSynchronized}.
     *
     * @param ctx the parse tree
     */
    void exitIsSynchronized(PureApsarsParser.IsSynchronizedContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#sync}.
     *
     * @param ctx the parse tree
     */
    void enterSync(PureApsarsParser.SyncContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#sync}.
     *
     * @param ctx the parse tree
     */
    void exitSync(PureApsarsParser.SyncContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#template}.
     *
     * @param ctx the parse tree
     */
    void enterTemplate(PureApsarsParser.TemplateContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#template}.
     *
     * @param ctx the parse tree
     */
    void exitTemplate(PureApsarsParser.TemplateContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#constructor}.
     *
     * @param ctx the parse tree
     */
    void enterConstructor(PureApsarsParser.ConstructorContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#constructor}.
     *
     * @param ctx the parse tree
     */
    void exitConstructor(PureApsarsParser.ConstructorContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#newKeyword}.
     *
     * @param ctx the parse tree
     */
    void enterNewKeyword(PureApsarsParser.NewKeywordContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#newKeyword}.
     *
     * @param ctx the parse tree
     */
    void exitNewKeyword(PureApsarsParser.NewKeywordContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#ifKeyword}.
     *
     * @param ctx the parse tree
     */
    void enterIfKeyword(PureApsarsParser.IfKeywordContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#ifKeyword}.
     *
     * @param ctx the parse tree
     */
    void exitIfKeyword(PureApsarsParser.IfKeywordContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#elseKeyword}.
     *
     * @param ctx the parse tree
     */
    void enterElseKeyword(PureApsarsParser.ElseKeywordContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#elseKeyword}.
     *
     * @param ctx the parse tree
     */
    void exitElseKeyword(PureApsarsParser.ElseKeywordContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#point}.
     *
     * @param ctx the parse tree
     */
    void enterPoint(PureApsarsParser.PointContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#point}.
     *
     * @param ctx the parse tree
     */
    void exitPoint(PureApsarsParser.PointContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#leftBrace}.
     *
     * @param ctx the parse tree
     */
    void enterLeftBrace(PureApsarsParser.LeftBraceContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#leftBrace}.
     *
     * @param ctx the parse tree
     */
    void exitLeftBrace(PureApsarsParser.LeftBraceContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#rightBrace}.
     *
     * @param ctx the parse tree
     */
    void enterRightBrace(PureApsarsParser.RightBraceContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#rightBrace}.
     *
     * @param ctx the parse tree
     */
    void exitRightBrace(PureApsarsParser.RightBraceContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#leftAngleBracket}.
     *
     * @param ctx the parse tree
     */
    void enterLeftAngleBracket(PureApsarsParser.LeftAngleBracketContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#leftAngleBracket}.
     *
     * @param ctx the parse tree
     */
    void exitLeftAngleBracket(PureApsarsParser.LeftAngleBracketContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#rightAngleBracket}.
     *
     * @param ctx the parse tree
     */
    void enterRightAngleBracket(PureApsarsParser.RightAngleBracketContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#rightAngleBracket}.
     *
     * @param ctx the parse tree
     */
    void exitRightAngleBracket(PureApsarsParser.RightAngleBracketContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#leftBracket}.
     *
     * @param ctx the parse tree
     */
    void enterLeftBracket(PureApsarsParser.LeftBracketContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#leftBracket}.
     *
     * @param ctx the parse tree
     */
    void exitLeftBracket(PureApsarsParser.LeftBracketContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#rightBracket}.
     *
     * @param ctx the parse tree
     */
    void enterRightBracket(PureApsarsParser.RightBracketContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#rightBracket}.
     *
     * @param ctx the parse tree
     */
    void exitRightBracket(PureApsarsParser.RightBracketContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#leftParenthesis}.
     *
     * @param ctx the parse tree
     */
    void enterLeftParenthesis(PureApsarsParser.LeftParenthesisContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#leftParenthesis}.
     *
     * @param ctx the parse tree
     */
    void exitLeftParenthesis(PureApsarsParser.LeftParenthesisContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#rightParenthesis}.
     *
     * @param ctx the parse tree
     */
    void enterRightParenthesis(PureApsarsParser.RightParenthesisContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#rightParenthesis}.
     *
     * @param ctx the parse tree
     */
    void exitRightParenthesis(PureApsarsParser.RightParenthesisContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#leftParen}.
     *
     * @param ctx the parse tree
     */
    void enterLeftParen(PureApsarsParser.LeftParenContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#leftParen}.
     *
     * @param ctx the parse tree
     */
    void exitLeftParen(PureApsarsParser.LeftParenContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#rightParen}.
     *
     * @param ctx the parse tree
     */
    void enterRightParen(PureApsarsParser.RightParenContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#rightParen}.
     *
     * @param ctx the parse tree
     */
    void exitRightParen(PureApsarsParser.RightParenContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#colon}.
     *
     * @param ctx the parse tree
     */
    void enterColon(PureApsarsParser.ColonContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#colon}.
     *
     * @param ctx the parse tree
     */
    void exitColon(PureApsarsParser.ColonContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#semicolon}.
     *
     * @param ctx the parse tree
     */
    void enterSemicolon(PureApsarsParser.SemicolonContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#semicolon}.
     *
     * @param ctx the parse tree
     */
    void exitSemicolon(PureApsarsParser.SemicolonContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#comma}.
     *
     * @param ctx the parse tree
     */
    void enterComma(PureApsarsParser.CommaContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#comma}.
     *
     * @param ctx the parse tree
     */
    void exitComma(PureApsarsParser.CommaContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#and}.
     *
     * @param ctx the parse tree
     */
    void enterAnd(PureApsarsParser.AndContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#and}.
     *
     * @param ctx the parse tree
     */
    void exitAnd(PureApsarsParser.AndContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#or}.
     *
     * @param ctx the parse tree
     */
    void enterOr(PureApsarsParser.OrContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#or}.
     *
     * @param ctx the parse tree
     */
    void exitOr(PureApsarsParser.OrContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#argAnd}.
     *
     * @param ctx the parse tree
     */
    void enterArgAnd(PureApsarsParser.ArgAndContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#argAnd}.
     *
     * @param ctx the parse tree
     */
    void exitArgAnd(PureApsarsParser.ArgAndContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#argOr}.
     *
     * @param ctx the parse tree
     */
    void enterArgOr(PureApsarsParser.ArgOrContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#argOr}.
     *
     * @param ctx the parse tree
     */
    void exitArgOr(PureApsarsParser.ArgOrContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#wordAnd}.
     *
     * @param ctx the parse tree
     */
    void enterWordAnd(PureApsarsParser.WordAndContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#wordAnd}.
     *
     * @param ctx the parse tree
     */
    void exitWordAnd(PureApsarsParser.WordAndContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#wordOr}.
     *
     * @param ctx the parse tree
     */
    void enterWordOr(PureApsarsParser.WordOrContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#wordOr}.
     *
     * @param ctx the parse tree
     */
    void exitWordOr(PureApsarsParser.WordOrContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#addisionAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterAddisionAssignment(PureApsarsParser.AddisionAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#addisionAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitAddisionAssignment(PureApsarsParser.AddisionAssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#subtractionAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterSubtractionAssignment(PureApsarsParser.SubtractionAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#subtractionAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitSubtractionAssignment(PureApsarsParser.SubtractionAssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#multiplicationAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterMultiplicationAssignment(PureApsarsParser.MultiplicationAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#multiplicationAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitMultiplicationAssignment(PureApsarsParser.MultiplicationAssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#divisionAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterDivisionAssignment(PureApsarsParser.DivisionAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#divisionAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitDivisionAssignment(PureApsarsParser.DivisionAssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#powAssignment}.
     *
     * @param ctx the parse tree
     */
    void enterPowAssignment(PureApsarsParser.PowAssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#powAssignment}.
     *
     * @param ctx the parse tree
     */
    void exitPowAssignment(PureApsarsParser.PowAssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#plus}.
     *
     * @param ctx the parse tree
     */
    void enterPlus(PureApsarsParser.PlusContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#plus}.
     *
     * @param ctx the parse tree
     */
    void exitPlus(PureApsarsParser.PlusContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#minus}.
     *
     * @param ctx the parse tree
     */
    void enterMinus(PureApsarsParser.MinusContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#minus}.
     *
     * @param ctx the parse tree
     */
    void exitMinus(PureApsarsParser.MinusContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#multiply}.
     *
     * @param ctx the parse tree
     */
    void enterMultiply(PureApsarsParser.MultiplyContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#multiply}.
     *
     * @param ctx the parse tree
     */
    void exitMultiply(PureApsarsParser.MultiplyContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#divide}.
     *
     * @param ctx the parse tree
     */
    void enterDivide(PureApsarsParser.DivideContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#divide}.
     *
     * @param ctx the parse tree
     */
    void exitDivide(PureApsarsParser.DivideContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#pow}.
     *
     * @param ctx the parse tree
     */
    void enterPow(PureApsarsParser.PowContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#pow}.
     *
     * @param ctx the parse tree
     */
    void exitPow(PureApsarsParser.PowContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#operator}.
     *
     * @param ctx the parse tree
     */
    void enterOperator(PureApsarsParser.OperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#operator}.
     *
     * @param ctx the parse tree
     */
    void exitOperator(PureApsarsParser.OperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#arithmetic}.
     *
     * @param ctx the parse tree
     */
    void enterArithmetic(PureApsarsParser.ArithmeticContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#arithmetic}.
     *
     * @param ctx the parse tree
     */
    void exitArithmetic(PureApsarsParser.ArithmeticContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#breakingAnd}.
     *
     * @param ctx the parse tree
     */
    void enterBreakingAnd(PureApsarsParser.BreakingAndContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#breakingAnd}.
     *
     * @param ctx the parse tree
     */
    void exitBreakingAnd(PureApsarsParser.BreakingAndContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#breakingOr}.
     *
     * @param ctx the parse tree
     */
    void enterBreakingOr(PureApsarsParser.BreakingOrContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#breakingOr}.
     *
     * @param ctx the parse tree
     */
    void exitBreakingOr(PureApsarsParser.BreakingOrContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#not}.
     *
     * @param ctx the parse tree
     */
    void enterNot(PureApsarsParser.NotContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#not}.
     *
     * @param ctx the parse tree
     */
    void exitNot(PureApsarsParser.NotContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#lessThan}.
     *
     * @param ctx the parse tree
     */
    void enterLessThan(PureApsarsParser.LessThanContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#lessThan}.
     *
     * @param ctx the parse tree
     */
    void exitLessThan(PureApsarsParser.LessThanContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#moreThan}.
     *
     * @param ctx the parse tree
     */
    void enterMoreThan(PureApsarsParser.MoreThanContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#moreThan}.
     *
     * @param ctx the parse tree
     */
    void exitMoreThan(PureApsarsParser.MoreThanContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#comparingAnd}.
     *
     * @param ctx the parse tree
     */
    void enterComparingAnd(PureApsarsParser.ComparingAndContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#comparingAnd}.
     *
     * @param ctx the parse tree
     */
    void exitComparingAnd(PureApsarsParser.ComparingAndContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#comparingOr}.
     *
     * @param ctx the parse tree
     */
    void enterComparingOr(PureApsarsParser.ComparingOrContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#comparingOr}.
     *
     * @param ctx the parse tree
     */
    void exitComparingOr(PureApsarsParser.ComparingOrContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#comparing}.
     *
     * @param ctx the parse tree
     */
    void enterComparing(PureApsarsParser.ComparingContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#comparing}.
     *
     * @param ctx the parse tree
     */
    void exitComparing(PureApsarsParser.ComparingContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#atSign}.
     *
     * @param ctx the parse tree
     */
    void enterAtSign(PureApsarsParser.AtSignContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#atSign}.
     *
     * @param ctx the parse tree
     */
    void exitAtSign(PureApsarsParser.AtSignContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#null}.
     *
     * @param ctx the parse tree
     */
    void enterNull(PureApsarsParser.NullContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#null}.
     *
     * @param ctx the parse tree
     */
    void exitNull(PureApsarsParser.NullContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#bool}.
     *
     * @param ctx the parse tree
     */
    void enterBool(PureApsarsParser.BoolContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#bool}.
     *
     * @param ctx the parse tree
     */
    void exitBool(PureApsarsParser.BoolContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(PureApsarsParser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(PureApsarsParser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#isEquals}.
     *
     * @param ctx the parse tree
     */
    void enterIsEquals(PureApsarsParser.IsEqualsContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#isEquals}.
     *
     * @param ctx the parse tree
     */
    void exitIsEquals(PureApsarsParser.IsEqualsContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#fullNameOrIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterFullNameOrIdentifier(PureApsarsParser.FullNameOrIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#fullNameOrIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitFullNameOrIdentifier(PureApsarsParser.FullNameOrIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifier(PureApsarsParser.IdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifier(PureApsarsParser.IdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#fullName}.
     *
     * @param ctx the parse tree
     */
    void enterFullName(PureApsarsParser.FullNameContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#fullName}.
     *
     * @param ctx the parse tree
     */
    void exitFullName(PureApsarsParser.FullNameContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#number}.
     *
     * @param ctx the parse tree
     */
    void enterNumber(PureApsarsParser.NumberContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#number}.
     *
     * @param ctx the parse tree
     */
    void exitNumber(PureApsarsParser.NumberContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#fieldModifiers}.
     *
     * @param ctx the parse tree
     */
    void enterFieldModifiers(PureApsarsParser.FieldModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#fieldModifiers}.
     *
     * @param ctx the parse tree
     */
    void exitFieldModifiers(PureApsarsParser.FieldModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#methodModifiers}.
     *
     * @param ctx the parse tree
     */
    void enterMethodModifiers(PureApsarsParser.MethodModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#methodModifiers}.
     *
     * @param ctx the parse tree
     */
    void exitMethodModifiers(PureApsarsParser.MethodModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#makeAlternateLet}.
     *
     * @param ctx the parse tree
     */
    void enterMakeAlternateLet(PureApsarsParser.MakeAlternateLetContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#makeAlternateLet}.
     *
     * @param ctx the parse tree
     */
    void exitMakeAlternateLet(PureApsarsParser.MakeAlternateLetContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#optionalFieldAndMethodModifiers}.
     *
     * @param ctx the parse tree
     */
    void enterOptionalFieldAndMethodModifiers(PureApsarsParser.OptionalFieldAndMethodModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#optionalFieldAndMethodModifiers}.
     *
     * @param ctx the parse tree
     */
    void exitOptionalFieldAndMethodModifiers(PureApsarsParser.OptionalFieldAndMethodModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#optionalFieldStaticAndFinal}.
     *
     * @param ctx the parse tree
     */
    void enterOptionalFieldStaticAndFinal(PureApsarsParser.OptionalFieldStaticAndFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#optionalFieldStaticAndFinal}.
     *
     * @param ctx the parse tree
     */
    void exitOptionalFieldStaticAndFinal(PureApsarsParser.OptionalFieldStaticAndFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#optionalStaticAndFinal}.
     *
     * @param ctx the parse tree
     */
    void enterOptionalStaticAndFinal(PureApsarsParser.OptionalStaticAndFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#optionalStaticAndFinal}.
     *
     * @param ctx the parse tree
     */
    void exitOptionalStaticAndFinal(PureApsarsParser.OptionalStaticAndFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#permissionModifiers}.
     *
     * @param ctx the parse tree
     */
    void enterPermissionModifiers(PureApsarsParser.PermissionModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#permissionModifiers}.
     *
     * @param ctx the parse tree
     */
    void exitPermissionModifiers(PureApsarsParser.PermissionModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#packageIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterPackageIdentifier(PureApsarsParser.PackageIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#packageIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitPackageIdentifier(PureApsarsParser.PackageIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#fullNameIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterFullNameIdentifier(PureApsarsParser.FullNameIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#fullNameIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitFullNameIdentifier(PureApsarsParser.FullNameIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#fieldFinal}.
     *
     * @param ctx the parse tree
     */
    void enterFieldFinal(PureApsarsParser.FieldFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#fieldFinal}.
     *
     * @param ctx the parse tree
     */
    void exitFieldFinal(PureApsarsParser.FieldFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#methodFinal}.
     *
     * @param ctx the parse tree
     */
    void enterMethodFinal(PureApsarsParser.MethodFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#methodFinal}.
     *
     * @param ctx the parse tree
     */
    void exitMethodFinal(PureApsarsParser.MethodFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#classFinal}.
     *
     * @param ctx the parse tree
     */
    void enterClassFinal(PureApsarsParser.ClassFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#classFinal}.
     *
     * @param ctx the parse tree
     */
    void exitClassFinal(PureApsarsParser.ClassFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#assignmentIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterAssignmentIdentifier(PureApsarsParser.AssignmentIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#assignmentIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitAssignmentIdentifier(PureApsarsParser.AssignmentIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#variableModifiers}.
     *
     * @param ctx the parse tree
     */
    void enterVariableModifiers(PureApsarsParser.VariableModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#variableModifiers}.
     *
     * @param ctx the parse tree
     */
    void exitVariableModifiers(PureApsarsParser.VariableModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineMethodUsingTemplate}.
     *
     * @param ctx the parse tree
     */
    void enterDefineMethodUsingTemplate(PureApsarsParser.DefineMethodUsingTemplateContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineMethodUsingTemplate}.
     *
     * @param ctx the parse tree
     */
    void exitDefineMethodUsingTemplate(PureApsarsParser.DefineMethodUsingTemplateContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineMethod}.
     *
     * @param ctx the parse tree
     */
    void enterDefineMethod(PureApsarsParser.DefineMethodContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineMethod}.
     *
     * @param ctx the parse tree
     */
    void exitDefineMethod(PureApsarsParser.DefineMethodContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineConstructor}.
     *
     * @param ctx the parse tree
     */
    void enterDefineConstructor(PureApsarsParser.DefineConstructorContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineConstructor}.
     *
     * @param ctx the parse tree
     */
    void exitDefineConstructor(PureApsarsParser.DefineConstructorContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineLetMethod}.
     *
     * @param ctx the parse tree
     */
    void enterDefineLetMethod(PureApsarsParser.DefineLetMethodContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineLetMethod}.
     *
     * @param ctx the parse tree
     */
    void exitDefineLetMethod(PureApsarsParser.DefineLetMethodContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#methodReturnType}.
     *
     * @param ctx the parse tree
     */
    void enterMethodReturnType(PureApsarsParser.MethodReturnTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#methodReturnType}.
     *
     * @param ctx the parse tree
     */
    void exitMethodReturnType(PureApsarsParser.MethodReturnTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#alternateMethodModifiers}.
     *
     * @param ctx the parse tree
     */
    void enterAlternateMethodModifiers(PureApsarsParser.AlternateMethodModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#alternateMethodModifiers}.
     *
     * @param ctx the parse tree
     */
    void exitAlternateMethodModifiers(PureApsarsParser.AlternateMethodModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineMethodBody}.
     *
     * @param ctx the parse tree
     */
    void enterDefineMethodBody(PureApsarsParser.DefineMethodBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineMethodBody}.
     *
     * @param ctx the parse tree
     */
    void exitDefineMethodBody(PureApsarsParser.DefineMethodBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#methodParamListDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterMethodParamListDefinition(PureApsarsParser.MethodParamListDefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#methodParamListDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitMethodParamListDefinition(PureApsarsParser.MethodParamListDefinitionContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#paramType}.
     *
     * @param ctx the parse tree
     */
    void enterParamType(PureApsarsParser.ParamTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#paramType}.
     *
     * @param ctx the parse tree
     */
    void exitParamType(PureApsarsParser.ParamTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#argType}.
     *
     * @param ctx the parse tree
     */
    void enterArgType(PureApsarsParser.ArgTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#argType}.
     *
     * @param ctx the parse tree
     */
    void exitArgType(PureApsarsParser.ArgTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#extraArgTypes}.
     *
     * @param ctx the parse tree
     */
    void enterExtraArgTypes(PureApsarsParser.ExtraArgTypesContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#extraArgTypes}.
     *
     * @param ctx the parse tree
     */
    void exitExtraArgTypes(PureApsarsParser.ExtraArgTypesContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#typedArgType}.
     *
     * @param ctx the parse tree
     */
    void enterTypedArgType(PureApsarsParser.TypedArgTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#typedArgType}.
     *
     * @param ctx the parse tree
     */
    void exitTypedArgType(PureApsarsParser.TypedArgTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#arrayArgType}.
     *
     * @param ctx the parse tree
     */
    void enterArrayArgType(PureApsarsParser.ArrayArgTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#arrayArgType}.
     *
     * @param ctx the parse tree
     */
    void exitArrayArgType(PureApsarsParser.ArrayArgTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#arrayDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterArrayDefinition(PureApsarsParser.ArrayDefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#arrayDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitArrayDefinition(PureApsarsParser.ArrayDefinitionContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#tokenList}.
     *
     * @param ctx the parse tree
     */
    void enterTokenList(PureApsarsParser.TokenListContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#tokenList}.
     *
     * @param ctx the parse tree
     */
    void exitTokenList(PureApsarsParser.TokenListContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#validToken}.
     *
     * @param ctx the parse tree
     */
    void enterValidToken(PureApsarsParser.ValidTokenContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#validToken}.
     *
     * @param ctx the parse tree
     */
    void exitValidToken(PureApsarsParser.ValidTokenContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#extraToken}.
     *
     * @param ctx the parse tree
     */
    void enterExtraToken(PureApsarsParser.ExtraTokenContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#extraToken}.
     *
     * @param ctx the parse tree
     */
    void exitExtraToken(PureApsarsParser.ExtraTokenContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterConstant(PureApsarsParser.ConstantContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitConstant(PureApsarsParser.ConstantContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#string}.
     *
     * @param ctx the parse tree
     */
    void enterString(PureApsarsParser.StringContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#string}.
     *
     * @param ctx the parse tree
     */
    void exitString(PureApsarsParser.StringContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#identifierOrSpace}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierOrSpace(PureApsarsParser.IdentifierOrSpaceContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#identifierOrSpace}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierOrSpace(PureApsarsParser.IdentifierOrSpaceContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#spacing}.
     *
     * @param ctx the parse tree
     */
    void enterSpacing(PureApsarsParser.SpacingContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#spacing}.
     *
     * @param ctx the parse tree
     */
    void exitSpacing(PureApsarsParser.SpacingContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#annotation}.
     *
     * @param ctx the parse tree
     */
    void enterAnnotation(PureApsarsParser.AnnotationContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#annotation}.
     *
     * @param ctx the parse tree
     */
    void exitAnnotation(PureApsarsParser.AnnotationContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDefineStatement(PureApsarsParser.DefineStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDefineStatement(PureApsarsParser.DefineStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#theStatement}.
     *
     * @param ctx the parse tree
     */
    void enterTheStatement(PureApsarsParser.TheStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#theStatement}.
     *
     * @param ctx the parse tree
     */
    void exitTheStatement(PureApsarsParser.TheStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#resultPresenting}.
     *
     * @param ctx the parse tree
     */
    void enterResultPresenting(PureApsarsParser.ResultPresentingContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#resultPresenting}.
     *
     * @param ctx the parse tree
     */
    void exitResultPresenting(PureApsarsParser.ResultPresentingContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#resultingStatement}.
     *
     * @param ctx the parse tree
     */
    void enterResultingStatement(PureApsarsParser.ResultingStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#resultingStatement}.
     *
     * @param ctx the parse tree
     */
    void exitResultingStatement(PureApsarsParser.ResultingStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#calculatableResultPresenting}.
     *
     * @param ctx the parse tree
     */
    void enterCalculatableResultPresenting(PureApsarsParser.CalculatableResultPresentingContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#calculatableResultPresenting}.
     *
     * @param ctx the parse tree
     */
    void exitCalculatableResultPresenting(PureApsarsParser.CalculatableResultPresentingContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfStatement(PureApsarsParser.IfStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfStatement(PureApsarsParser.IfStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#elseIfStatement}.
     *
     * @param ctx the parse tree
     */
    void enterElseIfStatement(PureApsarsParser.ElseIfStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#elseIfStatement}.
     *
     * @param ctx the parse tree
     */
    void exitElseIfStatement(PureApsarsParser.ElseIfStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#elseStatement}.
     *
     * @param ctx the parse tree
     */
    void enterElseStatement(PureApsarsParser.ElseStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#elseStatement}.
     *
     * @param ctx the parse tree
     */
    void exitElseStatement(PureApsarsParser.ElseStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#statementBlock}.
     *
     * @param ctx the parse tree
     */
    void enterStatementBlock(PureApsarsParser.StatementBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#statementBlock}.
     *
     * @param ctx the parse tree
     */
    void exitStatementBlock(PureApsarsParser.StatementBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#calculateStatementWithParen}.
     *
     * @param ctx the parse tree
     */
    void enterCalculateStatementWithParen(PureApsarsParser.CalculateStatementWithParenContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#calculateStatementWithParen}.
     *
     * @param ctx the parse tree
     */
    void exitCalculateStatementWithParen(PureApsarsParser.CalculateStatementWithParenContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#calculateLeftStatementWithParen}.
     *
     * @param ctx the parse tree
     */
    void enterCalculateLeftStatementWithParen(PureApsarsParser.CalculateLeftStatementWithParenContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#calculateLeftStatementWithParen}.
     *
     * @param ctx the parse tree
     */
    void exitCalculateLeftStatementWithParen(PureApsarsParser.CalculateLeftStatementWithParenContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#calculateStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCalculateStatement(PureApsarsParser.CalculateStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#calculateStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCalculateStatement(PureApsarsParser.CalculateStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#calculateStatementWithTotalParen}.
     *
     * @param ctx the parse tree
     */
    void enterCalculateStatementWithTotalParen(PureApsarsParser.CalculateStatementWithTotalParenContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#calculateStatementWithTotalParen}.
     *
     * @param ctx the parse tree
     */
    void exitCalculateStatementWithTotalParen(PureApsarsParser.CalculateStatementWithTotalParenContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#calculateLeft}.
     *
     * @param ctx the parse tree
     */
    void enterCalculateLeft(PureApsarsParser.CalculateLeftContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#calculateLeft}.
     *
     * @param ctx the parse tree
     */
    void exitCalculateLeft(PureApsarsParser.CalculateLeftContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#extraCalculateStatement}.
     *
     * @param ctx the parse tree
     */
    void enterExtraCalculateStatement(PureApsarsParser.ExtraCalculateStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#extraCalculateStatement}.
     *
     * @param ctx the parse tree
     */
    void exitExtraCalculateStatement(PureApsarsParser.ExtraCalculateStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#returnStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReturnStatement(PureApsarsParser.ReturnStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#returnStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReturnStatement(PureApsarsParser.ReturnStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#yieldStatement}.
     *
     * @param ctx the parse tree
     */
    void enterYieldStatement(PureApsarsParser.YieldStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#yieldStatement}.
     *
     * @param ctx the parse tree
     */
    void exitYieldStatement(PureApsarsParser.YieldStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#invokeStatement}.
     *
     * @param ctx the parse tree
     */
    void enterInvokeStatement(PureApsarsParser.InvokeStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#invokeStatement}.
     *
     * @param ctx the parse tree
     */
    void exitInvokeStatement(PureApsarsParser.InvokeStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#fluentInvokeStatement}.
     *
     * @param ctx the parse tree
     */
    void enterFluentInvokeStatement(PureApsarsParser.FluentInvokeStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#fluentInvokeStatement}.
     *
     * @param ctx the parse tree
     */
    void exitFluentInvokeStatement(PureApsarsParser.FluentInvokeStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#newInstanceStatement}.
     *
     * @param ctx the parse tree
     */
    void enterNewInstanceStatement(PureApsarsParser.NewInstanceStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#newInstanceStatement}.
     *
     * @param ctx the parse tree
     */
    void exitNewInstanceStatement(PureApsarsParser.NewInstanceStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#tryStatement}.
     *
     * @param ctx the parse tree
     */
    void enterTryStatement(PureApsarsParser.TryStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#tryStatement}.
     *
     * @param ctx the parse tree
     */
    void exitTryStatement(PureApsarsParser.TryStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#refCall}.
     *
     * @param ctx the parse tree
     */
    void enterRefCall(PureApsarsParser.RefCallContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#refCall}.
     *
     * @param ctx the parse tree
     */
    void exitRefCall(PureApsarsParser.RefCallContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#refCallFrom}.
     *
     * @param ctx the parse tree
     */
    void enterRefCallFrom(PureApsarsParser.RefCallFromContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#refCallFrom}.
     *
     * @param ctx the parse tree
     */
    void exitRefCallFrom(PureApsarsParser.RefCallFromContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#refCallMethod}.
     *
     * @param ctx the parse tree
     */
    void enterRefCallMethod(PureApsarsParser.RefCallMethodContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#refCallMethod}.
     *
     * @param ctx the parse tree
     */
    void exitRefCallMethod(PureApsarsParser.RefCallMethodContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#withMessage}.
     *
     * @param ctx the parse tree
     */
    void enterWithMessage(PureApsarsParser.WithMessageContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#withMessage}.
     *
     * @param ctx the parse tree
     */
    void exitWithMessage(PureApsarsParser.WithMessageContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#tryStatementBody}.
     *
     * @param ctx the parse tree
     */
    void enterTryStatementBody(PureApsarsParser.TryStatementBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#tryStatementBody}.
     *
     * @param ctx the parse tree
     */
    void exitTryStatementBody(PureApsarsParser.TryStatementBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#catchingStatementBody}.
     *
     * @param ctx the parse tree
     */
    void enterCatchingStatementBody(PureApsarsParser.CatchingStatementBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#catchingStatementBody}.
     *
     * @param ctx the parse tree
     */
    void exitCatchingStatementBody(PureApsarsParser.CatchingStatementBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#tryCatchList}.
     *
     * @param ctx the parse tree
     */
    void enterTryCatchList(PureApsarsParser.TryCatchListContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#tryCatchList}.
     *
     * @param ctx the parse tree
     */
    void exitTryCatchList(PureApsarsParser.TryCatchListContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#tryCatchListExtraType}.
     *
     * @param ctx the parse tree
     */
    void enterTryCatchListExtraType(PureApsarsParser.TryCatchListExtraTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#tryCatchListExtraType}.
     *
     * @param ctx the parse tree
     */
    void exitTryCatchListExtraType(PureApsarsParser.TryCatchListExtraTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#invokeParamList}.
     *
     * @param ctx the parse tree
     */
    void enterInvokeParamList(PureApsarsParser.InvokeParamListContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#invokeParamList}.
     *
     * @param ctx the parse tree
     */
    void exitInvokeParamList(PureApsarsParser.InvokeParamListContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#validInvokeParam}.
     *
     * @param ctx the parse tree
     */
    void enterValidInvokeParam(PureApsarsParser.ValidInvokeParamContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#validInvokeParam}.
     *
     * @param ctx the parse tree
     */
    void exitValidInvokeParam(PureApsarsParser.ValidInvokeParamContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#validExtraInvokeParam}.
     *
     * @param ctx the parse tree
     */
    void enterValidExtraInvokeParam(PureApsarsParser.ValidExtraInvokeParamContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#validExtraInvokeParam}.
     *
     * @param ctx the parse tree
     */
    void exitValidExtraInvokeParam(PureApsarsParser.ValidExtraInvokeParamContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineVariableStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDefineVariableStatement(PureApsarsParser.DefineVariableStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineVariableStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDefineVariableStatement(PureApsarsParser.DefineVariableStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#variableName}.
     *
     * @param ctx the parse tree
     */
    void enterVariableName(PureApsarsParser.VariableNameContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#variableName}.
     *
     * @param ctx the parse tree
     */
    void exitVariableName(PureApsarsParser.VariableNameContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineClass}.
     *
     * @param ctx the parse tree
     */
    void enterDefineClass(PureApsarsParser.DefineClassContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineClass}.
     *
     * @param ctx the parse tree
     */
    void exitDefineClass(PureApsarsParser.DefineClassContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#makeAlternateLetAndContent}.
     *
     * @param ctx the parse tree
     */
    void enterMakeAlternateLetAndContent(PureApsarsParser.MakeAlternateLetAndContentContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#makeAlternateLetAndContent}.
     *
     * @param ctx the parse tree
     */
    void exitMakeAlternateLetAndContent(PureApsarsParser.MakeAlternateLetAndContentContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineClassContent}.
     *
     * @param ctx the parse tree
     */
    void enterDefineClassContent(PureApsarsParser.DefineClassContentContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineClassContent}.
     *
     * @param ctx the parse tree
     */
    void exitDefineClassContent(PureApsarsParser.DefineClassContentContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineLetClassContent}.
     *
     * @param ctx the parse tree
     */
    void enterDefineLetClassContent(PureApsarsParser.DefineLetClassContentContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineLetClassContent}.
     *
     * @param ctx the parse tree
     */
    void exitDefineLetClassContent(PureApsarsParser.DefineLetClassContentContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineLet}.
     *
     * @param ctx the parse tree
     */
    void enterDefineLet(PureApsarsParser.DefineLetContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineLet}.
     *
     * @param ctx the parse tree
     */
    void exitDefineLet(PureApsarsParser.DefineLetContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineMemberField}.
     *
     * @param ctx the parse tree
     */
    void enterDefineMemberField(PureApsarsParser.DefineMemberFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineMemberField}.
     *
     * @param ctx the parse tree
     */
    void exitDefineMemberField(PureApsarsParser.DefineMemberFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#defineLetMemberField}.
     *
     * @param ctx the parse tree
     */
    void enterDefineLetMemberField(PureApsarsParser.DefineLetMemberFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#defineLetMemberField}.
     *
     * @param ctx the parse tree
     */
    void exitDefineLetMemberField(PureApsarsParser.DefineLetMemberFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link PureApsarsParser#fieldName}.
     *
     * @param ctx the parse tree
     */
    void enterFieldName(PureApsarsParser.FieldNameContext ctx);

    /**
     * Exit a parse tree produced by {@link PureApsarsParser#fieldName}.
     *
     * @param ctx the parse tree
     */
    void exitFieldName(PureApsarsParser.FieldNameContext ctx);
}