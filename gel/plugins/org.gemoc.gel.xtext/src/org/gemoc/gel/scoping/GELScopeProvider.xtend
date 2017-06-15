/*
 * generated by Xtext
 */
package org.gemoc.gel.scoping

import com.google.common.base.Predicate
import fr.inria.aoste.timesquare.ecl.ecl.ECLDefCS
import java.util.ArrayList
import java.util.Collections
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.FilteringScope
import org.gemoc.gel.AtomicDomainSpecificEvent
import org.gemoc.gel.CompositeDomainSpecificEvent
import org.gemoc.gel.DomainSpecificEventReference
import org.gemoc.gel.EclEvent
import org.gemoc.gel.ExecutionFunction
import org.gemoc.gel.ExecutionFunctionResult
import org.gemoc.gel.FeedbackConsequence
import org.gemoc.gel.FeedbackPolicy
import org.gemoc.gel.LocalVariable
import org.gemoc.gel.MultipleArguments
import org.gemoc.gel.SingleArgument
import org.gemoc.gel.UnfoldingStrategy
import org.gemoc.gel.utils.GELHelper
import org.eclipse.gemoc.gexpressions.GExpression
import org.eclipse.gemoc.gexpressions.GReferenceExpression
import org.eclipse.gemoc.gexpressions.xtext.scoping.GExpressionsScopeProvider

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class GELScopeProvider extends GExpressionsScopeProvider {

	def protected dispatch IScope getNavigationScopeForEObject(ExecutionFunctionResult eo, IScope outerScope) {
		return getScopeOfNavigableElementsForType(GELHelper.getTypeOfExecutionFunctionResult(eo), outerScope)
	}
	
	def protected dispatch IScope getNavigationScopeForEObject(LocalVariable eo, IScope outerScope){
		return getScopeOfNavigableElementsForType(eo.type, outerScope)
	}

	// By default, returns all the EStructuralFeatures and EOperations associated to the classifier. Since in ECL we define events within
	// the context of an EClassifier, we want to be able to navigate through them transparently, thus here we stuff elements from the outerscope into 
	// the scope that will be returned. If it is too much for the expression where it is located, then it can be restricted later on in the filter scope below.
	override protected dispatch IScope getScopeOfNavigableElementsForType(EClass eClass, IScope outerScope) {

		// Outerscope should contain all external EObjects, in particular ECL Events
		// While using super of this method returns the scope of navigable elements for the classifier (e.g. EOperations and EStructuralFeatures)
		// Let's merge.
		val scopeWithEclEventsDefinedWithinClassifier = new FilteringScope(outerScope,
			new Predicate<IEObjectDescription>() {

				override public boolean apply(IEObjectDescription input) {
					if (input.EClass.name.equals("ECLDefCS")) {
						if (GELHelper.parseContextName((input.EObjectOrProxy as ECLDefCS).owningClassifierContextDecl).
							equals(eClass.name)) {
							return true
						}
					}
					return false
				}
			});
		val allNavigableElements = getAllNavigableElementsOfType(eClass)
		val firstIterator = scopeWithEclEventsDefinedWithinClassifier.allElements
		val allElementsToPlaceInTheScope = new ArrayList<EObject>()

		// Outer scope first will have priority in the editor... !
		allElementsToPlaceInTheScope.addAll(firstIterator.map[description|description.EObjectOrProxy])
		allElementsToPlaceInTheScope.addAll(allNavigableElements)
		return Scopes.scopeFor(allElementsToPlaceInTheScope)
	}

	// Filter called by super of this scope provider. Is applied just before returning.
	override protected IScope filterScopeForNavigation(IScope scope, GExpression exp) {

		// Removing the ECL Events in case the expression is within an Execution Function.
		if (EcoreUtil2.getContainerOfType(exp, ExecutionFunction) != null) {
			return new FilteringScope(scope,
				new Predicate<IEObjectDescription>() {
					override public boolean apply(IEObjectDescription input) {
						if (input.EClass.name.equals("ECLDefCS")) {
							return false
						} else {
							return true
						}
					}
				});

		}

		// Removing the EOperations in case the expression is within a Feedback Consequence.
		if (EcoreUtil2.getContainerOfType(exp, FeedbackConsequence) != null) {
			return new FilteringScope(
				scope,
				new Predicate<IEObjectDescription>() {
					override public boolean apply(IEObjectDescription input) {
						if (input.EClass.name.equals("EOperation")) {
							return false
						} else {
							return true
						}
					}
				}
			)
		}

		return scope
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	def IScope scope_GReferenceExpression_referencedEObject(GReferenceExpression exp, EReference ref) {
		if (EcoreUtil2.getContainerOfType(exp, UnfoldingStrategy) != null) {

			// Expression inside an Instantiation Rule for the Unfolding Strategy of a Composite DSE.
			val strategy = EcoreUtil2.getContainerOfType(exp, UnfoldingStrategy)
			return Scopes.scopeFor(strategy.localVariables)
		} else if (EcoreUtil2.getContainerOfType(exp, FeedbackPolicy) != null) {
			if (EcoreUtil2.getContainerOfType(exp, FeedbackConsequence) != null) {

				// Expression for a Feedback Consequence.
				val dse = EcoreUtil2.getContainerOfType(exp, AtomicDomainSpecificEvent)
				val contextName = GELHelper.parseContextName(
					(dse.uponMoccEvent as EclEvent).eventReference.owningClassifierContextDecl)
				val eclassesWithTheRightName = super.delegateGetScope(exp, ref).allElements.filter [ description |
					if (description.EObjectOrProxy instanceof EClass) {
						(description.EObjectOrProxy as EClass).name.equals(contextName)
					} else {
						false
					}
				].map [ description |
					description.EObjectOrProxy
				]

				return Scopes.scopeFor(eclassesWithTheRightName)
			} else {

				// Expression inside a Feedback Filter.
				val dse = EcoreUtil2.getContainerOfType(exp, AtomicDomainSpecificEvent)
				return Scopes.scopeFor(Collections.singletonList(dse.executionFunction.result))
			}
		} else {

			// Expression to designate the EOperation
			val dse = EcoreUtil2.getContainerOfType(exp, AtomicDomainSpecificEvent)
			val contextName = GELHelper.parseContextName(
				(dse.uponMoccEvent as EclEvent).eventReference.owningClassifierContextDecl)
			val eclassesWithTheRightName = super.delegateGetScope(exp, ref).allElements.filter [ description |
				if (description.EObjectOrProxy instanceof EClass) {
					(description.EObjectOrProxy as EClass).name.equals(contextName)
				} else {
					false
				}
			].map [ description |
				description.EObjectOrProxy
			]

			return Scopes.scopeFor(eclassesWithTheRightName)
		}
	}

	def IScope scope_LocalVariable_type(LocalVariable localVariable, EReference ref) {
		super.delegateGetScope(localVariable, ref)
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	def IScope scope_SingleArgument_argument(SingleArgument singleArgument, EReference ref) {
		val dseReference = EcoreUtil2.getContainerOfType(singleArgument, DomainSpecificEventReference)
		val referencedDseContext = GELHelper.determineContextOfDomainSpecificEvent(dseReference.referencedDse)
		val owningDse = EcoreUtil2.getContainerOfType(singleArgument, CompositeDomainSpecificEvent)
		val accessibleVariables = owningDse.unfoldingStrategy.localVariables
		val localVariablesWithCorrectType = new ArrayList<LocalVariable>()
		val firstContainerOfTypeMultipleTargets = EcoreUtil2.getContainerOfType(singleArgument, MultipleArguments)

		if (firstContainerOfTypeMultipleTargets == null) {

			// Either this is a call with one argument, so we just check the context is only one classifier and only add in scope the variables of that type
			for (EClassifier classifier : referencedDseContext) {

				// There should only be 1 classifier here anyway...
				for (LocalVariable variable : accessibleVariables) {
					if (variable.type.equals(classifier) || variable.type.name.equals(classifier.name)) {
						localVariablesWithCorrectType.add(variable)
					}
				}
			}
		} else {

			// There are multiple arguments and this is the tail (last argument). ??? Maybe when writing this is not the case ...
			val EClassifier classifier = referencedDseContext.last
			for (LocalVariable variable : accessibleVariables) {
				if (variable.type.equals(classifier) || variable.type.name.equals(classifier.name)) {
					localVariablesWithCorrectType.add(variable)
				}
			}
		}
		return Scopes.scopeFor(localVariablesWithCorrectType)
	}

	def IScope scope_MultipleArguments_head(MultipleArguments multipleArguments, EReference ref) {
		val firstContainerOfTypeMultipleTargets = EcoreUtil2.getContainerOfType(multipleArguments, MultipleArguments)
		val dseReference = EcoreUtil2.getContainerOfType(multipleArguments, DomainSpecificEventReference)
		val referencedDseContext = GELHelper.determineContextOfDomainSpecificEvent(dseReference.referencedDse)
		val localVariablesWithCorrectType = new ArrayList<LocalVariable>()
		val owningDse = EcoreUtil2.getContainerOfType(multipleArguments, CompositeDomainSpecificEvent)
		val accessibleVariables = owningDse.unfoldingStrategy.localVariables

		if (firstContainerOfTypeMultipleTargets == null) {

			// It is the first argument.
			val EClassifier classifier = referencedDseContext.get(0)
			for (LocalVariable variable : accessibleVariables) {
				if (variable.type.equals(classifier) || variable.type.name.equals(classifier.name)) {
					localVariablesWithCorrectType.add(variable)
				}
			}
		} else {

			// It is not the first argument. We need to find in which index we are.
			var numberOfOwningMultipleTargets = findNumberOfOwningMultipleArguments(multipleArguments)

			val EClassifier classifier = referencedDseContext.get(numberOfOwningMultipleTargets)
			for (LocalVariable variable : accessibleVariables) {
				if (variable.type.equals(classifier) || variable.type.name.equals(classifier.name)) {
					localVariablesWithCorrectType.add(variable)
				}
			}

		}
		return Scopes.scopeFor(localVariablesWithCorrectType)
	}

	def private int findNumberOfOwningMultipleArguments(MultipleArguments mt) {
		val owningMultipleTargets = mt.eContainer
		if (owningMultipleTargets != null && owningMultipleTargets instanceof MultipleArguments) {
			return 1 + findNumberOfOwningMultipleArguments(owningMultipleTargets as MultipleArguments)
		} else {
			return 0
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
