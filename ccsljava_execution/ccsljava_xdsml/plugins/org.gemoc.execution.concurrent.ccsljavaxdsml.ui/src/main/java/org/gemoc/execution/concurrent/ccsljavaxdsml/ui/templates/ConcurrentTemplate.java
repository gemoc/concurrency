package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.templates;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.gemoc.execution.concurrent.ccsljavaxdsml.ui.Activator;

import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.templates.AbstractStringWithButtonOption;
import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.templates.TemplateOption;
import fr.inria.diverse.melange.ui.templates.MelangeTemplateMessages;
import fr.inria.diverse.melange.ui.templates.melange.SimpleMTTemplate;

public class ConcurrentTemplate extends SimpleMTTemplate{

	public static final String KEY_ECLFILE_PATH = "eclFilePath"; //$NON-NLS-1$
	
	protected static final String ECL_EXTENSION = "ecl";
	
	// other data specific to this template
	public IFile 		eclIFile;
	protected String 	eclProjectPath;
	
	public ConcurrentTemplate() {
		super();
		TemplateOption eclLocationOption  = new AbstractStringWithButtonOption(this, KEY_ECLFILE_PATH, "ECL path") {
			@Override
			public String doSelectButton() {
				final IWorkbenchWindow workbenchWindow = PlatformUI
						.getWorkbench().getActiveWorkbenchWindow();
				Object selection = null;
				if (workbenchWindow.getSelectionService().getSelection() instanceof IStructuredSelection) {
					selection = ((IStructuredSelection) workbenchWindow
							.getSelectionService().getSelection())
							.getFirstElement();
				}
				final IFile selectedEclFile = selection != null
						&& selection instanceof IFile
						&& ECL_EXTENSION.equals(((IFile) selection)
								.getFileExtension()) ? (IFile) selection : null;
				ViewerFilter viewerFilter = new ViewerFilter() {
					@Override
					public boolean select(Viewer viewer, Object parentElement,
							Object element) {
						if (element instanceof IFile) {
							IFile file = (IFile) element;
							return ECL_EXTENSION.equals(file
									.getFileExtension())
									&& (selectedEclFile == null || !selectedEclFile
											.getFullPath().equals(
													file.getFullPath()));
						}
						return true;
					}
				};
				final IFile[] files = WorkspaceResourceDialog
						.openFileSelection(workbenchWindow.getShell(), null,
								"Select ecl", true, null,
								Collections.singletonList(viewerFilter));
				if (files.length > 0) {
					ConcurrentTemplate.this.eclIFile = files[0];
					//txtPathEcore.setText(files[i].getFullPath().toOSString());
					ConcurrentTemplate.this.eclProjectPath = files[0].getProject().getFullPath().toString();
					return files[0].getFullPath().toString();
				}

				return null;
			}
		};
		registerOption(eclLocationOption, (String) null, 0);
	}
	
	@Override
	public String getSectionId() {
		return "ConcurrentLanguage";
	}
	
	@Override
	public URL getTemplateLocation() {
		// Need to override to get the local Activator
		try {
			String[] candidates = getDirectoryCandidates();
			for (int i = 0; i < candidates.length; i++) {
				if (Activator.getDefault().getBundle().getEntry(candidates[i]) != null) {
					URL candidate = new URL(getInstallURL(), candidates[i]);
					return candidate;
				}
			}
		} catch (MalformedURLException e) { // do nothing
		}
		return null;
	}
	
	@Override
	protected URL getInstallURL() {
		// Need to override to get the local Activator
		return Activator.getDefault().getBundle().getEntry("/");
	}
}
