package org.eclipse.gemoc.execution.concurrent.ccsljavaengine.tests

import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.tests.languages.TFSM
import org.eclipse.gemoc.execution.concurrent.ccsljavaengine.tests.wrapper.JavaCCSLEngineWrapper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestHelper
import org.eclipse.gemoc.executionframework.test.lib.impl.TestModel
import org.junit.Test

class JavaCCSLEngineTests {

	public static val tfsmModelsPlugin = "org.gemoc.sample.tfsm.concurrent.simple_example"

	@Test
	def void testTFSM() {
		TestHelper::testWithoutExtraAddons(new JavaCCSLEngineWrapper(), new TFSM(),
			new TestModel(tfsmModelsPlugin, "/", "simple_example.xtfsm", "", "", 50))
	}

}
