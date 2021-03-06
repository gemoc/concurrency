/*******************************************************************************
 * Copyright (c) 2017 INRIA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     INRIA - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.contextDSA;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gemoc.commons.eclipse.core.resources.NewProjectWorkspaceListener;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.TemplateListSelectionPage;
import org.eclipse.gemoc.commons.eclipse.ui.WizardFinder;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.Activator;
import org.eclipse.gemoc.executionframework.ui.xdsml.activefile.ActiveFile;
import org.eclipse.gemoc.executionframework.ui.xdsml.activefile.ActiveFileEcore;
import org.eclipse.gemoc.xdsmlframework.ide.ui.xdsml.wizards.MelangeXDSMLProjectHelper;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;

import fr.inria.diverse.k3.ui.wizards.NewK3ProjectWizard;
import fr.inria.diverse.k3.ui.wizards.pages.NewK3ProjectWizardFields.KindsOfProject;


public class CreateDSAWizardContextActionDSAK3 extends CreateDSAWizardContextBase {

	IProject createdProject;
	
	public CreateDSAWizardContextActionDSAK3(IProject gemocLanguageIProject) {
		super(gemocLanguageIProject);
	}
	
	public void createNewDSAProject() {
		createNewDSAProject(null);
	}
	
	public void createNewDSAProject(IFile ecoreFile) {
		// launch DSA Kermeta New wizard		
		IWizardDescriptor descriptor = WizardFinder.findNewWizardDescriptor("fr.inria.diverse.k3.ui.wizards.WizardNewProjectK3Plugin");
		
		// Then if we have a wizard, open it.
			if(descriptor == null) Activator.error("failled to find wizard descriptor with id = fr.inria.diverse.k3.ui.wizards.WizardNewProjectK3Plugin", null);
			if (descriptor != null) {
			// add a listener to capture the creation of the resulting project
			NewProjectWorkspaceListener workspaceListener = new NewProjectWorkspaceListener();
			ResourcesPlugin.getWorkspace().addResourceChangeListener(workspaceListener);
			try {
				IWizard wizard;
				wizard = descriptor.createWizard();
				// this wizard need some dedicated initialization
				NewK3ProjectWizard k3Wizard = (NewK3ProjectWizard)wizard;
				k3Wizard.init(PlatformUI.getWorkbench(), (IStructuredSelection) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection());
				
				if(ecoreFile == null){
					ActiveFile activeFileEcore = new ActiveFileEcore(_gemocLanguageIProject);
					ecoreFile = activeFileEcore.getActiveFile();
				}
				
				k3Wizard.getContext().ecoreIFile = ecoreFile;
				
				WizardDialog wd = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
				
				wd.create();

				k3Wizard.getPageProject().setProjectName(MelangeXDSMLProjectHelper.baseProjectName(_gemocLanguageIProject)+".k3dsa");
				k3Wizard.getPageProject().setProjectKind(KindsOfProject.PLUGIN);
				// set field as much as possible
				
				if (ecoreFile != null) {
					TemplateListSelectionPage templatePage = k3Wizard.getTemplateListSelectionPage(k3Wizard.getContext());
					templatePage.setUseTemplate(true);
					templatePage.setInitialTemplateId("fr.inria.diverse.k3.ui.templates.projectContent.UserEcoreBasicAspect");
					templatePage.selectTemplate("fr.inria.diverse.k3.ui.templates.projectContent.UserEcoreBasicAspect");
					//((NewK3ProjectWizard)wizard).getPageProject().setEcoreLoaded(ecoreFile);
					
				}
				wd.setTitle("New Kermeta 3 project");
				
				
				int res = wd.open();
				if(res == WizardDialog.OK){
					//((KermetaProjectNewWizard )wizard).performFinish();
					ResourcesPlugin.getWorkspace().removeResourceChangeListener(workspaceListener);
					createdProject = workspaceListener.getLastCreatedProject();
					// update the project configuration model
					if(createdProject != null){
						addDSAProjectToConf(createdProject.getName());
					}
				}
			} catch (CoreException e) {
				Activator.error(e.getMessage(), e);
			}
			finally{
				// make sure to remove listener in all situations
				ResourcesPlugin.getWorkspace().removeResourceChangeListener(workspaceListener);
			}
		}
	}
	
	public IProject getLastCreatedProject(){
		return createdProject;
	}

}
