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
package org.eclipse.gemoc.moccml.mapping.qvto2ccsl.ui.popup.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import fr.inria.aoste.timesquare.ccslkernel.parser.xtext.ExtendedCCSLStandaloneSetup;


public class Qvto2CCSLTranslator implements IObjectActionDelegate {
	private IFile modelFile=null;
	private IFile qvtoFile=null;
	private XtextResourceSet aModelResourceSet=null;
	private XtextResourceSet outputResourceSet=null;
	private ResourceSet feedbackResourceSet=null;
	/**
	 * Constructor for Action1.
	 */
	public Qvto2CCSLTranslator() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * just initialization stuff from xtext for an ecl resource
	 */
	private void initializeXtext(){
		ExtendedCCSLStandaloneSetup ess= new ExtendedCCSLStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
		aModelResourceSet = injector.getInstance(XtextResourceSet.class);
		outputResourceSet = injector.getInstance(XtextResourceSet.class);
		//set.setClasspathURIContext(getClasspathURIContext());
		aModelResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		ExtendedCCSLStandaloneSetup.doSetup();
		
		feedbackResourceSet = new ResourceSetImpl();
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		initializeXtext();

		//qvto uri
		String qvtoUriString = qvtoFile.getLocation().toOSString();
	    URI transformationURI = URI.createFileURI(qvtoUriString);
	    
		
	    //model resource
	    String modelUriString = modelFile.getProject().getName()+"/"+modelFile.getProjectRelativePath().toOSString();
	    URI modelUri = URI.createPlatformResourceURI(modelUriString,false);
	    Resource modelResource = aModelResourceSet.getResource(modelUri, true);
	   
	    HashMap<Object, Object> saveOptions = new HashMap<Object, Object>();
	    Builder aBuilder = SaveOptions.newBuilder();
	    SaveOptions anOption = aBuilder.getOptions();
	    anOption.addTo(saveOptions);
	    try {
	    	modelResource.load(saveOptions);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	   
	    //transformationURI is the URI of qvto file
		TransformationExecutor executor = new TransformationExecutor(transformationURI);

		//inResource have the vaule of inModel
		ModelExtent input = new BasicModelExtent(modelResource.getContents());
		ModelExtent output = new BasicModelExtent();
		ModelExtent feedback = new BasicModelExtent();
		
		ExecutionContextImpl context = new ExecutionContextImpl();

		ExecutionDiagnostic diagnostic = executor.execute(context, input, output, feedback);
		System.out.println(diagnostic);
		//output resource saving
		int numberOfCharToRemove = modelUriString.length() - modelUri.fileExtension().length() -1;
	    
		//ccsl file
		String outputPathString = modelUriString.substring(0, numberOfCharToRemove)+ "_MoCC.extendedCCSL";
	    URI outputUri = URI.createPlatformResourceURI(outputPathString,false);
	    Resource outputResource=null;
	    try{
	    	outputResource = outputResourceSet.createResource(outputUri);
	    }catch( Exception e){
	    	System.out.println(e);
	    	outputResource = outputResourceSet.createResource(outputUri);

	    //	outputResource = outputResourceSet.getResource(outputUri,true);
	    };
	    outputResource.getContents().addAll(output.getContents());
	    try {
			outputResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	  //feedback file
	    String feedbackPathString = modelUriString.substring(0, numberOfCharToRemove)+ ".feedback";
	    URI feedbackUri = URI.createPlatformResourceURI(feedbackPathString,false);
	    Resource feedbackResource=null;
	    try{
	    	feedbackResource = feedbackResourceSet.createResource(feedbackUri);
	    }catch( Exception e){
	    	System.out.println(e);
	    	feedbackResource = feedbackResourceSet.createResource(feedbackUri);

	    //	outputResource = outputResourceSet.getResource(outputUri,true);
	    };
	    feedbackResource.getContents().addAll(feedback.getContents());
	    try {
	    	feedbackResource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	/**path
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		qvtoFile=null;
		modelFile=null;
		if (selection instanceof TreeSelection) {
			TreeSelection ts = (TreeSelection) selection;
			Iterator it = ts.iterator();
			while(it.hasNext()){
				Object o = it.next();
				if (o instanceof IFile) {
					IFile f = (IFile)o;
					if (f.getFileExtension().compareTo("qvto")==0){
						qvtoFile = (IFile) o;
					}else{
						modelFile = (IFile) o;
					}
					
					
				}
			}
			
		}
	}

}
