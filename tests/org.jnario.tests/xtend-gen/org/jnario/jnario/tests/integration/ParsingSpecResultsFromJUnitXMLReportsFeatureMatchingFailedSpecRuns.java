package org.jnario.jnario.tests.integration;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.StringInputStream;
import org.hamcrest.StringDescription;
import org.jnario.Executable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.JnarioIteratorExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.report.Spec2ResultMapping;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecResultParser;
import org.jnario.runner.CreateWith;
import org.jnario.runner.Extension;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Matching failed Spec runs")
@CreateWith(value = SpecTestCreator.class)
@SuppressWarnings("all")
public class ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingFailedSpecRuns {
  @Test
  @Order(0)
  @Named("Given a specification")
  public void givenASpecification() {
    StepArguments _stepArguments = new StepArguments("\n\t\t\tpackage example\n\t\t\t\n\t\t\tdescribe \"Adding values\"{\n\t\t\t\tfact \"4 + 3 is 8\"{\n\t\t\t\t\t4 + 3 => 8\n\t\t\t\t}\n\t\t\t}\n\t\t\t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    Resource _parseSpec = this._modelStore.parseSpec(_first);
    TreeIterator<EObject> _allContents = _parseSpec.getAllContents();
    Iterator<Example> _filter = Iterators.<Example>filter(_allContents, Example.class);
    Example _first_1 = JnarioIteratorExtensions.<Example>first(_filter);
    this.specification = _first_1;
  }
  
  @Test
  @Order(1)
  @Named("And a test result xml file")
  public void andATestResultXmlFile() {
    StepArguments _stepArguments = new StepArguments("\n\t\t\t<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n\t\t\t<testsuite failures=\"1\" time=\"0.017\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"example.AddingValuesSpec\">\n\t\t\t  <properties>\n\t\t\t    <property name=\"java.runtime.name\" value=\"Java(TM) SE Runtime Environment\"/>\n\t\t\t  </properties>\n\t\t\t  <testcase time=\"0.017\" classname=\"example.AddingValuesSpec\" name=\"4 + 3 is 8\">\n\t\t\t    <failure message=\"\n\t\t\tExpected 4 + 3 =&gt; 8 but\n\t\t\t     4 + 3 is &lt;7&gt;\n\t\t\t\" type=\"java.lang.AssertionError\">java.lang.AssertionError: \n\t\t\tExpected 4 + 3 =&gt; 8 but\n\t\t\t     4 + 3 is &lt;7&gt;\n\t\t\t\tat org.junit.Assert.fail(Assert.java:93)\n\t\t\t\tat org.junit.Assert.assertTrue(Assert.java:43)\n\t\t\t\tat example.AddingValuesSpec.__43Is8(AddingValuesSpec.java:22)\n\t\t\t</failure>\n\t\t\t  </testcase>\n\t\t\t</testsuite>\t\n\t\t\t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    String _trim = _first.trim();
    StringInputStream _stringInputStream = new StringInputStream(_trim);
    this.resultParser.parse(_stringInputStream, this.spec2ResultMapping);
  }
  
  @Test
  @Order(2)
  @Named("Then the spec execution \"failed\"")
  public void thenTheSpecExecutionFailed() {
    StepArguments _stepArguments = new StepArguments("failed");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    final boolean shouldPass = Objects.equal(_first, "passed");
    SpecExecution _result = this.spec2ResultMapping.getResult(this.specification);
    boolean _hasPassed = _result.hasPassed();
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_hasPassed), Boolean.valueOf(shouldPass));
    Assert.assertTrue("\nExpected  but"
     + "\n      is " + new StringDescription().appendValue(Boolean.valueOf(_hasPassed)).toString() + "\n", _doubleArrow);
    
  }
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  Spec2ResultMapping spec2ResultMapping;
  
  @Inject
  SpecResultParser resultParser;
  
  Executable specification;
}
