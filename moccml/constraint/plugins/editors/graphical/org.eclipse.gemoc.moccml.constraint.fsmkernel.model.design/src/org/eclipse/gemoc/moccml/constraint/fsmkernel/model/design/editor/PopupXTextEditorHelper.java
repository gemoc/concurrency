/**
 * Copyright (c) 2012-2017 GEMOC consortium.
 * 
 * http://www.gemoc.org
 * 
 * Contributors:
 *   Stephen Creff - ENSTA Bretagne [stephen.creff@ensta-bretagne.fr]
 *   P. Issa Diallo - ENSTA Bretagne [papa_issa.diallo@ensta-bretagne.fr]
 *   
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * $Id$
 */
package org.eclipse.gemoc.moccml.constraint.fsmkernel.model.design.editor;


import java.io.IOException;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.CompoundXtextEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.info.ResourceWorkingCopyFileEditorInput;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.FSMModel.Transition;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.design.Activator;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.design.services.ResourceHelper;
import org.eclipse.gemoc.moccml.constraint.fsmkernel.model.design.services.StringUtil;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;


/**
 * Inspired by the gmf glue example from koehnlein
 * and the xtext support from Cedric Brun
 * @author Creffst
 * @see org.eclipse.xtext.gmf.glue
 */
public class PopupXTextEditorHelper {
	
	private static int MIN_EDITOR_WIDTH = 100;
	private static int MIN_EDITOR_HEIGHT = 20;
	
	/**
	 * Helper to access to the host Edit GraphicalPart 
	 */
	private GraphicalPartHelper hostEditPartHelper;
	
	/**
	 * Helper to manage the resources
	 */
	private ResourceHelper resourceHelper;

	/**
	 * Pop up xtext diagram editor part,
	 * (hostEditPartHelper-..>diagramEditor)
	 */
	private IEditorPart diagramEditor;
	

	/**
	 * Pop up xtext editor composite
	  * (hostEditPartHelper-..>diagramEditor-..>xtextEditorComposite)
	 */
	private Composite xtextEditorComposite;
	
	/**
	 * Pop up xtext editor
	 * (hostEditPartHelper-..>diagramEditor-..>xtextEditorComposite->xtextEditor)
	 */
	private XtextEditor xtextEditor;

	/**
	 * editor offset, 
	 * used to set and save&close the pop up editor
	 */
	private int editorOffset;
	
	/**
	 * initial Editor Size,
	 * used to set and save&close the pop up editor
	 */
	private int initialEditorSize;
	
	/**
	 * initial xtext document size,
	 * used to set and save&close the pop up editor
	 */
	private int initialDocumentSize;

	/**
	 * Dependency tracker service
	 */
	private final Injector xtextInjector;
	
	/**
	 * xtext pop up editor working resource
	 */
	private XtextResource xtextResource;
	
	/**
	 * host resource
	 */
	private Resource originalResource;

	/**
	 * host semantic element fragment
	 */
	private String semanticElementFragment;
	
	/**
	 * last stable text (without error or warning)
	 */
	private String stableText; 
	
	/**
	 * size of the last stable document
	 */
	private int stableDocSize;
	
	/**
	 * last stable text (without error or warning)
	 */
	private String textWithoutDandlingRefs; 
	
	// Modified by pihd
	
	/** X Location of the opened Workbench*/
	private int xLocation;
	
	/** Y Location of the opened Workbench*/
	private int yLocation;
	
	/** Bound of the window*/
	private org.eclipse.swt.graphics.Rectangle winBound;

	/**
	 * Create new PopupXTextEditor on a given edit part to perform direct xtext edition
	 * @param editPart : the host edit part
	 * @param xtextInjector : the dependency tracker xtext injector
	 * @param rectangle 
	 * @wbp.parser.entryPoint
	 */
	// Modified by pihd
	public PopupXTextEditorHelper(IGraphicalEditPart editPart, EObject semanticElement,Injector xtextInjector, int xl, int yl, org.eclipse.swt.graphics.Rectangle rectangle) {
		this.hostEditPartHelper = new GraphicalPartHelper(editPart,semanticElement);
		this.xtextInjector = xtextInjector;
		this.resourceHelper = new ResourceHelper(xtextInjector);
		this.xLocation = xl;
		this.yLocation = yl;
		this.winBound = rectangle;
	}
	
	/**
	 * Show editor
	 * @wbp.parser.entryPoint
	 */
	public void showEditor() {
		try {
			EObject originalSemanticElement = hostEditPartHelper.resolveSemanticElement();
			if (originalSemanticElement == null) {
				return;
			}
			
			if(originalSemanticElement instanceof Transition)
			{
				Transition t = (Transition)originalSemanticElement;
				if(!t.getActions().isEmpty())
				{
					originalSemanticElement = t.getActions().get(t.getActions().size()-1);
				}
				
				else if(t.getGuard()!=null)
				{
					originalSemanticElement = t.getGuard();
				}
				else if(t.getTrigger()!=null)
				{
					originalSemanticElement = t.getTrigger();
				}
				
			}
			this.originalResource = originalSemanticElement.eResource();
			
			this.xtextResource = resourceHelper.createVirtualXtextResource(originalResource, hostEditPartHelper);
			
			// TODO manage multi resource with Xtext Linking or Scoping service
			semanticElementFragment = originalResource.getURIFragment(originalSemanticElement);
			if (semanticElementFragment == null || "".equals(semanticElementFragment)) {
				return;
			}
			IDiagramEditDomain diagramEditDomain = hostEditPartHelper.getDiagramEditDomain();
			diagramEditor = ((DiagramEditDomain) diagramEditDomain).getEditorPart();
			createXtextEditor(new ResourceWorkingCopyFileEditorInput(xtextResource));
		} catch (Exception e) {
			Activator.logError(e);
		} finally {
			if (hostEditPartHelper != null) {
				hostEditPartHelper.refresh();
			}
		}
	}
	
	/**
	 * Close this editor (performing a reconciliation with the host resource or not)
	 * @param isReconcile : true if reconciliation has to be performed
	 */
	public void closeEditor(boolean isReconcile) {
		if (xtextEditor != null) {
			try {
				saveModifications(isReconcile);
			} catch (Exception exc) {
				Activator.logError(exc);
			}
			xtextEditor.dispose();
			xtextEditor = null;
			xtextEditorComposite.setVisible(false);
			xtextEditorComposite.dispose();
			xtextEditorComposite =null;
		}
	}
	
	/**
	 * Performs a reconciliation with the host resource whether possible (document  has no error)
	 * and necessary (resource has been modified)
	 */
	public void saveModifications(boolean isReconcile)throws IOException,BadLocationException {
		
		final IXtextDocument xtextDocument = xtextEditor.getDocument();
		if (isReconcile) {
			String newText = xtextDocument.get(0,xtextDocument.getLength());
			resourceHelper.updateXtextResource(newText);
		}else {
			String newText = xtextDocument.get(0,editorOffset);
			int documentGrowth = xtextDocument.getLength() - stableDocSize;
			newText = newText.concat(stableText);
			newText = newText.concat(xtextDocument.get(editorOffset +stableText.length()+documentGrowth, xtextDocument.getLength()-(editorOffset +stableText.length() + documentGrowth)));
			resourceHelper.updateXtextResource(newText);
		}
	}
	
	private boolean isDocumentHasErrorsOrWarnings(final IXtextDocument xtextDocument) {
		return (xtextDocument.readOnly(new IUnitOfWork<Boolean, XtextResource>() {
			public Boolean exec(XtextResource state) throws Exception {
				IParseResult parseResult = state.getParseResult();
				return !state.getErrors().isEmpty() || (!state.getWarnings().isEmpty()) || parseResult == null || parseResult.hasSyntaxErrors();
			}
		}));
	}
	
	private EList<Diagnostic> getWarnings(final IXtextDocument xtextDocument) {
		return (xtextDocument.readOnly(new IUnitOfWork<EList<Diagnostic>, XtextResource>() {
			public EList<Diagnostic> exec(XtextResource state) throws Exception {
				return state.getWarnings();
			}
		}));
	}
	
	/**
	 * Create the XText editor
	 * @param editorInput the editor input (ResourceWorkingCopyFileEditorInput on the temporary xtext resource)
	 * @throws Exception
	 * @wbp.parser.entryPoint
	 */
	protected void createXtextEditor(IEditorInput editorInput) throws Exception {
		DiagramRootEditPart diagramEditPart = hostEditPartHelper.getRootPart();
		
		Composite parentComposite = (Composite) diagramEditPart.getViewer().getControl();

		xtextEditorComposite = new Shell(parentComposite.getDisplay(),SWT.APPLICATION_MODAL | SWT.CLOSE|SWT.TITLE|SWT.RESIZE); //SWT.TITLE|SWT.CLOSE|SWT.RESIZE | SWT.ON_TOP | SWT.BORDER
		
		// SWT.ICON_WORKING|SWT.TITLE|SWT.CLOSE|SWT.BORDER|SWT.RESIZE
		xtextEditorComposite.setLayout(new FillLayout());

		xtextEditorComposite.addDisposeListener(new DisposeListener() {
			
			//@Override
			public void widgetDisposed(DisposeEvent e) {

				if(xtextEditor !=null)
				{
					final IXtextDocument xtextDocument = xtextEditor.getDocument();
					if (isDocumentHasErrorsOrWarnings(xtextDocument)) 
					{
						showDocumentErrorsOrWarnings(xtextDocument);
						closeEditor(false);
					}
					else 
					{
						closeEditor(true);
					}
				}
			}
		});
		IEditorSite editorSite = diagramEditor.getEditorSite();
		this.xtextEditor = xtextInjector.getInstance(XtextEditor.class);
		
		// remove dirty state editor callback
		xtextEditor.setXtextEditorCallback(new CompoundXtextEditorCallback(Guice.createInjector(new Module() {
			public void configure(Binder binder) {
			}
		})));
		xtextEditor.init(editorSite, editorInput);
		xtextEditor.createPartControl(xtextEditorComposite);

		
		registerKeyListener();
		setEditorRegion();
		setEditorBounds();
		
		/*PopupXTextEditorActionSupport xtextActionSupport = new PopupXTextEditorActionSupport((XtextSourceViewer)xTextEmbeddedEditor.getViewer());//xtextEditor.getInternalSourceViewer());
		xtextActionSupport.initializeActions();
		xtextActionSupport.installUndoRedoSupport();*/
		//}
		xtextEditorComposite.setVisible(true);
		xtextEditorComposite.forceFocus();
		xtextEditor.setFocus();
	}
	
	private boolean showDocumentErrorsOrWarnings(final IXtextDocument xtextDocument) {
		return (xtextDocument.readOnly(new IUnitOfWork<Boolean, XtextResource>() {
			public Boolean exec(XtextResource state) throws Exception {
				IParseResult parseResult = state.getParseResult();
				if (!state.getErrors().isEmpty()) {
					MessageDialog.openWarning(xtextEditorComposite.getShell(), "Warning", "Parsing error(s) remain(s): last stable model will be restored");
					return !state.getErrors().isEmpty();
				}
				if (parseResult.hasSyntaxErrors()) {
					MessageDialog.openWarning(xtextEditorComposite.getShell(), "Warning", "Syntax error(s) remain(s): last stable model will be restored");
					return parseResult.hasSyntaxErrors();
				}
				if (!state.getWarnings().isEmpty()) {
					MessageDialog.openWarning(xtextEditorComposite.getShell(), "Warning", "Parsing warning(s) remain(s): last stable model will be restored");
					return parseResult.hasSyntaxErrors();
				}
				return !state.getErrors().isEmpty() || parseResult == null || parseResult.hasSyntaxErrors();
			}
		}));
	}
	
	
	/**
	 * Add key listener
	 * @see PopupXTextEditorKeyListener
	 */
	private void registerKeyListener() {
		ISourceViewer sourceViewer = xtextEditor.getInternalSourceViewer(); //xTextEmbeddedEditor.getViewer();
//		xtextEditor.setAction(actionID, action);
		final StyledText xtextTextWidget = sourceViewer.getTextWidget();
		PopupXTextEditorKeyListener keyListener = 
				new PopupXTextEditorKeyListener
							(this, ((XtextSourceViewer)sourceViewer).getContentAssistant());
		xtextTextWidget.addVerifyKeyListener(keyListener);
		xtextTextWidget.addKeyListener(keyListener);
	}
	
	

	/**
	 * Set xtext pop up editor region, open xtext document for modifications
	 * @throws BadLocationException
	 */
	private void setEditorRegion() throws BadLocationException {
		final IXtextDocument xtextDocument = xtextEditor.getDocument();
		boolean success = xtextDocument.modify(new IUnitOfWork<Boolean, XtextResource>() {
			
			public Boolean exec(XtextResource state) throws Exception {
				EObject semanticElementInDocument = state.getEObject(semanticElementFragment);
				if (semanticElementInDocument == null) {
					return false;
				}
				
				ICompositeNode xtextNode = NodeModelUtils.getNode(semanticElementInDocument);
				if (xtextNode == null) {
					return false;
				}
				// getOffset() and getLength() are trimming whitespaces
				editorOffset = xtextNode.getOffset();
				initialEditorSize = xtextNode.getLength();
				initialDocumentSize = xtextDocument.getLength();
				stableText = xtextDocument.get(xtextNode.getOffset(), xtextNode.getLength());
				stableDocSize = initialDocumentSize;
				textWithoutDandlingRefs = xtextDocument.get(xtextNode.getOffset(), xtextNode.getLength());

				// insert a newline directly before and after the node
				//xtextDocument.replace(editorOffset, 0, "\n");
				//xtextDocument.replace(editorOffset + 1 + initialEditorSize, 0, "\n");
				return true;
			}

		});
		if (success) {
			xtextEditor.showHighlightRangeOnly(true);
			xtextEditor.setHighlightRange(editorOffset + 1, initialEditorSize, true);
			xtextEditor.setFocus();
		}
	}
	
	/**
	 * Set pop up xtext editor initial bounds
	 */
	private void setEditorBounds() {
		//String editString = xtextEditor.getEditablePart();
		
		final IXtextDocument xtextDocument = xtextEditor.getDocument();
		// mind the added newlines
		String editString = "";
		try {
			editString = xtextDocument.get(editorOffset + 1, initialEditorSize);
		} catch (BadLocationException exc) {
			Activator.logError(exc);
		}
		

		int numLines = StringUtil.getNumLines(editString);
		int numColumns = StringUtil.getMaxColumns(editString);

		IFigure figure = hostEditPartHelper.getFigure();
		Rectangle bounds = figure.getBounds().getCopy();
		DiagramRootEditPart diagramEditPart = (DiagramRootEditPart) hostEditPartHelper.getRootPart();
		IFigure contentPane = diagramEditPart.getContentPane();
		contentPane.translateToAbsolute(bounds);
		EditPartViewer viewer = hostEditPartHelper.getViewer();
		Control control = viewer.getControl();
		while (control != null && false == control instanceof Shell) {
			bounds.translate(control.getBounds().x, control.getBounds().y);
			control = control.getParent();
		}

		Font font = figure.getFont();
		FontData fontData = font.getFontData()[0];
		int fontHeightInPixel = fontData.getHeight();

		int width = Math.max(fontHeightInPixel * (numColumns + 3), MIN_EDITOR_WIDTH);
		int height = Math.max(fontHeightInPixel * (numLines + 4), MIN_EDITOR_HEIGHT);
		
		int x = (int) (xLocation + winBound.width/2);
		int y = (int) (yLocation + winBound.height/2);
		
		xtextEditorComposite.setBounds(x, y, width + 250, height + 50);
		//System.out.println("==============================================================");
		//System.out.println("[WindowBounds = (" +winBound.width+","+winBound.height+")" +", " + "EditHelperBounds = ("+bounds.x+","+bounds.y+"), position =("+xtextEditorComposite.getLocation().x+","+xtextEditorComposite.getLocation().y+"), page = ("+xLocation+","+yLocation+")]");
		//System.out.println("x[" +xtextEditorComposite.getLocation().x+"/"+xLocation+ "]" + "------" + "y[" +xtextEditorComposite.getLocation().y+"/"+yLocation+ "]");
		//System.out.println("==============================================================");
		//xtextEditorComposite.setLocation(x, y);
	}
	
	/**
	 * Set stable text to current state if there are
	 * neither errors nor warnings
	 */
	public void setStableText() {
		final IXtextDocument xtextDocument = xtextEditor.getDocument();
		if (!isDocumentHasErrorsOrWarnings(xtextDocument)) {
			int documentGrowth = xtextDocument.getLength() - initialDocumentSize;		
			try {
				this.stableText = xtextDocument.get(editorOffset, initialEditorSize + documentGrowth);
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
			this.stableDocSize = xtextDocument.getLength();
		}
	}
	
	
	/**
	 * ui cpt to reduce warning message occurences
	 */
	/*private int cpt=0;
	
		synchronized public void check4DandlingCrossReferences(){
		final IXtextDocument xtextDocument = xtextEditor.getDocument();
		EList<Diagnostic> warnings = getWarnings(xtextDocument);
		if (!warnings.isEmpty()) {
			for (Diagnostic diagnostic : warnings) {
				if( diagnostic instanceof XtextLinkingDiagnostic){
					cpt++;
				}
				if (cpt==5) {
					cpt=0;
					MessageDialog.openWarning(xtextEditorComposite.getShell(), "Warning", "Cross-referenced elements cannot be textually modified, please perform a refactoring through the diagram editor ("+((XtextLinkingDiagnostic)diagnostic).getMessage()+")");
				}
			}
			
			try {
				int documentGrowth = xtextDocument.getLength() - initialDocumentSize;
				xtextEditor.getDocument().replace(editorOffset, initialEditorSize + documentGrowth, textWithoutDandlingRefs);
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else 
		{
			try {
				int documentGrowth = xtextDocument.getLength() - initialDocumentSize;
				textWithoutDandlingRefs = xtextDocument.get(editorOffset, initialEditorSize + documentGrowth);
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	*/
	

}