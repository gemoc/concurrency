/*
 * generated by Xtext
 */
package org.eclipse.gemoc.moccml.mapping.xtext;

import org.antlr.runtime.TokenSource;
import org.eclipse.gemoc.moccml.mapping.xtext.parser.antlr.EclParser;
import org.eclipse.gemoc.moccml.mapping.xtext.scoping.EclScopeProvider;
import org.eclipse.gemoc.moccml.mapping.xtext.utilities.ECLResource;
import org.eclipse.ocl.xtext.base.services.RetokenizingTokenSource;
import org.eclipse.ocl.xtext.completeocl.services.CompleteOCLHiddenTokenSequencer;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class EclRuntimeModule extends org.eclipse.gemoc.moccml.mapping.xtext.AbstractEclRuntimeModule {
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bindConstant().annotatedWith(Names.named(org.eclipse.xtext.validation.CompositeEValidator.USE_EOBJECT_VALIDATOR)).to(false);
	}
	
	@SuppressWarnings("restriction")
	@Override
	public Class<? extends org.eclipse.xtext.serializer.sequencer.IHiddenTokenSequencer> bindIHiddenTokenSequencer() {
		return CompleteOCLHiddenTokenSequencer.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.parser.IParser> bindIParser() {
		return RetokenizingECLParser.class;
	}

	public static class RetokenizingECLParser extends EclParser
	{
		@Override
		protected XtextTokenStream createTokenStream(TokenSource tokenSource) {
			return super.createTokenStream(new RetokenizingTokenSource(tokenSource, getTokenDefProvider().getTokenDefMap()));
		}
	}

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return EclScopeProvider.class;
	}
	
	@Override
	public Class<? extends XtextResource> bindXtextResource() {
		return ECLResource.class;
	}
}
