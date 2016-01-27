package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.contextDSA.CreateDSAWizardContextActionDSAK3;
import org.gemoc.xdsmlframework.ide.ui.commands.AbstractMelangeSelectHandler;
import org.gemoc.xdsmlframework.ide.ui.xdsml.wizards.MelangeXDSMLProjectHelper;

import fr.inria.diverse.melange.metamodel.melange.Language;

public class CreateDSAProjectHandler extends AbstractMelangeSelectHandler implements IHandler  {

	

	@Override
	public Object executeForSelectedLanguage(ExecutionEvent event, IProject updatedGemocLanguageProject, Language language) throws ExecutionException {
		
		CreateDSAWizardContextActionDSAK3 action = new CreateDSAWizardContextActionDSAK3(
				updatedGemocLanguageProject, null);
		action.createNewDSAProject(MelangeXDSMLProjectHelper.getFirstEcore(language));
		return null;
	}

	@Override
	public String getSelectionMessage() {
		return "Select Language that is used to initialize the DSA creation wizard";
	}
	
	
}
