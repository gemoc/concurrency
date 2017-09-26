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
package org.eclipse.gemoc.moccml_mapping.qvto.helper;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ccslkernel.library.xtext.CCSLLibraryStandaloneSetup;


public class EclQVToHelper {
	
	public EclQVToHelper(){
		super();
	}
	
	public String getModelPath(EObject model){
		if (model == null){
			return "null";
		}
		String res="";
		res = "platform:"+model.eResource().getURI().devicePath();
		return res;
	}

	public String getModelAlias(EObject model){
		String res="";
		res = model.eClass().getName();
		return res;
	}

	public Set<EObject> getLibObjects(String libPath){
		//init Xtext
		Set<EObject> res = new HashSet<EObject>();
		CCSLLibraryStandaloneSetup ess= new CCSLLibraryStandaloneSetup();
		Injector injector = ess.createInjector();
	    XtextResourceSet aSet = injector.getInstance(XtextResourceSet.class);
		aSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		EcoreUtil.resolveAll(aSet);
		CCSLLibraryStandaloneSetup.doSetup();

		URI uri =null;
		//filter URI
		if (libPath.startsWith("platform:/plugin")){
			uri = URI.createPlatformPluginURI(libPath.replace("platform:/plugin", ""), false);
		}else
		if(libPath.startsWith("platform:/resource")){
			uri = URI.createPlatformResourceURI(libPath.replace("platform:/resource", ""),false);
		}else{//relative path
			throw new IllegalArgumentException("the path of the library must be platform based (platform:/resource or platform:/plugin)");
//			uri = URI.createFileURI(libPath);
		}
		
	    //load the corresponding resource
	    Resource libResource = aSet.getResource(uri, true);
	    HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
	    Builder aBuilder = SaveOptions.newBuilder();
	    SaveOptions anOption = aBuilder.getOptions();
	    anOption.addTo(saveOptions);
	    try {
	    	libResource.load(saveOptions);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		    
		    for (TreeIterator<EObject> iterator = libResource.getAllContents(); iterator.hasNext();) {
				EObject eo = (EObject) iterator.next();
					res.add(eo);
			}
		    
		return res;		
	}
	
	public Set<EObject> getVeryAllElementsFromResourceSetOf(EObject anEobject, EClass type){
		Set<EObject> res = new HashSet<EObject>();
		try {
			EcoreUtil.resolveAll(anEobject);
			anEobject.eResource().load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Resource r : anEobject.eResource().getResourceSet().getResources()) {
			for (TreeIterator<EObject> iterator = r.getAllContents(); iterator.hasNext();) {
				EObject eo = (EObject) iterator.next();
	//			for(EObject refEo : eo.eCrossReferences()){
	//    			Resource otherResource = eObject.eResource();
	//    			if(otherResource != null && !resources.contains(otherResource)){
	//    				resources.add(otherResource);
	//    			}
	//    		}
				
				
				if (eo.eClass().equals(type))
				{res.add(eo);}
				else{
					boolean isToAdd = false;
					for(EClass ec : eo.eClass().getEAllSuperTypes()){
						if (ec.equals(type)){
							isToAdd = true;
						}
					}
					if(isToAdd){
						res.add(eo);
					}
				}
			}
		}
		
		return res;
	}
	
	private int UID = 0;
	private HashMap<EObject, String> eoToID = new HashMap<EObject, String>();
	
	public String getNameOrUID(EObject eo){
		String res="";
		res = eoToID.get(eo); 
		if (res != null && res.length() > 0){
			return res;
		}

		if(eo == null){
			System.err.println("eo Object null");
			return "eoIsNull_"+UID++;
		}
		for( EAttribute ea :	eo.eClass().getEAllAttributes()){
			if (ea.getName().compareTo("name") == 0){
				res = (String) eo.eGet(ea);
				if (res==null){
					res="";
				}
				break;
			}
		}
		if (res==null){
			res = "";
		}
		if(res.length() == 0){
			EAttribute eID = eo.eClass().getEIDAttribute();
			if (eID != null){
				res += "id_"+(String) eo.eGet(eID);
			}
		}
		
		if (res.length() == 0){
			res = eo.getClass().getSimpleName();
		}
		
		res = res+"_"+UID++;
		res = res.replace(' ', '_');
		eoToID.put(eo, res);
		return res;
	}
}
