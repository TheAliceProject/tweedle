// Generated from C:/Users/Jonathan/Documents/Repos/Filament/tweedle/Grammar\TweedleParser.g4 by ANTLR 4.7.2
package Alice.Tweedle;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TweedleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TweedleParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TweedleParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(TweedleParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(TweedleParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(TweedleParser.VisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#visibilityLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilityLevel(TweedleParser.VisibilityLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(TweedleParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TweedleParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(TweedleParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(TweedleParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(TweedleParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(TweedleParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(TweedleParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(TweedleParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(TweedleParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(TweedleParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(TweedleParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(TweedleParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(TweedleParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(TweedleParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(TweedleParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(TweedleParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(TweedleParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(TweedleParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(TweedleParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(TweedleParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(TweedleParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#requiredParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiredParameter(TweedleParser.RequiredParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#optionalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalParameter(TweedleParser.OptionalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(TweedleParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TweedleParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TweedleParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(TweedleParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(TweedleParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TweedleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(TweedleParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(TweedleParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#unlabeledExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabeledExpressionList(TweedleParser.UnlabeledExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#labeledExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledExpressionList(TweedleParser.LabeledExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#labeledExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledExpression(TweedleParser.LabeledExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(TweedleParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#lambdaCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaCall(TweedleParser.LambdaCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TweedleParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(TweedleParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(TweedleParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#lambdaTypeSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaTypeSignature(TweedleParser.LambdaTypeSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(TweedleParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(TweedleParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(TweedleParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(TweedleParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(TweedleParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(TweedleParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(TweedleParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(TweedleParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(TweedleParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link TweedleParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(TweedleParser.ArgumentsContext ctx);
}