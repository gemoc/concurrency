package fr.inria.aoste.timmo2use.tadl2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

public final class TADLImportUriGlobalScopeProvider extends
		ImportUriGlobalScopeProvider {
	
	
	public TADLImportUriGlobalScopeProvider() {
		super();
		
	}

	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		final LinkedHashSet<URI> uniqueImportURIs = super.getImportedUris(resource);		
		Iterator<URI> uriIter = uniqueImportURIs.iterator();
		while(uriIter.hasNext()) {
			URI uri=uriIter.next();
			if (uri.toString()==null || uri.toString().length()==0 )//||  !EcoreUtil2.isValidUri(resource,uri ) )
				uriIter.remove();
		}
		return uniqueImportURIs;
		
	}

	@Override
	protected IScope getScope(Resource resource, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {
		final LinkedHashSet<URI> uniqueImportURIs = getImportedUris(resource);
		IResourceDescriptions descriptions = getResourceDescriptions(resource, uniqueImportURIs);
		List<URI> urisAsList = Lists.newArrayList(uniqueImportURIs);
		Collections.reverse(urisAsList);
		
		Predicate<IEObjectDescription> f = com.google.common.base.Predicates.alwaysTrue();
		IScope scope = IScope.NULLSCOPE;
		for (URI uri : urisAsList) {
			scope = createLazyResourceScope(resource,scope, uri, descriptions, type, f, ignoreCase);
		}
		return scope;
	}
	
	
	HashMap<Resource, EventResourceDescription> map= new HashMap<Resource, EventResourceDescription>();
	
	protected EventResourceDescription getorcreate(Resource resource, String pref)
	{
		EventResourceDescription erd= map.get(resource);
		if (erd!=null)
		{
			boolean t=true;
			if (pref==null )
			{
				t=(erd.getPrefix()==null);
			}
			else
			{
				t=pref.equals(erd.getPrefix());
			}			
			if (t)
			{
				if (erd.getURI().equals(erd.getNormalizedURI(resource)))
					return erd;
			}
		}
		erd = new EventResourceDescription(resource, pref);
		map.put(resource,erd);
		return erd;
		
	}
	
	
	
	protected IScope createLazyResourceScope(Resource r,IScope parent, URI uri,
			IResourceDescriptions descriptions, EClass type,
			Predicate<IEObjectDescription> filter, boolean ignoreCase) {
		try
		{
			IResourceDescription description=null;
			try
			{
			description = descriptions.getResourceDescription(uri);
			}
			catch (Throwable e) {
				Resource resource = EcoreUtil2.getResource(r, uri.toString());
				String string="";
				if (getImportUriResolver() instanceof InterviewImportURIResolver)
				{
					string =( (InterviewImportURIResolver)getImportUriResolver() ).getID(uri.toString());
				}
				description= getorcreate(resource, string);
			}
			return SelectableBasedScope.createScope(parent, description, filter, type, ignoreCase);
		}
		catch (Throwable e) {
			System.err.println("-->" +e.getLocalizedMessage()  + " " +e.getStackTrace()[0]);
			e.printStackTrace();
			return parent;
		}
	}
	
	
}