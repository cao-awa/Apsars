package com.github.cao.awa.apsars.visitor;

import com.github.cao.awa.apsars.antlr.ApsarsBaseVisitor;
import com.github.cao.awa.apsars.antlr.ApsarsParser;
import com.github.cao.awa.apsars.element.ApsAccessibleType;
import com.github.cao.awa.apsars.element.method.ApsMethodModifierType;
import com.github.cao.awa.apsars.element.modifier.ApsModifierRequiredAst;
import com.github.cao.awa.apsars.element.modifier.clazz.ApsClassModifier;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.element.modifier.parameter.ApsMemberParameterModifier;
import com.github.cao.awa.apsars.element.statement.ApsLocalVariableModifierType;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsClassKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsMemberParameterKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.translate.java.pool.ApsarsClassPool;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.annotation.ApsAnnotationAst;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.aps.ApsImportAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.ApsLetAst;
import com.github.cao.awa.apsars.tree.clazz.ApsMemberParameterAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodBodyAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import com.github.cao.awa.apsars.tree.statement.ApsStatementAst;
import com.github.cao.awa.apsars.tree.statement.calculate.ApsCalculateAst;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsOperators;
import com.github.cao.awa.apsars.tree.statement.calculate.symbol.ApsSymbolAst;
import com.github.cao.awa.apsars.tree.statement.constant.ApsConstantAst;
import com.github.cao.awa.apsars.tree.statement.constant.ApsStringAst;
import com.github.cao.awa.apsars.tree.statement.constant.primary.*;
import com.github.cao.awa.apsars.tree.statement.control.ApsIfStatementAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeAst;
import com.github.cao.awa.apsars.tree.statement.invoke.ApsInvokeObjectAst;
import com.github.cao.awa.apsars.tree.statement.result.*;
import com.github.cao.awa.apsars.tree.statement.result.instance.ApsNewInstanceStatementAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsCatchListAst;
import com.github.cao.awa.apsars.tree.statement.trys.ApsTryCatchAst;
import com.github.cao.awa.apsars.tree.statement.variable.ApsVariableAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import com.github.cao.awa.sinuatum.manipulate.Manipulate;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.function.Consumer;

public class ApsarsTreeVisitor extends ApsarsBaseVisitor<ApsAst> {
    private static final Logger LOGGER = LogManager.getLogger("ApsarsTreeVisitor");
    private ApsAst current;

    @Override
    public ApsFileAst visitProgram(ApsarsParser.ProgramContext ctx) {
        ApsFileAst ast = new ApsFileAst();
        this.current = ast;
        visitChildren(ctx);
        return ast;
    }

    @Override
    public ApsAst visitDefinePackage(ApsarsParser.DefinePackageContext ctx) {
        if (this.current instanceof ApsFileAst fileAst) {
            fileAst.packageAt(ctx.packageIdentifier().getText());
            return this.current;
        }
        throw new RuntimeException("Err");
    }

    @Override
    public ApsAst visitDefineImport(ApsarsParser.DefineImportContext ctx) {
        if (this.current instanceof ApsFileAst fileAst) {
            ApsImportAst ast = new ApsImportAst(fileAst);
            ast.fullName(ctx.fullNameIdentifier().getText());
            fileAst.addImport(ast);
            return ast;
        }
        throw new RuntimeException("Err");
    }

    @Override
    public ApsAst visitFieldModifiers(ApsarsParser.FieldModifiersContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitMethodModifiers(ApsarsParser.MethodModifiersContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitMakeAlternateLet(ApsarsParser.MakeAlternateLetContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitOptionalFieldAndMethodModifiers(ApsarsParser.OptionalFieldAndMethodModifiersContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitOptionalFieldStaticAndFinal(ApsarsParser.OptionalFieldStaticAndFinalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitOptionalStaticAndFinal(ApsarsParser.OptionalStaticAndFinalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitPermissionModifiers(ApsarsParser.PermissionModifiersContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitFieldFinal(ApsarsParser.FieldFinalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitMethodFinal(ApsarsParser.MethodFinalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitClassFinal(ApsarsParser.ClassFinalContext ctx) {
        return visitChildren(ctx);
    }

    private <T extends ParserRuleContext> void ifAlternateValid(List<T> list, Consumer<T> action) {
        if (list != null && !list.isEmpty()) {
            action.accept(list.getFirst());
        }
    }

    private <T extends ParserRuleContext> void ifValid(T list, Consumer<T> action) {
        if (list != null) {
            action.accept(list);
        }
    }

    private <T extends ParserRuleContext> void ifValid(List<T> list, Consumer<T> action) {
        if (list != null && !list.isEmpty()) {
            list.forEach(action);
        }
    }

    private void ifPermission(ApsarsParser.PermissionModifiersContext ctx, ApsModifierRequiredAst<?> ast) {
        if (ctx != null) {
            if (ctx.isPrivate() != null) {
                ast.addAccessible(ApsAccessibleType.PRIVATE.generic());
            }
            if (ctx.isPublic() != null) {
                ast.addAccessible(ApsAccessibleType.PUBLIC.generic());
            }
            if (ctx.isProtected() != null) {
                ast.addAccessible(ApsAccessibleType.PROTECTED.generic());
            }
        }
    }

    public ApsMethodAst defineMethod(ApsarsParser.PermissionModifiersContext permissionModifiers, ApsarsParser.IdentifierContext identifier, ApsarsParser.DefineVariableStatementContext defineVariableStatement, ApsarsParser.AlternateMethodModifiersContext alternateMethodModifiers, ApsarsParser.ResultPresentingContext resultPresenting, ApsarsParser.DefineMethodBodyContext defineMethodBody, ApsarsParser.MethodParamListDefinitionContext methodParamListDefinition, ApsarsParser.ArgTypeContext methodReturnType, boolean isConstructor) {
        return defineMethod(
                permissionModifiers,
                identifier.getText(),
                defineVariableStatement,
                alternateMethodModifiers,
                resultPresenting,
                defineMethodBody,
                methodParamListDefinition,
                methodReturnType,
                isConstructor
        );
    }

    public ApsMethodAst defineMethod(ApsarsParser.PermissionModifiersContext permissionModifiers, String identifier, ApsarsParser.DefineVariableStatementContext defineVariableStatement, ApsarsParser.AlternateMethodModifiersContext alternateMethodModifiers, ApsarsParser.ResultPresentingContext resultPresenting, ApsarsParser.DefineMethodBodyContext defineMethodBody, ApsarsParser.MethodParamListDefinitionContext methodParamListDefinition, ApsarsParser.ArgTypeContext methodReturnType, boolean isConstructor) {
        ApsMethodAst ast = new ApsMethodAst(this.current);
        this.current = ast;

        if (permissionModifiers == null) {
            ast.accessible(isConstructor ? ApsAccessibleType.PUBLIC.generic() : ApsAccessibleType.PRIVATE.generic());
        } else {
            ifPermission(permissionModifiers, ast);
        }

        ast.nameIdentity(identifier);

        ast.isConstructor(isConstructor);

        ifValid(
                alternateMethodModifiers,
                methodModifiers -> {
                    ifAlternateValid(
                            methodModifiers.sync(),
                            sync -> ast.addModifier(ApsMethodModifierType.SYNCHRONIZED.modifier())
                    );

                    ifAlternateValid(
                            methodModifiers.isFinal(),
                            sync -> ast.addModifier(ApsMethodModifierType.IS_FINAL.modifier())
                    );

                    ifAlternateValid(
                            methodModifiers.isStatic(),
                            sync -> ast.addModifier(ApsMethodModifierType.IS_STATIC.modifier())
                    );

                    ifAlternateValid(
                            methodModifiers.isInline(),
                            inline -> ast.addCompilerFlag("try-inline")
                    );
                }
        );

        this.current = ast;

        ast.param(visitMethodParamListDefinition(methodParamListDefinition));
        this.current = ast;

        if (methodReturnType != null) {
            ast.returnType(visitArgType(methodReturnType));
        }

        this.current = ast;
        if (defineMethodBody != null) {
            ast.methodBody(visitDefineMethodBody(defineMethodBody));
        }

        if (resultPresenting != null) {
            ApsMethodBodyAst body = new ApsMethodBodyAst(ast, null);

            ApsStatementAst statement;

            if (ast.returnType() != null) {
                statement = new ApsReturnAst(body).result(visitResultPresenting(resultPresenting));
            } else {
                statement = visitResultPresenting(resultPresenting).resultingStatement();
            }

            if (statement == null) {
                if (ast.returnType() != null) {
                    LOGGER.warn("The refs statement must returning a value when it has return type");
                } else {
                    LOGGER.warn("Unsupported statement in method '{}'", ast.nameIdentity());
                }
            } else {
                body.addStatement(statement);
            }

            ast.methodBody(body);
        }

        if (defineVariableStatement != null) {
            ApsMethodBodyAst body = new ApsMethodBodyAst(ast, null);

            body.addStatement(visitDefineVariableStatement(defineVariableStatement));

            if (ast.returnType() != null) {
                if (ast.returnType().nameIdentity().equals(ast.findAst(ApsClassAst.class).nameIdentity())) {
                    body.addStatement(new ApsReturnAst(body).result(ApsResultPresentingAst.ref(body, "this")));
                } else {
                    body.addStatement(new ApsReturnAst(body).result(ApsResultPresentingAst.ref(body, defineVariableStatement.variableName().getText())));
                }
            }

            ast.methodBody(body);
        }

        return ast;
    }

    @Override
    public ApsMethodAst visitDefineMethod(ApsarsParser.DefineMethodContext ctx) {
        return defineMethod(
                ctx.permissionModifiers(),
                ctx.identifier(),
                ctx.defineVariableStatement(),
                ctx.alternateMethodModifiers(),
                ctx.resultPresenting(),
                ctx.defineMethodBody(),
                ctx.methodParamListDefinition(),
                Manipulate.supplyWhenNotNull(ctx.methodReturnType(), ApsarsParser.MethodReturnTypeContext::argType),
                false
        );
    }

    @Override
    public ApsMethodAst visitDefineJavaMethod(ApsarsParser.DefineJavaMethodContext ctx) {
        return defineMethod(
                ctx.permissionModifiers(),
                ctx.identifier(),
                ctx.defineVariableStatement(),
                ctx.alternateMethodModifiers(),
                ctx.resultPresenting(),
                ctx.defineMethodBody(),
                ctx.methodParamListDefinition(),
                ctx.argType(),
                false
        );
    }

    @Override
    public ApsMethodAst visitDefineConstructor(ApsarsParser.DefineConstructorContext ctx) {
        if (this.current instanceof ApsClassAst classAst) {
            return defineMethod(
                    ctx.permissionModifiers(),
                    classAst.nameIdentity(),
                    null,
                    null,
                    null,
                    ctx.defineMethodBody(),
                    ctx.methodParamListDefinition(),
                    null,
                    true
            );
        }
        return null;
    }

    @Override
    public ApsMethodAst visitDefineLetMethod(ApsarsParser.DefineLetMethodContext ctx) {
        ApsMethodAst ast = new ApsMethodAst(this.current);
        this.current = ast;

        ast.param(visitMethodParamListDefinition(ctx.methodParamListDefinition()));
        ast.nameIdentity(ctx.identifier().getText());
        this.current = ast;

        if (ctx.methodReturnType() != null) {
            ast.returnType(visitArgType(ctx.methodReturnType().argType()));
        }

        this.current = ast;
        ast.methodBody(visitDefineMethodBody(ctx.defineMethodBody()));

        return ast;
    }

    @Override
    public ApsMethodBodyAst visitDefineMethodBody(ApsarsParser.DefineMethodBodyContext ctx) {
        ApsMethodBodyAst ast = new ApsMethodBodyAst(this.current, this.current.findAst(ApsMethodBodyAst.class));
        for (ApsarsParser.DefineStatementContext defineStatementContext : ctx.defineStatement()) {
            this.current = ast;

            for (ApsarsParser.TheStatementContext theStatementContext : defineStatementContext.theStatement()) {
                this.current = ast;

                if (theStatementContext.returnStatement() != null) {
                    ast.addStatement(visitReturnStatement(theStatementContext.returnStatement()));
                    continue;
                }

                if (theStatementContext.yieldStatement() != null) {
                    ast.addStatement(visitYieldStatement(theStatementContext.yieldStatement()));
                    continue;
                }

                if (theStatementContext.tryStatement() != null) {
                    ast.addStatement(visitTryStatement(theStatementContext.tryStatement()));
                    continue;
                }

                if (theStatementContext.defineVariableStatement() != null) {
                    ApsVariableAst variable = visitDefineVariableStatement(theStatementContext.defineVariableStatement()).withEnd(true);
                    if (variable.defining()) {
                        ast.addFieldVariable(variable);
                    } else {
                        ast.addReassignmentFieldVariable(variable);
                    }
                    continue;
                }

                if (theStatementContext.resultingStatement() != null) {
                    ast.addStatement(visitResultingStatement(theStatementContext.resultingStatement()).withEnd(true));
                }
            }
        }
        return ast;
    }

    @Override
    public ApsStatementAst visitReturnStatement(ApsarsParser.ReturnStatementContext ctx) {
        ApsReturnAst ast = new ApsReturnAst(this.current);
        ast.result(visitResultPresenting(ctx.resultPresenting()));
        return ast;
    }

    @Override
    public ApsYieldAst visitYieldStatement(ApsarsParser.YieldStatementContext ctx) {
        ApsYieldAst ast = new ApsYieldAst(this.current);
        ast.result(visitResultPresenting(ctx.resultPresenting()));
        return ast;
    }

    @Override
    public ApsTryCatchAst visitTryStatement(ApsarsParser.TryStatementContext ctx) {
        if (this.current instanceof ApsMethodBodyAst bodyAst) {
            ApsTryCatchAst ast = new ApsTryCatchAst(bodyAst, bodyAst);
            this.current = ast;

            if (ctx.tryCatchList() != null) {
                ast.catchList(visitTryCatchList(ctx.tryCatchList()));
            } else if (ctx.ignored() != null) {
                ast.catchList(new ApsCatchListAst(ast).catchName("ignored").targetAll());
            } else if (ctx.print() != null) {
                ast.catchList(new ApsCatchListAst(ast).catchName("ex").targetAll());
                ApsMethodBodyAst body = new ApsMethodBodyAst(ast, ast.findAst(ApsMethodBodyAst.class));
                ast.catchingMethodBody(
                        body.addStatement(
                                new ApsInvokeObjectAst(body)
                                        .objectName(new ApsRefReferenceAst(bodyAst).nameIdentity("ex"))
                                        .reference(new ApsRefReferenceAst(bodyAst).nameIdentity("printStackTrace").doNotProcess(true))
                                        .withEnd(true)
                        )
                );
            } else if (ctx.deliver() != null) {
                ast.catchList(new ApsCatchListAst(ast).catchName("ex").targetAll());
                ApsMethodBodyAst body = new ApsMethodBodyAst(ast, ast.findAst(ApsMethodBodyAst.class));
                ApsInvokeObjectAst invokeAst = new ApsInvokeObjectAst(body);
                if (ctx.with() == null) {
                    body.addStatement(
                            invokeAst
                                    .objectName(new ApsRefReferenceAst(invokeAst).nameIdentity(ctx.refCall().refCallFrom().getText()))
                                    .reference(new ApsRefReferenceAst(invokeAst).nameIdentity(ctx.refCall().refCallMethod().getText()).doNotProcess(true))
                                    .addParam(new ApsResultPresentingAst(invokeAst).reference(
                                                    new ApsRefReferenceAst(invokeAst)
                                                            .nameIdentity("ex")
                                                            .type(ApsarsClassPool.type("java.lang.Exception"))
                                            )
                                    )
                                    .withEnd(true)
                    );
                } else {
                    ApsResultPresentingAst withMessage = new ApsResultPresentingAst(invokeAst);

                    if (ctx.withMessage().validInvokeParam().validToken() != null) {
                        if (ctx.withMessage().validInvokeParam().validToken().identifier() != null) {
                            withMessage.reference(
                                    new ApsRefReferenceAst(withMessage)
                                            .nameIdentity(ctx.withMessage().validInvokeParam().validToken().identifier().getText())
                            );
                        } else {
                            withMessage.constant(new ApsStringAst(
                                            withMessage
                                    ).value(ctx.withMessage()
                                            .validInvokeParam()
                                            .validToken()
                                            .constant()
                                            .getText())
                            );
                        }
                    } else {
                        this.current = invokeAst;
                        withMessage = visitResultPresenting(ctx.withMessage().validInvokeParam().resultPresenting());
                    }

                    this.current = ast;

                    body.addStatement(
                            invokeAst
                                    .objectName(new ApsRefReferenceAst(invokeAst).nameIdentity(ctx.refCall().refCallFrom().getText()))
                                    .reference(new ApsRefReferenceAst(invokeAst).nameIdentity(ctx.refCall().refCallMethod().getText()).doNotProcess(true))
                                    .addParam(withMessage)
                                    .addParam(new ApsResultPresentingAst(invokeAst).reference(
                                                    new ApsRefReferenceAst(invokeAst)
                                                            .nameIdentity("ex")
                                                            .type(ApsarsClassPool.type("java.lang.Exception"))
                                            )
                                    )
                                    .withEnd(true)
                    );
                }
                ast.catchingMethodBody(body);
            }

            if (ctx.tryStatementBody() != null) {
                ast.methodBody(visitDefineMethodBody(ctx.tryStatementBody().defineMethodBody()));
            }

            if (ctx.catchingStatementBody() != null) {
                ast.catchingMethodBody(visitDefineMethodBody(ctx.catchingStatementBody().defineMethodBody()));
            }
            return ast;
        }
        return null;
    }

    @Override
    public ApsCatchListAst visitTryCatchList(ApsarsParser.TryCatchListContext ctx) {
        ApsCatchListAst ast = new ApsCatchListAst(this.current);
        ast.catchName(ctx.identifier().getText());
        ast.addCatchTarget(visitArgType(ctx.argType()));
        for (ApsarsParser.TryCatchListExtraTypeContext extraCatch : ctx.tryCatchListExtraType()) {
            ast.addCatchTarget(visitArgType(extraCatch.argType()));
        }
        return ast;
    }

    @Override
    public ApsResultingStatementAst visitResultingStatement(ApsarsParser.ResultingStatementContext ctx) {
        if (ctx.invokeStatement() != null) {
            return visitInvokeStatement(ctx.invokeStatement());
        }

        if (ctx.ifStatement() != null) {
            return visitIfStatement(ctx.ifStatement());
        }

        if (ctx.newInstanceStatement() != null) {
            return visitNewInstanceStatement(ctx.newInstanceStatement());
        }

        if (ctx.calculateStatement() != null) {
            return visitCalculateStatement(ctx.calculateStatement());
        }

        return null;
    }

    @Override
    public ApsNewInstanceStatementAst visitNewInstanceStatement(ApsarsParser.NewInstanceStatementContext ctx) {
        ApsNewInstanceStatementAst ast = new ApsNewInstanceStatementAst(this.current);
        ast.reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.identifier().getText()).doNotProcess(true));
        ApsarsParser.InvokeParamListContext paramList = ctx.invokeParamList();
        if (paramList != null && paramList.validInvokeParam() != null) {
            this.current = ast;

            ast.addParam(visitValidInvokeParam(paramList.validInvokeParam()));

            if (ctx.invokeParamList().validExtraInvokeParam() != null) {
                for (ApsarsParser.ValidExtraInvokeParamContext validExtraInvokeParamContext : ctx.invokeParamList().validExtraInvokeParam()) {
                    this.current = ast;

                    ast.addParam(visitValidInvokeParam(validExtraInvokeParamContext.validInvokeParam()));
                }
            }
        }
        return ast;
    }

    @Override
    public ApsInvokeAst visitInvokeStatement(ApsarsParser.InvokeStatementContext ctx) {
        ApsInvokeAst ast = new ApsInvokeAst(this.current);
        ast.reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.fullNameOrIdentifier().getText()).doNotProcess(true));
        ApsarsParser.InvokeParamListContext paramList = ctx.invokeParamList();
        if (paramList != null && paramList.validInvokeParam() != null) {
            this.current = ast;

            ast.addParam(visitValidInvokeParam(paramList.validInvokeParam()));

            if (ctx.invokeParamList().validExtraInvokeParam() != null) {
                for (ApsarsParser.ValidExtraInvokeParamContext validExtraInvokeParamContext : ctx.invokeParamList().validExtraInvokeParam()) {
                    this.current = ast;

                    ast.addParam(visitValidInvokeParam(validExtraInvokeParamContext.validInvokeParam()));
                }
            }
        }

        if (ctx.fluentInvokeStatement() != null) {
            for (ApsarsParser.FluentInvokeStatementContext fluentInvokeStatementContext : ctx.fluentInvokeStatement()) {
                this.current = ast;

                ast.fluentInvoke().add(visitFluentInvokeStatement(fluentInvokeStatementContext));
            }
        }

        return ast;
    }

    @Override
    public ApsInvokeAst visitFluentInvokeStatement(ApsarsParser.FluentInvokeStatementContext ctx) {
        ApsInvokeAst ast = new ApsInvokeAst(this.current);
        ast.isFluent(true);
        ast.reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.identifier().getText()).doNotProcess(true));
        ApsarsParser.InvokeParamListContext paramList = ctx.invokeParamList();
        if (paramList != null && paramList.validInvokeParam() != null) {
            this.current = ast;

            ast.addParam(visitValidInvokeParam(paramList.validInvokeParam()));

            if (ctx.invokeParamList().validExtraInvokeParam() != null) {
                for (ApsarsParser.ValidExtraInvokeParamContext validExtraInvokeParamContext : ctx.invokeParamList().validExtraInvokeParam()) {
                    this.current = ast;

                    ast.addParam(visitValidInvokeParam(validExtraInvokeParamContext.validInvokeParam()));
                }
            }
        }
        ast.withEnd(false);
        return ast;
    }

    @Override
    public ApsCalculateAst visitCalculateStatement(ApsarsParser.CalculateStatementContext ctx) {
        ApsCalculateAst ast = new ApsCalculateAst(this.current);

        if (ctx.calculateStatementWithTotalParen() != null) {
            ast = visitCalculateStatementWithTotalParen(ctx.calculateStatementWithTotalParen());
            ast.totalWithParen(true);
        } else {
            if (ctx.calculateStatementWithParen() != null) {
                ast = visitCalculateStatementWithParen(ctx.calculateStatementWithParen());
                ast.totalWithParen(true);
            } else {
                ast.left(visitCalculateLeft(ctx.calculateLeft()));
            }
        }

        if (ctx.extraCalculateStatement() != null) {
            for (ApsarsParser.ExtraCalculateStatementContext extraCalculateStatementContext : ctx.extraCalculateStatement()) {
                ApsSymbolAst symbol = visitOperator(extraCalculateStatementContext.operator());

                ApsResultPresentingAst theRight = visitCalculatableResultPresenting(extraCalculateStatementContext.calculatableResultPresenting());

                if (ast.right() == null) {
                    ast.symbol(symbol);
                    ast.right(theRight);
                } else {
                    ApsCalculateAst extraAst = new ApsCalculateAst(this.current);
                    extraAst.symbol(symbol);
                    extraAst.right(theRight);

                    ast.rights().add(extraAst);
                }
            }
        }

        return ast;
    }

    @Override
    public ApsCalculateAst visitCalculateStatementWithTotalParen(ApsarsParser.CalculateStatementWithTotalParenContext ctx) {
        ApsCalculateAst ast = new ApsCalculateAst(this.current);

        ast.left(visitCalculateLeft(ctx.calculateLeft()));
        if (ctx.extraCalculateStatement() != null) {
            for (ApsarsParser.ExtraCalculateStatementContext extraCalculateStatementContext : ctx.extraCalculateStatement()) {
                ApsSymbolAst symbol = visitOperator(extraCalculateStatementContext.operator());

                ApsResultPresentingAst theRight = visitCalculatableResultPresenting(extraCalculateStatementContext.calculatableResultPresenting());

                if (ast.right() == null) {
                    ast.symbol(symbol);
                    ast.right(theRight);
                } else {
                    ApsCalculateAst extraAst = new ApsCalculateAst(this.current);
                    extraAst.symbol(symbol);
                    extraAst.right(theRight);

                    ast.rights().add(extraAst);
                }
            }
        }

        return ast;
    }

    @Override
    public ApsResultPresentingAst visitCalculateLeft(ApsarsParser.CalculateLeftContext ctx) {
        return visitCalculatableResultPresenting(ctx.calculatableResultPresenting());
    }

    @Override
    public ApsResultPresentingAst visitCalculateRight(ApsarsParser.CalculateRightContext ctx) {
        return visitCalculatableResultPresenting(ctx.calculatableResultPresenting());
    }

    @Override
    public ApsResultPresentingAst visitCalculatableResultPresenting(ApsarsParser.CalculatableResultPresentingContext ctx) {
        ApsResultPresentingAst ast = this.current instanceof ApsResultPresentingAst presentingAst ? presentingAst : new ApsResultPresentingAst(this.current);
        if (ctx.invokeStatement() != null) {
            ast.resultingStatement(visitInvokeStatement(ctx.invokeStatement()));
        } else if (ctx.newInstanceStatement() != null) {
            ast.resultingStatement(visitNewInstanceStatement(ctx.newInstanceStatement()));
        } else if (ctx.constant() != null) {
            ast.constant(visitConstant(ctx.constant()));
        } else if (ctx.calculateStatementWithParen() != null) {
            ast.resultingStatement(visitCalculateStatementWithParen(ctx.calculateStatementWithParen()));
        } else if (ctx.identifier() != null) {
            ast.reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.identifier().getText()));
        } else if (ctx.fullName() != null) {
            ast.reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.fullName().getText()));
        } else {
            return null;
        }
        return ast;
    }

    @Override
    public ApsCalculateAst visitCalculateStatementWithParen(ApsarsParser.CalculateStatementWithParenContext ctx) {
        ApsCalculateAst ast = new ApsCalculateAst(this.current);
        ast.leftWithParen(true);
        ast.left(visitCalculateLeftStatementWithParen(ctx.calculateLeftStatementWithParen()));
        if (ctx.extraCalculateStatement() != null) {
            for (ApsarsParser.ExtraCalculateStatementContext extraCalculateStatementContext : ctx.extraCalculateStatement()) {
                ApsSymbolAst symbol = visitOperator(extraCalculateStatementContext.operator());

                ApsResultPresentingAst theRight = visitCalculatableResultPresenting(extraCalculateStatementContext.calculatableResultPresenting());

                if (ast.right() == null) {
                    ast.symbol(symbol);
                    ast.right(theRight);
                } else {
                    ApsCalculateAst extraAst = new ApsCalculateAst(this.current);
                    extraAst.symbol(symbol);
                    extraAst.right(theRight);

                    ast.rights().add(extraAst);
                }
            }
        }
        return ast;
    }

    @Override
    public ApsSymbolAst visitOperator(ApsarsParser.OperatorContext ctx) {
        if (ctx.arithmetic() != null) {
            return visitArithmetic(ctx.arithmetic());
        }

        if (ctx.comparing() != null) {
            return visitComparing(ctx.comparing());
        }

        if (ctx.not() != null) {
            return ApsOperators.NOT;
        }

        return null;
    }

    @Override
    public ApsSymbolAst visitComparing(ApsarsParser.ComparingContext ctx) {
        if (ctx.comparingOr() != null) {
            return visitComparingOr(ctx.comparingOr());
        }

        if (ctx.comparingAnd() != null) {
            return visitComparingAnd(ctx.comparingAnd());
        }

        if (ctx.moreThan() != null) {
            return ApsOperators.MORE_THAN;
        }

        if (ctx.lessThan() != null) {
            return ApsOperators.LESS_THAN;
        }

        if (ctx.Equals() != null) {
            return ApsOperators.EQUALS;
        }

        return null;
    }

    @Override
    public ApsSymbolAst visitComparingAnd(ApsarsParser.ComparingAndContext ctx) {
        if (ctx.and() != null) {
            return ApsOperators.AND;
        }

        if (ctx.breakingAnd() != null) {
            return ApsOperators.BREAKING_AND;
        }

        return null;
    }

    @Override
    public ApsSymbolAst visitComparingOr(ApsarsParser.ComparingOrContext ctx) {
        if (ctx.or() != null) {
            return ApsOperators.OR;
        }

        if (ctx.breakingOr() != null) {
            return ApsOperators.BREAKING_OR;
        }

        return null;
    }

    @Override
    public ApsSymbolAst visitArithmetic(ApsarsParser.ArithmeticContext ctx) {
        if (ctx.Plus() != null) {
            return ApsOperators.PLUS;
        }

        if (ctx.Minus() != null) {
            return ApsOperators.MINUS;
        }

        if (ctx.Multiply() != null) {
            return ApsOperators.MULTIPLY;
        }

        if (ctx.Divide() != null) {
            return ApsOperators.DIVIDE;
        }

        if (ctx.Pow() != null) {
            return ApsOperators.POW;
        }

        if (ctx.AddisionAssignment() != null) {
            return ApsOperators.ADDITION_ASSIGNMENT;
        }

        if (ctx.SubtractionAssignment() != null) {
            return ApsOperators.SUBTRACTION_ASSIGNMENT;
        }

        if (ctx.MultiplicationAssignment() != null) {
            return ApsOperators.MULTIPLICATION_ASSIGNMENT;
        }

        if (ctx.DivisionAssignment() != null) {
            return ApsOperators.DIVISION_ASSIGNMENT;
        }

        if (ctx.PowAssignment() != null) {
            return ApsOperators.POW_ASSIGNMENT;
        }

        return null;
    }

    @Override
    public ApsResultPresentingAst visitCalculateLeftStatementWithParen(ApsarsParser.CalculateLeftStatementWithParenContext ctx) {
        if (ctx.calculateStatement() != null) {
            return new ApsResultPresentingAst(this.current).resultingStatement(visitCalculateStatement(ctx.calculateStatement()));
        }
        return visitCalculatableResultPresenting(ctx.calculatableResultPresenting());
    }

    @Override
    public ApsResultPresentingAst visitValidInvokeParam(ApsarsParser.ValidInvokeParamContext ctx) {
        ApsResultPresentingAst ast = new ApsResultPresentingAst(this.current);

        if (ctx.resultPresenting() != null) {
            ast = visitResultPresenting(ctx.resultPresenting());
        } else if (ctx.validToken() != null) {
            ast.constant(null);
            ast.literal(null);
            ast.resultingStatement(null);
            if (ctx.validToken().constant() != null) {
                ast.constant(visitConstant(ctx.validToken().constant()));
            } else if (ctx.validToken().identifier() != null) {
                ast.reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.validToken().identifier().getText()));
            }
        }

        return ast;
    }

    @Override
    public ApsResultPresentingAst visitResultPresenting(ApsarsParser.ResultPresentingContext ctx) {
        ApsResultPresentingAst ast = this.current instanceof ApsResultPresentingAst presentingAst ? presentingAst : new ApsResultPresentingAst(this.current);
        if (ctx.resultingStatement() != null) {
            ast.resultingStatement(visitResultingStatement(ctx.resultingStatement()));
        } else if (ctx.constant() != null) {
            ast.constant(visitConstant(ctx.constant()));
        } else if (ctx.identifier() != null) {
            ast.reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.identifier().getText()));
        } else if (ctx.fullName() != null) {
            ast.reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.fullName().getText()));
        }
        return ast;
    }

    @Override
    public ApsConstantAst visitConstant(ApsarsParser.ConstantContext ctx) {
        if (ctx.string() != null) {
            StringBuilder builder = new StringBuilder();
            builder.append("\"");
            for (ApsarsParser.IdentifierOrSpaceContext identifierOrSpaceContext : ctx.string().identifierOrSpace()) {
                if (identifierOrSpaceContext.identifier() != null) {
                    builder.append(identifierOrSpaceContext.identifier().getText());
                } else if (identifierOrSpaceContext.spacing() != null) {
                    if (identifierOrSpaceContext.spacing().number() != null) {
                        int repeat = Integer.parseInt(identifierOrSpaceContext.spacing().number().getText());
                        if (repeat > 0) {
                            builder.append(" ".repeat(repeat));
                        } else {
                            builder.append(" ");
                        }
                    } else {
                        builder.append(" ");
                    }
                }
            }
            builder.append("\"");
            return new ApsStringAst(this.current).value(builder.toString());
        } else if (ctx.null_() != null) {
            return new ApsNullAst(this.current);
        } else if (ctx.number() != null) {
            String text = ctx.getText();
            if (text.contains(".")) {
                return switch (text.charAt(text.length() - 1)) {
                    case 'D', 'd' -> new ApsDoubleAst(this.current).value(Double.parseDouble(text));
                    case 'F', 'f' -> new ApsFloatAst(this.current).value(Float.parseFloat(text));
                    default -> new ApsDoubleAst(this.current).value(Double.parseDouble(text));
                };
            } else {
                return switch (text.charAt(text.length() - 1)) {
                    case 'L', 'l' -> new ApsLongAst(this.current).value(Long.parseLong(text));
                    default -> new ApsIntAst(this.current).value(Integer.parseInt(text));
                };
            }
        } else if (ctx.bool() != null) {
            return new ApsBooleanAst(this.current).value(Boolean.parseBoolean(ctx.getText()));
        }
        return new ApsStringAst(this.current).value(ctx.getText());
    }

    @Override
    public ApsVariableAst visitDefineVariableStatement(ApsarsParser.DefineVariableStatementContext ctx) {
        ApsVariableAst ast = new ApsVariableAst(this.current);

        ifValid(
                ctx.variableModifiers(),
                modifiers -> {
                    ifValid(
                            modifiers.fieldFinal(),
                            isFinal -> ast.addModifier(ApsLocalVariableModifierType.IS_FINAL.modifier())
                    );

                    ifValid(
                            modifiers.sync(),
                            isFinal -> ast.addModifier(ApsLocalVariableModifierType.SYNCHRONIZED.modifier())
                    );
                }
        );

        if (ctx.argType() != null) {
            ast.type(visitArgType(ctx.argType()));
            ast.defining(true);
        } else {
            ast.defining(false);
        }
        ast.reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.variableName().getText()));
        if (ctx.assignment() != null) {
            if (ctx.resultPresenting() != null) {
                this.current = ast;
                ast.assignment(visitResultPresenting(ctx.resultPresenting()));
            } else {
                ast.assignment(new ApsResultPresentingAst(ast).reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.assignmentIdentifier().getText())));
            }
        }
        return ast;
    }

    @Override
    public ApsAst visitTokenList(ApsarsParser.TokenListContext ctx) {
        return super.visitTokenList(ctx);
    }

    @Override
    public ApsAst visitValidToken(ApsarsParser.ValidTokenContext ctx) {
        return super.visitValidToken(ctx);
    }

    @Override
    public ApsAst visitExtraToken(ApsarsParser.ExtraTokenContext ctx) {
        return super.visitExtraToken(ctx);
    }

    @Override
    public ApsAst visitDefineStatement(ApsarsParser.DefineStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsMethodParamElementAst visitParamType(ApsarsParser.ParamTypeContext ctx) {
        ApsMethodParamElementAst ast = new ApsMethodParamElementAst(this.current);

        this.current = ast;

        ast.nameIdentity(ctx.identifier().getText());
        ast.argType(visitArgType(ctx.argType()));

        return ast;
    }

    @Override
    public ApsArgTypeAst visitArgType(ApsarsParser.ArgTypeContext ctx) {
        ApsArgTypeAst ast = new ApsArgTypeAst(this.current);
        if (ctx.identifier() != null) {
            ast.nameIdentity(ctx.identifier().getText());
        }
        if (ctx.typedArgType() != null) {
            if (ctx.typedArgType().argType() != null) {
                this.current = ast;

                ast.addArg(visitArgType(ctx.typedArgType().argType()));
                if (ctx.typedArgType().extraArgTypes() != null) {
                    for (ApsarsParser.ExtraArgTypesContext extraArgType : ctx.typedArgType().extraArgTypes()) {
                        this.current = ast;

                        ast.addArg(visitArgType(extraArgType.argType()));
                    }
                }
            }
        }
        if (ctx.arrayArgType() != null) {
            if (ctx.arrayArgType().arrayDefinition() != null && !ctx.arrayArgType().arrayDefinition().isEmpty()) {
                if (ctx.arrayArgType().arrayDefinition().size() > 1) {
                    ast.arrayDepth(ctx.arrayArgType().arrayDefinition().size());
                } else if (ctx.arrayArgType().arrayDefinition().getFirst().number() != null) {
                    int arraySize = Integer.parseInt(ctx.arrayArgType().arrayDefinition().getFirst().number().getText());
                    ast.arraySize(arraySize);
                }
                ast.arrayArgType(true);
            }
        }
        return ast;
    }

    @Override
    public ApsMethodParameterAst visitMethodParamListDefinition(ApsarsParser.MethodParamListDefinitionContext ctx) {
        if (this.current instanceof ApsMethodAst methodAst) {
            ApsMethodParameterAst parameterAst = new ApsMethodParameterAst(methodAst);
            if (ctx != null) {
                for (ApsarsParser.ParamTypeContext definiteParam : ctx.paramType()) {
                    this.current = parameterAst;

                    parameterAst.addParam(visitParamType(definiteParam));
                }
            }

            return parameterAst;
        }

        return null;
    }

    @Override
    public ApsAst visitDefineClass(ApsarsParser.DefineClassContext ctx) {
        if (this.current instanceof ApsFileAst fileAst) {
            ApsClassAst ast = new ApsClassAst(fileAst);
            this.current = ast;
            ast.nameIdentity(ctx.identifier().getText());

            ifPermission(ctx.permissionModifiers(), ast);

            ifValid(
                    ctx.annotation(),
                    annotation -> ast.addAnnotation(visitAnnotation(annotation))
            );

            if (ctx.classFinal() != null) {
                ast.addModifier(ApsClassModifier.create(ApsClassKeyword.of(ctx.classFinal().getText())));
            }

            if (ctx.makeAlternateLetAndContent() != null) {
                if (ctx.makeAlternateLetAndContent().defineLet() != null) {
                    for (ApsarsParser.DefineLetContext defineLet : ctx.makeAlternateLetAndContent().defineLet()) {
                        this.current = ast;

                        ast.addLet(visitDefineLet(defineLet));
                    }
                }

                if (ctx.makeAlternateLetAndContent().defineClassContent() != null) {
                    for (ApsarsParser.DefineClassContentContext defineClassContent : ctx.makeAlternateLetAndContent().defineClassContent()) {
                        this.current = ast;

                        visitDefineClassContent(defineClassContent);
                    }
                }
            }

            fileAst.addClass(ast);
            this.current = ast;
        }
        return this.current;
    }

    @Override
    public ApsAnnotationAst visitAnnotation(ApsarsParser.AnnotationContext ctx) {
        String annotationFullName = this.current.findAst(ApsFileAst.class).packageAt() + "." + ctx.identifier().getText();

        ApsAnnotationAst annotation = ApsarsClassPool.annotation(annotationFullName);

        if (annotation == null) {
            annotation = new ApsAnnotationAst(this.current, ctx.identifier().getText());
            ApsarsClassPool.registerAnnotation(annotationFullName, annotation);
        }
        return annotation;
    }

    @Override
    public ApsAst visitMakeAlternateLetAndContent(ApsarsParser.MakeAlternateLetAndContentContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitDefineClassContent(ApsarsParser.DefineClassContentContext ctx) {
        if (this.current instanceof ApsClassAst classAst) {
            for (ApsarsParser.DefineMethodUsingTemplateContext defineMethod : ctx.defineMethodUsingTemplate()) {
                this.current = classAst;

                classAst.addMethodByTemplate(
                        defineMethod.identifier().getText(),
                        methodAst -> {
                            this.current = methodAst;
                            return visitDefineMethodBody(defineMethod.defineMethodBody());
                        }
                );
            }

            for (ApsarsParser.DefineMethodContext defineMethod : ctx.defineMethod()) {
                this.current = classAst;

                classAst.addMethod(visitDefineMethod(defineMethod));
            }

            for (ApsarsParser.DefineJavaMethodContext defineMethod : ctx.defineJavaMethod()) {
                this.current = classAst;

                classAst.addMethod(visitDefineJavaMethod(defineMethod));
            }

            for (ApsarsParser.DefineConstructorContext defineConstructor : ctx.defineConstructor()) {
                this.current = classAst;

                classAst.addMethod(visitDefineConstructor(defineConstructor));
            }

            for (ApsarsParser.DefineMemberFieldContext defineMemberField : ctx.defineMemberField()) {
                this.current = classAst;

                classAst.addMemberParameter(visitDefineMemberField(defineMemberField));
            }
        }
        return this.current;
    }

    @Override
    public ApsIfStatementAst visitIfStatement(ApsarsParser.IfStatementContext ctx) {
        ApsIfStatementAst ast = new ApsIfStatementAst(this.current);
        if (ctx.resultPresenting() != null) {
            ast.predicate(visitResultPresenting(ctx.resultPresenting()));
        } else if (ctx.calculateStatement() != null) {
            ast.predicate(new ApsResultPresentingAst(ast).resultingStatement(visitCalculateStatement(ctx.calculateStatement())));
        }

        if (ctx.statementBlock() != null) {
            ast.statements(visitStatementBlock(ctx.statementBlock()));
        }

        if (ctx.elseStatement() != null) {
            ast.elseStatements(visitElseStatement(ctx.elseStatement()));
        }

        if (ctx.elseIfStatement() != null) {
            ast.elseIfStatement(visitElseIfStatement(ctx.elseIfStatement()));
        }

        return ast;
    }

    @Override
    public ApsIfStatementAst visitElseIfStatement(ApsarsParser.ElseIfStatementContext ctx) {
        return visitIfStatement(ctx.ifStatement());
    }

    @Override
    public ApsMethodBodyAst visitElseStatement(ApsarsParser.ElseStatementContext ctx) {
        return visitStatementBlock(ctx.statementBlock());
    }

    @Override
    public ApsMethodBodyAst visitStatementBlock(ApsarsParser.StatementBlockContext ctx) {
        return visitDefineMethodBody(ctx.defineMethodBody());
    }

    @Override
    public ApsLetAst visitDefineLet(ApsarsParser.DefineLetContext ctx) {
        ApsLetAst ast = new ApsLetAst(this.current);

        ApsarsParser.MakeAlternateLetContext alternate = ctx.makeAlternateLet();

        ifPermission(alternate.permissionModifiers(), ast);

        if (alternate.optionalFieldStaticAndFinal() != null) {
            for (ApsarsParser.OptionalFieldStaticAndFinalContext optionalFieldStaticAndFinalContext : alternate.optionalFieldStaticAndFinal()) {
                ApsMemberParameterKeyword keyword = ApsMemberParameterKeyword.ofNullable(optionalFieldStaticAndFinalContext.getText());
                if (keyword != null) {
                    ast.addModifier(ApsMemberParameterModifier.create(keyword));
                }
            }
        }

        if (alternate.optionalFieldAndMethodModifiers() != null) {
            for (ApsarsParser.OptionalFieldAndMethodModifiersContext optionalFieldAndMethodModifiersContext : alternate.optionalFieldAndMethodModifiers()) {
                for (ApsarsParser.FieldModifiersContext fieldModifiers : optionalFieldAndMethodModifiersContext.fieldModifiers()) {
                    ApsMemberParameterKeyword keyword = ApsMemberParameterKeyword.ofNullable(fieldModifiers.getText());
                    if (keyword != null) {
                        ast.addModifier(ApsMemberParameterModifier.create(keyword));
                    }
                }

                for (ApsarsParser.MethodModifiersContext methodModifiers : optionalFieldAndMethodModifiersContext.methodModifiers()) {
                    ApsMethodKeyword keyword = ApsMethodKeyword.ofNullable(methodModifiers.getText());
                    if (keyword != null) {
                        ast.addModifier(ApsMethodModifier.create(keyword));
                    }
                }
            }
        }

        if (ctx.defineLetClassContent() != null) {
            for (ApsarsParser.DefineLetMethodContext defineMethodContext : ctx.defineLetClassContent().defineLetMethod()) {
                this.current = ast;

                ast.addMethod(visitDefineLetMethod(defineMethodContext));
            }

            for (ApsarsParser.DefineLetMemberFieldContext defineMemberFieldContext : ctx.defineLetClassContent().defineLetMemberField()) {
                this.current = ast;

                ast.addMemberParameter(visitDefineLetMemberField(defineMemberFieldContext));
            }
        }

        return ast;
    }

    @Override
    public ApsMemberParameterAst visitDefineMemberField(ApsarsParser.DefineMemberFieldContext ctx) {
        if (ctx.defineApsarsMemberField() != null) {
            return visitDefineApsarsMemberField(ctx.defineApsarsMemberField());
        } else if (ctx.defineJavaMemberField() != null) {
            return visitDefineJavaMemberField(ctx.defineJavaMemberField());
        }
        return null;
    }

    @Override
    public ApsMemberParameterAst visitDefineJavaMemberField(ApsarsParser.DefineJavaMemberFieldContext ctx) {
        ApsMemberParameterAst ast = new ApsMemberParameterAst(this.current.findAst(ApsClassAst.class));

        ifPermission(ctx.permissionModifiers(), ast);

        if (ctx.optionalFieldStaticAndFinal() != null) {
            if (!ctx.optionalFieldStaticAndFinal().isStatic().isEmpty()) {
                ast.addModifier(ApsMemberParameterModifier.create(ApsMemberParameterKeyword.STATIC));
            }

            if (!ctx.optionalFieldStaticAndFinal().fieldFinal().isEmpty()) {
                ast.addModifier(ApsMemberParameterModifier.create(ApsMemberParameterKeyword.FINAL));
            }
        }
        ast.nameIdentity(ctx.fieldName().getText());
        ast.argType(visitArgType(ctx.argType()));
        if (ctx.assignment() != null) {
            if (ctx.resultPresenting() != null) {
                this.current = ast;
                ast.value(visitResultPresenting(ctx.resultPresenting()));
            } else {
                ast.value(new ApsResultPresentingAst(ast).reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.assignmentIdentifier().getText())));
            }
        }
        return ast;
    }

    @Override
    public ApsMemberParameterAst visitDefineApsarsMemberField(ApsarsParser.DefineApsarsMemberFieldContext ctx) {
        ApsMemberParameterAst ast = new ApsMemberParameterAst(this.current.findAst(ApsClassAst.class));

        ifPermission(ctx.permissionModifiers(), ast);

        if (ctx.optionalFieldStaticAndFinal() != null) {
            if (!ctx.optionalFieldStaticAndFinal().isStatic().isEmpty()) {
                ast.addModifier(ApsMemberParameterModifier.create(ApsMemberParameterKeyword.STATIC));
            }

            if (!ctx.optionalFieldStaticAndFinal().fieldFinal().isEmpty()) {
                ast.addModifier(ApsMemberParameterModifier.create(ApsMemberParameterKeyword.FINAL));
            }
        }
        ast.nameIdentity(ctx.fieldName().getText());
        ast.argType(visitArgType(ctx.argType()));
        if (ctx.assignment() != null) {
            if (ctx.resultPresenting() != null) {
                this.current = ast;
                ast.value(visitResultPresenting(ctx.resultPresenting()));
            } else {
                ast.value(new ApsResultPresentingAst(ast).reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.assignmentIdentifier().getText())));
            }
        }
        return ast;
    }

    @Override
    public ApsMemberParameterAst visitDefineLetMemberField(ApsarsParser.DefineLetMemberFieldContext ctx) {
        if (ctx.defineApsarsLetMemberField() != null) {
            return visitDefineApsarsLetMemberField(ctx.defineApsarsLetMemberField());
        } else if (ctx.defineJavaLetMemberField() != null) {
            return visitDefineJavaLetMemberField(ctx.defineJavaLetMemberField());
        }
        return null;
    }

    @Override
    public ApsMemberParameterAst visitDefineJavaLetMemberField(ApsarsParser.DefineJavaLetMemberFieldContext ctx) {
        ApsMemberParameterAst ast = new ApsMemberParameterAst(this.current.findAst(ApsClassAst.class));
        ast.nameIdentity(ctx.fieldName().getText());
        ast.argType(visitArgType(ctx.argType()));
        if (ctx.assignment() != null) {
            if (ctx.resultPresenting() != null) {
                this.current = ast;
                ast.value(visitResultPresenting(ctx.resultPresenting()));
            } else {
                ast.value(new ApsResultPresentingAst(ast).reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.assignmentIdentifier().getText())));
            }
        }
        return ast;
    }

    @Override
    public ApsMemberParameterAst visitDefineApsarsLetMemberField(ApsarsParser.DefineApsarsLetMemberFieldContext ctx) {
        ApsMemberParameterAst ast = new ApsMemberParameterAst(this.current.findAst(ApsClassAst.class));
        ast.nameIdentity(ctx.fieldName().getText());
        ast.argType(visitArgType(ctx.argType()));
        if (ctx.assignment() != null) {
            if (ctx.resultPresenting() != null) {
                this.current = ast;
                ast.value(visitResultPresenting(ctx.resultPresenting()));
            } else {
                ast.value(new ApsResultPresentingAst(ast).reference(new ApsRefReferenceAst(ast).nameIdentity(ctx.assignmentIdentifier().getText())));
            }
        }
        return ast;
    }

    @Override
    public ApsAst visitChildren(RuleNode node) {
        ApsAst parent = this.current;
        int n = node.getChildCount();
        for (int i = 0; i < n; i++) {
            if (!shouldVisitNextChild(node, null)) {
                break;
            }

            ParseTree c = node.getChild(i);
            c.accept(this);
        }

        this.current = parent;

        return this.current;
    }
}
