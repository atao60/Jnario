/*
* generated by Xtext
*/
package de.bmw.carit.jnario.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.*;
import org.eclipse.xtext.xtend2.ui.contentassist.Xtend2ProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;

/**
 * Represents a generated, default implementation of interface {@link IProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them 
 * with a more concrete subtype. 
 */
@SuppressWarnings("all")
public class AbstractJnarioProposalProvider extends Xtend2ProposalProvider {
		
	public void completeJnario_Package(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeJnario_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeJnario_Imports(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeJnario_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeJnario_Background(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeJnario_XtendClass(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeImport_Static(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void completeImport_Extension(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void completeImport_ImportedType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	}
	public void completeImport_ImportedNamespace(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeBackground_Steps(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeScenario_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeScenario_Annotations(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeScenario_Steps(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeScenario_Examples(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeAnnotation_Annotation(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeAnnotation_Var(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeVariableDeclaration_Visibility(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeVariableDeclaration_VariableDec(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeGiven_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeGiven_Code(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeGiven_And(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeWhen_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeWhen_Code(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeWhen_And(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeThen_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeThen_Code(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeThen_And(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeAnd_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeAnd_Code(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeCode_Annotations(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeCode_BlockExpression(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeBlockExpression_Expressions(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeExampleTable_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeExampleTable_Heading(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeExampleTable_Rows(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeExampleHeading_Parts(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeExampleHeadingCell_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeExampleRow_Parts(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeExampleCell_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
    
	public void complete_Jnario(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_DESCRIPTION(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Import(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_QualifiedNameWithWildCard(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Background(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Scenario(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Annotation(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_VariableDeclaration(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Step(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Given(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_When(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Then(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_And(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_Code(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_BlockExpression(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_ExampleTable(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_ExampleHeading(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_ExampleHeadingCell(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_ExampleRow(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_ExampleCell(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_FEATURE_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_BACKGROUND_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_SCENARIO_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_GIVEN_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_WHEN_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_THEN_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_AND_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_EXAMPLE_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_IN_ORDER_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_AS_A_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_I_WANT_TEXT(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_PIPE(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_PIPE_SPACES(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_EXAMPLE_ROW_END(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_TEXT_MULTI_LINE(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_TEXT_AND_NL(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_MNL(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_COLON(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_NL(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
	public void complete_SPACES(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
}
