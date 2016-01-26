package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.commons.eclipse.core.resources.FileFinderVisitor;
import org.gemoc.xdsmlframework.ide.ui.Activator;
import org.gemoc.xdsmlframework.ide.ui.commands.AbstractGemocLanguageProjectHandler;
import org.gemoc.xdsmlframework.ui.utils.dialogs.SelectAnyMelangeLanguageDialog;

import com.google.common.collect.Iterables;

import fr.inria.diverse.melange.metamodel.melange.Import;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.Operator;

@SuppressWarnings("all")
public abstract class AbstractMelangeProjectHandler extends AbstractGemocLanguageProjectHandler {
	
	public abstract Object executeForSelectedLanguage(ExecutionEvent event, IProject updatedGemocLanguageProject, Language language) throws ExecutionException;
	
	public abstract String getSelectionMessage();
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// get the optional selection and eventually project data to preset the wizard
		final IProject updatedGemocLanguageProject = getUpdatedGemocLanguageProjectFromSelection(event);
		
		final IFile melangeFile = getMelangeFileFromSelection(event);
		final ResourceSet rs = new ResourceSetImpl();
		if(melangeFile != null){
			final URI uri = URI.createPlatformResourceURI(melangeFile.getFullPath().toString(), true);
			rs.getResource(uri, true);
		}
		else{
			
			FileFinderVisitor melangeProjectVisitor = new FileFinderVisitor("melange");
			try {
				updatedGemocLanguageProject.accept(melangeProjectVisitor);
				for(IFile projectMelangeIFile: melangeProjectVisitor.getFiles()){
					// consider all melange files in the project, get them in the ResourceSet
					if(!(projectMelangeIFile.getFullPath().toString().contains("/bin/")|projectMelangeIFile.getFullPath().toString().contains("/target/"))){ 
						// stupid check to remove some typical duplicates, a beter impl should look into java output
						
						final URI uri = URI.createPlatformResourceURI(projectMelangeIFile.getFullPath().toString(), true);
						rs.getResource(uri, true);
					}
				}
			} catch (CoreException e) {
				Activator.error(e.getMessage(), e);
			}
		}	
			
		final LabelProvider labelProvider = new LabelProvider(){								
			public String getText(Object element) {
				if(element instanceof Language){
					return ((Language)element).getName();
				} else	return super.getText(element);
			}
		};
		final SelectAnyMelangeLanguageDialog dialog = new SelectAnyMelangeLanguageDialog(rs, labelProvider);
		dialog.setTitle("Select Melange language");
		dialog.setMessage(getSelectionMessage());
		final int res = dialog.open();
		if (res == WizardDialog.OK) {
			final Language lang = (Language)dialog.getFirstResult();
			executeForSelectedLanguage(event, updatedGemocLanguageProject, lang);
		}
			
		return null;
	} 
	
  public String getFirstEcorePath(final Language language) {
    EList<Operator> _operators = language.getOperators();
    Iterable<Import> _filter = Iterables.<Import>filter(_operators, Import.class);
    final Import firstImport = IterableExtensions.<Import>head(_filter);
    if ((firstImport != null)) {
      return firstImport.getEcoreUri();
    }
    return null;
  }
  
  public IFile getFirstEcore(final Language lang) {
    final String ecoreURI = this.getFirstEcorePath(lang);
    if ((ecoreURI != null)) {
      final URI uri = URI.createURI(ecoreURI);
      final String filePath = uri.toPlatformString(true);
      final IPath path = new Path(filePath);
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root = _workspace.getRoot();
      return _root.getFile(path);
    }
		return null;
	}
}
