package com.github.cao.awa.apsars.visitor;

import com.github.cao.awa.apsars.antlr.ApsarsBaseVisitor;
import com.github.cao.awa.apsars.antlr.ApsarsParser;
import com.github.cao.awa.apsars.element.modifier.accessible.GenericAccessibleModifier;
import com.github.cao.awa.apsars.element.modifier.clazz.ApsClassModifier;
import com.github.cao.awa.apsars.element.modifier.method.ApsMethodModifier;
import com.github.cao.awa.apsars.parser.token.keyword.clazz.ApsClassKeyword;
import com.github.cao.awa.apsars.parser.token.keyword.method.ApsMethodKeyword;
import com.github.cao.awa.apsars.tree.ApsAst;
import com.github.cao.awa.apsars.tree.aps.ApsFileAst;
import com.github.cao.awa.apsars.tree.aps.ApsImportAst;
import com.github.cao.awa.apsars.tree.clazz.ApsClassAst;
import com.github.cao.awa.apsars.tree.clazz.ApsLetAst;
import com.github.cao.awa.apsars.tree.method.ApsMethodAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParamElementAst;
import com.github.cao.awa.apsars.tree.method.parameter.ApsMethodParameterAst;
import com.github.cao.awa.apsars.tree.vararg.ApsArgTypeAst;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

public class ApsarsTreeVisitor extends ApsarsBaseVisitor<ApsAst> {
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

    @Override
    public ApsMethodAst visitDefineMethod(ApsarsParser.DefineMethodContext ctx) {
        if (this.current instanceof ApsClassAst classAst) {
            ApsMethodAst ast = new ApsMethodAst(classAst);
            this.current = ast;
            if (ctx.permissionModifiers() != null) {
                ast.addAccessible(new GenericAccessibleModifier(ctx.permissionModifiers().getText()));
            }
            ApsarsParser.AlternateStaticAndFinalAndSyncContext treeParamAlternate = ctx.alternateStaticAndFinalAndSync();
            if (treeParamAlternate != null) {
                ApsarsParser.OptionalStaticAndFinalContext staticAndFinal = treeParamAlternate.optionalStaticAndFinal();
                if (!(staticAndFinal == null)) {
                    if (!staticAndFinal.isFinal().isEmpty()) {
                        ast.addModifier(ApsMethodModifier.create(ApsMethodKeyword.FINAL));
                    }
                    if (!staticAndFinal.isStatic().isEmpty()) {
                        ast.addModifier(ApsMethodModifier.create(ApsMethodKeyword.STATIC));
                    }

                    if (treeParamAlternate.sync() != null) {
                        ast.addModifier(ApsMethodModifier.create(ApsMethodKeyword.of(treeParamAlternate.sync().getText())));
                    }
                }
            }
            this.current = ast;

            ast.param(visitMethodParamListDefinition(ctx.methodParamListDefinition()));
            ast.nameIdentity(ctx.identifier().getText());
            this.current = ast;

            if (ctx.methodReturnType() != null) {
                ast.returnType(visitArgType(ctx.methodReturnType().argType()));
            }
            visitChildren(ctx);
            return ast;
        }
        return null;
    }

    @Override
    public ApsAst visitDefineMethodBody(ApsarsParser.DefineMethodBodyContext ctx) {
        return visitChildren(ctx);
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
        ast.nameIdentity(ctx.identifier().getText());
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
            for (ApsarsParser.ParamTypeContext definiteParam : ctx.paramType()) {
                this.current = parameterAst;

                parameterAst.addParam(visitParamType(definiteParam));
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

            if (ctx.permissionModifiers() != null) {
                ast.addAccessible(new GenericAccessibleModifier(ctx.permissionModifiers().getText()));
            }
            if (ctx.classFinal() != null) {
                ast.addModifier(ApsClassModifier.create(ApsClassKeyword.of(ctx.classFinal().getText())));
            }
            if (ctx.makeAlternateLetAndContent() != null) {
                for (ApsarsParser.DefineLetContext defineLet : ctx.makeAlternateLetAndContent().defineLet()) {
                    this.current = ast;

                    ast.addLet(visitDefineLet(defineLet));
                }
            }
            ast.nameIdentity(ctx.identifier().getText());

            fileAst.addClass(ast);
            this.current = ast;

            visitChildren(ctx);
        }
        return this.current;
    }

    @Override
    public ApsAst visitMakeAlternateLetAndContent(ApsarsParser.MakeAlternateLetAndContentContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ApsAst visitDefineClassContent(ApsarsParser.DefineClassContentContext ctx) {
        if (this.current instanceof ApsClassAst classAst) {
            for (ApsarsParser.DefineMethodContext defineMethod : ctx.defineMethod()) {
                this.current = classAst;

                classAst.addMethod(visitDefineMethod(defineMethod));
            }
        }
        return this.current;
    }

    @Override
    public ApsLetAst visitDefineLet(ApsarsParser.DefineLetContext ctx) {
        ApsLetAst let = new ApsLetAst(this.current);

        ApsarsParser.MakeAlternateLetContext alternate = ctx.makeAlternateLet();

        if (alternate.permissionModifiers() != null) {
            let.addAccessible(new GenericAccessibleModifier(alternate.permissionModifiers().getText()));
        }

        return let;
    }

    @Override
    public ApsAst visitDefineMemberField(ApsarsParser.DefineMemberFieldContext ctx) {
        return visitChildren(ctx);
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
            ApsAst childResult = c.accept(this);
            if (childResult != null) {
                childResult.parent(parent);
            }
        }

        this.current = parent;

        return this.current;
    }
}
