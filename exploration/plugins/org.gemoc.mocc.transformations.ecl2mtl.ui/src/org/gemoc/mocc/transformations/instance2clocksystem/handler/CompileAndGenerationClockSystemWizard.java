package org.gemoc.mocc.transformations.instance2clocksystem.handler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.gemoc.commons.eclipse.emf.EMFResource;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtensionPoint;
import org.gemoc.execution.concurrent.ccsljavaxdsml.concurrent_xdsml.ConcurrentLanguageDefinition;
import org.gemoc.xdsmlframework.api.extensions.languages.LanguageDefinitionExtension;
import org.osgi.framework.Bundle;


public class CompileAndGenerationClockSystemWizard extends Wizard {

  protected Combo _languageCombo;
	
  protected File sourceFile;

  private SelectProjectPage selectProject;

  private boolean hasFinished = false;
  
  public CompileAndGenerationClockSystemWizard() {
    super();
    setNeedsProgressMonitor(true);
  }

  @Override
  public String getWindowTitle() {
    return "Select xdsml";
  }
  
  protected boolean sourceFileHasChanged = true;
  
  public File getSourceFile() { 
	if(sourceFile==null || sourceFileHasChanged){
		retrieveSourceFile();
	}
	return sourceFile;
  }

  public void setSourceFile(File sourceFile) {
	this.sourceFile = sourceFile;
  }

  @Override
  public void addPages() {
	selectProject = new SelectProjectPage();
    addPage(selectProject);
  }

  @Override
  public boolean performFinish() {
	  hasFinished = true;
	  return true;
  }

  public boolean isHasFinished() {
	return hasFinished;
}

@Override
  public boolean performCancel() {
	  hasFinished = false;
	  return true;
  }
  
  private File retrieveSourceFile(){
	  	File sourceFile = null;
	  	LanguageDefinitionExtension dfe = ConcurrentLanguageDefinitionExtensionPoint.findDefinition(selectProject.projectName);

	  	String xdsmluri = dfe.getXDSMLFilePath();
		if (!xdsmluri.startsWith("platform:/plugin"))
			xdsmluri = "platform:/plugin" + xdsmluri;
		Object o = EMFResource.getFirstContent(xdsmluri);
		if(o != null && o instanceof ConcurrentLanguageDefinition){
			ConcurrentLanguageDefinition ld = (ConcurrentLanguageDefinition)o;
		
			Bundle bundle = Platform.getBundle(ld.getDSEProject().getProjectName());
			if( bundle == null )
				throw new RuntimeException("Could not resolve plugin: " + ld.getDSEProject().getProjectName());
			
			try {
				//System.out.println("@@@ " + FileLocator.getBundleFile(bundle) + "/mtl-gen/");
				setSourceFile(new File(FileLocator.getBundleFile(bundle) + "/mtl-gen/"));
				sourceFileHasChanged = false;
			} catch (IOException e) {
				//IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				//Activator.getDefault().getLog().log(status);
			}
		}
		return sourceFile;
  }
  
  
  @Override
  public boolean canFinish() {
	  if(selectProject.projectName!=null){
		//  System.out.println("@@@ " + selectProject.projectName);
		  if(getSourceFile()!=null){
			  return true;
		  }
	  }
	  return false;
	  
  };

public class SelectProjectPage extends WizardPage {
	  private Text selectProjectText;
	  private Composite container;
	  private String projectName;

	  public SelectProjectPage() {
	    super("Select the Xdsml","Select xdsml", ImageDescriptor
				.createFromImage(new Image(Display.getCurrent(),
			  			CompileAndGenerationClockSystemWizard.class.getResourceAsStream(
				  			      "/../icons/clocksystem_logo_64x64.png"))));
	    //setTitle("Select xdsml");
	    setDescription("Select a xdsml to define the clocksystem execution semantics");
	  }

	  public void createControl(Composite parent) {
	    container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 2;
	    createLanguageLayout(container);
	    setControl(container);
	    setPageComplete(false);
	  }
	  
	  
	  
	  /**
	   * 
	   * @param parent
	   *            the Parent
	   * @param labelString
	   *            the label of the input text to create
	   */
	  protected Label createTextLabelLayout(Composite parent, String labelString) {
	  	GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	  	parent.setLayoutData(gd);
	  	Label inputLabel = new Label(parent, SWT.NONE);
	  	inputLabel.setText(labelString); //$NON-NLS-1$
	  	return inputLabel;
	  }

	  public Composite createLanguageLayout(Composite parent) {
		//createTextLabelLayout(parent, "xDSML");
	  	Label label = createTextLabelLayout(parent, "xDSML");
	  	Image image = new Image(getShell().getDisplay(),
	  			CompileAndGenerationClockSystemWizard.class.getResourceAsStream(
	  			      "/../icons/IconeGemocLanguage-16.png"));
	  	label.setImage(image);
	  	_languageCombo = new Combo(parent, SWT.NONE);

	  	ArrayList<String> xdsmlNames = new ArrayList<String>();
	  	IConfigurationElement[] confElements = Platform
	  			.getExtensionRegistry()
	  			.getConfigurationElementsFor(
	  					ConcurrentLanguageDefinitionExtensionPoint.GEMOC_CONCURRENT_LANGUAGE_EXTENSION_POINT);
	  	for (int i = 0; i < confElements.length; i++) {
	  		xdsmlNames.add(confElements[i].getAttribute("name"));
	  	}
	  	if (confElements.length == 0) {
	  		xdsmlNames.add("<No xdml available>");
	  	}
	  	String[] empty = {};
	  	_languageCombo.setItems(xdsmlNames.toArray(empty));
	  	
	  	
	  	_languageCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				projectName = _languageCombo.getText();
				sourceFileHasChanged = true;
				if(projectName!=null){
					setPageComplete(true);
				}else{
					setPageComplete(false);
				}
			}
		});
	  	
	  	return parent;
	  }

	  public String getSelectProjectText() {
	    return selectProjectText.getText();
	  }
	}

	 
}
 