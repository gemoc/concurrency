/*
 * generated by Xtext
 */
package org.eclipse.gemoc.moccml.mapping.xtext.formatting;

import org.eclipse.ocl.xtext.completeocl.formatting.CompleteOCLFormatter;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class EclFormatter extends CompleteOCLFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		super.configureFormatting(c);
		org.eclipse.gemoc.moccml.mapping.xtext.services.EclGrammarAccess f = (org.eclipse.gemoc.moccml.mapping.xtext.services.EclGrammarAccess) getGrammarAccess();
		for(Pair<Keyword, Keyword> pair: f.findKeywordPairs("{", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1).after(pair.getFirst());
			c.setLinewrap(1).before(pair.getSecond());
			c.setLinewrap(1).after(pair.getSecond());
		}
		for(Keyword comma: f.findKeywords(",")) {
			c.setNoLinewrap().before(comma);
			c.setNoSpace().before(comma);
			c.setLinewrap().after(comma);
		}
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}