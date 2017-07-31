/**
 * <copyright>
 *
 * Copyright (c) 2010,2017 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: CompleteOCLDocumentAttribution.java,v 1.11 2011/05/21 19:04:14 ewillink Exp $
 */
package org.eclipse.gemoc.moccml.mapping.xtext.attributes;

import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ECLDocument;
import org.eclipse.gemoc.moccml.mapping.moccml_mapping.ImportStatement;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.utilities.MetamodelManager;
import org.eclipse.ocl.xtext.completeocl.attributes.CompleteOCLDocumentCSAttribution;

import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.NamedElement;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.ExpressionDeclaration;
import fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.RelationDeclaration;

public class ECLAttribution extends CompleteOCLDocumentCSAttribution
{
	public static final ECLAttribution INSTANCE = new ECLAttribution();
	
	private ArrayList<String> listOfURI = new ArrayList<String>();
	private ArrayList<fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.NamedElement> ListOfImportedDeclaration = new ArrayList<fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.NamedElement>();

	
	@Override
	public  ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		super.computeLookup(target, environmentView, scopeView);
		CompleteOCLDocumentCSAttribution.INSTANCE.computeLookup(target, environmentView, scopeView);
		ECLDocument targetElement = (ECLDocument)target;
		
		EnvironmentFactoryInternal environmentFactory = environmentView.getEnvironmentFactory();
		MetamodelManager metaModelManager = environmentFactory.getMetamodelManager();
		
		//to update list if new imports are done
		//FIXME ?
		if (listOfURI.size() != targetElement.getImports().size()){
			listOfURI.clear();
			ListOfImportedDeclaration.clear();
		}
		
		for (ImportStatement anImport : targetElement.getImports()) {
			if (!listOfURI.contains(anImport.getImportURI())){
				listOfURI.add(anImport.getImportURI());
//				CCSLLibraryStandaloneSetup libss= new CCSLLibraryStandaloneSetup();
//				Injector injector = libss.createInjectorAndDoEMFRegistration();
//				
//				XtextResourceSet resSet = injector.getInstance(XtextResourceSet.class);
//				//set.setClasspathURIContext(getClasspathURIContext());
//				
//				resSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	
				 // Obtain a new resource set
			    ResourceSet resSet = new ResourceSetImpl();

			    // create a uri
			    String uristring = anImport.getImportURI();
			    URI uri = URI.createURI(uristring);
			    if (uri.isPlatform()){
			    	resSet.getResource(uri, true);//createResource(uri);
			    }else{
			    	uristring = target.eResource().getURI().toString().replace(target.eResource().getURI().lastSegment(), "")+uristring;
			    	uri = URI.createURI(uristring);
			    	 // Get the resource
				    Resource resource = resSet.getResource(uri, true);
				    
			    }
			    EcoreUtil.resolveAll(resSet);
				if (((fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.Library)resSet.getResources().get(0).getContents().get(0)).getRelationLibraries().size()>0){
				    for (RelationDeclaration rd: ((fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.Library)resSet.getResources().get(0).getContents().get(0)).getRelationLibraries().get(0).getRelationDeclarations()){
						ListOfImportedDeclaration.add(rd);
					}
				}
				if (((fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.Library)resSet.getResources().get(0).getContents().get(0)).getExpressionLibraries().size()>0){
					for (ExpressionDeclaration ed: ((fr.inria.aoste.timesquare.ccslkernel.model.TimeModel.CCSLModel.ClockExpressionAndRelation.Library)resSet.getResources().get(0).getContents().get(0)).getExpressionLibraries().get(0).getExpressionDeclarations()){
						ListOfImportedDeclaration.add(ed);
					}
				}
			}
		} 
			
			for(NamedElement ne : ListOfImportedDeclaration){
				environmentView.addElement(ne.getName(), ne);
//				if (ne instanceof DomainElement){
//					DomainElement de= (DomainElement)ne;
//					environmentView.addElement(ne.getName(),  de);
//				}else{
//					CCSLDomainNamedElement dne = new CCSLDomainNamedElement(ne);
//					environmentView.addElement(ne.getName(), dne);
//				}
			}
		

		return null;
	}
}
