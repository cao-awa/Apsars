// Generated from D:/Codes/Java/Apsars/grammar/Apsars.g4 by ANTLR 4.13.1
package com.github.cao.awa.apsars.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ApsarsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ApsarsVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link ApsarsParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(ApsarsParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#definePackage}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefinePackage(ApsarsParser.DefinePackageContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineImport}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineImport(ApsarsParser.DefineImportContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isPublic}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsPublic(ApsarsParser.IsPublicContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isPrivate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsPrivate(ApsarsParser.IsPrivateContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isProtected}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsProtected(ApsarsParser.IsProtectedContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsFinal(ApsarsParser.IsFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isVal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsVal(ApsarsParser.IsValContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isUnique}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsUnique(ApsarsParser.IsUniqueContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isInline}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsInline(ApsarsParser.IsInlineContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#let}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLet(ApsarsParser.LetContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#packageAt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPackageAt(ApsarsParser.PackageAtContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#importting}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImportting(ApsarsParser.ImporttingContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isStatic}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsStatic(ApsarsParser.IsStaticContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#classKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassKeyword(ApsarsParser.ClassKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#returnKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnKeyword(ApsarsParser.ReturnKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#yieldKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitYieldKeyword(ApsarsParser.YieldKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isTransient}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsTransient(ApsarsParser.IsTransientContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isVolatile}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsVolatile(ApsarsParser.IsVolatileContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isHolder}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsHolder(ApsarsParser.IsHolderContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isGetHolder}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsGetHolder(ApsarsParser.IsGetHolderContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isSetHolder}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsSetHolder(ApsarsParser.IsSetHolderContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isOverridable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsOverridable(ApsarsParser.IsOverridableContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#catching}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCatching(ApsarsParser.CatchingContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#ignored}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIgnored(ApsarsParser.IgnoredContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#print}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrint(ApsarsParser.PrintContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#deliver}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDeliver(ApsarsParser.DeliverContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#with}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWith(ApsarsParser.WithContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isSync}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsSync(ApsarsParser.IsSyncContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isSynchronized}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsSynchronized(ApsarsParser.IsSynchronizedContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#sync}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSync(ApsarsParser.SyncContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#template}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTemplate(ApsarsParser.TemplateContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#constructor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstructor(ApsarsParser.ConstructorContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#newKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNewKeyword(ApsarsParser.NewKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#ifKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfKeyword(ApsarsParser.IfKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#elseKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseKeyword(ApsarsParser.ElseKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#point}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPoint(ApsarsParser.PointContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#leftBrace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeftBrace(ApsarsParser.LeftBraceContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#rightBrace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightBrace(ApsarsParser.RightBraceContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#leftAngleBracket}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeftAngleBracket(ApsarsParser.LeftAngleBracketContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#rightAngleBracket}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightAngleBracket(ApsarsParser.RightAngleBracketContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#leftBracket}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeftBracket(ApsarsParser.LeftBracketContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#rightBracket}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightBracket(ApsarsParser.RightBracketContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#leftParenthesis}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeftParenthesis(ApsarsParser.LeftParenthesisContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#rightParenthesis}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightParenthesis(ApsarsParser.RightParenthesisContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#leftParen}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeftParen(ApsarsParser.LeftParenContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#rightParen}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightParen(ApsarsParser.RightParenContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#colon}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColon(ApsarsParser.ColonContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#semicolon}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSemicolon(ApsarsParser.SemicolonContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#comma}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComma(ApsarsParser.CommaContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#and}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnd(ApsarsParser.AndContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#or}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOr(ApsarsParser.OrContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#argAnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgAnd(ApsarsParser.ArgAndContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#argOr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgOr(ApsarsParser.ArgOrContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#wordAnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWordAnd(ApsarsParser.WordAndContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#wordOr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWordOr(ApsarsParser.WordOrContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#addisionAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddisionAssignment(ApsarsParser.AddisionAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#subtractionAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubtractionAssignment(ApsarsParser.SubtractionAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#multiplicationAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultiplicationAssignment(ApsarsParser.MultiplicationAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#divisionAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDivisionAssignment(ApsarsParser.DivisionAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#powAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPowAssignment(ApsarsParser.PowAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#plus}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPlus(ApsarsParser.PlusContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#minus}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinus(ApsarsParser.MinusContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#multiply}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultiply(ApsarsParser.MultiplyContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#divide}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDivide(ApsarsParser.DivideContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#pow}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPow(ApsarsParser.PowContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#operator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOperator(ApsarsParser.OperatorContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#arithmetic}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArithmetic(ApsarsParser.ArithmeticContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#breakingAnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBreakingAnd(ApsarsParser.BreakingAndContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#breakingOr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBreakingOr(ApsarsParser.BreakingOrContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#not}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNot(ApsarsParser.NotContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#lessThan}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLessThan(ApsarsParser.LessThanContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#moreThan}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMoreThan(ApsarsParser.MoreThanContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#comparingAnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComparingAnd(ApsarsParser.ComparingAndContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#comparingOr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComparingOr(ApsarsParser.ComparingOrContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#comparing}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComparing(ApsarsParser.ComparingContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#atSign}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAtSign(ApsarsParser.AtSignContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#null}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNull(ApsarsParser.NullContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#bool}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBool(ApsarsParser.BoolContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#assignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignment(ApsarsParser.AssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#isEquals}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsEquals(ApsarsParser.IsEqualsContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#fullNameOrIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFullNameOrIdentifier(ApsarsParser.FullNameOrIdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#identifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifier(ApsarsParser.IdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#fullName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFullName(ApsarsParser.FullNameContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumber(ApsarsParser.NumberContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#fieldModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFieldModifiers(ApsarsParser.FieldModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#methodModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethodModifiers(ApsarsParser.MethodModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#makeAlternateLet}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMakeAlternateLet(ApsarsParser.MakeAlternateLetContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#optionalFieldAndMethodModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOptionalFieldAndMethodModifiers(ApsarsParser.OptionalFieldAndMethodModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#optionalFieldStaticAndFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOptionalFieldStaticAndFinal(ApsarsParser.OptionalFieldStaticAndFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#optionalStaticAndFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOptionalStaticAndFinal(ApsarsParser.OptionalStaticAndFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#permissionModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPermissionModifiers(ApsarsParser.PermissionModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#packageIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPackageIdentifier(ApsarsParser.PackageIdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#fullNameIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFullNameIdentifier(ApsarsParser.FullNameIdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#fieldFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFieldFinal(ApsarsParser.FieldFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#methodFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethodFinal(ApsarsParser.MethodFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#classFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassFinal(ApsarsParser.ClassFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#assignmentIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignmentIdentifier(ApsarsParser.AssignmentIdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#variableModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableModifiers(ApsarsParser.VariableModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineMethodUsingTemplate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineMethodUsingTemplate(ApsarsParser.DefineMethodUsingTemplateContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineMethod(ApsarsParser.DefineMethodContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineJavaMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineJavaMethod(ApsarsParser.DefineJavaMethodContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineConstructor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineConstructor(ApsarsParser.DefineConstructorContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineLetMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineLetMethod(ApsarsParser.DefineLetMethodContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#methodReturnType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethodReturnType(ApsarsParser.MethodReturnTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#alternateMethodModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlternateMethodModifiers(ApsarsParser.AlternateMethodModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineMethodBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineMethodBody(ApsarsParser.DefineMethodBodyContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#methodParamListDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethodParamListDefinition(ApsarsParser.MethodParamListDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#paramType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParamType(ApsarsParser.ParamTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#argType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgType(ApsarsParser.ArgTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#extraArgTypes}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtraArgTypes(ApsarsParser.ExtraArgTypesContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#typedArgType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypedArgType(ApsarsParser.TypedArgTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#arrayArgType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArrayArgType(ApsarsParser.ArrayArgTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#arrayDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArrayDefinition(ApsarsParser.ArrayDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#tokenList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTokenList(ApsarsParser.TokenListContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#validToken}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValidToken(ApsarsParser.ValidTokenContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#extraToken}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtraToken(ApsarsParser.ExtraTokenContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstant(ApsarsParser.ConstantContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#string}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitString(ApsarsParser.StringContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#identifierOrSpace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierOrSpace(ApsarsParser.IdentifierOrSpaceContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#spacing}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSpacing(ApsarsParser.SpacingContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#annotation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnnotation(ApsarsParser.AnnotationContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineStatement(ApsarsParser.DefineStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#theStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTheStatement(ApsarsParser.TheStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#resultPresenting}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResultPresenting(ApsarsParser.ResultPresentingContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#resultingStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResultingStatement(ApsarsParser.ResultingStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#calculatableResultPresenting}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculatableResultPresenting(ApsarsParser.CalculatableResultPresentingContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#ifStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStatement(ApsarsParser.IfStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#elseIfStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseIfStatement(ApsarsParser.ElseIfStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#elseStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseStatement(ApsarsParser.ElseStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#statementBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementBlock(ApsarsParser.StatementBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#calculateStatementWithParen}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateStatementWithParen(ApsarsParser.CalculateStatementWithParenContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#calculateLeftStatementWithParen}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateLeftStatementWithParen(ApsarsParser.CalculateLeftStatementWithParenContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#calculateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateStatement(ApsarsParser.CalculateStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#calculateStatementWithTotalParen}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateStatementWithTotalParen(ApsarsParser.CalculateStatementWithTotalParenContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#calculateLeft}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateLeft(ApsarsParser.CalculateLeftContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#calculateRight}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateRight(ApsarsParser.CalculateRightContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#extraCalculateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtraCalculateStatement(ApsarsParser.ExtraCalculateStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#returnStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnStatement(ApsarsParser.ReturnStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#yieldStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitYieldStatement(ApsarsParser.YieldStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#invokeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInvokeStatement(ApsarsParser.InvokeStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#fluentInvokeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFluentInvokeStatement(ApsarsParser.FluentInvokeStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#newInstanceStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNewInstanceStatement(ApsarsParser.NewInstanceStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#tryStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTryStatement(ApsarsParser.TryStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#refCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRefCall(ApsarsParser.RefCallContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#refCallFrom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRefCallFrom(ApsarsParser.RefCallFromContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#refCallMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRefCallMethod(ApsarsParser.RefCallMethodContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#withMessage}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWithMessage(ApsarsParser.WithMessageContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#tryStatementBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTryStatementBody(ApsarsParser.TryStatementBodyContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#catchingStatementBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCatchingStatementBody(ApsarsParser.CatchingStatementBodyContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#tryCatchList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTryCatchList(ApsarsParser.TryCatchListContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#tryCatchListExtraType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTryCatchListExtraType(ApsarsParser.TryCatchListExtraTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#invokeParamList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInvokeParamList(ApsarsParser.InvokeParamListContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#validInvokeParam}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValidInvokeParam(ApsarsParser.ValidInvokeParamContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#validExtraInvokeParam}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValidExtraInvokeParam(ApsarsParser.ValidExtraInvokeParamContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineVariableStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineVariableStatement(ApsarsParser.DefineVariableStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#variableName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableName(ApsarsParser.VariableNameContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineClass}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineClass(ApsarsParser.DefineClassContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#makeAlternateLetAndContent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMakeAlternateLetAndContent(ApsarsParser.MakeAlternateLetAndContentContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineClassContent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineClassContent(ApsarsParser.DefineClassContentContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineLetClassContent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineLetClassContent(ApsarsParser.DefineLetClassContentContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineLet}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineLet(ApsarsParser.DefineLetContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineMemberField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineMemberField(ApsarsParser.DefineMemberFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineJavaMemberField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineJavaMemberField(ApsarsParser.DefineJavaMemberFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineApsarsMemberField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineApsarsMemberField(ApsarsParser.DefineApsarsMemberFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineLetMemberField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineLetMemberField(ApsarsParser.DefineLetMemberFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineJavaLetMemberField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineJavaLetMemberField(ApsarsParser.DefineJavaLetMemberFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#defineApsarsLetMemberField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineApsarsLetMemberField(ApsarsParser.DefineApsarsLetMemberFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link ApsarsParser#fieldName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFieldName(ApsarsParser.FieldNameContext ctx);
}