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
package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.contextDSA.CreateDSAWizardContextActionDSA;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.contextDSA.CreateDSAWizardContextActionDSAK3;
//import org.eclipse.gemoc.gemoc_language_workbench.ui.wizards.contextDSA.CreateDSAWizardContextActionDSAK2;

public class CreateDSAWizardContextAction {

	public enum CreateDSAAction {CREATE_NEW_K2_DSA_PROJECT, CREATE_NEW_K3_DSA_PROJECT, SELECT_EXISTING_DSA_PROJECT};
	
	public CreateDSAAction actionToExecute = CreateDSAAction.CREATE_NEW_K3_DSA_PROJECT;
	
	protected IProject gemocLanguageIProject; 
	
	public CreateDSAWizardContextAction(IProject updatedGemocLanguageProject) {
		gemocLanguageIProject = updatedGemocLanguageProject;
	}

	public void execute() {
		switch (actionToExecute) {
		/*case CREATE_NEW_K2_DSA_PROJECT:
			new CreateDSAWizardContextActionDSAK2(gemocLanguageIProject).createNewDSAProject(); 
			break;*/
		case CREATE_NEW_K3_DSA_PROJECT:
			new CreateDSAWizardContextActionDSAK3(gemocLanguageIProject).createNewDSAProject();
			break;
		case SELECT_EXISTING_DSA_PROJECT:
			new CreateDSAWizardContextActionDSA(gemocLanguageIProject).selectExistingDSAProject();
			break;

		default:
			break;
		}
	}
}
