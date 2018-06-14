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
package org.eclipse.gemoc.moccml_mapping.ecltoqvto.helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLExpression;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLRelation;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.EventType;
import org.eclipse.ocl.pivot.IteratorExp;
import org.eclipse.ocl.pivot.NamedElement;
import org.eclipse.ocl.pivot.OperationCallExp;
import org.eclipse.ocl.pivot.Package;
import org.eclipse.ocl.pivot.PropertyCallExp;
import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.PrimitiveTypeRefCS;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.ContextDeclCS;
import org.eclipse.ocl.xtext.completeoclcs.DefCS;
import org.eclipse.ocl.xtext.completeoclcs.PackageDeclarationCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.InfixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NavigatingArgCS;
import org.eclipse.ocl.xtext.essentialoclcs.NumberLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.OperatorExpCS;

public class helperNsURI {
	

	/**
	 * @deprecated
	 * @param res
	 * @return
	 */
	public String getResourcePath(Resource res){
		if (res != null)
	    {
	      URI uri = res.getURI();
	      if(uri.isPlatformResource()){
	    	return   "platform:/resource"+uri.toPlatformString(true);
	      }else{
	    	return   "platform:/plugin"+uri.toPlatformString(true);
	      }
	   
	    }
		System.out.println("noooooooooooooooooooooooooooooooooooooooooooo");
	    return null; 
	}
	
	public String getpackageIndex(ECLDocument eclDoc, String objectName){
		EList<PackageDeclarationCS> allpackages = eclDoc.getOwnedPackages();
		
		for(int i=0; i< allpackages.size(); i++){
			PackageDeclarationCS pdecl = allpackages.get(i);
			Package p = pdecl.getReferredPackage();
			TreeIterator<EObject> it = p.eAllContents();
			while( it.hasNext()){
				EObject eo = it.next();
				String eoName = "";
				try {
					if(eo.getClass().getMethod("getName") != null){
						eoName = (String) eo.getClass().getMethod("getName").invoke(eo, new Object[]{});
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if ((eoName != null) && (eoName.compareTo(objectName)==0)){
					return (new Integer(i+1)).toString();
				}
			}
		}
		return (new Integer(1)).toString(); //1 is returned by default since we do not necessarly know the name of the rootElement and it is PAckage by default (for UML)
	}
	
	
	public String getClassifierContext(ElementCS me){
		String res="";
		if (me instanceof ClassifierContextDeclCS){
			res = ((ClassifierContextDeclCS) me).getReferredClass().getName();
		}
		else{
			if (me.getParent() != null){
				res += getClassifierContext(me.getParent());
			}
		}
		return res;
	}

/**
 * give all the previous "let" statement before the infoxExpCS, i.e. before the implies operator 
 * @param the implies operator
 * @return the list of previous "let" variable
 */
	public ArrayList<LetExpCS> getAllLetExpParents(EObject root){
		ArrayList<LetExpCS> tmpRes = new ArrayList<LetExpCS>();
		if (root instanceof InfixExpCS && (! (root instanceof ECLRelation))){
			
			while ((((ElementCS)root).getParent() != null ) && ! (((ElementCS)root).getParent() instanceof ContextDeclCS)){
//				System.out.println(root);
//				System.out.println("###################  "+((ElementCS)root).getLogicalParent().getClass().getName());
//				System.out.println("*******************  ");
				ElementCS elem = ((ElementCS)root).getParent();
				if (elem instanceof LetExpCS){
					tmpRes.add(((LetExpCS)elem));
				}
				root = elem;
			}
		}
		//put list in the original order
		ArrayList<LetExpCS> res = new ArrayList<LetExpCS>();
		for (int i = tmpRes.size()-1; i >=0; i--) {
			res.add(tmpRes.get(i));
		}
		return res;
	}
	
	
	public ArrayList<ExpCS> getAllContainingExpression(EObject root){
		ArrayList<ExpCS> res = new ArrayList<ExpCS>();
		EObject container = root.eContainer();
		if (container != null && container instanceof ExpCS){
			res.add((ExpCS)container);
			res.addAll(getAllContainingExpression(container));
		}
		return res;
	}
	
	
	
	public ArrayList<ExpCS> getAllContainedExpression(EObject root){
		ArrayList<ExpCS> res = new ArrayList<ExpCS>();
		for(EObject eo : root.eContents()){
			if (eo instanceof ExpCS){
				res.add((ExpCS)eo);
			}
			res.addAll(getAllContainedExpression(eo));
		}
		return res;
	}
	
	public ArrayList<EObject> getElementsFromLib(String libPathName){
		URI fileURI = URI.createFileURI(libPathName);
		Resource resource = new XMIResourceImpl(fileURI);

		try {
		resource.load(null);
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		EObject model = resource.getContents().get(0); 
		
		ArrayList<EObject> res = new ArrayList<EObject>();
		
		for (TreeIterator<EObject> iterator = model.eAllContents(); iterator.hasNext();) {
			EObject eo = iterator.next();
			res.add(eo);
		}
		
		return res;
	}

	public String prettyPrintButLast(ExpCS e) {
		if (e instanceof ECLExpression){
			return "self"; //is it sufficient to avoid doing bad stuff ?
		}
		String s=e.toString();
		String res = s.substring(0, s.lastIndexOf(prettyPrintOnlyLast(e)));
		if (res.length()==0){
			res="self.";
		}
		return res;
	}
	
	public String prettyPrintButLastNoPoint(ExpCS e) {
		String res = prettyPrintButLast(e);
		return res.substring(0, res.length()-2);
	}
	
	public String prettyPrintButRelation(ExpCS e) {
		if (e == null){
			return "";
		}
		//remove the relation from the result string and put 'StringToReplaceWithTheMapping' instead
		String res = e.toString();
		String rel="";
		for (TreeIterator<EObject> iterator = e.eAllContents(); iterator.hasNext();) {
			EObject eo = iterator.next();
			if (eo instanceof ECLRelation){
				rel=eo.toString();
				int end = rel.indexOf(')');
				rel = rel.substring(0, end);
				res = res.replace(rel, "StringToReplaceWithTheMapping(ParametersToReplace)");
			}
		}
		
		//remove 'self.' from the begin of the res
		res = res.replaceFirst("self.", "");
		
	
		res = res.replace("ParametersToReplace)", prettyPrintParametersForCall(e)+").oclIsUndefined()");

		return res;
	}
	
	
	public String prettyPrintParametersForCall(ExpCS e) {
		if (e == null){
			return "";
		}
		String res = "";
		//get the iterating variables
			ArrayList<NameExpCS> iteratingVariables = new ArrayList<NameExpCS>();
			for (TreeIterator<EObject> iterator = e.eAllContents(); iterator.hasNext();) {
				EObject eo = iterator.next();
				if (eo instanceof NavigatingArgCS){
					NavigatingArgCS navArg = ((NavigatingArgCS)eo);
					if (navArg.getOwnedNameExpression() instanceof NameExpCS){
						iteratingVariables.add((NameExpCS) navArg.getOwnedNameExpression());
					}
				}
			}
			
			//put the iterating variables as parameters of the mapping
			for (NameExpCS nameExpCS : iteratingVariables) {
				res+=nameExpCS.toString()+",";
			}
			if (res.length()>1){
				res = res.substring(0, res.length()-1);
			}
			return res;
		}

	
	public String prettyPrintParametersForDefinition(ExpCS e) {
		if (e == null){
			return "";
		}
		String res = "";
		NameExpCS lastNameExpr = null;
		for(EObject eo : e.eContents()){
			if (eo instanceof NameExpCS){
				lastNameExpr = (NameExpCS)eo;
			}	
		}
		if (lastNameExpr == null){
			return "";
		}
//		String paramName = lastNameExpr.getNamedElement().getName();
//		System.out.println("################## "+paramName);
		String paramType = lastNameExpr.getPivot().eCrossReferences().get(0).toString();
		if (paramType.startsWith("Set<")){
			paramType = paramType.substring(4, paramType.length()-1);
		}
		paramType = paramType.substring(paramType.indexOf("::")+2);
//		System.out.println("################## : : :  "+paramType);

	//get the iterating variables
			ArrayList<NameExpCS> iteratingVariables = new ArrayList<NameExpCS>();
			for (TreeIterator<EObject> iterator = e.eAllContents(); iterator.hasNext();) {
				EObject eo = iterator.next();
				if (eo instanceof NavigatingArgCS){
					NavigatingArgCS navArg = ((NavigatingArgCS)eo);
					if (navArg.getOwnedNameExpression() instanceof NameExpCS){
						iteratingVariables.add((NameExpCS) navArg.getOwnedNameExpression());
					}
				}
			}
			
			//put the iterating variables as parameters of the mapping
			for (NameExpCS nameExpCS : iteratingVariables) {
				res+=nameExpCS.toString()+" : "+paramType + ",";
			}
			if (res.length()>1){
				res = res.substring(0, res.length()-1);
			}
			return res;
		}


	public String prettyPrintOnlyLast(ExpCS e) {
		//System.out.println("==>"+e.toString());
		if (e instanceof ECLExpression){
			//System.out.println("   avoid dealing with instance of ecl expression ("+e.getClass().getName()+")");
			return ""; //is it sufficient to avoid doing bad stuff ?
		}
		if (e instanceof NumberLiteralExpCS){
			//System.out.println("  avoid dealing with instance of number...");
			return e.toString();
		}		
		//System.out.println("    instance of "+e.getClass().getName());
		ExpCS res =null;
		if (e instanceof NameExpCS) {
			res = (NameExpCS) e;
		}
		if(e instanceof InfixExpCS){
			return ((InfixExpCS) e).getLocalRightmostDescendant().toString();			
		}
		for (TreeIterator<EObject> iterator = e.eAllContents(); iterator.hasNext();) {
			EObject eo = iterator.next();
			if (eo instanceof ExpCS && (!( eo instanceof OperatorExpCS))) {
				ExpCS ne = (ExpCS) eo;
				if (ne.getPivot() instanceof PropertyCallExp
						||
					ne.getPivot() instanceof OperationCallExp
						||
					ne instanceof NameExpCS	){
					res = ne;
				}
			}
		}
		
		String s=res.toString();
		return s;//.substring(s.lastIndexOf('.')+1, minPositive(s.length(), s.lastIndexOf('-')));
	}

	private int maxPositive(int i1, int i2) {
		if (i1 < 0 && i2 <0)
			return 0;
		if (i1 < 0)
			return i2;
		if (i2 < 0)
			return i1;
		if (i1 < i2)
			return i2;
		else
			return i1;
	}
	
	
	private ArrayList<ExpCS> collectAllOwnedRightExpression(InfixExpCS infExp){
		ArrayList<ExpCS> res = new ArrayList<ExpCS>();
		ExpCS current = infExp.getOwnedRight();
		res.add(current);
		if (current instanceof InfixExpCS){
			res.addAll(collectAllOwnedRightExpression((InfixExpCS) current));
		}
		return res;
	}
	
	private ArrayList<ExpCS> collectAllOwnedLeftExpression(InfixExpCS infExp){
		ArrayList<ExpCS> res = new ArrayList<ExpCS>();
		ExpCS current = infExp.getOwnedLeft();
		res.add(current);
		if (current instanceof InfixExpCS){
			res.addAll(collectAllOwnedLeftExpression((InfixExpCS) current));
		}
		return res;
	}
	
	public boolean isACollection(ExpCS param){
		if (! (param instanceof InfixExpCS)){
			return false;//throw new RuntimeException("in the qvto helper; in isACollection, the param is not supported: "+param);
		}
		
		ArrayList<ExpCS> ownedExpressions = collectAllOwnedRightExpression((InfixExpCS) param);
		ownedExpressions.addAll(collectAllOwnedLeftExpression((InfixExpCS) param));
		for(ExpCS e: ownedExpressions){
			if (e.getPivot() instanceof IteratorExp || e.getPivot().eContainer() instanceof IteratorExp){
				//not enough ! (but sufficient here to avoid most of the problems
				return true;
			}
		}
		return false;
	}
	
	public <T> String getTypeOfSet(EObject param){
		String res = "";
		if (param instanceof InfixExpCS){
			InfixExpCS ie = (InfixExpCS) param;
			res= ((NameExpCS)ie.getLocalRightmostDescendant()).getSourceType().toString();
		}else return "\"helperNsURI::getTypeOfSet did not worked :-/\"";
//			ArrayList<ExpCS> ownedRightExpressions = collectAllOwnedRightExpression(ie);
//			int sizeOfNav = ownedRightExpressions.size();
//			//the last one is considered to be an event !! so we keep the one before
////			System.out.println("~~~~~checked 2: "+ie.getOwnedExpression().get(sizeOfNav-2).toString());
//			if(ownedRightExpressions.get(sizeOfNav-2).getPivot() != null){
//				EObject ref = ownedRightExpressions.get(sizeOfNav-2).getPivot().eCrossReferences().get(0);
//				res += ref.toString();
//			}else{
//				String tmp = ownedRightExpressions.get(sizeOfNav-2).toString();
//				res+= tmp.substring(tmp.indexOf('('), tmp.indexOf(')'));
//			}
//		}
////		System.out.println("~~~~~checked 3: "+res);
		res = res.substring(res.indexOf("::")+2);
		if (res.endsWith(">")){
			res = res.substring(0, res.length()-1);
		}
		if (res.endsWith(")")){
			res = res.substring(0, res.length()-1);
		}

//		if (res.contains("::")){
//			String[] tabName = res.split("::");
//			res = tabName[tabName.length - 1];
//		}
		return res;
	}
	
	
	
	public boolean isAlreadyTranslated(Set<DefCS> defs, String paramName){
		boolean res = false;
		//System.out.println("############################################################ is translated ?" +paramName);
		for (DefCS constraint : defs){
//System.out.println("defs:" +constraint.getFeature().getOwnedType());
			if (constraint.getOwnedType() instanceof PrimitiveTypeRefCS || constraint.getOwnedType() instanceof EventType){
//				System.out.println(((NamedElement)constraint.getFeature().getPivot()).getName()+" == " +paramName);
				if (((NamedElement)constraint.getPivot()).getName().compareTo(paramName)==0){
					return true;
				}
			}
		}
		return res;
	}
	
	
	
	
	public String prettyPrintAlias(String e) {
		return e.substring(maxPositive(0,e.lastIndexOf('/')+1), e.lastIndexOf('.'));
	}
	
	public String getModelPath(ECLDocument d){
		String res ="";
			res = d.eResource().getURI().toFileString();
		return res;
	}
	
}
