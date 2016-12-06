/**
 * Copyright (c) 2012-2016 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Stephen Creff - ENSTA Bretagne [stephen.creff@ensta-bretagne.fr]
 *   Papa Issa Diallo - ENSTA Bretagne [papa_issa.diallo@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */
package org.gemoc.mocc.transformations.ecl2mtl.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.Class;
import org.eclipse.ocl.pivot.Operation;
import org.eclipse.ocl.pivot.Property;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.xtext.basecs.ConstraintCS;
import org.eclipse.ocl.xtext.basecs.PrimitiveTypeRefCS;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.ContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.DefCS;
import org.eclipse.ocl.xtext.completeoclcs.PackageDeclarationCS;
import org.eclipse.ocl.xtext.essentialoclcs.CallExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpSpecificationCS;
import org.eclipse.ocl.xtext.essentialoclcs.InfixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetVariableCS;
import org.eclipse.ocl.xtext.essentialoclcs.NestedExpCS;
import org.gemoc.mocc.ccslmoc.model.moccml.StateMachineRelationDefinition;
import org.gemoc.mocc.ccslmoc.model.moccml.StateRelationBasedLibrary;
import org.gemoc.mocc.transformations.ecl2mtl.libLoader.LibLoader;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.BasicType.IntegerElement;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.ConcreteEntity;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.ExpressionLibrary;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.Library;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.RelationDeclaration;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.RelationDefinition;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.RelationLibrary;
import fr.inria.aoste.timesquare.ecl.ecl.ECLDefCS;
import fr.inria.aoste.timesquare.ecl.ecl.ECLDocument;
import fr.inria.aoste.timesquare.ecl.ecl.ECLExpression;
import fr.inria.aoste.timesquare.ecl.ecl.ECLRelation;
import fr.inria.aoste.timesquare.ecl.ecl.EventType;
import fr.inria.aoste.timesquare.ecl.ecltoqvto.helper.helperNsURI;

/**
 * Services to go through the ECL models
 * <br/>FIXME: this is a first version of the services
 * <br/>add comments,
 * <br/>test more,
 * @author Stfun
 *
 */
public class EclServices {
	private helperNsURI theHelper = new helperNsURI();
	
	public String getMoCIDFromFirstLib(ECLDocument document){
		
		//StateRelationBasedLibrary lib = null;
		
		for (fr.inria.aoste.timesquare.ecl.ecl.ImportStatement st : document.getImports())
		{
			if(st.toString().contains("moccml"))
			{
				//lib = LibLoader.loadMoCMLLibrary(document.getImports().get(0));
				StateRelationBasedLibrary lib = LibLoader.loadMoCMLLibrary(st);
				// Return first lib name.
				if(lib!=null){
					return lib.getName();
				}
			}
		}
		return null;
	}
	
	public EList<String> getContextFullLabels(ECLDocument document){
		EList<String> result = new BasicEList<String>();	
		for (Iterator<ContextDeclCS> iterator = getContexts(document).iterator(); iterator.hasNext();) {
			ContextDeclCS c = iterator.next();
			String cLabel = ((Package)((PackageDeclarationCS)c.eContainer()).getPivot()).getName()+"::"+((org.eclipse.ocl.pivot.Class)c.getPivot()).getName();
			if (!result.contains(cLabel)) {
				result.add(cLabel);
			}
		}
		return result;
	}
	
	public EList<ContextDeclCS> getContexts(ECLDocument document){
		EList<ContextDeclCS> result = new BasicEList<>();
		for (Iterator<ContextDeclCS> iterator = getAllContextOccurences(document).iterator(); iterator.hasNext();) {
			ContextDeclCS contextDeclCS = iterator.next();
			if (!result.contains(contextDeclCS)) {
				result.add(contextDeclCS);
			}	
		}	
		return result;
	}
	
//	public EList<String> getContextLabels(ECLDocument document){
//		EList<String> result = new BasicEList<>();
//		for (Iterator<ContextDeclCS> iterator = getAllContextOccurences(document).iterator(); iterator.hasNext();) {
//			ContextDeclCS contextDeclCS = iterator.next();
//			String name = ((org.eclipse.ocl.pivot.Class)contextDeclCS.getPivot()).getName();
//			if (!result.contains(name)) {
//			result.add(name);
//			}	
//	}	
//		return result;
//	}
	
	public EList<String> getContextLabels(ECLDocument document, String root){
		EList<String> result = new BasicEList<>();
		String [] tab = new String[3];
		tab = root.split("::");
		String name = "";
		for (Iterator<ContextDeclCS> iterator = getAllContextOccurences(document).iterator(); iterator.hasNext();) {
			ContextDeclCS contextDeclCS = iterator.next();
			ClassifierContextDeclCS _contextDeclCS = (ClassifierContextDeclCS) contextDeclCS;
			if(tab.length>1)
				name = tab[0] + "::"+_contextDeclCS.getReferredClass().getName();
			else
				//name = ((org.eclipse.ocl.pivot.Class)contextDeclCS.getPivot()).getName();
				name = ((org.eclipse.ocl.pivot.Class)contextDeclCS.getPivot()).toString();
			if (!result.contains(name)) {
				result.add(name);
			}	
		}	
		return result;
	}
	
	public EList<ContextDeclCS> getAllContextOccurences(ECLDocument document){
		EList<ContextDeclCS> result = new BasicEList<>();
		for (Iterator<PackageDeclarationCS> iterator = document.getOwnedPackages().iterator(); iterator.hasNext();) {
			PackageDeclarationCS p = iterator.next();
			for (Iterator<ContextDeclCS> iterator2 = p.getOwnedContexts().iterator(); iterator2.hasNext();) {
				ContextDeclCS c = iterator2.next();
				result.add(c);
			}
		}	
		return result;
	}
	
	public EList<String> getAllEvents(ECLDocument document){
		EList<String> result = new BasicEList<>();
		for (Iterator<ContextDeclCS> iterator = getAllContextOccurences(document).iterator(); iterator.hasNext();) {
			ContextDeclCS c = iterator.next();
			result.addAll(getEvents(c));
		}
		return result;
	}
	
	private String getDeclaredEvents(ContextDeclCS context){
		StringBuilder sb = new StringBuilder();
		if (context instanceof ClassifierContextDeclCS) {
			ClassifierContextDeclCS cCls = (ClassifierContextDeclCS) context;
			for (Iterator<DefCS> iterator2 = cCls.getOwnedDefinitions().iterator(); iterator2
						.hasNext();) {
				DefCS def = iterator2.next();
				if (def.getOwnedType() instanceof EventType) {	
					if(def instanceof ECLDefCS && ((ECLDefCS)def).getCondition()!=null){
						sb.append("[if(" );
						sb.append(substituteNonAcceleoOperation(((ECLDefCS)def).getCondition().toString()));
						sb.append(") ]" );
						sb.append("system addClocks: #(" );
						sb.append(def.getName());
						sb.append("[element.name/]");
						sb.append(").");
						sb.append("[/if]");
						sb.append(System.getProperty("line.separator"));
					}else{
						sb.append("system addClocks: #(" );
						sb.append(def.getName());
						sb.append("[element.name/]");
						sb.append(").");
						sb.append(System.getProperty("line.separator"));
					}
				}				
			}	
		}
		return sb.toString();
	}
	
	public String getLabel(ContextDeclCS context){
		return ((org.eclipse.ocl.pivot.Class)context.getPivot()).getName();
	}
	
	public EList<String> getEvents(ContextDeclCS context){
		EList<String> result = new BasicEList<>();
		if (context instanceof ClassifierContextDeclCS) {
			ClassifierContextDeclCS cCls = (ClassifierContextDeclCS) context;
			for (Iterator<DefCS> iterator2 = cCls.getOwnedDefinitions().iterator(); iterator2
					.hasNext();) {
				DefCS def = iterator2.next();
				if (def.getOwnedType() instanceof EventType) {
					result.add(def.getName());
				}				
			}	
		}
		return result;
	}
	
	public EList<String> getEventsWithDSA(ContextDeclCS context){
		EList<String> result = new BasicEList<>();
		if (context instanceof ClassifierContextDeclCS) {
			ClassifierContextDeclCS cCls = (ClassifierContextDeclCS) context;
			for (Iterator<DefCS> iterator2 = cCls.getOwnedDefinitions().iterator(); iterator2
					.hasNext();) {
				DefCS def = iterator2.next();
				if (def.getOwnedType() instanceof EventType) {
					if(def.getOwnedSpecification().toString().equals("self")==false)
					result.add(def.getName());
				}				
			}	
		}
		return result;
	}
	
	public EList<String> getEventsWithoutDSA(ContextDeclCS context){
		EList<String> result = new BasicEList<>();
		if (context instanceof ClassifierContextDeclCS) {
			ClassifierContextDeclCS cCls = (ClassifierContextDeclCS) context;
			for (Iterator<DefCS> iterator2 = cCls.getOwnedDefinitions().iterator(); iterator2
					.hasNext();) {
				DefCS def = iterator2.next();
				if (def.getOwnedType() instanceof EventType) {
					if(def.getOwnedSpecification().toString().equals("self")==true)
					result.add(def.getName());
				}				
			}	
		}
		return result;
	}
	
	
	public EList<String> getAllEvents(ECLDocument document, String contextName){
		EList<String> result = new BasicEList<>();
		result.addAll(getEventsDSA(document, contextName)); // TODO: Supposedly the events for which Execution Functions are defined, see method getEventsDSA
		return result;
	}
	
	public String getExpressionName(ECLDocument document, String contextName, String eventName){
		for (ContextDeclCS contextDeclCS : getAllContextOccurences(document)) {
			if (((org.eclipse.ocl.pivot.Class)contextDeclCS.getPivot()).toString().equals(contextName)) {
				EList<ConstraintCS> invList = getInvariants(contextDeclCS);
				for (ConstraintCS constraintCS : invList) {
					EList<LetExpCS> lst = new BasicEList<>();
					getLetRelation(((ExpSpecificationCS)constraintCS.getOwnedSpecification()).getOwnedExpression(), lst);
					for (LetExpCS letExpCS : lst) {
						for(LetVariableCS letVariableCS :letExpCS.getOwnedVariables()){
							if (letVariableCS.getOwnedType() instanceof EventType) {
								if (letVariableCS.getName().equalsIgnoreCase(eventName)) {
									return ((ECLExpression)letVariableCS.getOwnedInitExpression()).getType().getName();
								}
							} 
						}
					}
				}
			}
		}
		return "error in getExpressionName";
	}
	
	
	public String printListedClockParameters(ECLDocument document, String contextName, String eventName){
		for (ContextDeclCS contextDeclCS : getAllContextOccurences(document)) {
			if (((org.eclipse.ocl.pivot.Class)contextDeclCS.getPivot()).toString().equals(contextName)) {
				EList<ConstraintCS> invList = getInvariants(contextDeclCS);
				for (ConstraintCS constraintCS : invList) {
					EList<LetExpCS> lst = new BasicEList<>();
					getLetRelation(((ExpSpecificationCS)constraintCS.getOwnedSpecification()).getOwnedExpression(), lst);
					for (LetExpCS letExpCS : lst) {
						for(LetVariableCS letVariableCS :letExpCS.getOwnedVariables()){
							if (letVariableCS.getOwnedType() instanceof EventType) {
								if (letVariableCS.getName().equalsIgnoreCase(eventName)) {
									return getClockNamesListedAndSepBySpace(letVariableCS);
								}
							}
						}
					}
				}
			}
		}
		return "error in printListedClockParameters";
	}
	
	public String printListedClockParametersSepByDot(ECLDocument document, String contextName, String eventName){
		for (ContextDeclCS contextDeclCS : getAllContextOccurences(document)) {
			if (((org.eclipse.ocl.pivot.Class)contextDeclCS.getPivot()).getName().equals(contextName)) {
				EList<ConstraintCS> invList = getInvariants(contextDeclCS);
				for (ConstraintCS constraintCS : invList) {
					EList<LetExpCS> lst = new BasicEList<>();
					getLetRelation(((ExpSpecificationCS)constraintCS.getOwnedSpecification()).getOwnedExpression(), lst);
					for (LetExpCS letExpCS : lst) {
						for(LetVariableCS letVariableCS :letExpCS.getOwnedVariables()){
							if (letVariableCS.getOwnedType() instanceof EventType) {
								if (letVariableCS.getName().equalsIgnoreCase(eventName)) {
									return getClockNamesListedAndSepByDot(letVariableCS);
								}
							}
						}
					}
				}
			}
		}
		return "error in printListedClockParametersSepByDot";
	}
	
	public String getAllInternalEventsAsString(ECLDocument document, String contextName){
		StringBuilder sb = new StringBuilder();
		for(LetVariableCS letVariableCS : getAllInternalEvents(document, contextName)){
			if(!processVariableExpression(letVariableCS).equals("")){
				sb.append("[if ( ");
				sb.append(processVariableExpression(letVariableCS));
				sb.append("->size()>1) ]");
				sb.append("system addInternalClocks: ");
				sb.append("#("+letVariableCS.getName() + "[element.name/]).");
				sb.append("[/if]");	
				sb.append(System.getProperty("line.separator"));
			}else{
				sb.append("system addInternalClocks: ");
				sb.append("#("+letVariableCS.getName() + "[element.name/]).");
				sb.append(System.getProperty("line.separator"));
			}
			
			// system addInternalClocks: #([for (e : String | anECLDocument.getAllInternalEventsAsString(cDecl))][e/][ '[' /]element.name /[ ']' /] [/for]).
		}
		return sb.toString();
	}
	
	public EList<String> getAllInternalEventsListAsString(ECLDocument document, String contextName){
		EList<String> result = new BasicEList<>();
		for(LetVariableCS letVariableCS : getAllInternalEvents(document, contextName)){
			result.add(letVariableCS.getName());
		}
		return result;
	}
	
	public EList<LetVariableCS> getAllInternalEvents(ECLDocument document, String contextName){
		EList<LetVariableCS> result = new BasicEList<>();
		//add internal events from let expression
		for (ContextDeclCS contextDeclCS : getAllContextOccurences(document)) {
			if (((org.eclipse.ocl.pivot.Class)contextDeclCS.getPivot()).toString().equals(contextName)) {
				EList<ConstraintCS> invList = getInvariants(contextDeclCS);
				for (ConstraintCS constraintCS : invList) {
					EList<LetExpCS> lst = new BasicEList<>();
					getLetRelation(((ExpSpecificationCS)constraintCS.getOwnedSpecification()).getOwnedExpression(), lst);
					for (LetExpCS letExpCS : lst) {
						for(LetVariableCS letVariableCS :letExpCS.getOwnedVariables()){
							if (letVariableCS.getOwnedType() instanceof EventType) {
								result.add(letVariableCS);
							}
						}
					}
				}
			}
			
		}
		
		// add all events that does not have a DSA function attached
		//Vincent this is only used a priori in expression, is it possible to have other things than lets:new event?: result.addAll(getEventsWithoutDSA(document, contextName)); // Only the events without Execution Functions defined
		
		return result;
	}
	
	
	public boolean hasInternalEvents(ECLDocument document, String contextName){
		//add internal events from let expression
		for (ContextDeclCS contextDeclCS : getAllContextOccurences(document)) {
			if (((org.eclipse.ocl.pivot.Class)contextDeclCS.getPivot()).toString().equals(contextName)) {
				EList<ConstraintCS> invList = getInvariants(contextDeclCS);
				for (ConstraintCS constraintCS : invList) {
					EList<LetExpCS> lst = new BasicEList<>();
					getLetRelation(((ExpSpecificationCS)constraintCS.getOwnedSpecification()).getOwnedExpression(), lst);
					for (LetExpCS letExpCS : lst) {
						for(LetVariableCS letVariableCS :letExpCS.getOwnedVariables()){
							if (letVariableCS.getOwnedType() instanceof EventType) {
								return true;
							}
						}
					}
				}
			}
			
		}
		return false;
	}		
	
	public EList<String> getEvents(ECLDocument document, ContextDeclCS context){
		EList<String> result = new BasicEList<>();
		
		for (Iterator<ContextDeclCS> iterator = getAllContextOccurences(document).iterator(); iterator.hasNext();) {
			ContextDeclCS c = iterator.next();
			if (((org.eclipse.ocl.pivot.Class)c.getPivot()).getName().equals(((org.eclipse.ocl.pivot.Class)context.getPivot()).getName())) {
				result.addAll(getEvents(c));
			}
		}
		return result;
	}
	
	public EList<String> getEvents(ECLDocument document, String contextName){
		EList<String> result = new BasicEList<>();
		
		for (Iterator<ContextDeclCS> iterator = getAllContextOccurences(document).iterator(); iterator.hasNext();) {
			ContextDeclCS c = iterator.next();
			if (((org.eclipse.ocl.pivot.Class)c.getPivot()).getName().equals(contextName)) {
				result.addAll(getEvents(c)); 
				//result.addAll(getEventsWithDSA(c)); 
			}
		}
		return result;
	}
	
	
	public boolean hasEventsDSA(ECLDocument document, String contextName){
		for (Iterator<ContextDeclCS> iterator = getAllContextOccurences(document).iterator(); iterator.hasNext();) {
			ContextDeclCS c = iterator.next();
			if (isPivotClassKindOf(((org.eclipse.ocl.pivot.Class)c.getPivot()),contextName)) {
				if(getEvents(c).size()>0)
					return true;
			}
		}
		return false;
	}
	
	public EList<String> getEventsDSA(ECLDocument document, String contextName){
		EList<String> result = new BasicEList<>();
		
		for (Iterator<ContextDeclCS> iterator = getAllContextOccurences(document).iterator(); iterator.hasNext();) {
			ContextDeclCS c = iterator.next();
			if (isPivotClassKindOf(((org.eclipse.ocl.pivot.Class)c.getPivot()),contextName)) {
				result.add(getDeclaredEvents(c)); 
				//result.addAll(getEventsWithDSA(c)); // Used when we want to have only the events with DSA 
			}
		}
		return result;
	}
	
	private boolean isPivotClassKindOf(org.eclipse.ocl.pivot.Class pivot, String contextName){
		if ((pivot.getOwningPackage() + "::" + pivot.getName()).equals(contextName)) {
			return true;
		}
		if (pivot.getName().equals(contextName)) {
			return true;
		} 
		else{
			return false;
		}
	}
	
	public EList<String> getEventsWithoutDSA(ECLDocument document, String contextName){
		EList<String> result = new BasicEList<>();
		
		for (Iterator<ContextDeclCS> iterator = getAllContextOccurences(document).iterator(); iterator.hasNext();) {
			ContextDeclCS c = iterator.next();
			if (((org.eclipse.ocl.pivot.Class)c.getPivot()).getName().equals(contextName)) { 
				result.addAll(getEventsWithoutDSA(c)); 
			}
		}
		return result;
	}
	
	public String getListedEventsSepByDot(ECLDocument document, String contextName){
		StringBuilder sb = new StringBuilder(16);
		for (Iterator<String> iterator = getEvents(document, contextName).iterator(); iterator.hasNext();) {
			String e = iterator.next();
			sb.append(e).append("[element.name/]");
			if (iterator.hasNext()) {
				sb.append(". ");
			}
		}
		return sb.toString();
	}
	
	public EList<ConstraintCS> getInvariants(ContextDeclCS context){
		if (context instanceof ClassifierContextDeclCS) {
			ClassifierContextDeclCS cCls = (ClassifierContextDeclCS) context;
			return cCls.getOwnedInvariants();	
		}
		return null;
	}
	
	public EList<ConstraintCS> getInvariants(ECLDocument document, String contextName){
		EList<ConstraintCS> result = new BasicEList<>();
		String [] splitContexName = new String [3];
		String cname = "";
		splitContexName = contextName.split("::");
		if(splitContexName.length>1)
			cname = splitContexName[1];
		else
			cname = contextName;
		for (Iterator<ContextDeclCS> iterator = getAllContextOccurences(document).iterator(); iterator.hasNext();) {
			ContextDeclCS c = iterator.next();
			if (((org.eclipse.ocl.pivot.Class)c.getPivot()).getName().equals(cname)) {
				result.addAll(getInvariants(c));
			}
		}
		return result;
	}
	
	public String getLibraryName(ConstraintCS inv){
		
		if (inv.getOwnedSpecification()!=null) {
			if (!(inv.getOwnedSpecification() instanceof ExpSpecificationCS)) {
				return "TODO";
			}
			ECLRelation rel = getECLRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression());
			
			if (rel!=null) {
				return ((Library)((RelationLibrary)rel.getType().eContainer()).eContainer()).getName();
			}
			return "TODO: complete EclServices.java, ConstraintCS.getLibraryName() for expression type " +((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression().eClass().getName();

		}
		return "TODO";
	}
	
	public String getLibraryName(LetVariableCS var){
		return ((Library)((ExpressionLibrary)((ECLExpression)var.getOwnedInitExpression()).getType().eContainer()).eContainer()).getName();
	}
	
	public String getRelationName(LetVariableCS var){
		return ((ECLExpression)var.getOwnedInitExpression()).getType().getName().toString();
	}
	
	public String getClockNamesListedAndSepByDot(LetVariableCS var){
		return getClockNamesListedAndSepBySep(var, ". ");
	}
	
	public String getClockNamesListedAndSepBySpace(LetVariableCS var){
		return getClockNamesListedAndSepBySep(var, " ");
	}
	
	public String getClockIterator(ECLDocument document, String contextName, String eventName){
		
		for (ContextDeclCS contextDeclCS : getAllContextOccurences(document)) {
			if (((org.eclipse.ocl.pivot.Class)contextDeclCS.getPivot()).toString().equals(contextName)) {
				EList<ConstraintCS> invList = getInvariants(contextDeclCS);
				for (ConstraintCS constraintCS : invList) {
					EList<LetExpCS> lst = new BasicEList<>();
					getLetRelation(((ExpSpecificationCS)constraintCS.getOwnedSpecification()).getOwnedExpression(), lst);
					for (LetExpCS letExpCS : lst) {
						for(LetVariableCS letVariableCS :letExpCS.getOwnedVariables()){
							if (letVariableCS.getOwnedType() instanceof EventType) {
								if (letVariableCS.getName().equalsIgnoreCase(eventName)) {
									return extractMultipleClockConditionFromClockExpression(letVariableCS);
								}
							}
						}
					}
				}
			}
		}
		
		return "";
	}
	
	private String extractMultipleClockConditionFromClockExpression(LetVariableCS letVariableCS){
		ECLExpression exp = (ECLExpression)letVariableCS.getOwnedInitExpression();
		if(exp.getParameters().size()>1){
			return "true";
		}else{
			return processVariableExpression(letVariableCS) + "->size()>1";
		}
	}
	
	
	/**
	 * From a Let expression create a String expression formalized for acceleo
	 * @param variable
	 * @return
	 */
	private String processVariableExpression(LetVariableCS variable){
		StringBuilder sb = new StringBuilder(16);
		ECLExpression exp = (ECLExpression)variable.getOwnedInitExpression();
		for (int i = 0; i < exp.getParameters().size(); i++) {
			ExpCS e = exp.getParameters().get(i);
			//e.
			if (e.getPivot().toString().contains("->collect")) {
				//[for (ne : NamedElement | element.allocatedAgents.oclAsType(Agent))] isExecuting[ne.name/] [/for]
				String str = getFullNamespaceOfExpression(e).replace("self.", "element.");
				String type = str.substring(str.lastIndexOf("oclAsType("), str.length());
				sb.append(str.substring(0, str.lastIndexOf(".")));
			}/* else{
				String str = getFullNamespaceOfExpression(e).replace("self.", "element.");
				sb.append(e);
			}*/
		}

		addSetOfClock( variable);
		return sb.toString().replace("[?]", "");
	}
	
	
	/**
	 * From a Let expression create a String expression formalized for acceleo
	 * @param variable
	 * @return
	 */
	private String processFirstVariableExpression(LetVariableCS variable){
		String result = processVariableExpression(variable);
		return result+"->first().name";
	}
	
	private List<LetVariableCS> setOfClocks = new ArrayList<LetVariableCS>();
	
	
	/**
	 * Add an set of clock
	 * @param variable
	 * @return
	 */
	private void addSetOfClock(LetVariableCS variable){
		if(!setOfClocks.contains(variable)){
			setOfClocks.add(variable);
		}
	}
	
	/**
	 * Return the first clock of set of clock
	 * @param variable
	 * @return
	 */
	public String firstClockOfSetOfClock(LetVariableCS variable){
		for(LetVariableCS existingVar : setOfClocks){
			if(existingVar.equals(variable)){
				return processFirstVariableExpression(variable);
			}
		}
		return "";
	}
	
	/**
	 * Return variable corresponding to the clock name
	 * @param variable
	 * @return
	 */
	public LetVariableCS getOwnedVariablesFromSetOfClock(String clockName){
		for(LetVariableCS existingVar : setOfClocks){
			if(existingVar.getName().equals(clockName)){
				return existingVar;
			}
		}
		return null;
	}

	/**
	 * Return the last parameter of an expression.
	 * @param exp
	 * @return
	 */
	private ExpCS getLastParameter(ExpCS exp){
		if(exp instanceof InfixExpCS){
			InfixExpCS infixExp = (InfixExpCS)exp;
			//TODO: here one should iterate over all left and right expressions
		return theHelper.getAllContainedExpression(infixExp).get(theHelper.getAllContainedExpression(infixExp).size()-1);
		}else if (exp instanceof ECLExpression){
			ECLExpression eclExp = (ECLExpression)exp;
			return getLastParameter(eclExp.getParameters().get(0));
		}else if (exp instanceof LetVariableCS){
			LetVariableCS varExp = (LetVariableCS)exp;
			return getLastParameter(varExp.getOwnedInitExpression());
		}else
			return null;
	}
	
	
	public String getClockNamesListedAndSepBySep(LetVariableCS var, String sep){
		StringBuilder sb = new StringBuilder(16);
		ECLExpression exp = (ECLExpression)var.getOwnedInitExpression();
		for (int i = 0; i < exp.getParameters().size(); i++) {
			ExpCS e = exp.getParameters().get(i);
			//e.
			if (e.getPivot().toString().contains("->collect")) {
				//[for (ne : NamedElement | element.allocatedAgents.oclAsType(Agent))] isExecuting[ne.name/] [/for]
				String str = getFullNamespaceOfExpression(e).replace("self.", "element.");
				String type = str.substring(str.lastIndexOf("oclAsType("), str.length());
				sb.append("[for (ne : ").append(type.substring(10, type.indexOf(")"))).append(" | ").append(str.substring(0, str.lastIndexOf("."))).append(")]").append(str.substring(str.lastIndexOf(".")+1, str.length())).append("[ne.name/]").append(sep).append("[/for]");
			} else {
				if (e.toString().contains("self.")) {
					if (e.toString().replace("self.", "").contains(".")) {
						//complex navigation TODO
						String str = getFullNamespaceOfExpression(e).replace("self.", "element.");//FIXME
						sb.append(str.substring(str.lastIndexOf(".")+1, str.length())).append("[").append(str.substring(0, str.lastIndexOf("."))).append(".name/]"); 
					}else {
						sb.append(getFullNamespaceOfExpression(e).replace("self.", "")).append("[element.name/]"); //FIXME UGGLY
					}
				}else {
					//parameter of type integer constant 
				}
				if (i<exp.getParameters().size()-1) {
					if (exp.getParameters().get(i+1).toString().contains("self.")) {
						sb.append(sep);
					}
				}
			}
		}
		return sb.toString().replace("[?]", "");
	}
	
	
	public String getConstantsOrLinkersListedAndSepByDot(LetVariableCS var){
		StringBuilder sb = new StringBuilder(16);
		ECLExpression exp = (ECLExpression)var.getOwnedInitExpression();
		for (int i = 0; i < exp.getParameters().size(); i++) {
			ExpCS e = exp.getParameters().get(i);
			String pivotValue = e.getPivot().toString();
			if (e.toString().contains("self.")) {
				// clocks
			}else {
				//parameter of type integer constant 
				EObject eo = var.eContainer();
				do {
					eo = eo.eContainer();
				} while (!(eo instanceof ConstraintCS));
				ConstraintCS c = (ConstraintCS)eo;
				EList<LetExpCS> lst = new BasicEList<>();
				getLetRelation(((ExpSpecificationCS)c.getOwnedSpecification()).getOwnedExpression(), lst);
				for (LetExpCS letExpCS : lst) {
					for (LetVariableCS letVarCS : letExpCS.getOwnedVariables()) {
						if (letVarCS.getName().equals(e.toString())) {
							if (letVarCS.getOwnedInitExpression().toString().contains("self.")) {
								if (letVarCS.getOwnedInitExpression().toString().replace("self.", "").contains(".")) {
									//complex navigation TODO
									sb.append("["+letVarCS.getOwnedInitExpression().toString().replace("self.", "element.")+"/]"); //FIXME
									
								}else {
									sb.append("[element."+letVarCS.getOwnedInitExpression().toString().replace("self.", "")+"/]");
								}
							}else {
								sb.append(letVarCS.getOwnedInitExpression().toString());
							}
						}
					}
				}
				if (i<exp.getParameters().size()-1) {
					if (!exp.getParameters().get(i+1).toString().contains("self.")) {
						sb.append(". ");
					}
				}
			}
		}
		return sb.toString();
	}
	
	private LetVariableCS getVarInLetExpression(ConstraintCS inv,String name){
		for(LetExpCS letExp : getLetExpressions(inv)){
			for(LetVariableCS var : letExp.getOwnedVariables()){
				if(var.getName().equals(name)){
					return var;
				}
			}
			
		}
		return null;
	}
	
	public String getClockNamesListedAndSepBySep(ConstraintCS inv, String sep){
		StringBuilder sb = new StringBuilder();
		if (inv.getOwnedSpecification()!=null) {
			if (!(inv.getOwnedSpecification() instanceof ExpSpecificationCS)) {
				return "TODO: complete EclServices.java, ConstraintCS.getClockNamesListedAndSepBySep()";
			}
			ECLRelation rel = getECLRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression());
			
			if (rel!=null) {
				for (int i = 0; i < rel.getParameters().size(); i++) {
					
					if(sb.length() != 0){
						sb.append(sep);
					}
					
					ExpCS e = rel.getParameters().get(i);
					//String pivotValue = e.getPivot().toString();//getFullNamespaceOfExpression(e);
					String pivotValue = getFullNamespaceOfExpression(e);
					
					
					if (e.getPivot().toString().contains("->collect")) {
						String str = pivotValue.replace("self.", "element.");
						String type = str.substring(str.lastIndexOf("oclAsType("), str.length());
						sb.append("[for (ne : ").append(type.substring(10, type.indexOf(")"))).append(" | ").append(str.substring(0, str.lastIndexOf("."))).append(")]").append(str.substring(str.lastIndexOf(".")+1, str.length())).append("[ne.name/] [/for]");
					}else {
						/*if (pivotValue.contains("self.")) {
							if (pivotValue.replace("self.", "").contains(".")) {
								//complex navigation TODO
								String str = pivotValue.replace("self.", "element.");//FIXME
								//
								sb.append(str.substring(str.lastIndexOf(".")+1, str.length())).append("[").append(str.substring(0, str.lastIndexOf("."))).append(".name/]"); 
							}else {
								sb.append(pivotValue.replace("self.", "")).append("[element.name/]"); //FIXME UGGLY
							}
						}else {*/
							if (pivotValue.startsWith("(")) { //clock in let
								String letID = pivotValue.substring(e.toString().indexOf("(")+1, pivotValue.lastIndexOf(")"));
								EList<LetExpCS> lst = new BasicEList<>();
								getLetRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression(), lst);
								for (LetExpCS letExpCS : lst) {
									for (LetVariableCS letVariableCS : letExpCS.getOwnedVariables()) {
										if (letVariableCS.getName().equals(letID)) {
											String str = letVariableCS.getOwnedInitExpression().toString().replace("self", "element");//FIXME
											sb.append(pivotValue.substring(pivotValue.lastIndexOf(".")+1, pivotValue.length())).append("[").append(str).append(".name/]");
										}
									}
								}
							
							}else {//only name, either parameter of type integer constant or internal clock
								EObject eo = e.eContainer();
								do {
									eo = eo.eContainer();
								} while (!(eo instanceof ConstraintCS));
								ConstraintCS c = (ConstraintCS)eo;
								EList<LetExpCS> lst = new BasicEList<>();
								getLetRelation(((ExpSpecificationCS)c.getOwnedSpecification()).getOwnedExpression(), lst);
								String variableString =pivotValue;
								for (LetExpCS letExpCS : lst) {
									for (LetVariableCS letVarCS : letExpCS.getOwnedVariables()) {
										if (e.toString().contains(letVarCS.getName())) {
											if(letVarCS.getOwnedType() instanceof PrimitiveTypeRefCS){
												variableString = pivotValue.replace(letVarCS.getName(), letVarCS.getOwnedInitExpression().toString());
											}
											
											if (letVarCS.getOwnedType() instanceof EventType) {
												if (pivotValue.contains("self.")) {
													if (pivotValue.replace("self.", "").contains(".")) {
														//complex navigation TODO
														String str = pivotValue.replace("self.", "element.");//FIXME
														sb.append(str.substring(str.lastIndexOf(".")+1, str.length())).append("[").append(str.substring(0, str.lastIndexOf("."))).append(".name/]"); 
													}else {
														sb.append(pivotValue.replace("self.", "")).append("[element.name/]"); //FIXME UGGLY
													}
												}else {
													if (sb.length()!=0) {
														sb.append(sep);
													}
													if(getOwnedVariablesFromSetOfClock(pivotValue)!=null ){
														String varExp = processVariableExpression(getOwnedVariablesFromSetOfClock(pivotValue));
														if(!processVariableExpression(getOwnedVariablesFromSetOfClock(pivotValue)).equals("")){
															sb.append("[if ( ");
															sb.append(processVariableExpression(getOwnedVariablesFromSetOfClock(pivotValue)));
															sb.append("->size()<2) ]");
															sb.append(getLastParameter(getOwnedVariablesFromSetOfClock(pivotValue)).toString());
															sb.append("[" + processFirstVariableExpression(getOwnedVariablesFromSetOfClock(pivotValue))+ "/]" );
															sb.append("[/if]");
															sb.append("[if ( ");
															sb.append(processVariableExpression(getOwnedVariablesFromSetOfClock(pivotValue)));
															sb.append("->size()>1) ]");
															sb.append(pivotValue+ "[element.name/]");
															sb.append("[/if]");
														}else{
															sb.append(pivotValue+ "[element.name/]");
														}		
													}else{
														sb.append(e.toString()).append("[element.name/]");
													}	
												}
											}
										}
									}
									
									
								//}
								}
								if (variableString.contains("self.")) {
									if (variableString.replace("self.", "").contains(".")) {
										//complex navigation TODO
										String str = variableString.replace("self.", "element.");//FIXME
										//
										sb.append(str.substring(str.lastIndexOf(".")+1, str.length())).append("[").append(str.substring(0, str.lastIndexOf("."))).append(".name/]"); 
									}else {
										sb.append(variableString.replace("self.", "")).append("[element.name/]"); //FIXME UGGLY
									}
								}
						}
							
						if (i<rel.getParameters().size()-1) {
							if (rel.getParameters().get(i+1).toString().contains("self.") || rel.getParameters().get(i+1).toString().startsWith("(")) {
								sb.append(sep);
							}
						}
					}
					
					
					
				}
				
				
				return sb.toString().replace("[?]", "");
			}
			return "TODO: complete EclServices.java, ConstraintCS.getClockNamesListedAndSepBySep()";
		}
		return "TODO: complete EclServices.java, ConstraintCS.getClockNamesListedAndSepBySep()";
	}
	
	/**
	 * This method should be used to prevent the lose of context.
	 * It appends to the name of each cast instruction the whole namespace of the Type.
	 * @param e
	 * @return
	 */
	/*private String getFullNamespaceOfExpression(ExpCS e){
		StringBuilder returned = new StringBuilder();
		if(e instanceof InfixExpCS){
			InfixExpCS infix = (InfixExpCS)e;
			for(ExpCS exp : infix.getOwnedExpression()){
				if(exp instanceof InvocationExpCS){
					InvocationExpCS invok = (InvocationExpCS) exp;
					for(NavigatingArgCS arg : invok.getArgument()){
						String replaced = invok.toString();
						replaced = replaced.replace(arg.toString(), invok.getSourceType().toString());
						returned.append(returned.toString().replace(invok.toString(), replaced));
					}
				}
			}
		}
		
		return e.getPivot().toString();
	}*/
	
	private String getFullNamespaceOfExpression(ExpCS e){
		String returned = e.toString();
		StringBuilder sb = new StringBuilder();
		if(e instanceof InfixExpCS){
			InfixExpCS infix = (InfixExpCS)e;
			for(ExpCS exp : theHelper.getAllContainedExpression(infix)){
				//TODO: check cast correctness, was InvocationExpCS
				if(exp instanceof CallExpCS){
					CallExpCS invok = (CallExpCS) exp;
					sb.append(substituteNonAcceleoOperation(invok.getOwnedPathName().toString()));
					sb.append("(");
					
					//TODO: correct this ! 
					
					
					
					
//					for(NavigatingArgCS arg : invok.getArguments()){
//						//String replaced = invok.toString();
//						//replaced = replaced.replace(arg.toString(), invok.getSourceType().toString());
//						//returned = returned.replace(invok.toString(), replaced);
//						sb.append(arg.getPrefix() != null ? arg.getPrefix() : "");  
//						sb.append(arg.getPivot() ==null || arg.getPivot().toString().contains("OclInvalid[?]") ? arg.getName() : arg.getPivot());
//						/*if(invok.getArgument().indexOf(arg) > invok.getArgument().size()-1){
//							sb.append(",");
//						}*/
//					}
					
					
					
					
					sb.append(")");
				}else{
					sb.append(exp.toString());
				}
				int index = theHelper.getAllContainedExpression(infix).indexOf(exp);
				
//				TODO: correct the following !
				
//				if(index<infix.getOwnedOperator().size())
//					sb.append(infix.getOwnedOperator().get(index).toString());
				
				
			}
		}
		return sb.toString();
	}
	
	public String getClockNamesListedAndSepBySpace(ConstraintCS inv){
		return getClockNamesListedAndSepBySep(inv, " ");
	}
	
	public List<String> getOrderedDataNames(ConstraintCS inv){
		List<String> returned = new ArrayList<String>();
		for(IntegerElement var : getIntegerVariables(inv)){
			//if(!returned.contains(var.getName()))
				returned.add(var.getName());
		}
		for(LetVariableCS var : getConstantsOrLinker(inv)){
			//if(!returned.contains(var.getName()))
				returned.add(var.getName());
		}
		
		return returned;
	}
	
	public List<LetVariableCS> getConstantsOrLinker(ConstraintCS inv){
		List<LetVariableCS> constants = new ArrayList<LetVariableCS>();
		EList<LetExpCS> lst = new BasicEList<>();
		getLetRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression(), lst);
		for (Iterator<LetExpCS> iterator = lst.iterator(); iterator.hasNext();) {
			LetExpCS expCS = iterator.next();
			EList<LetVariableCS> listVar = expCS.getOwnedVariables();
			boolean isIn = false;
			for (int i = 0; i < listVar.size(); i++) {
				LetVariableCS letVariableCS = listVar.get(i);
				if (letVariableCS.getOwnedType() instanceof  PrimitiveTypeRefCS) {
					if (((PrimitiveTypeRefCS)letVariableCS.getOwnedType()).getName().equalsIgnoreCase("Integer")) {
						isIn = false;
						ECLRelation rel = getECLRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression());
						for (ExpCS e : rel.getParameters()) {
							if (e.toString().contains(expCS.getOwnedVariables().get(0).getName())) {
								isIn=true;
							};
						}
						if (isIn) {//if in relation
							constants.add(letVariableCS);
						}
					}
				}
				
			}
		}
		return constants;
	}
	
	public List<IntegerElement> getIntegerVariables(ConstraintCS inv){
		List<IntegerElement> integers= new ArrayList<IntegerElement>();
		if (inv.getOwnedSpecification()!=null) {
			ECLRelation rel = getECLRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression());
			if (rel!=null && !(((RelationLibrary)rel.getType().eContainer()).getName().equalsIgnoreCase("kernelRelations"))) {
				RelationDefinition rd = getCorrespondingRelationDefinition(((RelationLibrary)rel.getType().eContainer()), rel.getType());
			
				if (rd!=null && rd instanceof StateMachineRelationDefinition) {
					if(((StateMachineRelationDefinition)rd).getDeclarationBlock()!=null){
						for (ConcreteEntity ce : ((StateMachineRelationDefinition)rd).getDeclarationBlock().getConcreteEntities()) {
							if (ce instanceof IntegerElement) {
								integers.add((IntegerElement) ce);
							}
						}
					}
				}
			}	
		}
		return integers;
	}
	
	
	public String getClockNamesListedAndSepByDot(ConstraintCS inv){
		return getClockNamesListedAndSepBySep(inv, ". ");
	}
	
	public String getOwnedVariablessListedAndSepByDot(ConstraintCS inv){
		StringBuilder sb = new StringBuilder();
		if (inv.getOwnedSpecification()!=null) {
			if (!(inv.getOwnedSpecification() instanceof ExpSpecificationCS)) {
				return "TODO";
			}
			ECLRelation rel = getECLRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression());
			if (rel==null) {
				return "TODO: complete EclServices.java, ConstraintCS.getOwnedVariablessListedAndSepByDot() for expression type " +((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression().eClass().getName();
			}
			if (((RelationLibrary)rel.getType().eContainer()).getName().equalsIgnoreCase("kernelRelations")) {
				return "";
			}//FIXME do it for all ccsl lib
			
			RelationDefinition rd = getCorrespondingRelationDefinition(((RelationLibrary)rel.getType().eContainer()), rel.getType());
			if (rd==null) {
				return "TODO: complete EclServices.java, ConstraintCS.getOwnedVariablessListedAndSepByDot() for expression type " +((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression().eClass().getName();
			}
			if (rd instanceof StateMachineRelationDefinition) {
				if(((StateMachineRelationDefinition)rd).getDeclarationBlock()!=null){
					for (ConcreteEntity ce : ((StateMachineRelationDefinition)rd).getDeclarationBlock().getConcreteEntities()) {
						//FIXME do it for other concreteEntity specializations
						if (ce instanceof IntegerElement) {
							if (sb.length()!=0) {
								sb.append(". ");
							}
							sb.append(((IntegerElement)ce).getValue());
						}else {
							return "TODO: complete EclServices.java, ConstraintCS.getOwnedVariablessListedAndSepByDot() for expression type " +((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression().eClass().getName();
						}
					}
				}
			}
			return sb.toString();
		}
		return "TODO";
	}
	
	private RelationDefinition getCorrespondingRelationDefinition(RelationLibrary rl, RelationDeclaration rd){
		for (RelationDefinition rdef : rl.getRelationDefinitions()) {
			if (rdef.getDeclaration().equals(rd)) {
				return rdef;
			}
		}
		return null;
	}
	
	public List<LetExpCS> getLetExpressions(ConstraintCS inv){
		EList<LetExpCS> lst = new BasicEList<>();
		getLetRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression(), lst);
		return lst;
	}
	
	public String getConstantsOrLinkersListedAndSepByDot(ConstraintCS inv){
		StringBuilder sb = new StringBuilder(16);
		EList<LetExpCS> lst = new BasicEList<>();
		getLetRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression(), lst);
		for (Iterator<LetExpCS> iterator = lst.iterator(); iterator.hasNext();) {
			LetExpCS expCS = iterator.next();
			EList<LetVariableCS> listVar = expCS.getOwnedVariables();
			boolean isIn = false;
			for (int i = 0; i < listVar.size(); i++) {
				LetVariableCS letVariableCS = listVar.get(i);
				if (letVariableCS.getOwnedType() instanceof  PrimitiveTypeRefCS) {
					if (((PrimitiveTypeRefCS)letVariableCS.getOwnedType()).getName().equalsIgnoreCase("Integer")) {
						isIn = false;
						ECLRelation rel = getECLRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression());
						for (ExpCS e : rel.getParameters()) {
							if (e.toString().contains(expCS.getOwnedVariables().get(0).getName())) {
								isIn=true;
							};
						}
						if (isIn) {//if in relation
							if (letVariableCS.getOwnedInitExpression().toString().contains("self.")) {
								if (letVariableCS.getOwnedInitExpression().toString().replace("self.", "").contains(".")) {
									//complex navigation TODO
									sb.append("["+letVariableCS.getOwnedInitExpression().getPivot().toString().replace("self.", "element.")+"/]"); //FIXME
									
								}else {
									sb.append("[element."+letVariableCS.getOwnedInitExpression().getPivot().toString().replace("self.", "")+"/]");
								}
							}else {
								sb.append(letVariableCS.getOwnedInitExpression().getPivot().toString());
							}
							if (i<listVar.size()-1) {
								sb.append(". ");
							}
						}
					}
				}
				
			}
			if (isIn &&iterator.hasNext()) {
				sb.append(". ");
			}
		}
		return sb.toString().replace("[?]", "");
	}
	
	private ECLRelation getLetRelation(ExpCS exp, EList<LetExpCS> lst){
		if (exp instanceof ECLRelation) {
			return (ECLRelation) exp;
		}
		if (exp instanceof LetExpCS) {
			lst.add((LetExpCS)exp);
			return getLetRelation(((LetExpCS)exp).getOwnedInExpression(),lst);
		}
		if (exp instanceof InfixExpCS) {
			return getLetRelation(theHelper.getAllContainedExpression(exp).get(1),lst);
		}
		return null;
	}
	
	public String getRelationName(ConstraintCS inv){
		if (inv.getOwnedSpecification()!=null) {
			if (!(inv.getOwnedSpecification() instanceof ExpSpecificationCS)) {
				return "TODO";
			}
			ECLRelation rel = getECLRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression());
			
			if (rel!=null) {
				RelationDefinition rd = getCorrespondingRelationDefinition((RelationLibrary)rel.getType().eContainer(), rel.getType());
				return rd.getName();
			}
			return "TODO: complete EclServices.java, ConstraintCS.getRelationName() for expression type " +((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression().eClass().getName();

		}
		return "TODO";
	}
	
	public String getRelationDeclName(ConstraintCS inv){
		if (inv.getOwnedSpecification()!=null) {
			if (!(inv.getOwnedSpecification() instanceof ExpSpecificationCS)) {
				return "TODO";
			}
			ECLRelation rel = getECLRelation(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression());
			
			if (rel!=null) {
				return rel.getType().getName();
			}
			return "TODO: complete EclServices.java, ConstraintCS.getRelationName() for expression type " +((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression().eClass().getName();

		}
		return "TODO";
	}
	
	private String substituteNonAcceleoOperation(String operationName){
		String result = operationName.replace("allInstances", "eAllContents");
		result = result.replace("allSubobjectsOfKind", "eAllContents");
		
		return result;
	}
	
	public String getRelationCondition(ConstraintCS inv){
		if (inv.getOwnedSpecification()!=null) {
			if (!(inv.getOwnedSpecification() instanceof ExpSpecificationCS)) {
				return "TODO";
			}
			List<ExpCS> exps = getECLCondition(((ExpSpecificationCS)inv.getOwnedSpecification()).getOwnedExpression());
			StringBuilder sb = new StringBuilder();
			for(ExpCS expCS : exps){
//				TODO: correct this !
				
				
//				sb.append((expCS instanceof BinaryOperatorCS) ? " " : "( ");	
//				sb.append(substituteNonAcceleoOperation(expCS.toString()));
//				sb.append((expCS instanceof BinaryOperatorCS) ? " " : ") ");	
				
				
				
			}
			if(sb.toString().equals("")){
				return "true";
			}else{
				return sb.toString();
			}
		}
		return "true";
	}
	
	private ECLRelation getECLRelation(ExpCS exp){
		if (exp instanceof ECLRelation) {
			return (ECLRelation) exp;
		}
		if (exp instanceof NestedExpCS) {
			return getECLRelation(((NestedExpCS) exp).getOwnedExpression());
		}
		if (exp instanceof LetExpCS) {
			return getECLRelation(((LetExpCS)exp).getOwnedInExpression());
		}
		if (exp instanceof InfixExpCS) {
			ECLRelation relation = null;
			for(ExpCS ownExp : theHelper.getAllContainedExpression(exp)){
				if(getECLRelation(ownExp)!=null){
					relation = getECLRelation(ownExp);
				}
			}
			return relation;
		}
		return null;
	}
	
	private List<ExpCS> getECLCondition(ExpCS exp){
		List<ExpCS> exps = new ArrayList<ExpCS>();
		if (exp instanceof NestedExpCS && !(((NestedExpCS)exp).getOwnedExpression() instanceof ECLRelation)) {
			exps.add(((NestedExpCS) exp).getOwnedExpression());
			return exps;
		}
		if (exp instanceof InfixExpCS) {
			for(int i =0;i<theHelper.getAllContainedExpression(exp).size(); i++){
				ExpCS ownedExp = theHelper.getAllContainedExpression(exp).get(i);
				exps.addAll(getECLCondition(ownedExp));
				
//				TODO: fix the following !!
//				if(((InfixExpCS)exp).getOwnedOperator().size()>=(i+1) && 
//						!((InfixExpCS)exp).getOwnedOperator().get(i).getName().equals("implies")){
//					exps.add(((InfixExpCS)exp).getOwnedOperator().get(i));
//				}
				
			}
		}
		return exps;
	}
	
	
	public String getNsURIToDeclare(ECLDocument document){
		StringBuilder sb = new StringBuilder(48);
		for (Iterator<PackageDeclarationCS> iterator = document.getOwnedPackages().iterator(); iterator.hasNext();) {
			PackageDeclarationCS p = iterator.next();
			//TODO: fix the following !!
//			String uri = ((Package)p.getPivot()).getNsURI().toString().replace("/extended", "");
//			sb.append("'").append(uri).append("'");
//			if (iterator.hasNext()) {
//				sb.append(",");
//			}
		}
		return sb.toString();
	}
	
	public boolean hasInternalClocks(ECLDocument document){
		EList<ContextDeclCS> contextList = getAllContextOccurences(document);
		for (ContextDeclCS contextDeclCS : contextList) {
			EList<ConstraintCS> invList = getInvariants(contextDeclCS);
			for (ConstraintCS constraintCS : invList) {
				return hasInternalClocks(constraintCS);
			}
		}
		return false;
	}
	
	public boolean hasInternalClocks(ConstraintCS constraintCS){
		EList<LetExpCS> lst = new BasicEList<>();
		getLetRelation(((ExpSpecificationCS)constraintCS.getOwnedSpecification()).getOwnedExpression(), lst);
		for (LetExpCS letExpCS : lst) {
			for(LetVariableCS letVariableCS :letExpCS.getOwnedVariables()){
				if (letVariableCS.getOwnedType() instanceof EventType) {
					return true;
				}
			}
		}
		return false;
	}
	
	public EList<String> getInternalClocks(ConstraintCS constraintCS){
		EList<String> result = new BasicEList<String>();
		EList<LetExpCS> lst = new BasicEList<>();
		getLetRelation(((ExpSpecificationCS)constraintCS.getOwnedSpecification()).getOwnedExpression(), lst);
		for (LetExpCS letExpCS : lst) {
			for(LetVariableCS letVariableCS :letExpCS.getOwnedVariables()){
				if (letVariableCS.getOwnedType() instanceof EventType) {
					result.add(letVariableCS.getName());
				}
			}
		}
		return result;
	}
	
	public EList<LetVariableCS> getInternalClockExps(ConstraintCS constraintCS){
		EList<LetVariableCS> result = new BasicEList<LetVariableCS>();
		EList<LetExpCS> lst = new BasicEList<>();
		getLetRelation(((ExpSpecificationCS)constraintCS.getOwnedSpecification()).getOwnedExpression(), lst);
		for (LetExpCS letExpCS : lst) {
			for(LetVariableCS letVariableCS :letExpCS.getOwnedVariables()){
				if (letVariableCS.getOwnedType() instanceof EventType) {
					result.add(letVariableCS);
				}
			}
		}
		return result;
	}
	
	
	
	
	public EList<String> getInternalClocks(ECLDocument document){
		EList<String> result = new BasicEList<String>();
		EList<ContextDeclCS> contextList = getAllContextOccurences(document);
		for (ContextDeclCS contextDeclCS : contextList) {
			EList<ConstraintCS> invList = getInvariants(contextDeclCS);
			for (ConstraintCS constraintCS : invList) {
				result.addAll(getInternalClocks(constraintCS));
			}
		}
		return result;
	}
	
	/***************************************New Added Rules ********************************************/
	
	public static EList<ContextDeclCS> getContextsFromPack(PackageDeclarationCS pack)
	{
		EList<ContextDeclCS> result = new BasicEList<>();
		EList<ContextDeclCS> tmp = new BasicEList<>();
		EList<String> ctmp = new BasicEList<>();
		tmp = pack.getOwnedContexts();
		
		for (ContextDeclCS c : tmp) 
		{			
			ClassifierContextDeclCS clc = (ClassifierContextDeclCS) c;
			if(ctmp.contains(clc.getReferredClass().getName())==false)
			{
				ctmp.add(clc.getReferredClass().getName());
				result.add(clc);
			}
		}	
		return result;
	}
	
	public String getEventParameters(PackageDeclarationCS pack, String elt, String ct)
	{
		StringBuilder bresult = new StringBuilder();
		EList<ContextDeclCS> contexts = new BasicEList<>();
		contexts = pack.getOwnedContexts();
		
		for(ContextDeclCS c: contexts)
		{
			if (c instanceof ClassifierContextDeclCS)
			{
				ClassifierContextDeclCS clc = (ClassifierContextDeclCS) c;
				if(clc.getReferredClass().getName().equalsIgnoreCase(ct)==true)
				{
					EList<DefCS> listdef = new BasicEList<>();
					listdef = clc.getOwnedDefinitions();
					for (Iterator<DefCS> iterator = listdef.iterator(); iterator
							.hasNext();) {
						DefCS def = (DefCS) iterator.next();
						if (def.getOwnedType() instanceof EventType)
						{
							bresult.append("[" +elt+ "/]_"+def.getName()+":in none");
							if(iterator.hasNext()) bresult.append(",");
						}
					}
					/*for(DefCS def:listdef)
					{
						if (def.getOwnedType() instanceof EventType)
							bresult.append("[" +elt+ "/]_"+def.getName()+":in none" + ",");
					}*/
				}
			}
		}
		//bresult.deleteCharAt(bresult.length()-1);
		return bresult.toString();
	}
	
	public String getEventParametersOUT(PackageDeclarationCS pack, String elt, String ct)
	{
		StringBuilder bresult = new StringBuilder();
		EList<ContextDeclCS> contexts = new BasicEList<>();
		contexts = pack.getOwnedContexts();
		
		for(ContextDeclCS c: contexts)
		{
			if (c instanceof ClassifierContextDeclCS)
			{
				ClassifierContextDeclCS clc = (ClassifierContextDeclCS) c;
				if(clc.getReferredClass().getName().equalsIgnoreCase(ct)==true)
				{
					EList<DefCS> listdef = new BasicEList<>();
					listdef = clc.getOwnedDefinitions();
					for(DefCS def:listdef)
					{
						if (def.getOwnedType() instanceof EventType)
							bresult.append("[" +elt+ "/]_"+def.getName()+":out none" + ",");
					}
				}
			}
		}
		//bresult.deleteCharAt(bresult.length()-1);
		return bresult.toString();
	}
	
	/*public String getEventParameterParDefinition(PackageDeclarationCS pack, String elt, String ct)
	{
		StringBuilder bresult = new StringBuilder();
		EList<ContextDeclCS> contexts = new BasicEList<>();
		String spacing = "   ";
		contexts = pack.getOwnedContexts();
		
		for(ContextDeclCS c: contexts)
		{
			if (c instanceof ClassifierContextDeclCS)
			{
				ClassifierContextDeclCS clc = (ClassifierContextDeclCS) c;
				if(clc.getReferredClass().getName().equalsIgnoreCase(ct)==true)
				{
					EList<String> lst_evt = new BasicEList<>();
					EList<DefCS> listdef = new BasicEList<>();
					listdef = clc.getOwnedDefinitions();
					for(DefCS def:listdef)
					{
						if (def.getOwnedType() instanceof EventType)
						{
							//bresult.append("[" +elt+ "/]_"+def.getName()+",");
							lst_evt.add("[" +elt+ "/]_"+def.getName()+",");
						}
					}
					for (Iterator<String> iterator = lst_evt.iterator(); iterator.hasNext();) {
						String input = iterator.next();
						bresult.append(input);
					}
				}
			}
		}
		//bresult.deleteCharAt(bresult.length()-1);
		return bresult.toString();
	}*/
	
	public String getEventParameterParDefinition(PackageDeclarationCS pack, String elt, String ct)
	{
		StringBuilder bresult = new StringBuilder();
		EList<ContextDeclCS> contexts = new BasicEList<>();
		contexts = pack.getOwnedContexts();
		
		for(ContextDeclCS c: contexts)
		{
			if (c instanceof ClassifierContextDeclCS)
			{
				ClassifierContextDeclCS clc = (ClassifierContextDeclCS) c;
				if(clc.getReferredClass().getName().equalsIgnoreCase(ct)==true)
				{
					EList<DefCS> listdef = new BasicEList<>();
					listdef = clc.getOwnedDefinitions();
					for (Iterator<DefCS> iterator = listdef.iterator(); iterator
							.hasNext();) {
						DefCS def = (DefCS) iterator.next();
						if (def.getOwnedType() instanceof EventType)
						{
							bresult.append("[" +elt+ "/]_"+def.getName());
							if(iterator.hasNext()) bresult.append(",");
						}
					}
					/*for(DefCS def:listdef)
					{
						if (def.getOwnedType() instanceof EventType)
							bresult.append("[" +elt+ "/]_"+def.getName()+":in none" + ",");
					}*/
				}
			}
		}
		//bresult.deleteCharAt(bresult.length()-1);
		return bresult.toString();
	}
	
	/*public String getPortDeclaration(PackageDeclarationCS pack, String elt, String ct)
	{
		StringBuilder bresult = new StringBuilder();
		EList<ContextDeclCS> contexts = new BasicEList<>();
		contexts = pack.getOwnedContexts();
		
		for (Iterator<ContextDeclCS> iterator = contexts.iterator(); iterator.hasNext();) 
		{
			ContextDeclCS c = (ContextDeclCS) iterator.next();
			ClassifierContextDeclCS clc = (ClassifierContextDeclCS) c;
				if(clc.getReferredClass().getName().equalsIgnoreCase(ct)==true)
				{
					EList<String> lst_port = new BasicEList<>();
					EList<DefCS> listdef = new BasicEList<>();
					listdef = clc.getOwnedDefinitions();
			
					if(iterator.hasNext())
					{
						for (Iterator<DefCS> iterator2 = listdef.iterator(); iterator2.hasNext();) 
						{
							DefCS defCS = (DefCS) iterator2.next();
							if (defCS.getOwnedType() instanceof EventType)
							{
								lst_port.add("[" +elt+ "/]_"+defCS.getName()+": none"+"[if (0=0)],[/if]");
								//lst_port.add("[" +elt+ "/]_"+defCS.getName());
							}
						}
						for (Iterator<String> iterator3 = lst_port.iterator(); iterator3.hasNext();) {
							String input = iterator3.next();
							bresult.append(input);
						}
					}
					else {
							for (Iterator<DefCS> iterator2 = listdef.iterator(); iterator2.hasNext();) 
							{
								DefCS defCS = (DefCS) iterator2.next();
								if(iterator2.hasNext())
								{
									if (defCS.getOwnedType() instanceof EventType)
										lst_port.add("[" +elt+ "/]_"+defCS.getName()+": none"+"[if (0=0)],[/if]"); 
								}
								else{
									if (defCS.getOwnedType() instanceof EventType)
										lst_port.add("[" +elt+ "/]_"+defCS.getName()+": none"+"[if (0=1)],[/if]"); 
								}
								
							}
							for (Iterator<String> iterator3 = lst_port.iterator(); iterator3.hasNext();) {
								String input = iterator3.next();
								bresult.append(input);
							}
						}
					
			}
		}
		return bresult.toString();
	}
	*/
	public String getPortDeclaration(PackageDeclarationCS pack, String elt, String ct)
	{
		StringBuilder bresult = new StringBuilder();
		EList<ContextDeclCS> contexts = new BasicEList<>();
		String spacing = "   ";
		contexts = pack.getOwnedContexts();
		
		for(ContextDeclCS c: contexts)
		{
			if (c instanceof ClassifierContextDeclCS)
			{
				ClassifierContextDeclCS clc = (ClassifierContextDeclCS) c;
				if(clc.getReferredClass().getName().equalsIgnoreCase(ct)==true)
				{
					EList<String> lst_port = new BasicEList<>();
					EList<DefCS> listdef = new BasicEList<>();
					listdef = clc.getOwnedDefinitions();
					for(DefCS def:listdef)
					{
						if (def.getOwnedType() instanceof EventType)
							//bresult.append("[" +elt+ "/]_"+def.getName()+": none in" +"['['/]"+"0,0"+"[']'/]" + ",");
							lst_port.add("[" +elt+ "/]_"+def.getName()+": none,");
					}
					
					for (Iterator<String> iterator = lst_port.iterator(); iterator.hasNext();) {
						String input = iterator.next();
						bresult.append(input);
						//if (iterator.hasNext()) {
						//	bresult.append(",\n");
						//}
					}
					bresult.append("\n");
				}
			}
		}
		return bresult.toString();
	}
	
	public String getProcTransitions(PackageDeclarationCS pack, String elt, String ct)
	{
		StringBuilder bresult = new StringBuilder();
		EList<ContextDeclCS> contexts = new BasicEList<>();
		contexts = getContextsFromPack(pack);
		
		for(ContextDeclCS c: contexts)
		{
			if (c instanceof ClassifierContextDeclCS)
			{
				ClassifierContextDeclCS clc = (ClassifierContextDeclCS) c;
				if(clc.getReferredClass().getName().equalsIgnoreCase(ct)==true)
				{
					EList<DefCS> listdef = new BasicEList<>();
					listdef = clc.getOwnedDefinitions();
					for(DefCS def:listdef)
					{
						if (def.getOwnedType() instanceof EventType)
						{
							if(def.getOwnedSpecification().toString().equals("self"))
							{
								bresult.append("    from s0  " +"["+elt+ "/]_"+def.getName()+";" + "  to s0" + "\n");
							}
							else
							{
								String methodname = def.getOwnedSpecification().toString().substring(5, def.getOwnedSpecification().toString().length()-2);
								for(Operation op: clc.getReferredClass().getOwnedOperations())
								{
									if(op.getName().equalsIgnoreCase(methodname))
									{
										String rtype = getReturnType(clc, op);
										if(rtype.equalsIgnoreCase("Y"))
										{
											methodname = methodname +"_"+elt;
										}
									}
								}
								String func = "global:="+clc.getReferredClass().getName()+"_"+methodname+"( "+"global , " +"global.refToElement_id)"; 
								bresult.append("    from s0  " +"["+elt+ "/]_"+def.getName()+";" + " " + func +" "+ ";" + "  to s0" + "\n");
							}
						}
							
					}
				}
			}
		}
		bresult.deleteCharAt(bresult.length()-1);
		return bresult.toString();
	}
	
	public String getProcTransitionsOUT(PackageDeclarationCS pack, String elt, String ct)
	{
		StringBuilder bresult = new StringBuilder();
		EList<ContextDeclCS> contexts = new BasicEList<>();
		contexts = getContextsFromPack(pack);
		
		for(ContextDeclCS c: contexts)
		{
			if (c instanceof ClassifierContextDeclCS)
			{
				ClassifierContextDeclCS clc = (ClassifierContextDeclCS) c;
				if(clc.getReferredClass().getName().equalsIgnoreCase(ct)==true)
				{
					EList<DefCS> listdef = new BasicEList<>();
					listdef = clc.getOwnedDefinitions();
					for(DefCS def:listdef)
					{
						if (def.getOwnedType() instanceof EventType)
						{
							bresult.append("    from s0  " +"["+elt+ "/]_"+def.getName()+";" + "  to s0" + "\n");
						}
							
					}
				}
			}
		}
		//bresult.deleteCharAt(bresult.length()-1);
		return bresult.toString();
	}
	
	
	
	/*public String getGlobalParameters(ClassifierContextDeclCS cdecl)
	{
		StringBuilder bresult = new StringBuilder();
		EList<Property> attrs = new BasicEList<>();
		attrs = (EList<Property>) cdecl.getReferredClass().getOwnedAttribute();
		
		for (Property attr:attrs)
		{
			if(attr.getType().getName().contains("EIn"))
			{
				String param = "p"+attr.getName().substring(0, 4);
				bresult.append("&" +param+ ":int"+ ",");
			}
		}
		bresult.append("&rt:int");
		return bresult.toString();
	}*/
	
	/*public String getGlobalParameters(ClassifierContextDeclCS cs)
	{
		StringBuilder bresult = new StringBuilder();
		for(Property attr : cs.getReferredClass().getOwnedAttribute())
		{
			if(attr.getName().startsWith("nonED"))
			{
					if(attr.getName().contains("procparam"))
					{
						bresult.append(attr.getDefault().toString());
					}
				
			}
		}
		return bresult.toString();
	}*/
	
	public String getGlobalParameters(ClassifierContextDeclCS cs)
	{
		StringBuilder bresult = new StringBuilder();
		bresult.append("&global : SystemDataRoot, id : read int");
		return bresult.toString();
	}
	
	/*public String getGlobalParametersInit(ClassifierContextDeclCS cdecl)
	{
		StringBuilder bresult = new StringBuilder();
		EList<Property> attrs = new BasicEList<>();
		attrs = (EList<Property>) cdecl.getReferredClass().getOwnedAttribute();
		
		for (Property attr:attrs)
		{
			if(attr.getType().getName().contains("EIn"))
			{
				String param ="p"+cdecl.getReferredClass().getName().substring(0, 2)+ attr.getName().substring(0, 4);
				bresult.append("&" +param+ ",");
			}
		}
		bresult.append("&rt");
		return bresult.toString();
	}*/
	
	public String getGlobalParametersInit(ClassifierContextDeclCS cdecl)
	{
		StringBuilder bresult = new StringBuilder();
		bresult.append("&global, ID");
		return bresult.toString();
	}
	
	public String getParametersDeclaration(PackageDeclarationCS pack)
	{
		StringBuilder bresult = new StringBuilder();
		EList<Property> attrs = new BasicEList<>();
		EList<ContextDeclCS> decls = new BasicEList<>();
		decls = getContextsFromPack(pack);
		for(ContextDeclCS decl:decls)
		{
			ClassifierContextDeclCS cdecl = (ClassifierContextDeclCS)decl;
			attrs = (EList<Property>) cdecl.getReferredClass().getOwnedProperties();
		
			for (Property attr:attrs)
			{
				if(attr.getType().getName().contains("EIn"))
				{
					String param ="p"+cdecl.getReferredClass().getName().substring(0, 2)+ attr.getName().substring(0, 4);
					bresult.append(param+ ":int"+ ",");
				}
			}
		}
		
		bresult.deleteCharAt(bresult.length()-1);
		return bresult.toString();
	}
	
	public String removeLastComma(String inputstr){
		StringBuilder bresult = new StringBuilder();
		bresult.append(inputstr);
		bresult.deleteCharAt(bresult.length()-1);
		return bresult.toString();
	}
	
	public String getXtendFilePath(ECLDocument document)
	{
		String result = "";
		XtendFileChooserBasic fl = new XtendFileChooserBasic("C:\\Workspaces\\runtime-v4LanguageModelingTest\\org.gemoc.sigpml.k3dsa");
		result = fl.getFile().getAbsolutePath();
		return result;
	}
	
	/*public String getBasicTypesDeclaration (PackageDeclarationCS pck, String root)
	{
		StringBuilder sb = new StringBuilder();
		EList<String> listArrayID = new BasicEList<String>();
		//System.out.println("============================= ID Arrays Declaration ===============================================");
		for(ContextDeclCS ct : getContextsFromPack(pck))
		{
			ClassifierContextDeclCS cct = (ClassifierContextDeclCS) ct;
			String leftsideMetaClass = "";
			String rightsideMetaClass = "";
			
			for(Property attr : cct.getReferredClass().getOwnedAttribute())
			{	
					if(attr.getName().startsWith("nonED")==false)
					{
						if (attr.getType().getName().equalsIgnoreCase("Enumeration")) 
						{
							sb.append("type " + attr.getName()+ " is " + "int" +"\n");
						}
						if (attr.getType().getName().equalsIgnoreCase("OrderedSet")) 
						{
							if(attr.getType().toString().contains(cct.getReferredClass().getOwningPackage().toString())==true)
							{
								leftsideMetaClass = "OrderedSet"+"\\("+cct.getReferredClass().getOwningPackage().toString()+"::";
							}
							else
							{
								leftsideMetaClass = "OrderedSet\\(ecore::";
							}
							
							rightsideMetaClass = "\\)";
							String ff = attr.getType().toString();
							String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
							String arrname = conceptname+"_"+attr.getName() +"Array";
							String arraysize = "[a"+root+".eAllContents("+conceptname+")->size()/]";
						
							//sb.append("type " + arrname+ " is array " + arraysize +" of "+ conceptname +"\n");
							listArrayID.add("type " + arrname+ " is array " + arraysize +" of "+ conceptname +"\n");
						}
						if (attr.getType().getName().equalsIgnoreCase("ArrayList")) 
						{
							if(attr.getType().toString().contains(cct.getReferredClass().getOwningPackage().toString())==true)
							{
								leftsideMetaClass = "ArrayList"+"\\("+cct.getReferredClass().getOwningPackage().toString()+"::";
							}
							else
							{
								leftsideMetaClass = "ArrayList\\(ecore::";
							}
							rightsideMetaClass = "\\)";
							String ff = attr.getType().toString();
							String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
							String arraysize =  "[a"+root+".eAllContents("+conceptname+")->size()/]";
							String arrname = conceptname+"_"+attr.getName() +"Array";
							//sb.append("type " + arrname+ " is array " + arraysize +" of "+conceptname +"\n");
							listArrayID.add("type " + arrname+ " is array " + arraysize +" of "+ conceptname +"\n");
						}
						if (attr.getType().getName().equalsIgnoreCase("Bag")) 
						{
							if(attr.getType().toString().contains(cct.getReferredClass().getOwningPackage().toString())==true)
							{
								leftsideMetaClass = "Bag"+"\\("+cct.getReferredClass().getOwningPackage().toString()+"::";
							}
							else
							{
								leftsideMetaClass = "Bag\\(ecore::";
							}
							rightsideMetaClass = "\\)";
							String ff = attr.getType().toString();
							String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
							String arraysize =  "[a"+root+".eAllContents("+conceptname+")->size()/]";
							String arrname = conceptname+"_"+attr.getName() +"Array";
							//sb.append("type " + arrname+ " is array " + arraysize +" of "+conceptname +"\n");
							listArrayID.add("type " + arrname+ " is array " + arraysize +" of "+ conceptname +"\n");
						}
					}
			}
			
			for(org.eclipse.ocl.pivot.Type supt: cct.getReferredClass().getSuperClass())
			{
				for(Property attr : supt.getOwnedAttribute())
				{
					if(attr.getName().startsWith("nonED")==false)
					{
						if (attr.getType().getName().equalsIgnoreCase("Enumeration")) 
						{
							sb.append("type " + attr.getName()+ " is " + "int" +"\n");
						}
						if (attr.getType().getName().equalsIgnoreCase("OrderedSet")) 
						{
							
							if(attr.getType().toString().contains(supt.getOwningPackage().toString())==true)
							{
								leftsideMetaClass = "OrderedSet"+"\\("+supt.getOwningPackage().toString()+"::";
							}
							else
							{
								leftsideMetaClass = "OrderedSet\\(ecore::";
							}
							rightsideMetaClass = "\\)";
							String ff = attr.getType().toString();
							String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
							String arraysize =  "[a"+root+".eAllContents("+conceptname+")->size()/]";
							String arrname = conceptname+"_"+attr.getName() +"Array";
							//sb.append("type " + arrname+ " is array " + arraysize +" of "+conceptname +"\n");
							listArrayID.add("type " + arrname+ " is array " + arraysize +" of "+ conceptname +"\n");
						}
						
						if (attr.getType().getName().equalsIgnoreCase("ArrayList")) 
						{
							if(attr.getType().toString().contains(supt.getOwningPackage().toString())==true)
							{
								leftsideMetaClass = "ArrayList"+"\\("+supt.getOwningPackage().toString()+"::";
							}
							else
							{
								leftsideMetaClass = "ArrayList\\(ecore::";
							}
							rightsideMetaClass = "\\)";
							String ff = attr.getType().toString();
							String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
							String arraysize =  "[a"+root+".eAllContents("+conceptname+")->size()/]";
							String arrname = conceptname+"_"+attr.getName() +"Array";
							//sb.append("type " + arrname+ " is array " + arraysize +" of "+conceptname +"\n");
							listArrayID.add("type " + arrname+ " is array " + arraysize +" of "+ conceptname +"\n");
						}
						if (attr.getType().getName().equalsIgnoreCase("Bag")) 
						{
							if(attr.getType().toString().contains(supt.getOwningPackage().toString())==true)
							{
								leftsideMetaClass = "Bag"+"\\("+supt.getOwningPackage().toString()+"::";
							}
							else
							{
								leftsideMetaClass = "Bag\\(ecore::";
							}
							rightsideMetaClass = "\\)";
							String ff = attr.getType().toString();
							String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
							String arraysize =  "[a"+root+".eAllContents("+conceptname+")->size()/]";
							String arrname = conceptname+"_"+attr.getName() +"Array";
							//sb.append("type " + arrname+ " is array " + arraysize +" of "+conceptname +"\n");
							listArrayID.add("type " + arrname+ " is array " + arraysize +" of "+ conceptname +"\n");
						}
					}
				}
			}
		}
		
		for (Iterator<String> iterator = listArrayID.iterator(); iterator.hasNext();) {
			String input = iterator.next();
			sb.append(input+"\n");
		}
		//System.out.println("============================================================================");
		return sb.toString();
	}
	*/
	public boolean compareElementLists(EList<String> list1, EList<String> list2)
	{
		boolean isTrue = false;
		
		for (String elt1 : list1) 
		{
			if(list2.contains(elt1))
				isTrue = true;
		}
		return isTrue;
	}
	
	public boolean checkTypeInListContext(PackageDeclarationCS pck, ContextDeclCS ct){
		boolean isTrue = false;
		EList <ContextDeclCS> listContexts = new BasicEList<ContextDeclCS>();
		listContexts = getContextsFromPack(pck);
		EList <String> listContextsNames = new BasicEList<String>();
		
		for (ContextDeclCS c:listContexts)
		{
			ClassifierContextDeclCS cc = (ClassifierContextDeclCS) c;
			listContextsNames.add(cc.getReferredClass().getName()); 
		}
		
		// For Each Context <ct>, get its SuperClass that has the same name (inheritance relation btw MM_Extended & MM)
		
		ClassifierContextDeclCS cct = (ClassifierContextDeclCS) ct;
		EList <String> listAttrType = new BasicEList<String>();
		
		for ( org.eclipse.ocl.pivot.Type supt: cct.getReferredClass().getSuperClasses())
		{
			if(supt.toString().contains(cct.getReferredClass().getName()))
			{
				
				//TODO: fix the following !!
//				for(Property attr : supt.getOwnedAttribute())
//				{	
//					listAttrType.add(attr.getType().getName());
//				}
					
			}
		}
		
		return isTrue;
	}
	
	
	public org.eclipse.ocl.pivot.Type getParentClass(ClassifierContextDeclCS ccd)
	{
		org.eclipse.ocl.pivot.Type ctr = null;
		EList<org.eclipse.ocl.pivot.Class> typelist = new BasicEList<org.eclipse.ocl.pivot.Class>();
		
		typelist = (EList<org.eclipse.ocl.pivot.Class>) ccd.getReferredClass().getSuperClasses();
		
		for (Type type : typelist) {
			if(type.getName().equalsIgnoreCase(ccd.getReferredClass().getName()))
				{
					ctr = type;
				}
		}
		return ctr;
	}
	
	public EList<org.eclipse.ocl.pivot.Type> getSuperTypesOfParent (org.eclipse.ocl.pivot.Type t, EList<ContextDeclCS> lst){
		
		EList<org.eclipse.ocl.pivot.Type> lst2 =  new BasicEList<Type>();
		
		for (ContextDeclCS ct : lst) 
		{
			ClassifierContextDeclCS cct = (ClassifierContextDeclCS) ct;
			
			for (Type type : ((Class) t).getSuperClasses()) {
				if(type.getName().equalsIgnoreCase(cct.getReferredClass().getName()))
				{
					lst2.add(cct.getReferredClass());
					lst2.add(getParentClass(cct));
				}
			}
			//System.out.println("################### = " + t.getName() + " : " + t.getSuperClass() + " / " + cct.getReferredClass().getName());
		}
		return lst2;
	}
	
	public void getListofAllOwnedAttributes(EList <org.eclipse.ocl.pivot.Type> lst, EList <Property> listAtrr)
	{
		for (org.eclipse.ocl.pivot.Type t : lst) {
			//TODO: fix this !!
//			for (Property property : t.getOwnedAttributes()) 
//			{
//				if(!(property.getName().equals(t.getName())))
//					listAtrr.add(property);
//			}
		}
	}
	
	public void getListofOwnedAttributes(org.eclipse.ocl.pivot.Type t, EList <Property> listAtrr)
	{
		//TODO: fix this !!
//		for (Property property : t.getOwnedAttribute()) 
//		{
//			if(!(property.getName().equals(t.getName())))
//			listAtrr.add(property);
//		}
	}
	
	// Building the different Array and ID arrays
	public String getBasicTypesDeclaration (PackageDeclarationCS pck, String root)
	{
		StringBuilder sb = new StringBuilder();
		EList <String> listIDArray = new BasicEList<String>();
		
		ClassifierContextDeclCS cct = (ClassifierContextDeclCS) getContextsFromPack(pck).get(0);
		String leftsideMetaClass = "";
		String rightsideMetaClass = "";
		String attrname = "";
			
		EList <Type> ltype = new BasicEList<Type>();
			
		for (EObject eo : cct.getReferredClass().getOwningPackage().eContents()) {
				ltype.add((org.eclipse.ocl.pivot.Type)eo);
		}
		
		EList <Property> list_attr = new BasicEList<Property>();
		getListofAllOwnedAttributes(ltype,list_attr); // Get the List of attributes at the MM Level
			
		System.out.println("################### = " + cct.getReferredClass().getName() + " --> " + list_attr);
		for (Property property : list_attr) {
				System.out.println("                  ################### = " + property.getName() + " : " + property.getType().getName() + " //  " + property.getType());
		}
			
		for (Property attr : list_attr) 
		{
			if (attr.getType().getName().equalsIgnoreCase("OrderedSet")) 
				{
					attrname = attr.getName();
					if(attr.getName().equalsIgnoreCase("type")) {attrname = "_"+attr.getName();}

					if(attr.getType().toString().contains(cct.getReferredClass().getOwningPackage().toString())==true)
					{
						leftsideMetaClass = "OrderedSet"+"\\("+cct.getReferredClass().getOwningPackage().toString()+"::";
					}
					else
					{
						leftsideMetaClass = "OrderedSet\\(ecore::";
					}
					rightsideMetaClass = "\\)";
					String ff = attr.getType().toString();
					String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
					String arrname = conceptname.replace("[+]","")+"_"+attr.getName() +"Array";

					String arraysize = "[a"+root+".eAllContents("+conceptname.replace("[+]","")+")->size()/]";
					//listIDArray.add("type " + arrname+ " is array " + arraysize +" of "+ conceptname.replace("[+]","") +"\n");
					listIDArray.add("type " + arrname.replace("::", "_")+ " is array " + arraysize +" of "+ "int" +"\n");
				}
				
				if (attr.getType().getName().equalsIgnoreCase("ArrayList")) 
				{
					attrname = attr.getName();
					if(attr.getName().equalsIgnoreCase("type")) {attrname = "_"+attr.getName();}
					
					if(attr.getType().toString().contains(cct.getReferredClass().getOwningPackage().toString())==true)
					{
						leftsideMetaClass = "ArrayList"+"\\("+cct.getReferredClass().getOwningPackage().toString()+"::";
					}
					else
					{
						leftsideMetaClass = "ArrayList\\(ecore::";
					}
					rightsideMetaClass = "\\)";
					String ff = attr.getType().toString();
					String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
					String arrname = conceptname.replace("[+]","")+"_"+attr.getName() +"Array";
					
					String arraysize = "[a"+root+".eAllContents("+conceptname.replace("[+]","")+")->size()/]";
					listIDArray.add("type " + arrname.replace("::", "_")+ " is array " + "100" +" of "+ "int" +"\n");
				}
			}
		
		for (Iterator<String> iterator = listIDArray.iterator(); iterator.hasNext();) {
			String input = iterator.next();
			sb.append(input);
		}
		
		return sb.toString();
	}
		public String getTypesDeclaration (PackageDeclarationCS pck, String root)
		{
			StringBuilder sb = new StringBuilder();
			String typebegindecl = "";
			String subToadd = "";
			String spacing = "    ";
			String typeenddecl = "\nend record"+"\n\n";
			ClassifierContextDeclCS cct = (ClassifierContextDeclCS) getContextsFromPack(pck).get(0);
			
			EList <Type> ltype = new BasicEList<Type>();
			
			for (EObject eo : cct.getReferredClass().getOwningPackage().eContents()) {
				ltype.add((org.eclipse.ocl.pivot.Type)eo);
			}
			
			for(org.eclipse.ocl.pivot.Type ct : ltype)
			{
			//	ClassifierContextDeclCS cct = (ClassifierContextDeclCS) ct;
				EList <String> listsubElt = new BasicEList<String>();
				
				typebegindecl = "type " + ct.getName() + " is record";
				sb.append(typebegindecl+"\n");
				String leftsideMetaClass = "";
				String rightsideMetaClass = "";
				String attrname = "";
				
				System.out.println("################### = " + cct.getReferredClass().getName() + " --> " + ltype);
				
				EList <Property> list_attr = new BasicEList<Property>();
				getListofOwnedAttributes(ct,list_attr); // Get the List of attributes at the MM Level
				
				for(Property attr : list_attr)
				{
					if (attr.getType().getName().equalsIgnoreCase("Enumeration")) 
					{
						attrname = spacing+ attr.getName();
						if(attr.getName().equalsIgnoreCase("type")) {attrname = "_"+attr.getName();}
						subToadd = attrname + " : Enum";
						listsubElt.add(subToadd);
								
					}
					
					if (attr.getType().getName().equalsIgnoreCase("EInt")) 
					{
						attrname = attr.getName();
						if(attr.getName().equalsIgnoreCase("type")) {attrname = "_"+attr.getName();}
						subToadd = attrname + " : int";
						listsubElt.add(subToadd);
					}
					
					if (attr.getType().getName().equalsIgnoreCase("Boolean")) 
					{
						attrname = attr.getName();
						if(attr.getName().equalsIgnoreCase("type")) {attrname = "_"+attr.getName();}
						subToadd = attrname + " : bool";
						listsubElt.add(subToadd);
					}
					
					if (attr.getType().getName().equalsIgnoreCase("OrderedSet")) 
					{
						attrname = attr.getName();
						if(attr.getName().equalsIgnoreCase("type")) {attrname = "_"+attr.getName();}

						if(attr.getType().toString().contains(cct.getReferredClass().getOwningPackage().toString())==true)
						{
							leftsideMetaClass = "OrderedSet"+"\\("+cct.getReferredClass().getOwningPackage().toString()+"::";
						}
						else
						{
							leftsideMetaClass = "OrderedSet\\(ecore::";
						}
						rightsideMetaClass = "\\)";
						String ff = attr.getType().toString();
						String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
						String arrname = conceptname.replace("[+]","")+"_"+attr.getName() +"Array";

						subToadd = attrname+"ID"+ " : " + arrname.replace("::", "_");
						listsubElt.add(subToadd);
					}
					
					if (attr.getType().getName().equalsIgnoreCase("ArrayList")) 
					{
						attrname = attr.getName();
						if(attr.getName().equalsIgnoreCase("type")) {attrname = "_"+attr.getName();}
						
						if(attr.getType().toString().contains(cct.getReferredClass().getOwningPackage().toString())==true)
						{
							leftsideMetaClass = "ArrayList"+"\\("+cct.getReferredClass().getOwningPackage().toString()+"::";
						}
						else
						{
							leftsideMetaClass = "ArrayList\\(ecore::";
						}
						rightsideMetaClass = "\\)";
						String ff = attr.getType().toString();
						String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
						String arrname = conceptname.replace("[+]","")+"_"+attr.getName() +"Array";
						//subToadd = attrname+ " : " + arrname;
						//listsubElt.add(subToadd);
						
						subToadd = attrname+"ID"+ " : " + arrname.replace("::", "_");
						listsubElt.add(subToadd);
					}
					
					if (attr.getType().getName().equalsIgnoreCase("Bag")) 
					{
						attrname = attr.getName();
						if(attr.getName().equalsIgnoreCase("type")) {attrname = "_"+attr.getName();}
						
						if(attr.getType().toString().contains(cct.getReferredClass().getOwningPackage().toString())==true)
						{
							leftsideMetaClass = "Bag"+"\\("+cct.getReferredClass().getOwningPackage().toString()+"::";
						}
						else
						{
							leftsideMetaClass = "Bag\\(ecore::";
						}
						rightsideMetaClass = "\\)";
						String ff = attr.getType().toString();
						String conceptname = ff.replaceAll(leftsideMetaClass, "").replaceAll(rightsideMetaClass, "");
						String arrname = conceptname.replace("[+]","")+"_"+attr.getName() +"Array";
						
						subToadd = attrname+ " : " + arrname.replace("::", "_");
						if(!(attrname.equals(conceptname)))
							listsubElt.add(subToadd);
					}
				}
					
			for (Iterator<String> iterator = listsubElt.iterator(); iterator.hasNext();) {
					String input = iterator.next();
					sb.append(spacing + input);
					if (iterator.hasNext()) {
						sb.append(",\n");
					}
			}
			sb.append(typeenddecl);
			}
			return sb.toString();
		}
	
	// TODO  Here we assume there is only one package in the ECL file, getRootTypeArraysDeclaration can be extended when * package in ECL
		public String getRootTypeArraysDeclaration (PackageDeclarationCS pck,String root){
		
		StringBuilder sb = new StringBuilder();
		String spacing = "    ";
		String ref = "";
		
		ClassifierContextDeclCS cct = (ClassifierContextDeclCS) getContextsFromPack(pck).get(0);
		
		EList <Type> lst_metaclass = new BasicEList<Type>();
		
		for (EObject eo : cct.getReferredClass().getOwningPackage().eContents()) {
			lst_metaclass.add((org.eclipse.ocl.pivot.Type)eo);
		}
		
		
		
		EList<FiacreArrayElement> lst_arrays = new BasicEList<FiacreArrayElement>();
		EList<RootRecordElement> lst_recordElt = new BasicEList<RootRecordElement>();
		for (Type ct : lst_metaclass) 
		{
			
				ref = "rootRefTo";
				ref = ref + cct.getReferredClass().getName();
				String sprefix = ".eAllContents(" + cct.getReferredClass().getName()+")";
				createEntryInRootList(ct,lst_metaclass,ref,root,lst_arrays,lst_recordElt,sprefix);
				parseOwnedAttributes(ct,lst_metaclass,ref,root,lst_arrays,lst_recordElt,sprefix);
		}
		
		for (Iterator<FiacreArrayElement> iterator = lst_arrays.iterator(); iterator.hasNext();) {
			FiacreArrayElement input = iterator.next();
			sb.append("type " + input.arrayname+ " is array " + input.arraysize +" of "+ input.conceptname+"\n");
		}
		
		sb.append("\ntype SystemDataRoot is record \n");
		for (Iterator<RootRecordElement> iterator = lst_recordElt.iterator(); iterator.hasNext();) {
			RootRecordElement input = iterator.next();
			sb.append(spacing + input.refname+ " : " + input.arrayname);
			if(iterator.hasNext())
			{
				sb.append(",\n");
			}
		}
		sb.append("\nend record \n");
		return sb.toString();
	}
	
	public void parseOwnedAttributes(org.eclipse.ocl.pivot.Type t, EList<Type> lst, String refname,String root, EList<FiacreArrayElement> lst1, EList<RootRecordElement> lst2, String cref)
	{
		if(!(classInTypeDeclaration(t,lst).equalsIgnoreCase("none")))
		{
			//String conceptname = classInTypeDeclaration(t,lst);
			
//TODO: fix this !
//			for(Property attr : t.getOwnedAttribute())
//			{
//				if(attr.getType().getName().equalsIgnoreCase("OrderedSet"))
//				{
//					String attrType = "" ;
//					if(!(classInTypeDeclaration(attr.getType(),lst).equalsIgnoreCase("none")))
//						attrType = classInTypeDeclaration(attr.getType(),lst);
//					refname = refname + attr.getName()+attrType;
//					// cref = cref +"."+attr.getName()+".eContents(" + attrType+")";
//					String sprefix = ".eAllContents(" +attrType +")";
//					createEntryInRootList(t,lst,refname,root,lst1,lst2,sprefix); // replace "sprefix" with "cref"
//					org.eclipse.ocl.pivot.Type nextT = attr.getType();
//					parseOwnedAttributes(nextT,lst,refname,root,lst1,lst2,sprefix);
//				}
//			}
		}
	}
	
	public void createEntryInRootList(org.eclipse.ocl.pivot.Type t, EList<Type> lst, String refname,String root, EList<FiacreArrayElement> lst1, EList<RootRecordElement> lst2, String sizePrefix)
	{
			
			String conceptname = classInTypeDeclaration(t,lst);
			String recordname = refname;
			String arrname = refname +"Array";
			String arraysize = "[a" + root + sizePrefix + "->size()/]";
			
			lst1.add(new FiacreArrayElement(arrname,arraysize,conceptname));
			lst2.add(new RootRecordElement(arrname, recordname));
	}
	
	public String classInTypeDeclaration(org.eclipse.ocl.pivot.Type t, EList<Type> lst)
	{
		String concept = "none";
		
		for(Type ct : lst)
		{
			if(t.toString().contains(ct.getName()))
			{
				concept = ct.getName();
			}
		}
		return concept;
	}
	
	public String getUnChangingFunctionsDeclarations(PackageDeclarationCS pck){
		StringBuilder sb = new StringBuilder();
		




		for(ContextDeclCS ct : getContextsFromPack(pck))
		{
			ClassifierContextDeclCS cct = (ClassifierContextDeclCS) ct;
			for(Operation op : cct.getReferredClass().getOwnedOperations())
			{

				boolean coreChange = getCoreChangesValue(cct, op); 
				if(coreChange==false)
				{
					String returnType = getReturnType(cct,op);
					String params = getParamList(cct, op);
					sb.append("function " + cct.getReferredClass().getName()+"_"+op.getName() + " (" + params + ") :" + returnType +" is"+"\n");
					sb.append("begin"+ "\n");
					String coreBody = getExecutionFunctionBody(op);
					sb.append(coreBody + "\n");
					sb.append("end" + "\n\n");
				}
			}
		}






		return sb.toString();
	}
	
	public String getChangingFunctionsDeclarations(PackageDeclarationCS pck, String root){
		StringBuilder sb = new StringBuilder();
		
		for(ContextDeclCS ct : getContextsFromPack(pck))
		{
			ClassifierContextDeclCS cct = (ClassifierContextDeclCS) ct;
			for(Operation op : cct.getReferredClass().getOwnedOperations())
			{
				boolean coreChange = getCoreChangesValue(cct, op); 
				if(coreChange==true)
				{
					String returnType = getReturnType(cct,op);
					String params = getParamList(cct, op);
					sb.append("[for (element : "+cct.getReferredClass().getName()+"| a"+root+".eAllContents("+cct.getReferredClass().getName()+"))]");
					sb.append("function " + cct.getReferredClass().getName()+"_"+op.getName()+"_"+"[element.name/]" + " (" + params + ") :" + returnType +" is"+"\n");
					sb.append("begin"+ "\n");
					String coreBody = getExecutionFunctionBody(op);
					sb.append(coreBody + "\n");
					sb.append("end" + "\n\n");
					sb.append("[/for]\n");
				}
			}
		}

		return sb.toString();
	}
	
	public String getExecutionFunctionBody(Operation op){
		StringBuilder sb = new StringBuilder();
		sb.append("TODO");
		return sb.toString();
	}
	
	// Return TYpe by Functions
	public String getReturnType(ClassifierContextDeclCS cs, Operation op)
	{
		StringBuilder sb = new StringBuilder();
		//System.out.println("=======================================");
		
		//TODO: fix this !!
//		for(Property attr : cs.getReferredClass().getOwnedAttribute())
//		{
//			//System.out.println(attr.getName());	
//			if(attr.getName().startsWith("nonED"))
//			{
//				if(attr.getName().contains(op.getName()))
//				{
//					if(attr.getName().contains("freturn"))
//					{
//						//System.out.println("============"+attr.getDefaultExpression());
//						String value = attr.getDefault().toString();
//						sb.append(value);
//					}
//				}
//			}
//		}
		//System.out.println("=======================================");
		return sb.toString();
	}
	
	/*public String getReturnType(ClassifierContextDeclCS cs)
	{
		StringBuilder sb = new StringBuilder();
		System.out.println("=======================================");
		for(Property attr : cs.getReferredClass().getOwnedAttribute())
		{
			System.out.println(attr.getName());	
			if(attr.getName().startsWith("nonED"))
			{
				if(attr.getName().contains("freturn"))
					{
						System.out.println("============"+attr.getDefaultExpression());
						String value = attr.getDefault().toString();
						sb.append(value);
					}
			}
		}
		System.out.println("=======================================");
		return sb.toString();
	}*/
	
	public String getParamList(ClassifierContextDeclCS cs, Operation op)
	{
		StringBuilder sb = new StringBuilder();
		//TODO: fix this !!
//		for(Property attr : cs.getReferredClass().getOwnedAttribute())
//		{
//			if(attr.getName().startsWith("nonED"))
//			{
//				if(attr.getName().contains(op.getName()))
//				{
//					if(attr.getName().contains("lparam"))
//					{
//						String value = attr.getDefault().toString();
//						sb.append(value);
//					}
//				}
//			}
//		}
		return sb.toString();
	}
	
	public boolean getCoreChangesValue(ClassifierContextDeclCS cs, Operation op)
	{
		boolean change = false;
		//TODO: fix this !!
//		for(Property attr : cs.getReferredClass().getOwnedAttribute())
//		{
//			if(attr.getName().startsWith("nonED"))
//			{
//				if(attr.getName().contains(op.getName()))
//				{
//					if(attr.getName().contains("fcore"))
//					{
//						String value = attr.getDefault().toString();
//						if(value.equals("Y")) change = true;
//					}
//				}
//			}
//		}
		return change;
	}
	
	public String getBodyExpression(PackageDeclarationCS pck, String operatioName, String xtendAbsolutePath)
	{
		String result = "";
		System.out.println("Check Operation : " + operatioName+ " IN -> " +xtendAbsolutePath);
		System.out.println("========================================================================");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(xtendAbsolutePath));
			String aLine;
			while ((aLine = br.readLine())!=null)
			{
				System.out.println(aLine);
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("========================================================================");
		return result;
	}
	
	public String INITIAL_Configuration (PackageDeclarationCS pck, String root){
		
		// TODO 
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}
}
