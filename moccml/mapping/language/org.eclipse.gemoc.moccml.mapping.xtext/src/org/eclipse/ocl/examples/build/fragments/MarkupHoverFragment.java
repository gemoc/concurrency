/*******************************************************************************
 * Copyright (c) 2012, 2019 I3S laboratory and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     I3S Laboratory - initial API and implementation
 *     ENSTA Bretagne - API update, feature enhancement and bug fix
 *******************************************************************************/
package org.eclipse.ocl.examples.build.fragments;

import java.util.Set;

import org.eclipse.ocl.xtext.base.ui.model.BaseDocumentationProvider;
import org.eclipse.ocl.xtext.markup.ui.hover.MarkupHover;
import org.eclipse.ocl.xtext.markup.ui.hover.MarkupHoverProvider;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.DefaultGeneratorFragment;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;

/**
 * Support Markup in hover text.
 */
public class MarkupHoverFragment  extends DefaultGeneratorFragment
{
	@Override
	public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
		BindFactory bindFactory = new BindFactory();
		bindFactory.addTypeToType(IEObjectHover.class.getName(), MarkupHover.class.getName());
		bindFactory.addTypeToType(IEObjectHoverProvider.class.getName(), MarkupHoverProvider.class.getName());
		bindFactory.addTypeToType(IEObjectDocumentationProvider.class.getName(), BaseDocumentationProvider.class.getName());
		return bindFactory.getBindings();
	}
}