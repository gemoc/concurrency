/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S laboratory - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.moccml.constraint.ccslkernel.solver.extension.statemachine;



import org.eclipse.gemoc.moccml.constraint.ccslmoc.model.moccml.moccml.StateMachineRelationDefinition;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.ExternalRelationDefinition;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.RelationDeclaration;
import fr.inria.aoste.timesquare.ccslkernel.modelunfolding.AbstractConcreteMapping;
import fr.inria.aoste.timesquare.ccslkernel.solver.ISolverElement;
import fr.inria.aoste.timesquare.ccslkernel.solver.exception.SolverException;
import fr.inria.aoste.timesquare.ccslkernel.solver.extension.ISolverRelationFactory;
import fr.inria.aoste.timesquare.ccslkernel.solver.relation.AbstractWrappedRelation;

public class StateMachineRelationDefinitionFactory implements ISolverRelationFactory {

	@Override
	public boolean canHandle(RelationDeclaration declaration, ExternalRelationDefinition definition) {
		if (! (definition instanceof StateMachineRelationDefinition)) {
			return false;
		}
//		boolean leftFound = false, rightFound = false;
//		for (AbstractEntity parameter : declaration.getParameters()) {
//			if (parameter.getName().compareTo("AlternatesLeftClock") == 0)
//				leftFound = true;
//			else if (parameter.getName().compareTo("AlternatesRightClock") == 0)
//				rightFound = true;
//		}
		return true;
	}

	@Override
	public AbstractWrappedRelation  createRelation(RelationDeclaration declaration,
			ExternalRelationDefinition definition,
			AbstractConcreteMapping<ISolverElement> context)
			throws SolverException {
		
		StateMachineRelationDefinition modelSTS = (StateMachineRelationDefinition)definition;
		
		
		/**
		 * TODO: add management of classical expressions contained in modelSTS.getConcreteEntities()
		 */
		
		StateMachineRelationDefinitionSemantics semanticSTS = new StateMachineRelationDefinitionSemantics(modelSTS, context);
		
//		Map<AbstractEntity, SolverElement> 
//		
//		boolean leftClockDefined = false, rightClockDefined = false;
//		for (AbstractEntity parameter : declaration.getParameters()) {
//			SolverElement value = context.getLocalValue(parameter);
//			if (parameter.getName().compareTo("AlternatesLeftClock") == 0
//					&& value instanceof SolverClock) {
//				semanticSTS.setLeftClock((SolverClock) value);
//				leftClockDefined = true;
//				((SolverClock) value).incRefCount();
//			}
//			if (parameter.getName().compareTo("AlternatesRightClock") == 0
//					&& value instanceof SolverClock) {
//				semanticSTS.setRightClock((SolverClock) value);
//				rightClockDefined = true;
//				((SolverClock) value).incRefCount();
//			}
//		}
//		if (!leftClockDefined) {
//			throw new UnboundAbstract("BlackBoxAlternates: left clock is undefined");
//		}
//		if (!rightClockDefined) {
//			throw new UnboundAbstract("BlackBoxAlternates: right clock is undefined");
//		}
		return semanticSTS;
	}



}
