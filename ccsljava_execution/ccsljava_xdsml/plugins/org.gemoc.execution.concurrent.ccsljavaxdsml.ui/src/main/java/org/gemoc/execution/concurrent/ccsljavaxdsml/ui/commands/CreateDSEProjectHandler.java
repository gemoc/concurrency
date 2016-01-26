package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.CreateDSEWizardContextAction;

import fr.inria.diverse.melange.metamodel.melange.Language;

public class CreateDSEProjectHandler extends AbstractMelangeSelectHandler implements IHandler {

	@Override
	public Object executeForSelectedLanguage(ExecutionEvent event, IProject updatedGemocLanguageProject,
			Language language) throws ExecutionException {

		CreateDSEWizardContextAction action = new CreateDSEWizardContextAction(updatedGemocLanguageProject, language);
		action.createNewDSEProject();
		return null;
	}

	@Override
	public String getSelectionMessage() {
		return "Select Language that is used to initialize the DSE creation wizard";
	}

}
