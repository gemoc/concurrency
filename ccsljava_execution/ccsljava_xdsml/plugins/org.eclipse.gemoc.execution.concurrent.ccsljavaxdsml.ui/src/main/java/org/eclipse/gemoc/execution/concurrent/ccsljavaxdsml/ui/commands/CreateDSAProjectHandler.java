///*******************************************************************************
// * Copyright (c) 2017 INRIA and others.
// * All rights reserved. This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *     INRIA - initial API and implementation
// *******************************************************************************/
//package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.commands;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.List;
//import java.util.Set;
//
//import org.eclipse.core.commands.ExecutionEvent;
//import org.eclipse.core.commands.ExecutionException;
//import org.eclipse.core.commands.IHandler;
//import org.eclipse.core.resources.IProject;
//import org.eclipse.core.resources.ResourcesPlugin;
//import org.eclipse.core.runtime.OperationCanceledException;
//import org.eclipse.core.runtime.jobs.Job;
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EStructuralFeature;
//import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.templates.ConcurrentTemplate;
//import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.wizards.contextDSA.CreateDSAWizardContextActionDSAK3;
//import org.eclipse.gemoc.xdsmlframework.ide.ui.commands.AbstractDslSelectHandler;
//import org.eclipse.gemoc.xdsmlframework.ide.ui.xdsml.wizards.MelangeXDSMLProjectHelper;
//import org.eclipse.xtext.nodemodel.INode;
//import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
//import org.eclipse.xtext.resource.XtextResource;
//import org.eclipse.xtext.ui.editor.XtextEditor;
//import org.eclipse.xtext.ui.editor.model.IXtextDocument;
//import org.eclipse.xtext.ui.editor.utils.EditorUtils;
//
//import fr.inria.diverse.melange.metamodel.melange.Language;
//
//public class CreateDSAProjectHandler extends AbstractDslSelectHandler implements IHandler  {
//
//	
//
//	@Override
//	public Object executeForSelectedLanguage(ExecutionEvent event, IProject updatedGemocLanguageProject, String language) throws ExecutionException {
//		
//		CreateDSAWizardContextActionDSAK3 action = new CreateDSAWizardContextActionDSAK3(
//				updatedGemocLanguageProject);
//		action.createNewDSAProject(MelangeXDSMLProjectHelper.getFirstEcore(language));
//		
//		if(action.getLastCreatedProject() != null){
//			waitForAutoBuild();
//			
//			Set<String> aspects = ConcurrentTemplate.getAspectClassesList(action.getLastCreatedProject());
//			
//			updateMelange(event,language,aspects);
//		}
//		
//		return null;
//	}
//
//	@Override
//	public String getSelectionMessage() {
//		return "Select Language that is used to initialize the DSA creation wizard";
//	}
//	
//	protected void updateMelange(ExecutionEvent event, Language language, Set<String> aspects){
//		try {
//			XtextEditor editor = EditorUtils.getActiveXtextEditor();
//			if (editor != null && editor.getLanguageName().equals(MELANGE_EDITOR)) { //Update the editor content
//				
//				IXtextDocument document = editor.getDocument();
//				document.modify((XtextResource it) -> {
//					EStructuralFeature operators = language.eClass().getEStructuralFeature("operators");
//					List<INode> nodesOp = NodeModelUtils.findNodesForFeature(language, operators);
//					int lastOffset = -1;
//					for (INode node : nodesOp) {
//						if (node.getEndOffset() > lastOffset) lastOffset = node.getEndOffset();
//					}
//					if (lastOffset != -1) {
//						final StringBuilder insertion = new StringBuilder();
//						for (String asp : aspects) {
//							insertion.append("\twith " + asp + "\n");
//						}
//						document.replace(lastOffset, 0,	"\n\n" + insertion.toString());
//					}
//					return null; // no computed value
//				});
//			}
//			else{ //Update the Melange file content
//				
//				//Load Melange file
//				String melangeWSLocation = language.eResource().getURI().toPlatformString(true);
//				URI uri = language.eResource().getURI();
//				String melangeLocation =ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()+melangeWSLocation;
//				List<String> lines = Files.readAllLines(Paths.get(melangeLocation));
//				StringBuffer newContent = new StringBuffer();
//				lines.forEach(
//						line -> newContent.append(line+"\n")
//						);
//				
//				//insert after operators
//				EStructuralFeature operators = language.eClass().getEStructuralFeature("operators");
//				List<INode> nodesOp = NodeModelUtils.findNodesForFeature(language, operators);
//				int lastOffset = -1;
//				for(INode node : nodesOp){
//					if(node.getEndOffset() > lastOffset) lastOffset = node.getEndOffset();
//				}
//				if(lastOffset != -1){
//					
//					StringBuilder insertion = new StringBuilder();
//					aspects.stream().forEach(
//							asp -> insertion.append("\twith "+ asp + "\n")
//							);
//					
//					newContent.replace(lastOffset,lastOffset+1, "\n\n"+insertion.toString());
//				}
//				
//				//Write new content
//				Files.write(Paths.get(melangeLocation), newContent.toString().getBytes());
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	protected void waitForAutoBuild() {
//		boolean wasInterrupted = false;
//		do {
//			try {
//				Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD,	null);
//				wasInterrupted = false;
//			} catch (OperationCanceledException e) {
//				e.printStackTrace();
//			} catch (InterruptedException e) {
//				wasInterrupted = true;
//			}
//		} while (wasInterrupted);
//	}
//}
