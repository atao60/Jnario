/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleImplementationSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameSpec;
import org.jnario.spec.tests.unit.naming.ExamplePendingSpec;
import org.junit.runner.RunWith;

@Contains({ ExampleNameSpec.class, ExampleImplementationSpec.class, ExamplePendingSpec.class })
@CreateWith(SpecTestCreator.class)
@Named("Example")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleSpec {
  @Extension
  ModelStore modelStore;
  
  public Example parse(final String content) {
    final Resource spec = this.modelStore.parseSpec((("\r\n\t\t\tdescribe \"test\"{\r\n\t\t\t\t" + content) + "\r\n\t\t\t}\r\n\t\t"));
    TreeIterator<EObject> _allContents = spec.getAllContents();
    Query _query = Query.query(_allContents);
    return _query.<Example>first(Example.class);
  }
  
  public boolean pendingStateOf(final String string) {
    Example _parse = this.parse(string);
    return _parse.isPending();
  }
}
