/*******************************************************************************
 * Copyright (c) 2014, 2017 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.build.fragments;

import org.eclipse.xtext.generator.DefaultGeneratorFragment;

/**
 * Provide the Xtext 2.4+ *.xtextbin support for Xtext 2.3
 */
public class CompatibilityFragment extends DefaultGeneratorFragment
{
//	@Override
//	public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
//		BindFactory bindFactory = new BindFactory();
//		bindFactory.addTypeToType(GrammarProvider.class.getName(), grammar.getName() + "GrammarResource.GrammarProvider");
//		return bindFactory.getBindings();
//	}
}