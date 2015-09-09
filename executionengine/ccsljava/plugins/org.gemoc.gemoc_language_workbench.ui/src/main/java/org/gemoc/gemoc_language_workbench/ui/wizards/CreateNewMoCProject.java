package org.gemoc.gemoc_language_workbench.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.gemoc.commons.eclipse.core.resources.Project;
import org.gemoc.commons.eclipse.pde.ui.PluginConverter;
import org.gemoc.gemoc_language_workbench.ui.Activator;
//import org.gemoc.gemoc_language_workbench.ui.dse.AddRemoveGemocDSENatureHandler;
import org.gemoc.gemoc_language_workbench.ui.wizards.pages.AskMoCInfoWizardPage;

public class CreateNewMoCProject extends Wizard implements INewWizard {

	public WizardNewProjectCreationPage _askProjectNamePage;
	public AskMoCInfoWizardPage _askMoCInfoPage;
	//private AddRemoveGemocDSENatureHandler nature;
	
	private IProject createdProject = null; 
	
	
	public String createdProjectName = "";
	public String createdTemplateMoCFile = "";
	

	public CreateNewMoCProject() {
		super();
		//this.nature = new AddRemoveGemocDSENatureHandler();
		this.setWindowTitle("Create MoCCML project");
		_askProjectNamePage = new WizardNewProjectCreationPage("NewProjectName");
		_askProjectNamePage.setTitle("Project");
		_askProjectNamePage.setDescription("Create a new MoCCML Project");
		addPage(_askProjectNamePage);

		_askMoCInfoPage = new AskMoCInfoWizardPage("NewMoCInfo");
		_askMoCInfoPage.setTitle("MoCCML");
		_askMoCInfoPage.setDescription("Specify the MoCC");
		addPage(_askMoCInfoPage);	
	}

	@Override
	public void addPages() {
		super.addPages();
	}

	@Override
	public boolean needsPreviousAndNextButtons() {
		return true;
	}
	
	@Override
	public boolean canFinish() {
		return getContainer().getCurrentPage() == _askMoCInfoPage
				&& _askMoCInfoPage.isPageComplete();
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page == _askProjectNamePage) {
			//_askLanguageNamePage.setLanguageName(_askProjectNamePage.getProjectName());
		}
		return super.getNextPage(page);
	}
		
	@Override
	public boolean performFinish() {
		
		try {
			createdProject = _askProjectNamePage.getProjectHandle();
			//final String languageName = _askLanguageNamePage.getLanguageName();

			IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
			final IProjectDescription description = workspace.newProjectDescription(createdProject.getName());
			if (!_askProjectNamePage.getLocationPath().equals(workspace.getRoot().getLocation()))
				description.setLocation(_askProjectNamePage.getLocationPath());
			//description.setLocationURI(_askProjectNamePage.getLocationURI());
			
			IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				 public void run(IProgressMonitor monitor) throws CoreException {
					 createdProject.create(description, monitor);
					 createdProject.open(monitor);
					// addDSEProjectNature(createdProject);
					 
					 try {
						PluginConverter.convert(createdProject);
					 } catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					 } catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					 }
					
					 String filePath = "mocc/" + _askMoCInfoPage.getTemplateMoCFileNameFile() + ".moccml";
					 Project.createFile(createdProject, filePath, "AutomataConstraintLibrary "+_askMoCInfoPage.getTemplateMoCFileNameFile().toString()+"{ \n\n}", monitor);
//						
					
					 // save some result for embedding this wizard in a process
					 createdProjectName = _askProjectNamePage.getProjectName();
					 createdTemplateMoCFile = _askMoCInfoPage.getTemplateMoCFileNameFile();
					 
					 createdProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
					 createdProject.touch(new NullProgressMonitor()); // [FT] One touch to force eclipse to serialize the project properties that will update accordingly the gemoc actions in the menu.
					 //createdProject.build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
				 }
			};
			ResourcesPlugin.getWorkspace().run(operation, null);
		} catch (CoreException exception) {
			Activator.error(exception.getMessage(), exception);
			return false;
		}
		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}
	
	public IProject getCreatedProject() {
		return createdProject;
	}
}