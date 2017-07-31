/*******************************************************************************
 * Copyright (c) 2017 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *     ENSTA Bretagne - API update, feature enhancement and bug fix
 *******************************************************************************/
package org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.ui.wizard;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class MoCDslProjectCreator extends org.eclipse.xtext.ui.wizard.AbstractPluginProjectCreator {

	protected static final String DSL_GENERATOR_PROJECT_NAME = "org.eclipse.gemoc.moccml.constraint.ccslmocc.model.xtext.mocdsl.generator";

	protected static final String SRC_ROOT = "src";
	protected static final String SRC_GEN_ROOT = "src-gen";
	protected final List<String> SRC_FOLDER_LIST = ImmutableList.of(SRC_ROOT, SRC_GEN_ROOT);

	@Override
	protected MoCDslProjectInfo getProjectInfo() {
		return (MoCDslProjectInfo) super.getProjectInfo();
	}
	
	@Override
	protected String getModelFolderName() {
		return SRC_ROOT;
	}
	
	@Override
	protected List<String> getAllFolders() {
        return SRC_FOLDER_LIST;
    }

    @Override
	protected List<String> getRequiredBundles() {
		List<String> result = Lists.newArrayList(super.getRequiredBundles());
		result.add(DSL_GENERATOR_PROJECT_NAME);
		return result;
	}

	@Override
	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("UTF-8");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate("org::eclipse::gemoc::moccml::constraint::ccslmocc::model::xtext::ui::wizard::MoCDslNewProject::main", getProjectInfo());

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

}