// Generated from D:/Codes/Java/Apsars/grammar/Apsars.g4 by ANTLR 4.13.1
package com.github.cao.awa.apsars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ApsarsParser}.
 */
public interface ApsarsListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link ApsarsParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(ApsarsParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(ApsarsParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#definePackage}.
     *
     * @param ctx the parse tree
     */
    void enterDefinePackage(ApsarsParser.DefinePackageContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#definePackage}.
     *
     * @param ctx the parse tree
     */
    void exitDefinePackage(ApsarsParser.DefinePackageContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineImport}.
     *
     * @param ctx the parse tree
     */
    void enterDefineImport(ApsarsParser.DefineImportContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineImport}.
     *
     * @param ctx the parse tree
     */
    void exitDefineImport(ApsarsParser.DefineImportContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isPublic}.
     *
     * @param ctx the parse tree
     */
    void enterIsPublic(ApsarsParser.IsPublicContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isPublic}.
     *
     * @param ctx the parse tree
     */
    void exitIsPublic(ApsarsParser.IsPublicContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isPrivate}.
     *
     * @param ctx the parse tree
     */
    void enterIsPrivate(ApsarsParser.IsPrivateContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isPrivate}.
     *
     * @param ctx the parse tree
     */
    void exitIsPrivate(ApsarsParser.IsPrivateContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isProtected}.
     *
     * @param ctx the parse tree
     */
    void enterIsProtected(ApsarsParser.IsProtectedContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isProtected}.
     *
     * @param ctx the parse tree
     */
    void exitIsProtected(ApsarsParser.IsProtectedContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isFinal}.
     *
     * @param ctx the parse tree
     */
    void enterIsFinal(ApsarsParser.IsFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isFinal}.
     *
     * @param ctx the parse tree
     */
    void exitIsFinal(ApsarsParser.IsFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isVal}.
     *
     * @param ctx the parse tree
     */
    void enterIsVal(ApsarsParser.IsValContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isVal}.
     *
     * @param ctx the parse tree
     */
    void exitIsVal(ApsarsParser.IsValContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isUnique}.
     *
     * @param ctx the parse tree
     */
    void enterIsUnique(ApsarsParser.IsUniqueContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isUnique}.
     *
     * @param ctx the parse tree
     */
    void exitIsUnique(ApsarsParser.IsUniqueContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#let}.
     *
     * @param ctx the parse tree
     */
    void enterLet(ApsarsParser.LetContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#let}.
     *
     * @param ctx the parse tree
     */
    void exitLet(ApsarsParser.LetContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#packageAt}.
     *
     * @param ctx the parse tree
     */
    void enterPackageAt(ApsarsParser.PackageAtContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#packageAt}.
     *
     * @param ctx the parse tree
     */
    void exitPackageAt(ApsarsParser.PackageAtContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#importting}.
     *
     * @param ctx the parse tree
     */
    void enterImportting(ApsarsParser.ImporttingContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#importting}.
     *
     * @param ctx the parse tree
     */
    void exitImportting(ApsarsParser.ImporttingContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isStatic}.
     *
     * @param ctx the parse tree
     */
    void enterIsStatic(ApsarsParser.IsStaticContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isStatic}.
     *
     * @param ctx the parse tree
     */
    void exitIsStatic(ApsarsParser.IsStaticContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#class}.
     *
     * @param ctx the parse tree
     */
    void enterClass(ApsarsParser.ClassContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#class}.
     *
     * @param ctx the parse tree
     */
    void exitClass(ApsarsParser.ClassContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#return}.
     *
     * @param ctx the parse tree
     */
    void enterReturn(ApsarsParser.ReturnContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#return}.
     *
     * @param ctx the parse tree
     */
    void exitReturn(ApsarsParser.ReturnContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isTransient}.
     *
     * @param ctx the parse tree
     */
    void enterIsTransient(ApsarsParser.IsTransientContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isTransient}.
     *
     * @param ctx the parse tree
     */
    void exitIsTransient(ApsarsParser.IsTransientContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isVolatile}.
     *
     * @param ctx the parse tree
     */
    void enterIsVolatile(ApsarsParser.IsVolatileContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isVolatile}.
     *
     * @param ctx the parse tree
     */
    void exitIsVolatile(ApsarsParser.IsVolatileContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isHolder}.
     *
     * @param ctx the parse tree
     */
    void enterIsHolder(ApsarsParser.IsHolderContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isHolder}.
     *
     * @param ctx the parse tree
     */
    void exitIsHolder(ApsarsParser.IsHolderContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isGetHolder}.
     *
     * @param ctx the parse tree
     */
    void enterIsGetHolder(ApsarsParser.IsGetHolderContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isGetHolder}.
     *
     * @param ctx the parse tree
     */
    void exitIsGetHolder(ApsarsParser.IsGetHolderContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isSetHolder}.
     *
     * @param ctx the parse tree
     */
    void enterIsSetHolder(ApsarsParser.IsSetHolderContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isSetHolder}.
     *
     * @param ctx the parse tree
     */
    void exitIsSetHolder(ApsarsParser.IsSetHolderContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isOverridable}.
     *
     * @param ctx the parse tree
     */
    void enterIsOverridable(ApsarsParser.IsOverridableContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isOverridable}.
     *
     * @param ctx the parse tree
     */
    void exitIsOverridable(ApsarsParser.IsOverridableContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#catching}.
     *
     * @param ctx the parse tree
     */
    void enterCatching(ApsarsParser.CatchingContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#catching}.
     *
     * @param ctx the parse tree
     */
    void exitCatching(ApsarsParser.CatchingContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#ignored}.
     *
     * @param ctx the parse tree
     */
    void enterIgnored(ApsarsParser.IgnoredContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#ignored}.
     *
     * @param ctx the parse tree
     */
    void exitIgnored(ApsarsParser.IgnoredContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#print}.
     *
     * @param ctx the parse tree
     */
    void enterPrint(ApsarsParser.PrintContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#print}.
     *
     * @param ctx the parse tree
     */
    void exitPrint(ApsarsParser.PrintContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#deliver}.
     *
     * @param ctx the parse tree
     */
    void enterDeliver(ApsarsParser.DeliverContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#deliver}.
     *
     * @param ctx the parse tree
     */
    void exitDeliver(ApsarsParser.DeliverContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#with}.
     *
     * @param ctx the parse tree
     */
    void enterWith(ApsarsParser.WithContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#with}.
     *
     * @param ctx the parse tree
     */
    void exitWith(ApsarsParser.WithContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isSync}.
     *
     * @param ctx the parse tree
     */
    void enterIsSync(ApsarsParser.IsSyncContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isSync}.
     *
     * @param ctx the parse tree
     */
    void exitIsSync(ApsarsParser.IsSyncContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isSynchronized}.
     *
     * @param ctx the parse tree
     */
    void enterIsSynchronized(ApsarsParser.IsSynchronizedContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isSynchronized}.
     *
     * @param ctx the parse tree
     */
    void exitIsSynchronized(ApsarsParser.IsSynchronizedContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#sync}.
     *
     * @param ctx the parse tree
     */
    void enterSync(ApsarsParser.SyncContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#sync}.
     *
     * @param ctx the parse tree
     */
    void exitSync(ApsarsParser.SyncContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#fullNameOrIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterFullNameOrIdentifier(ApsarsParser.FullNameOrIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#fullNameOrIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitFullNameOrIdentifier(ApsarsParser.FullNameOrIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifier(ApsarsParser.IdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifier(ApsarsParser.IdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#fullName}.
     *
     * @param ctx the parse tree
     */
    void enterFullName(ApsarsParser.FullNameContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#fullName}.
     *
     * @param ctx the parse tree
     */
    void exitFullName(ApsarsParser.FullNameContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#number}.
     *
     * @param ctx the parse tree
     */
    void enterNumber(ApsarsParser.NumberContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#number}.
     *
     * @param ctx the parse tree
     */
    void exitNumber(ApsarsParser.NumberContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#template}.
     *
     * @param ctx the parse tree
     */
    void enterTemplate(ApsarsParser.TemplateContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#template}.
     *
     * @param ctx the parse tree
     */
    void exitTemplate(ApsarsParser.TemplateContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#leftBrace}.
     *
     * @param ctx the parse tree
     */
    void enterLeftBrace(ApsarsParser.LeftBraceContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#leftBrace}.
     *
     * @param ctx the parse tree
     */
    void exitLeftBrace(ApsarsParser.LeftBraceContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#rightBrace}.
     *
     * @param ctx the parse tree
     */
    void enterRightBrace(ApsarsParser.RightBraceContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#rightBrace}.
     *
     * @param ctx the parse tree
     */
    void exitRightBrace(ApsarsParser.RightBraceContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#leftAngleBracket}.
     *
     * @param ctx the parse tree
     */
    void enterLeftAngleBracket(ApsarsParser.LeftAngleBracketContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#leftAngleBracket}.
     *
     * @param ctx the parse tree
     */
    void exitLeftAngleBracket(ApsarsParser.LeftAngleBracketContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#rightAngleBracket}.
     *
     * @param ctx the parse tree
     */
    void enterRightAngleBracket(ApsarsParser.RightAngleBracketContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#rightAngleBracket}.
     *
     * @param ctx the parse tree
     */
    void exitRightAngleBracket(ApsarsParser.RightAngleBracketContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#lessThan}.
     *
     * @param ctx the parse tree
     */
    void enterLessThan(ApsarsParser.LessThanContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#lessThan}.
     *
     * @param ctx the parse tree
     */
    void exitLessThan(ApsarsParser.LessThanContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#moreThan}.
     *
     * @param ctx the parse tree
     */
    void enterMoreThan(ApsarsParser.MoreThanContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#moreThan}.
     *
     * @param ctx the parse tree
     */
    void exitMoreThan(ApsarsParser.MoreThanContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#leftBracket}.
     *
     * @param ctx the parse tree
     */
    void enterLeftBracket(ApsarsParser.LeftBracketContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#leftBracket}.
     *
     * @param ctx the parse tree
     */
    void exitLeftBracket(ApsarsParser.LeftBracketContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#rightBracket}.
     *
     * @param ctx the parse tree
     */
    void enterRightBracket(ApsarsParser.RightBracketContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#rightBracket}.
     *
     * @param ctx the parse tree
     */
    void exitRightBracket(ApsarsParser.RightBracketContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#leftParenthesis}.
     *
     * @param ctx the parse tree
     */
    void enterLeftParenthesis(ApsarsParser.LeftParenthesisContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#leftParenthesis}.
     *
     * @param ctx the parse tree
     */
    void exitLeftParenthesis(ApsarsParser.LeftParenthesisContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#rightParenthesis}.
     *
     * @param ctx the parse tree
     */
    void enterRightParenthesis(ApsarsParser.RightParenthesisContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#rightParenthesis}.
     *
     * @param ctx the parse tree
     */
    void exitRightParenthesis(ApsarsParser.RightParenthesisContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#leftParen}.
     *
     * @param ctx the parse tree
     */
    void enterLeftParen(ApsarsParser.LeftParenContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#leftParen}.
     *
     * @param ctx the parse tree
     */
    void exitLeftParen(ApsarsParser.LeftParenContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#rightParen}.
     *
     * @param ctx the parse tree
     */
    void enterRightParen(ApsarsParser.RightParenContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#rightParen}.
     *
     * @param ctx the parse tree
     */
    void exitRightParen(ApsarsParser.RightParenContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#colon}.
     *
     * @param ctx the parse tree
     */
    void enterColon(ApsarsParser.ColonContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#colon}.
     *
     * @param ctx the parse tree
     */
    void exitColon(ApsarsParser.ColonContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#semicolon}.
     *
     * @param ctx the parse tree
     */
    void enterSemicolon(ApsarsParser.SemicolonContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#semicolon}.
     *
     * @param ctx the parse tree
     */
    void exitSemicolon(ApsarsParser.SemicolonContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#comma}.
     *
     * @param ctx the parse tree
     */
    void enterComma(ApsarsParser.CommaContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#comma}.
     *
     * @param ctx the parse tree
     */
    void exitComma(ApsarsParser.CommaContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#and}.
     *
     * @param ctx the parse tree
     */
    void enterAnd(ApsarsParser.AndContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#and}.
     *
     * @param ctx the parse tree
     */
    void exitAnd(ApsarsParser.AndContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#or}.
     *
     * @param ctx the parse tree
     */
    void enterOr(ApsarsParser.OrContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#or}.
     *
     * @param ctx the parse tree
     */
    void exitOr(ApsarsParser.OrContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#argAnd}.
     *
     * @param ctx the parse tree
     */
    void enterArgAnd(ApsarsParser.ArgAndContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#argAnd}.
     *
     * @param ctx the parse tree
     */
    void exitArgAnd(ApsarsParser.ArgAndContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#argOr}.
     *
     * @param ctx the parse tree
     */
    void enterArgOr(ApsarsParser.ArgOrContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#argOr}.
     *
     * @param ctx the parse tree
     */
    void exitArgOr(ApsarsParser.ArgOrContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#wordAnd}.
     *
     * @param ctx the parse tree
     */
    void enterWordAnd(ApsarsParser.WordAndContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#wordAnd}.
     *
     * @param ctx the parse tree
     */
    void exitWordAnd(ApsarsParser.WordAndContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#wordOr}.
     *
     * @param ctx the parse tree
     */
    void enterWordOr(ApsarsParser.WordOrContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#wordOr}.
     *
     * @param ctx the parse tree
     */
    void exitWordOr(ApsarsParser.WordOrContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#null}.
     *
     * @param ctx the parse tree
     */
    void enterNull(ApsarsParser.NullContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#null}.
     *
     * @param ctx the parse tree
     */
    void exitNull(ApsarsParser.NullContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(ApsarsParser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(ApsarsParser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#isEquals}.
     *
     * @param ctx the parse tree
     */
    void enterIsEquals(ApsarsParser.IsEqualsContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#isEquals}.
     *
     * @param ctx the parse tree
     */
    void exitIsEquals(ApsarsParser.IsEqualsContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#fieldModifiers}.
     *
     * @param ctx the parse tree
     */
    void enterFieldModifiers(ApsarsParser.FieldModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#fieldModifiers}.
     *
     * @param ctx the parse tree
     */
    void exitFieldModifiers(ApsarsParser.FieldModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#methodModifiers}.
     *
     * @param ctx the parse tree
     */
    void enterMethodModifiers(ApsarsParser.MethodModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#methodModifiers}.
     *
     * @param ctx the parse tree
     */
    void exitMethodModifiers(ApsarsParser.MethodModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#makeAlternateLet}.
     *
     * @param ctx the parse tree
     */
    void enterMakeAlternateLet(ApsarsParser.MakeAlternateLetContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#makeAlternateLet}.
     *
     * @param ctx the parse tree
     */
    void exitMakeAlternateLet(ApsarsParser.MakeAlternateLetContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#optionalFieldAndMethodModifiers}.
     *
     * @param ctx the parse tree
     */
    void enterOptionalFieldAndMethodModifiers(ApsarsParser.OptionalFieldAndMethodModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#optionalFieldAndMethodModifiers}.
     *
     * @param ctx the parse tree
     */
    void exitOptionalFieldAndMethodModifiers(ApsarsParser.OptionalFieldAndMethodModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#optionalFieldStaticAndFinal}.
     *
     * @param ctx the parse tree
     */
    void enterOptionalFieldStaticAndFinal(ApsarsParser.OptionalFieldStaticAndFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#optionalFieldStaticAndFinal}.
     *
     * @param ctx the parse tree
     */
    void exitOptionalFieldStaticAndFinal(ApsarsParser.OptionalFieldStaticAndFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#optionalStaticAndFinal}.
     *
     * @param ctx the parse tree
     */
    void enterOptionalStaticAndFinal(ApsarsParser.OptionalStaticAndFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#optionalStaticAndFinal}.
     *
     * @param ctx the parse tree
     */
    void exitOptionalStaticAndFinal(ApsarsParser.OptionalStaticAndFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#permissionModifiers}.
     *
     * @param ctx the parse tree
     */
    void enterPermissionModifiers(ApsarsParser.PermissionModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#permissionModifiers}.
     *
     * @param ctx the parse tree
     */
    void exitPermissionModifiers(ApsarsParser.PermissionModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#packageIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterPackageIdentifier(ApsarsParser.PackageIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#packageIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitPackageIdentifier(ApsarsParser.PackageIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#fullNameIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterFullNameIdentifier(ApsarsParser.FullNameIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#fullNameIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitFullNameIdentifier(ApsarsParser.FullNameIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#fieldFinal}.
     *
     * @param ctx the parse tree
     */
    void enterFieldFinal(ApsarsParser.FieldFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#fieldFinal}.
     *
     * @param ctx the parse tree
     */
    void exitFieldFinal(ApsarsParser.FieldFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#methodFinal}.
     *
     * @param ctx the parse tree
     */
    void enterMethodFinal(ApsarsParser.MethodFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#methodFinal}.
     *
     * @param ctx the parse tree
     */
    void exitMethodFinal(ApsarsParser.MethodFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#classFinal}.
     *
     * @param ctx the parse tree
     */
    void enterClassFinal(ApsarsParser.ClassFinalContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#classFinal}.
     *
     * @param ctx the parse tree
     */
    void exitClassFinal(ApsarsParser.ClassFinalContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#assignmentIdentifier}.
     *
     * @param ctx the parse tree
     */
    void enterAssignmentIdentifier(ApsarsParser.AssignmentIdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#assignmentIdentifier}.
     *
     * @param ctx the parse tree
     */
    void exitAssignmentIdentifier(ApsarsParser.AssignmentIdentifierContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineMethodUsingTemplate}.
     *
     * @param ctx the parse tree
     */
    void enterDefineMethodUsingTemplate(ApsarsParser.DefineMethodUsingTemplateContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineMethodUsingTemplate}.
     *
     * @param ctx the parse tree
     */
    void exitDefineMethodUsingTemplate(ApsarsParser.DefineMethodUsingTemplateContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineMethod}.
     *
     * @param ctx the parse tree
     */
    void enterDefineMethod(ApsarsParser.DefineMethodContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineMethod}.
     *
     * @param ctx the parse tree
     */
    void exitDefineMethod(ApsarsParser.DefineMethodContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineLetMethod}.
     *
     * @param ctx the parse tree
     */
    void enterDefineLetMethod(ApsarsParser.DefineLetMethodContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineLetMethod}.
     *
     * @param ctx the parse tree
     */
    void exitDefineLetMethod(ApsarsParser.DefineLetMethodContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#methodReturnType}.
     *
     * @param ctx the parse tree
     */
    void enterMethodReturnType(ApsarsParser.MethodReturnTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#methodReturnType}.
     *
     * @param ctx the parse tree
     */
    void exitMethodReturnType(ApsarsParser.MethodReturnTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#alternateStaticAndFinalAndSync}.
     *
     * @param ctx the parse tree
     */
    void enterAlternateStaticAndFinalAndSync(ApsarsParser.AlternateStaticAndFinalAndSyncContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#alternateStaticAndFinalAndSync}.
     *
     * @param ctx the parse tree
     */
    void exitAlternateStaticAndFinalAndSync(ApsarsParser.AlternateStaticAndFinalAndSyncContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineMethodBody}.
     *
     * @param ctx the parse tree
     */
    void enterDefineMethodBody(ApsarsParser.DefineMethodBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineMethodBody}.
     *
     * @param ctx the parse tree
     */
    void exitDefineMethodBody(ApsarsParser.DefineMethodBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#methodParamListDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterMethodParamListDefinition(ApsarsParser.MethodParamListDefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#methodParamListDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitMethodParamListDefinition(ApsarsParser.MethodParamListDefinitionContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#paramType}.
     *
     * @param ctx the parse tree
     */
    void enterParamType(ApsarsParser.ParamTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#paramType}.
     *
     * @param ctx the parse tree
     */
    void exitParamType(ApsarsParser.ParamTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#argType}.
     *
     * @param ctx the parse tree
     */
    void enterArgType(ApsarsParser.ArgTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#argType}.
     *
     * @param ctx the parse tree
     */
    void exitArgType(ApsarsParser.ArgTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#extraArgTypes}.
     *
     * @param ctx the parse tree
     */
    void enterExtraArgTypes(ApsarsParser.ExtraArgTypesContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#extraArgTypes}.
     *
     * @param ctx the parse tree
     */
    void exitExtraArgTypes(ApsarsParser.ExtraArgTypesContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#typedArgType}.
     *
     * @param ctx the parse tree
     */
    void enterTypedArgType(ApsarsParser.TypedArgTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#typedArgType}.
     *
     * @param ctx the parse tree
     */
    void exitTypedArgType(ApsarsParser.TypedArgTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#arrayArgType}.
     *
     * @param ctx the parse tree
     */
    void enterArrayArgType(ApsarsParser.ArrayArgTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#arrayArgType}.
     *
     * @param ctx the parse tree
     */
    void exitArrayArgType(ApsarsParser.ArrayArgTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#arrayDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterArrayDefinition(ApsarsParser.ArrayDefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#arrayDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitArrayDefinition(ApsarsParser.ArrayDefinitionContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#tokenList}.
     *
     * @param ctx the parse tree
     */
    void enterTokenList(ApsarsParser.TokenListContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#tokenList}.
     *
     * @param ctx the parse tree
     */
    void exitTokenList(ApsarsParser.TokenListContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#validToken}.
     *
     * @param ctx the parse tree
     */
    void enterValidToken(ApsarsParser.ValidTokenContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#validToken}.
     *
     * @param ctx the parse tree
     */
    void exitValidToken(ApsarsParser.ValidTokenContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#extraToken}.
     *
     * @param ctx the parse tree
     */
    void enterExtraToken(ApsarsParser.ExtraTokenContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#extraToken}.
     *
     * @param ctx the parse tree
     */
    void exitExtraToken(ApsarsParser.ExtraTokenContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterConstant(ApsarsParser.ConstantContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitConstant(ApsarsParser.ConstantContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#string}.
     *
     * @param ctx the parse tree
     */
    void enterString(ApsarsParser.StringContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#string}.
     *
     * @param ctx the parse tree
     */
    void exitString(ApsarsParser.StringContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#identifierOrSpace}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifierOrSpace(ApsarsParser.IdentifierOrSpaceContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#identifierOrSpace}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifierOrSpace(ApsarsParser.IdentifierOrSpaceContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#spacing}.
     *
     * @param ctx the parse tree
     */
    void enterSpacing(ApsarsParser.SpacingContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#spacing}.
     *
     * @param ctx the parse tree
     */
    void exitSpacing(ApsarsParser.SpacingContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDefineStatement(ApsarsParser.DefineStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDefineStatement(ApsarsParser.DefineStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#theStatement}.
     *
     * @param ctx the parse tree
     */
    void enterTheStatement(ApsarsParser.TheStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#theStatement}.
     *
     * @param ctx the parse tree
     */
    void exitTheStatement(ApsarsParser.TheStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#resultingStatement}.
     *
     * @param ctx the parse tree
     */
    void enterResultingStatement(ApsarsParser.ResultingStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#resultingStatement}.
     *
     * @param ctx the parse tree
     */
    void exitResultingStatement(ApsarsParser.ResultingStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#invokeStatement}.
     *
     * @param ctx the parse tree
     */
    void enterInvokeStatement(ApsarsParser.InvokeStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#invokeStatement}.
     *
     * @param ctx the parse tree
     */
    void exitInvokeStatement(ApsarsParser.InvokeStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#tryStatement}.
     *
     * @param ctx the parse tree
     */
    void enterTryStatement(ApsarsParser.TryStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#tryStatement}.
     *
     * @param ctx the parse tree
     */
    void exitTryStatement(ApsarsParser.TryStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#refCall}.
     *
     * @param ctx the parse tree
     */
    void enterRefCall(ApsarsParser.RefCallContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#refCall}.
     *
     * @param ctx the parse tree
     */
    void exitRefCall(ApsarsParser.RefCallContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#refCallFrom}.
     *
     * @param ctx the parse tree
     */
    void enterRefCallFrom(ApsarsParser.RefCallFromContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#refCallFrom}.
     *
     * @param ctx the parse tree
     */
    void exitRefCallFrom(ApsarsParser.RefCallFromContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#refCallMethod}.
     *
     * @param ctx the parse tree
     */
    void enterRefCallMethod(ApsarsParser.RefCallMethodContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#refCallMethod}.
     *
     * @param ctx the parse tree
     */
    void exitRefCallMethod(ApsarsParser.RefCallMethodContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#withMessage}.
     *
     * @param ctx the parse tree
     */
    void enterWithMessage(ApsarsParser.WithMessageContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#withMessage}.
     *
     * @param ctx the parse tree
     */
    void exitWithMessage(ApsarsParser.WithMessageContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#tryStatementBody}.
     *
     * @param ctx the parse tree
     */
    void enterTryStatementBody(ApsarsParser.TryStatementBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#tryStatementBody}.
     *
     * @param ctx the parse tree
     */
    void exitTryStatementBody(ApsarsParser.TryStatementBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#catchingStatementBody}.
     *
     * @param ctx the parse tree
     */
    void enterCatchingStatementBody(ApsarsParser.CatchingStatementBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#catchingStatementBody}.
     *
     * @param ctx the parse tree
     */
    void exitCatchingStatementBody(ApsarsParser.CatchingStatementBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#tryCatchList}.
     *
     * @param ctx the parse tree
     */
    void enterTryCatchList(ApsarsParser.TryCatchListContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#tryCatchList}.
     *
     * @param ctx the parse tree
     */
    void exitTryCatchList(ApsarsParser.TryCatchListContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#tryCatchListExtraType}.
     *
     * @param ctx the parse tree
     */
    void enterTryCatchListExtraType(ApsarsParser.TryCatchListExtraTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#tryCatchListExtraType}.
     *
     * @param ctx the parse tree
     */
    void exitTryCatchListExtraType(ApsarsParser.TryCatchListExtraTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#invokeParamList}.
     *
     * @param ctx the parse tree
     */
    void enterInvokeParamList(ApsarsParser.InvokeParamListContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#invokeParamList}.
     *
     * @param ctx the parse tree
     */
    void exitInvokeParamList(ApsarsParser.InvokeParamListContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#validInvokeParam}.
     *
     * @param ctx the parse tree
     */
    void enterValidInvokeParam(ApsarsParser.ValidInvokeParamContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#validInvokeParam}.
     *
     * @param ctx the parse tree
     */
    void exitValidInvokeParam(ApsarsParser.ValidInvokeParamContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#validExtraInvokeParam}.
     *
     * @param ctx the parse tree
     */
    void enterValidExtraInvokeParam(ApsarsParser.ValidExtraInvokeParamContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#validExtraInvokeParam}.
     *
     * @param ctx the parse tree
     */
    void exitValidExtraInvokeParam(ApsarsParser.ValidExtraInvokeParamContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#resultPresenting}.
     *
     * @param ctx the parse tree
     */
    void enterResultPresenting(ApsarsParser.ResultPresentingContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#resultPresenting}.
     *
     * @param ctx the parse tree
     */
    void exitResultPresenting(ApsarsParser.ResultPresentingContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineVariableStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDefineVariableStatement(ApsarsParser.DefineVariableStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineVariableStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDefineVariableStatement(ApsarsParser.DefineVariableStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#variableName}.
     *
     * @param ctx the parse tree
     */
    void enterVariableName(ApsarsParser.VariableNameContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#variableName}.
     *
     * @param ctx the parse tree
     */
    void exitVariableName(ApsarsParser.VariableNameContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineClass}.
     *
     * @param ctx the parse tree
     */
    void enterDefineClass(ApsarsParser.DefineClassContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineClass}.
     *
     * @param ctx the parse tree
     */
    void exitDefineClass(ApsarsParser.DefineClassContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#makeAlternateLetAndContent}.
     *
     * @param ctx the parse tree
     */
    void enterMakeAlternateLetAndContent(ApsarsParser.MakeAlternateLetAndContentContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#makeAlternateLetAndContent}.
     *
     * @param ctx the parse tree
     */
    void exitMakeAlternateLetAndContent(ApsarsParser.MakeAlternateLetAndContentContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineClassContent}.
     *
     * @param ctx the parse tree
     */
    void enterDefineClassContent(ApsarsParser.DefineClassContentContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineClassContent}.
     *
     * @param ctx the parse tree
     */
    void exitDefineClassContent(ApsarsParser.DefineClassContentContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineLetClassContent}.
     *
     * @param ctx the parse tree
     */
    void enterDefineLetClassContent(ApsarsParser.DefineLetClassContentContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineLetClassContent}.
     *
     * @param ctx the parse tree
     */
    void exitDefineLetClassContent(ApsarsParser.DefineLetClassContentContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineLet}.
     *
     * @param ctx the parse tree
     */
    void enterDefineLet(ApsarsParser.DefineLetContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineLet}.
     *
     * @param ctx the parse tree
     */
    void exitDefineLet(ApsarsParser.DefineLetContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineMemberField}.
     *
     * @param ctx the parse tree
     */
    void enterDefineMemberField(ApsarsParser.DefineMemberFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineMemberField}.
     *
     * @param ctx the parse tree
     */
    void exitDefineMemberField(ApsarsParser.DefineMemberFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#defineLetMemberField}.
     *
     * @param ctx the parse tree
     */
    void enterDefineLetMemberField(ApsarsParser.DefineLetMemberFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#defineLetMemberField}.
     *
     * @param ctx the parse tree
     */
    void exitDefineLetMemberField(ApsarsParser.DefineLetMemberFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link ApsarsParser#fieldName}.
     *
     * @param ctx the parse tree
     */
    void enterFieldName(ApsarsParser.FieldNameContext ctx);

    /**
     * Exit a parse tree produced by {@link ApsarsParser#fieldName}.
     *
     * @param ctx the parse tree
     */
    void exitFieldName(ApsarsParser.FieldNameContext ctx);
}