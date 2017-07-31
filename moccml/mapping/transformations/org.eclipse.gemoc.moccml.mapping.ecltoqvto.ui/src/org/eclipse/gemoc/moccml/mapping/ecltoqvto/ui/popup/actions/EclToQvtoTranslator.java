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
package org.eclipse.gemoc.moccml.mapping.ecltoqvto.ui.popup.actions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gemoc.moccml.mapping.xtext.EclStandaloneSetup;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import org.eclipse.gemoc.moccml.mapping.ecltoqvto.main.AcceleoLauncherForEclToQvto;

public class EclToQvtoTranslator implements IObjectActionDelegate {
	private IFile eclModel=null;
	private AcceleoLauncherForEclToQvto launcher=null;
	
	/**
	 * Constructor for Action1.
	 */
	public EclToQvtoTranslator() {
		super();
		initializeXtext();
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
		EclStandaloneSetup ess= new EclStandaloneSetup();
		Injector injector = ess.createInjector();
		// instanciate a resource set
	    XtextResourceSet aset = injector.getInstance(XtextResourceSet.class);
		//set.setClasspathURIContext(getClasspathURIContext());
		aset.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		EclStandaloneSetup.doSetup();
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {		
	    // create a uri
	    String uristring = eclModel.getLocation().toOSString();
	    URI uri = URI.createFileURI(uristring);
	    String folderPath = uri.devicePath().replace(uri.lastSegment(), "");
	    File folder = new File(folderPath);
       
        List<String> arguments = new ArrayList<String>();
        String qvtoFileName = uri.lastSegment().replace(".ecl", "_toCCSL.qvto");
        arguments.add(qvtoFileName);
       arguments.add("Package"); //by default, use the uml root
        
        try {
        	System.out.println("launching ecl to qvto:\n\turi="+uri+"\n\tfolder="+folder+"\n\targs="+arguments);
			launcher = new AcceleoLauncherForEclToQvto(uri, folder, arguments);
			launcher.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
		
		

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		eclModel=null;
		if (selection instanceof StructuredSelection) {
			StructuredSelection ss = (StructuredSelection) selection;
			Object o = ss.getFirstElement();
			if (o instanceof IFile) {
				eclModel = (IFile) o;
				
			}
		}
	}

}
