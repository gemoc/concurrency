/*******************************************************************************
 * Copyright (c) 2017 INRIA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     INRIA - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.builder;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.gemoc.commons.eclipse.core.resources.IProjectUtils;
import org.eclipse.gemoc.commons.eclipse.core.resources.NatureToggling;
import org.eclipse.gemoc.commons.eclipse.jdt.JavaProject;
import org.eclipse.gemoc.commons.eclipse.pde.manifest.ManifestChanger;
import org.eclipse.gemoc.commons.eclipse.pde.ui.PluginConverter;
import org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.ui.Activator;
import org.eclipse.gemoc.xdsmlframework.ide.ui.builder.pde.PluginXMLHelper;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.BundleException;

public class ToggleNatureAction implements IObjectActionDelegate {

	private ISelection selection;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) 
	{
		if (selection instanceof IStructuredSelection) 
		{
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it.hasNext();) 
			{
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
				}
				if (project != null) {
					// [FT] Use the AskLanguaeName wizard here because the name of the project may contain some bad characters.
					toggleNature(project);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction,
	 *      org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * Toggles sample nature on a project
	 * 
	 * @param project
	 *            to have sample nature added or removed
	 */
	public void toggleNature(IProject project) 
	{
		try 
		{
//			NatureToggling result = IProjectUtils.toggleNature(project, GemocLanguageDesignerNature.NATURE_ID);
			NatureToggling result =null;
			if (!project.hasNature(GemocLanguageDesignerNature.NATURE_ID)) 
			{
				IProjectUtils.addNature(project, GemocLanguageDesignerNature.NATURE_ID);
				result = NatureToggling.Added;
			}
			else 
			{
//				removeNature(project, natureId);
				result = NatureToggling.Removed;
			}
			
			
			switch (result) {
				case Added:
					JavaProject.create(project);
					addPluginNature(project);
					addGemocNature(project);
					updateManifestFile(project);
					break;
				case Removed:
					removeNature(project, GemocLanguageDesignerNature.NATURE_ID, null);
					break;	
				default:
					break;
			}
		} 
		catch (CoreException | IOException e) 
		{
			Activator.error("Problem while adding Gemoc Language nature to project. " + e.getMessage(), e);
		} 
	}
	
	public static void addNature(IProject project,String natureID, IProgressMonitor monitor) throws CoreException {
		if (monitor != null && monitor.isCanceled()) {
			throw new OperationCanceledException();
		}
		if (!project.hasNature(natureID)) {
			IProjectDescription description = project.getDescription();
			String[] prevNatures= description.getNatureIds();
			String[] newNatures= new String[prevNatures.length + 1];
			System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
			newNatures[prevNatures.length]= natureID;
			description.setNatureIds(newNatures);
			project.setDescription(description, monitor);
		} else {
			if (monitor != null) {
				monitor.worked(1);
			}
		}
	}
	public static void removeNature(IProject project,String natureID, IProgressMonitor monitor) throws CoreException {
			if (monitor != null && monitor.isCanceled()) {
				throw new OperationCanceledException();
			}
			if (project.hasNature(natureID)) {
				IProjectDescription description = project.getDescription();
				String[] natures = description.getNatureIds();
				String[] newNatures = new String[natures.length - 1];
				int i = 0;
				for (String n : natures) {
					if (n.compareTo(natureID) != 0) {
						newNatures[i++] = n;
					}
				}
				description.setNatureIds(newNatures);
				project.setDescription(description, null);
			} else {
				if (monitor != null) {
					monitor.worked(1);
				}
			}
		}

	private void addPluginNature(IProject project) throws CoreException {
		if(!project.hasNature("org.eclipse.pde.PluginNature")) 
		{
			try {
				// create first the plugin.xml file
				PluginXMLHelper.createEmptyTemplateFile(project.getFile(PluginXMLHelper.PLUGIN_FILENAME), false);					
				// convert to plugin and add necessary entries in the build.properties
				PluginConverter.convert(project);							
			} 
			catch (InvocationTargetException | InterruptedException e) 
			{
				Activator.error("cannot add org.eclipse.pde.PluginNature nature to project due to " + e.getMessage(), e);
			}								
		}
	}
	
	private void updateManifestFile(IProject project){
		// complement manifest
		ManifestChanger changer = new ManifestChanger(project);
		try {
			changer.addPluginDependency(org.eclipse.gemoc.xdsmlframework.api.Activator.PLUGIN_ID, "0.1.0", true, true);
			changer.addPluginDependency("org.eclipse.emf.ecore.xmi", "2.8.0", true, true);				
			changer.addPluginDependency("org.eclipse.gemoc.xdsmlframework.api");				
			changer.addPluginDependency("org.eclipse.gemoc.execution.concurrent.ccsljavaxdsml.api");				
			changer.addPluginDependency("org.eclipse.gemoc.execution.concurrent.ccsljavaengine");
			changer.addPluginDependency("org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.k3");
			changer.addPluginDependency("org.eclipse.gemoc.executionframework.engine");
			changer.addPluginDependency("org.eclipse.gemoc.execution.concurrent.ccsljavaengine.extensions.timesquare");
//			changer.addSingleton();
//			changer.addAttributes("Bundle-RequiredExecutionEnvironment","JavaSE-1.7");
			changer.commit();	
		} catch (BundleException | IOException | CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void addGemocNature(IProject project)
			throws CoreException {
		addAsMainNature(project, GemocLanguageDesignerNature.NATURE_ID, null);
		addMissingResourcesToNature(project);
		addGemocResourcesToBuildProperties(project);
		addSourceFolder(project,Activator.EXTENSION_GENERATED_CLASS_FOLDER_NAME);
	}

	// add the nature making sure this will be the first
	public static void addAsMainNature(IProject project, String natureID, IProgressMonitor monitor) throws CoreException{
		if (monitor != null && monitor.isCanceled()) {
			throw new OperationCanceledException();
		}
		if (!project.hasNature(natureID)) {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 1, natures.length);
			newNatures[0] = natureID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} else {
			if (monitor != null) {
				monitor.worked(1);
			}
		}
	}
	
	public void addSourceFolder(IProject project, String folder){
		try {
			IJavaProject javaProject = JavaCore.create(project);
			IClasspathEntry[] entries = javaProject.getRawClasspath();
			IClasspathEntry[] newEntries = new IClasspathEntry[entries.length + 1];
			System.arraycopy(entries, 0, newEntries, 0, entries.length);

			IPath srcPath= javaProject.getPath().append(folder);
			IClasspathEntry srcEntry= JavaCore.newSourceEntry(srcPath, null);

			
			boolean entryfound = false;
			for (IClasspathEntry cpe : entries) {
				if (cpe.equals(srcEntry)){
					entryfound = true;
				}
			}
			
			if (! entryfound) {
				newEntries[entries.length] = JavaCore.newSourceEntry(srcEntry.getPath());
				javaProject.setRawClasspath(newEntries, null);
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void addMissingResourcesToNature(IProject project) {
	}
	
	private void addGemocResourcesToBuildProperties(IProject project){
		
		try {
			Properties properties = new Properties();
			InputStream inputStream = project.getFile("build.properties").getContents();
			properties.load(inputStream);
			String binIncludes = properties.getProperty("bin.includes");
			if(binIncludes != null ){
//				if(!binIncludes.contains("project.xdsml")){
//					properties.put("bin.includes", binIncludes+", project.xdsml");
//				}
			}
			//create an empty InputStream
			PipedInputStream in = new PipedInputStream();
			//create an OutputStream with the InputStream from above as input
			PipedOutputStream out = new PipedOutputStream(in);

			//now work on the OutputStream e.g.
			properties.store(out, "");
			out.close();
			//now you have the OutputStream as InputStream

			//overwrite file contents
			project.getFile("build.properties").setContents(in, true, true, new NullProgressMonitor());
				
		} catch (CoreException e1) {
			Activator.error(e1.getMessage(), e1);
		} catch (IOException e) {
			Activator.error(e.getMessage(), e);
		}
		
	}

}
