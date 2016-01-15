package org.gemoc.mocc.transformations.instance2clocksystem.handler;

import java.util.ArrayList;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionDelegate;
import org.gemoc.execution.concurrent.ccsljavaxdsml.api.extensions.languages.ConcurrentLanguageDefinitionExtensionPoint;


public class CompileAndGenerationClockSystemWizard extends Wizard implements IActionDelegate{

  protected Combo _languageCombo;
	
  protected SelectProjectPage one;

  public CompileAndGenerationClockSystemWizard() {
    super();
    setNeedsProgressMonitor(true);
  }

  @Override
  public String getWindowTitle() {
    return "Select xdsml";
  }

  @Override
  public void addPages() {
    one = new SelectProjectPage();
    addPage(one);
  }

  @Override
  public boolean performFinish() {
    return true;
  }

@Override
public void run(IAction action) {
	// TODO Auto-generated method stub
	 System.out.println("run");
}

@Override
public void selectionChanged(IAction action, ISelection selection) {
	// TODO Auto-generated method stub
	
}



public class SelectProjectPage extends WizardPage {
	  private Text text1;
	  private Composite container;

	  public SelectProjectPage() {
	    super("Select xdsml");
	    setTitle("Select xdsml");
	    setDescription("Select xdsml");
	  }

	  @Override
	  public void createControl(Composite parent) {
	    container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 2;
	    
	    createLanguageLayout(container);
	    
	    /*Label label1 = new Label(container, SWT.NONE);
	    label1.setText("Put a value here.");


	    
	    text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
	    text1.setText("");
	    text1.addKeyListener(new KeyListener() {

	      @Override
	      public void keyPressed(KeyEvent e) {
	      }

	      @Override
	      public void keyReleased(KeyEvent e) {
	        if (!text1.getText().isEmpty()) {
	          setPageComplete(true);

	        }
	      }

	    });
	    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	    text1.setLayoutData(gd);*/
	    // required to avoid an error in the system
	    setControl(container);
	    setPageComplete(false);

	  }
	  
	  /**
	   * 
	   * @param parent
	   *            the Parent of this argument tab
	   * @param labelString
	   *            the label of the input text to create
	   */
	  protected void createTextLabelLayout(Composite parent, String labelString) {
	  	GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	  	parent.setLayoutData(gd);
	  	Label inputLabel = new Label(parent, SWT.NONE);
	  	inputLabel.setText(labelString); //$NON-NLS-1$
	  	//gd = new GridData();
	  	//gd.horizontalSpan = 2;
	  	//inputLabel.setLayoutData(gd);
	  }

	  public Composite createLanguageLayout(Composite parent) {
	  	createTextLabelLayout(parent, "xDSML");
	  	_languageCombo = new Combo(parent, SWT.NONE);
	  	//_languageCombo.setLayoutData(createStandardLayout());

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


	  	return parent;
	  }

	  public String getText1() {
	    return text1.getText();
	  }
	}
	 
}
 