package fr.inria.aoste.timmo2use.tadl2;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.inject.Inject;

import fr.inria.aoste.timmo2use.tadl2.TimingExpressions.NamedElement;


public class SimpleNamedElementProvider extends org.eclipse.xtext.naming.SimpleNameProvider {
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof NamedElement) {
			String name = ((NamedElement) obj).getName();
			if (name == null)
				return null;
			if (name.length() == 0)
				return null;
			return qualifiedNameConverter.toQualifiedName(name);
		}
		return null;
	}
}