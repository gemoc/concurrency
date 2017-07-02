package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.dialogs;

import java.util.Arrays;

import org.eclipse.gemoc.commons.eclipse.ui.dialogs.SelectPluginIProjectWithFileExtensionDialog;
import org.eclipse.swt.widgets.Shell;

public class SelectMoCCIProjectDialog extends SelectPluginIProjectWithFileExtensionDialog {

	public SelectMoCCIProjectDialog(Shell parentShell) {
		super(parentShell, Arrays.asList("mocc","ccslLib","moccml"));
	}

}
