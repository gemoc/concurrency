package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.dialogs;

import org.eclipse.gemoc.commons.eclipse.core.resources.FileFinderVisitor;
import org.eclipse.gemoc.commons.eclipse.ui.dialogs.SelectSpecificFileDialog;


public class SelectECLIFileDialog extends SelectSpecificFileDialog {

	@Override
	protected FileFinderVisitor instanciateFinder() {
		return new FileFinderVisitor("ecl");
	}

}
