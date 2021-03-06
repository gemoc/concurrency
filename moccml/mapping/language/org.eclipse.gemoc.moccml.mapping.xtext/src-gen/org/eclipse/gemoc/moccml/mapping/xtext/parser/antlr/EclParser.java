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
/*
 * generated by Xtext
 */
package org.eclipse.gemoc.moccml.mapping.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.gemoc.moccml.mapping.xtext.services.EclGrammarAccess;

public class EclParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private EclGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.gemoc.moccml.mapping.xtext.parser.antlr.internal.InternalEclParser createParser(XtextTokenStream stream) {
		return new org.eclipse.gemoc.moccml.mapping.xtext.parser.antlr.internal.InternalEclParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ECLDocument";
	}
	
	public EclGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EclGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
