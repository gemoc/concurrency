package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.gemoc.commons.eclipse.core.resources.NewProjectWorkspaceListener;
import org.gemoc.commons.eclipse.ui.WizardFinder;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.DSEProject;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.impl.Concurrent_xdsmlFactoryImpl;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.Activator;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.dialogs.SelectECLIFileDialog;
import org.gemoc.executionframework.ui.xdsml.activefile.ActiveFileEcore;
import org.gemoc.executionframework.xdsml_base.LanguageDefinition;
import org.gemoc.xdsmlframework.ide.ui.xdsml.wizards.XDSMLProjectHelper;

public class CreateDSEWizardContextAction {

	public enum CreateDSEAction {
		CREATE_NEW_DSE_PROJECT, SELECT_EXISTING_DSE_PROJECT
	};

	public CreateDSEAction actionToExecute = CreateDSEAction.CREATE_NEW_DSE_PROJECT;

	// one of these must be set, depending on it it will work on the file or
	// directly in the model
	protected IProject gemocLanguageIProject = null;
	protected ConcurrentLanguageDefinition gemocLanguageModel = null;

	public CreateDSEWizardContextAction(IProject updatedGemocLanguageProject) {
		gemocLanguageIProject = updatedGemocLanguageProject;
	}
	public CreateDSEWizardContextAction(IProject updatedGemocLanguageProject, ConcurrentLanguageDefinition rootModelElement) {
		gemocLanguageIProject = updatedGemocLanguageProject;
		gemocLanguageModel = rootModelElement;
	}
	

	public void execute() {
		switch (actionToExecute) {
		case CREATE_NEW_DSE_PROJECT:
			createNewDSEProject();
			break;
		case SELECT_EXISTING_DSE_PROJECT:
			selectExistingDSEProject();
			break;

		default:
			break;
		}
	}
	
	protected void createNewDSEProject() {
		final IWizardDescriptor descriptor = WizardFinder.findNewWizardDescriptor(Activator.PLUGIN_ID+".wizards.CreateNewDSEProject");
		// Then if we have a wizard, open it.
		if (descriptor != null) {				
			NewProjectWorkspaceListener workspaceListener = new NewProjectWorkspaceListener();
			ResourcesPlugin.getWorkspace().addResourceChangeListener(workspaceListener);
			try {
				IWorkbenchWizard wizard;
				wizard = descriptor.createWizard();
				IWorkbench workbench = PlatformUI.getWorkbench();
				CreateNewDSEProject createNewDSEProjectWizard = (CreateNewDSEProject)wizard;
				// fine initialization
				ConcurrentLanguageDefinition languageDefinition = getLanguageDefinition();
				if(languageDefinition != null){
					createNewDSEProjectWizard._askProjectNamePage.setInitialProjectName(XDSMLProjectHelper.baseProjectName(gemocLanguageIProject)+".dse");
					createNewDSEProjectWizard._askDSEInfoPage.initialTemplateECLFileFieldValue = languageDefinition.getName();
					if(languageDefinition.getDomainModelProject() != null){
						ActiveFileEcore activeEcoreFile = new ActiveFileEcore(gemocLanguageIProject);
						createNewDSEProjectWizard._askDSEInfoPage.initialEcoreFileFieldValue =  "platform:/resource"+activeEcoreFile.getActiveFile().getFullPath();
						createNewDSEProjectWizard._askDSEInfoPage.initialRootContainerFieldValue = languageDefinition.getDomainModelProject().getDefaultRootEObjectQualifiedName();
					}
				}
				wizard.init(workbench, null);
				WizardDialog wd = new WizardDialog(workbench.getActiveWorkbenchWindow().getShell(), wizard);
				wd.create();
				wd.setTitle(wizard.getWindowTitle());
				
				int res = wd.open();
				if(res == WizardDialog.OK){
					ResourcesPlugin.getWorkspace().removeResourceChangeListener(workspaceListener);
					IProject createdProject = workspaceListener.getLastCreatedProject();
					// update the project configuration model					
					if(createdProject != null){
						
						
						addECLFileToConf(createNewDSEProjectWizard.createdProjectName, 
									"/"+createNewDSEProjectWizard.createdProjectName+"/ecl/"+createNewDSEProjectWizard.createdTemplateECLFile+".ecl");
					}
					else{
						Activator.error("not able to detect which project was created by wizard", null);
					}
				}						
			} catch (CoreException e) {
				Activator.error(e.getMessage(), e);
			} finally {
				ResourcesPlugin.getWorkspace().removeResourceChangeListener(workspaceListener);						
			}
		}
		else{
			Activator.error("wizard with id="+Activator.PLUGIN_ID+".ui.wizards.CreateNewDSEProject not found", null);
		}
	}

	protected void selectExistingDSEProject() {
		/*
		 * MessageDialog.openWarning(
		 * PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
		 * "Gemoc Language Workbench UI",
		 * "selectExistingDSEProject. Action not implemented yet");
		 */
		SelectECLIFileDialog dialog = new SelectECLIFileDialog();
		int res = dialog.open();
		if (res == WizardDialog.OK) {
			// update the project model
			addECLFileToConf(((IResource) dialog.getResult()[0]).getProject()
					.getName(), ((IResource) dialog.getResult()[0])
					.getFullPath().toString());
		}
	}
	protected void addECLFileToConf(String projectName, String eclFileURI) {
		
		if(this.gemocLanguageModel != null){
			addECLFileToConf(projectName, eclFileURI, this.gemocLanguageModel);
		} else {
			addECLFileToConf(projectName, eclFileURI, this.gemocLanguageIProject);
		}
	}
	protected void addECLFileToConf(String projectName, String eclFileURI, IProject gemocLanguageIProject) {
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put(Activator.GEMOC_PROJECT_CONFIGURATION_FILE_EXTENSION,
//				new XMIResourceFactoryImpl());
//		ResourceSet resSet = new ResourceSetImpl();
//		// get the resource
//		IFile configFile = gemocLanguageIProject.getFile(new Path(Activator.GEMOC_PROJECT_CONFIGURATION_FILE));
//		Resource resource = resSet
//				.getResource(URI.createURI(configFile.getLocationURI()
//						.toString()), true);
//		ConcurrentLanguageDefinition gemocLanguageWorkbenchConfiguration = (ConcurrentLanguageDefinition) resource
//				.getContents().get(0);
//		
//		addECLFileToConf(projectName, eclFileURI, gemocLanguageWorkbenchConfiguration);
//		
//		try {
//			resource.save(null);
//		} catch (IOException e) {
//			Activator.error(e.getMessage(), e);
//		}
//		if (configFile != null) {
//			try {
//				configFile.refreshLocal(IResource.DEPTH_ZERO,
//						new NullProgressMonitor());
//			} catch (CoreException e) {
//				Activator.error(e.getMessage(), e);
//			}
//		}
	}
	
	protected void addECLFileToConf(String projectName, String eclFileURI, ConcurrentLanguageDefinition languageDefinition) {
		DSEProject eclProject = Concurrent_xdsmlFactoryImpl.eINSTANCE
				.createDSEProject();
		eclProject.setProjectName(projectName);
		
//		ECLFile eclFile = confFactory.eINSTANCE.createECLFile();
//		eclFile.setLocationURI(eclFileURI);
//		eclProject.setEclFile(eclFile);

		
		
		languageDefinition.setDSEProject(eclProject);
			
		
	}

	protected ConcurrentLanguageDefinition getLanguageDefinition(){

		if(this.gemocLanguageModel != null){
			return this.gemocLanguageModel;
		}
		LanguageDefinition ld = XDSMLProjectHelper.getLanguageDefinition(gemocLanguageIProject);
		if(ld instanceof ConcurrentLanguageDefinition)
			return (ConcurrentLanguageDefinition) ld;
		else return null;
	}
}
