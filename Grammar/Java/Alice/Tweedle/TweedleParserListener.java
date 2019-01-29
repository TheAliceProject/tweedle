// Generated from C:/Users/Jonathan/Documents/Repos/Filament/tweedle/Grammar\TweedleParser.g4 by ANTLR 4.7.2
package Alice.Tweedle;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TweedleParser}.
 */
public interface TweedleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TweedleParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(TweedleParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(TweedleParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(TweedleParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(TweedleParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(TweedleParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(TweedleParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#visibilityLevel}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityLevel(TweedleParser.VisibilityLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#visibilityLevel}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityLevel(TweedleParser.VisibilityLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(TweedleParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(TweedleParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TweedleParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TweedleParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(TweedleParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(TweedleParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(TweedleParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(TweedleParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(TweedleParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(TweedleParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(TweedleParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(TweedleParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(TweedleParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(TweedleParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(TweedleParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(TweedleParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(TweedleParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(TweedleParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(TweedleParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(TweedleParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(TweedleParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(TweedleParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(TweedleParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(TweedleParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(TweedleParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(TweedleParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(TweedleParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(TweedleParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(TweedleParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(TweedleParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(TweedleParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(TweedleParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(TweedleParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(TweedleParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(TweedleParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(TweedleParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(TweedleParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(TweedleParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(TweedleParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(TweedleParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(TweedleParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(TweedleParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void enterRequiredParameter(TweedleParser.RequiredParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	void exitRequiredParameter(TweedleParser.RequiredParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	void enterOptionalParameter(TweedleParser.OptionalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	void exitOptionalParameter(TweedleParser.OptionalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(TweedleParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(TweedleParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TweedleParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TweedleParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TweedleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TweedleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(TweedleParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(TweedleParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(TweedleParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(TweedleParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TweedleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TweedleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(TweedleParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(TweedleParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(TweedleParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(TweedleParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#unlabeledExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterUnlabeledExpressionList(TweedleParser.UnlabeledExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#unlabeledExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitUnlabeledExpressionList(TweedleParser.UnlabeledExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#labeledExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterLabeledExpressionList(TweedleParser.LabeledExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#labeledExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitLabeledExpressionList(TweedleParser.LabeledExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#labeledExpression}.
	 * @param ctx the parse tree
	 */
	void enterLabeledExpression(TweedleParser.LabeledExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#labeledExpression}.
	 * @param ctx the parse tree
	 */
	void exitLabeledExpression(TweedleParser.LabeledExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(TweedleParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(TweedleParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#lambdaCall}.
	 * @param ctx the parse tree
	 */
	void enterLambdaCall(TweedleParser.LambdaCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#lambdaCall}.
	 * @param ctx the parse tree
	 */
	void exitLambdaCall(TweedleParser.LambdaCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TweedleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TweedleParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(TweedleParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(TweedleParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(TweedleParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(TweedleParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#lambdaTypeSignature}.
	 * @param ctx the parse tree
	 */
	void enterLambdaTypeSignature(TweedleParser.LambdaTypeSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#lambdaTypeSignature}.
	 * @param ctx the parse tree
	 */
	void exitLambdaTypeSignature(TweedleParser.LambdaTypeSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(TweedleParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(TweedleParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(TweedleParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(TweedleParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(TweedleParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(TweedleParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(TweedleParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(TweedleParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(TweedleParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(TweedleParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(TweedleParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(TweedleParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(TweedleParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(TweedleParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(TweedleParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(TweedleParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(TweedleParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(TweedleParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TweedleParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TweedleParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TweedleParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TweedleParser.ArgumentsContext ctx);
}