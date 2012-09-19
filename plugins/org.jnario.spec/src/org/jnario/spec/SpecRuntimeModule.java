/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.jnario.spec;

import org.eclipse.xtend.core.compiler.XtendOutputConfigurationProvider;
import org.eclipse.xtend.core.featurecalls.XtendIdentifiableSimpleNameProvider;
import org.eclipse.xtend.core.jvmmodel.DispatchUtil;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtend.core.jvmmodel.SyntheticNameClashResolver;
import org.eclipse.xtend.core.linking.XtendLinkingDiagnosticMessageProvider;
import org.eclipse.xtend.core.resource.XtendLocationInFileProvider;
import org.eclipse.xtend.core.resource.XtendResource;
import org.eclipse.xtend.core.scoping.XtendImportedNamespaceScopeProvider;
import org.eclipse.xtend.core.validation.ClasspathBasedChecks;
import org.eclipse.xtend.core.validation.XtendEarlyExitValidator;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.generator.IFilePostProcessor;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.serializer.sequencer.IContextFinder;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.TraceAwarePostProcessor;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.resource.JvmDeclaredTypeSignatureHashProvider.SignatureHashBuilder;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.util.XExpressionHelper;
import org.eclipse.xtext.xbase.validation.EarlyExitValidator;
import org.jnario.compiler.JnarioCompiler;
import org.jnario.compiler.JnarioExpressionHelper;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.DocOutputConfigurationProvider;
import org.jnario.generator.JnarioJavaIoFileSystemAccess;
import org.jnario.jvmmodel.ExtendedJvmModelGenerator;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioDispatchUtil;
import org.jnario.jvmmodel.JnarioSignatureHashBuilder;
import org.jnario.linking.JnarioLazyLinker;
import org.jnario.linking.JnarioLinkingService;
import org.jnario.report.Executable2ResultMatcher;
import org.jnario.scoping.JnarioExtensionClassNameProvider;
import org.jnario.serializer.JnarioContextFinder;
import org.jnario.spec.compiler.SpecBatchCompiler;
import org.jnario.spec.conversion.SpecValueConverterService;
import org.jnario.spec.doc.SpecDocGenerator;
import org.jnario.spec.jvmmodel.SpecJvmModelInferrer;
import org.jnario.spec.jvmmodel.SpecSyntheticNameClashResolver;
import org.jnario.spec.naming.SpecQualifiedNameProvider;
import org.jnario.spec.report.Spec2ResultMatcher;
import org.jnario.spec.scoping.SpecResourceDescriptionStrategy;
import org.jnario.spec.scoping.SpecScopeProvider;
import org.jnario.spec.validation.SpecClassPathBasedChecks;
import org.jnario.typing.JnarioTypeProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecRuntimeModule extends org.jnario.spec.AbstractSpecRuntimeModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(AbstractDocGenerator.class).to(SpecDocGenerator.class);
		binder.bind(SignatureHashBuilder.class).to(JnarioSignatureHashBuilder.class);
		binder.bind(SyntheticNameClashResolver.class).to(SpecSyntheticNameClashResolver.class);
		binder.bind(Executable2ResultMatcher.class).to(Spec2ResultMatcher.class);
	}
	
	public Class<? extends ILinkingDiagnosticMessageProvider> bindILinkingDiagnosticMessageProvider() {
		return XtendLinkingDiagnosticMessageProvider.class;
	}
	
	public Class<? extends DispatchUtil> bindDispatchUtil(){
		return JnarioDispatchUtil.class;
	}
	
	public Class<? extends JvmTypesBuilder> bindJvmTypesBuilder(){
		return ExtendedJvmTypesBuilder.class;
	}
	
	public Class<? extends JvmModelGenerator> bindJvmModelGenerator(){
		return ExtendedJvmModelGenerator.class;
	}
	
	@Override
	public java.lang.Class<? extends IScopeProvider> bindIScopeProvider() {
		return SpecScopeProvider.class;
	}

	public Class<? extends ExtensionClassNameProvider> bindExtensionClassNameProvider(){
		return JnarioExtensionClassNameProvider.class;
	}
	
	@Override
	public Class<? extends ITypeProvider> bindITypeProvider() {
		return JnarioTypeProvider.class;
	}
	
	@Override
	public Class<? extends XtextResource> bindXtextResource() {
		return XtendResource.class;
	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return SpecValueConverterService.class;
	}

	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(XtendImportedNamespaceScopeProvider.class);
	}

	@Override
	public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
		return XtendIdentifiableSimpleNameProvider.class;
	}

	public Class<? extends IJvmModelInferrer> bindIJvmModelInferrer() {
		return SpecJvmModelInferrer.class;
	}

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return SpecQualifiedNameProvider.class;
	}
	
	public Class <? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return SpecResourceDescriptionStrategy.class;
	}

	public Class<? extends JvmModelAssociator> bindJvmModelAssociator() {
		return IXtendJvmAssociations.Impl.class;
	}

	public Class<? extends EarlyExitValidator> bindEarlyExitValidator() {
		return XtendEarlyExitValidator.class;
	}
	
	public Class<? extends OutputConfigurationProvider> bindOutputConfigurationProvider() {
		return DocOutputConfigurationProvider.class;
	}
	
	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return JnarioCompiler.class; 
	}
	

	public Class<? extends IFilePostProcessor> bindPostProcessor() {
		return TraceAwarePostProcessor.class;
	}
	
	@Override
	public Class<? extends IGenerator> bindIGenerator() {
		return JvmModelGenerator.class;
	}
	
	public Class<? extends ClasspathBasedChecks> bindClassPathBasedChecks(){
		return SpecClassPathBasedChecks.class;
	}
	
	public Class<? extends IContextFinder> bindContextFinder(){
		return JnarioContextFinder.class;
	}
	
	@Override
	public Class<? extends ILinker> bindILinker() {
		return JnarioLazyLinker.class;
	}
	
	@Override
	public Class<? extends ILinkingService> bindILinkingService() {
		return JnarioLinkingService.class;
	}
	
	public Class<? extends JavaIoFileSystemAccess> bindJavaIoFileSystemAccess() {
		return JnarioJavaIoFileSystemAccess.class;
	}
	
	public Class<? extends org.jnario.compiler.JnarioBatchCompiler> bindJnarioBatchCompiler(){
		return SpecBatchCompiler.class;
	}
	
	public Class<? extends XExpressionHelper> bindXExpressionHelper() {
		return JnarioExpressionHelper.class;
	}
	
	public Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
		return XtendOutputConfigurationProvider.class;
	}
	
	@Override
	public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
		return XtendLocationInFileProvider.class;
	}
	
}
