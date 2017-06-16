package org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.tabs;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.gemoc.commons.eclipse.emf.EMFResource;
import org.eclipse.gemoc.commons.eclipse.emf.URIHelper;
import org.eclipse.gemoc.commons.eclipse.ui.dialogs.SelectAnyIFileDialog;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.Activator;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.ConcurrentRunConfiguration;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.LauncherMessages;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.dsa.executors.ICodeExecutor;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.deciders.DeciderSpecificationExtension;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.deciders.DeciderSpecificationExtensionPoint;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtension;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtensionPoint;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.ConcurrentRunConfiguration;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.Activator;
import org.gemoc.execution.concurrent.ccsljavaengine.ui.launcher.LauncherMessages;
import org.eclipse.gemoc.executionframework.engine.commons.MelangeHelper;
import org.eclipse.gemoc.executionframework.engine.ui.commons.RunConfiguration;
import org.eclipse.gemoc.xdsmlframework.ui.utils.dialogs.SelectAIRDIFileDialog;
import org.osgi.framework.Bundle;

import org.eclipse.gemoc.dsl.debug.ide.launch.AbstractDSLLaunchConfigurationDelegate;
import org.eclipse.gemoc.dsl.debug.ide.sirius.ui.launch.AbstractDSLLaunchConfigurationDelegateUI;

public class LaunchConfigurationAdvancedTab extends LaunchConfigurationTab {

	protected Composite _parent;
	protected Text _timemodelLocationText;
	public int GRID_DEFAULT_WIDTH = 200;

	@Override
	public void createControl(Composite parent) {
		_parent = parent;
		Composite area = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout(1, false);
		gl.marginHeight = 0;
		area.setLayout(gl);
		area.layout();
		setControl(area);

		Group executionModelArea = createGroup(area, "execution model (.timemodel):");
		createModelLayout(executionModelArea , null);
	

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(RunConfiguration.LAUNCH_DELAY, 1000);
		configuration.setAttribute(ConcurrentRunConfiguration.LAUNCH_SELECTED_DECIDER,
				ConcurrentRunConfiguration.DECIDER_ASKUSER_STEP_BY_STEP);
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			ConcurrentRunConfiguration runConfiguration = new ConcurrentRunConfiguration(configuration);
			_timemodelLocationText.setText(runConfiguration.getExecutionModelPath());
		} catch (CoreException e) {
			Activator.error(e.getMessage(), e);
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(ConcurrentRunConfiguration.EXTRA_TIMEMODEL_PATH, _timemodelLocationText.getText());
	}

	@Override
	public String getName() {
		return "Advanced";
	}

	// -----------------------------------

	/**
	 * Basic modify listener that can be reused if there is no more precise need
	 */
	private ModifyListener fBasicModifyListener = new ModifyListener() {
		@Override
		public void modifyText(ModifyEvent arg0) {
			updateLaunchConfigurationDialog();
		}
	};

	// -----------------------------------

	/***
	 * Create the Field where user enters model to execute
	 * 
	 * @param parent
	 * @param font
	 * @return
	 */
	public Composite createModelLayout(Composite parent, Font font) {
		createTextLabelLayout(parent, "Model to execute");
		// Model location text
		_timemodelLocationText = new Text(parent, SWT.SINGLE | SWT.BORDER);
		_timemodelLocationText.setLayoutData(createStandardLayout());
		_timemodelLocationText.setFont(font);
		_timemodelLocationText.addModifyListener(fBasicModifyListener);
		Button modelLocationButton = createPushButton(parent, "Browse", null);
		modelLocationButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent evt) {
				// handleModelLocationButtonSelected();
				// TODO launch the appropriate selector

				SelectAnyIFileDialog dialog = new SelectAnyIFileDialog();
				if (dialog.open() == Dialog.OK) {
					String modelPath = ((IResource) dialog.getResult()[0]).getFullPath().toPortableString();
					_timemodelLocationText.setText(modelPath);
					updateLaunchConfigurationDialog();
				}
			}
		});
		
		createTextLabelLayout(parent, "");
		return parent;
	}

	private GridData createStandardLayout() {
		return new GridData(SWT.FILL, SWT.CENTER, true, false);
	}

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#isValid(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(ILaunchConfiguration config) {
		setErrorMessage(null);
		setMessage(null);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String timemodelName = _timemodelLocationText.getText().trim();
		if (timemodelName.length() > 0) {
			
			IResource modelIResource = workspace.getRoot().findMember(timemodelName);
			if (modelIResource == null || !modelIResource.exists()) {
				setErrorMessage(NLS.bind("execution model does not exist", new String[] {timemodelName})); 
				return false;
			}
			if (!timemodelName.equals("/")) {
				setWarningMessage("warning, you specified a specific timemodel file in the advanced tab... you may better know what you are doing :)"); 
			}
			if (! (modelIResource instanceof IFile)) {
				setErrorMessage(NLS.bind("execution model invalid file", new String[] {timemodelName})); 
				return false;
			}
		}
		if (timemodelName.length() != 0) {
			setWarningMessage("warning, you specified a specific timemodel file in the advanced tab... you may better know what you are doing :)"); 
		}
		
		return true;
	}
}
