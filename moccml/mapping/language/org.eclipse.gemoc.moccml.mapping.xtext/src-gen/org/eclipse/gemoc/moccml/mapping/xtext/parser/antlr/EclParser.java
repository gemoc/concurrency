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