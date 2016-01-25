package org.gemoc.execution.concurrent.ccsljavaxdsml.ui.commands;

import com.google.common.collect.Iterables;
import fr.inria.diverse.melange.metamodel.melange.Import;
import fr.inria.diverse.melange.metamodel.melange.Language;
import fr.inria.diverse.melange.metamodel.melange.Operator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.xdsmlframework.ide.ui.commands.AbstractGemocLanguageProjectHandler;

@SuppressWarnings("all")
public abstract class AbstractMelangeProjectHandler extends AbstractGemocLanguageProjectHandler {
  public String getFirstEcorePath(final Language language) {
    EList<Operator> _operators = language.getOperators();
    Iterable<Import> _filter = Iterables.<Import>filter(_operators, Import.class);
    final Import firstImport = IterableExtensions.<Import>head(_filter);
    if ((firstImport != null)) {
      return firstImport.getEcoreUri();
    }
    return null;
  }
  
  public IFile getFirstEcore(final Language lang) {
    final String ecoreURI = this.getFirstEcorePath(lang);
    if ((ecoreURI != null)) {
      final URI uri = URI.createURI(ecoreURI);
      final String filePath = uri.toPlatformString(true);
      final IPath path = new Path(filePath);
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root = _workspace.getRoot();
      return _root.getFile(path);
    }
    return null;
  }
}
