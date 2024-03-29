/*
 * generated by Xtext 2.31.0
 */
package com.leonardo.lsaf.sadl.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.leonardo.lsaf.sadl.SADLRuntimeModule;
import com.leonardo.lsaf.sadl.SADLStandaloneSetup;
import com.leonardo.lsaf.sadl.ide.SADLIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class SADLWebSetup extends SADLStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SADLRuntimeModule(), new SADLIdeModule(), new SADLWebModule()));
	}
	
}
