// Generated from D:/Codes/Java/Apsars/grammar/pure/PureApsars.g4 by ANTLR 4.13.1
package com.github.cao.awa.apsars.antlr.pure;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PureApsarsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PureApsarsVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link PureApsarsParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(PureApsarsParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#definePackage}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefinePackage(PureApsarsParser.DefinePackageContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineImport}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineImport(PureApsarsParser.DefineImportContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isPublic}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsPublic(PureApsarsParser.IsPublicContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isPrivate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsPrivate(PureApsarsParser.IsPrivateContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isProtected}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsProtected(PureApsarsParser.IsProtectedContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsFinal(PureApsarsParser.IsFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isVal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsVal(PureApsarsParser.IsValContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isUnique}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsUnique(PureApsarsParser.IsUniqueContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isInline}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsInline(PureApsarsParser.IsInlineContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#let}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLet(PureApsarsParser.LetContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#packageAt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPackageAt(PureApsarsParser.PackageAtContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#importting}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImportting(PureApsarsParser.ImporttingContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isStatic}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsStatic(PureApsarsParser.IsStaticContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#classKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassKeyword(PureApsarsParser.ClassKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#returnKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnKeyword(PureApsarsParser.ReturnKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#yieldKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitYieldKeyword(PureApsarsParser.YieldKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isTransient}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsTransient(PureApsarsParser.IsTransientContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isVolatile}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsVolatile(PureApsarsParser.IsVolatileContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isHolder}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsHolder(PureApsarsParser.IsHolderContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isGetHolder}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsGetHolder(PureApsarsParser.IsGetHolderContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isSetHolder}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsSetHolder(PureApsarsParser.IsSetHolderContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isOverridable}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsOverridable(PureApsarsParser.IsOverridableContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#catching}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCatching(PureApsarsParser.CatchingContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#ignored}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIgnored(PureApsarsParser.IgnoredContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#print}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrint(PureApsarsParser.PrintContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#deliver}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDeliver(PureApsarsParser.DeliverContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#with}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWith(PureApsarsParser.WithContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isSync}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsSync(PureApsarsParser.IsSyncContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isSynchronized}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsSynchronized(PureApsarsParser.IsSynchronizedContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#sync}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSync(PureApsarsParser.SyncContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#template}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTemplate(PureApsarsParser.TemplateContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#constructor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstructor(PureApsarsParser.ConstructorContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#newKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNewKeyword(PureApsarsParser.NewKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#ifKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfKeyword(PureApsarsParser.IfKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#elseKeyword}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseKeyword(PureApsarsParser.ElseKeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#point}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPoint(PureApsarsParser.PointContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#leftBrace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeftBrace(PureApsarsParser.LeftBraceContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#rightBrace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightBrace(PureApsarsParser.RightBraceContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#leftAngleBracket}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeftAngleBracket(PureApsarsParser.LeftAngleBracketContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#rightAngleBracket}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightAngleBracket(PureApsarsParser.RightAngleBracketContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#leftBracket}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeftBracket(PureApsarsParser.LeftBracketContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#rightBracket}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightBracket(PureApsarsParser.RightBracketContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#leftParenthesis}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeftParenthesis(PureApsarsParser.LeftParenthesisContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#rightParenthesis}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightParenthesis(PureApsarsParser.RightParenthesisContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#leftParen}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLeftParen(PureApsarsParser.LeftParenContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#rightParen}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRightParen(PureApsarsParser.RightParenContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#colon}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitColon(PureApsarsParser.ColonContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#semicolon}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSemicolon(PureApsarsParser.SemicolonContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#comma}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComma(PureApsarsParser.CommaContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#and}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnd(PureApsarsParser.AndContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#or}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOr(PureApsarsParser.OrContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#argAnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgAnd(PureApsarsParser.ArgAndContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#argOr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgOr(PureApsarsParser.ArgOrContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#wordAnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWordAnd(PureApsarsParser.WordAndContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#wordOr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWordOr(PureApsarsParser.WordOrContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#addisionAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddisionAssignment(PureApsarsParser.AddisionAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#subtractionAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubtractionAssignment(PureApsarsParser.SubtractionAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#multiplicationAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultiplicationAssignment(PureApsarsParser.MultiplicationAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#divisionAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDivisionAssignment(PureApsarsParser.DivisionAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#powAssignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPowAssignment(PureApsarsParser.PowAssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#plus}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPlus(PureApsarsParser.PlusContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#minus}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinus(PureApsarsParser.MinusContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#multiply}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMultiply(PureApsarsParser.MultiplyContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#divide}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDivide(PureApsarsParser.DivideContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#pow}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPow(PureApsarsParser.PowContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#operator}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOperator(PureApsarsParser.OperatorContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#arithmetic}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArithmetic(PureApsarsParser.ArithmeticContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#breakingAnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBreakingAnd(PureApsarsParser.BreakingAndContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#breakingOr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBreakingOr(PureApsarsParser.BreakingOrContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#not}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNot(PureApsarsParser.NotContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#lessThan}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLessThan(PureApsarsParser.LessThanContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#moreThan}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMoreThan(PureApsarsParser.MoreThanContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#comparingAnd}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComparingAnd(PureApsarsParser.ComparingAndContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#comparingOr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComparingOr(PureApsarsParser.ComparingOrContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#comparing}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComparing(PureApsarsParser.ComparingContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#atSign}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAtSign(PureApsarsParser.AtSignContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#null}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNull(PureApsarsParser.NullContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#bool}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBool(PureApsarsParser.BoolContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#assignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignment(PureApsarsParser.AssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#isEquals}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIsEquals(PureApsarsParser.IsEqualsContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#fullNameOrIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFullNameOrIdentifier(PureApsarsParser.FullNameOrIdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#identifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifier(PureApsarsParser.IdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#fullName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFullName(PureApsarsParser.FullNameContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#number}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumber(PureApsarsParser.NumberContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#fieldModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFieldModifiers(PureApsarsParser.FieldModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#methodModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethodModifiers(PureApsarsParser.MethodModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#makeAlternateLet}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMakeAlternateLet(PureApsarsParser.MakeAlternateLetContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#optionalFieldAndMethodModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOptionalFieldAndMethodModifiers(PureApsarsParser.OptionalFieldAndMethodModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#optionalFieldStaticAndFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOptionalFieldStaticAndFinal(PureApsarsParser.OptionalFieldStaticAndFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#optionalStaticAndFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOptionalStaticAndFinal(PureApsarsParser.OptionalStaticAndFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#permissionModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPermissionModifiers(PureApsarsParser.PermissionModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#packageIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPackageIdentifier(PureApsarsParser.PackageIdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#fullNameIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFullNameIdentifier(PureApsarsParser.FullNameIdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#fieldFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFieldFinal(PureApsarsParser.FieldFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#methodFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethodFinal(PureApsarsParser.MethodFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#classFinal}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassFinal(PureApsarsParser.ClassFinalContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#assignmentIdentifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignmentIdentifier(PureApsarsParser.AssignmentIdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#variableModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableModifiers(PureApsarsParser.VariableModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineMethodUsingTemplate}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineMethodUsingTemplate(PureApsarsParser.DefineMethodUsingTemplateContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineMethod(PureApsarsParser.DefineMethodContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineConstructor}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineConstructor(PureApsarsParser.DefineConstructorContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineLetMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineLetMethod(PureApsarsParser.DefineLetMethodContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#methodReturnType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethodReturnType(PureApsarsParser.MethodReturnTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#alternateMethodModifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAlternateMethodModifiers(PureApsarsParser.AlternateMethodModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineMethodBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineMethodBody(PureApsarsParser.DefineMethodBodyContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#methodParamListDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMethodParamListDefinition(PureApsarsParser.MethodParamListDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#paramType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParamType(PureApsarsParser.ParamTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#argType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArgType(PureApsarsParser.ArgTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#extraArgTypes}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtraArgTypes(PureApsarsParser.ExtraArgTypesContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#typedArgType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypedArgType(PureApsarsParser.TypedArgTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#arrayArgType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArrayArgType(PureApsarsParser.ArrayArgTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#arrayDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArrayDefinition(PureApsarsParser.ArrayDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#tokenList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTokenList(PureApsarsParser.TokenListContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#validToken}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValidToken(PureApsarsParser.ValidTokenContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#extraToken}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtraToken(PureApsarsParser.ExtraTokenContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#constant}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstant(PureApsarsParser.ConstantContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#string}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitString(PureApsarsParser.StringContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#identifierOrSpace}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifierOrSpace(PureApsarsParser.IdentifierOrSpaceContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#spacing}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSpacing(PureApsarsParser.SpacingContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#annotation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnnotation(PureApsarsParser.AnnotationContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineStatement(PureApsarsParser.DefineStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#theStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTheStatement(PureApsarsParser.TheStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#resultPresenting}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResultPresenting(PureApsarsParser.ResultPresentingContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#resultingStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitResultingStatement(PureApsarsParser.ResultingStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#calculatableResultPresenting}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculatableResultPresenting(PureApsarsParser.CalculatableResultPresentingContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#ifStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStatement(PureApsarsParser.IfStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#elseIfStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseIfStatement(PureApsarsParser.ElseIfStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#elseStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElseStatement(PureApsarsParser.ElseStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#statementBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatementBlock(PureApsarsParser.StatementBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#calculateStatementWithParen}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateStatementWithParen(PureApsarsParser.CalculateStatementWithParenContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#calculateLeftStatementWithParen}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateLeftStatementWithParen(PureApsarsParser.CalculateLeftStatementWithParenContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#calculateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateStatement(PureApsarsParser.CalculateStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#calculateStatementWithTotalParen}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateStatementWithTotalParen(PureApsarsParser.CalculateStatementWithTotalParenContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#calculateLeft}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCalculateLeft(PureApsarsParser.CalculateLeftContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#extraCalculateStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtraCalculateStatement(PureApsarsParser.ExtraCalculateStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#returnStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnStatement(PureApsarsParser.ReturnStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#yieldStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitYieldStatement(PureApsarsParser.YieldStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#invokeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInvokeStatement(PureApsarsParser.InvokeStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#fluentInvokeStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFluentInvokeStatement(PureApsarsParser.FluentInvokeStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#newInstanceStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNewInstanceStatement(PureApsarsParser.NewInstanceStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#tryStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTryStatement(PureApsarsParser.TryStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#refCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRefCall(PureApsarsParser.RefCallContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#refCallFrom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRefCallFrom(PureApsarsParser.RefCallFromContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#refCallMethod}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRefCallMethod(PureApsarsParser.RefCallMethodContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#withMessage}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWithMessage(PureApsarsParser.WithMessageContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#tryStatementBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTryStatementBody(PureApsarsParser.TryStatementBodyContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#catchingStatementBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCatchingStatementBody(PureApsarsParser.CatchingStatementBodyContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#tryCatchList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTryCatchList(PureApsarsParser.TryCatchListContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#tryCatchListExtraType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTryCatchListExtraType(PureApsarsParser.TryCatchListExtraTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#invokeParamList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInvokeParamList(PureApsarsParser.InvokeParamListContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#validInvokeParam}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValidInvokeParam(PureApsarsParser.ValidInvokeParamContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#validExtraInvokeParam}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValidExtraInvokeParam(PureApsarsParser.ValidExtraInvokeParamContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineVariableStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineVariableStatement(PureApsarsParser.DefineVariableStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#variableName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVariableName(PureApsarsParser.VariableNameContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineClass}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineClass(PureApsarsParser.DefineClassContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#makeAlternateLetAndContent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMakeAlternateLetAndContent(PureApsarsParser.MakeAlternateLetAndContentContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineClassContent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineClassContent(PureApsarsParser.DefineClassContentContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineLetClassContent}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineLetClassContent(PureApsarsParser.DefineLetClassContentContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineLet}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineLet(PureApsarsParser.DefineLetContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineMemberField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineMemberField(PureApsarsParser.DefineMemberFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#defineLetMemberField}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefineLetMemberField(PureApsarsParser.DefineLetMemberFieldContext ctx);

    /**
     * Visit a parse tree produced by {@link PureApsarsParser#fieldName}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFieldName(PureApsarsParser.FieldNameContext ctx);
}