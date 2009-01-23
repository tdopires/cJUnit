/*
 * This file is covered by the terms of the Common Public License v1.0.
 *
 * Copyright (c) SZEDER Gábor
 *
 * Parts of this software were developed within the JEOPARD research
 * project, which received funding from the European Union's Seventh
 * Framework Programme under grant agreement No. 216682.
 */

package de.fzi.cjunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
	de.fzi.cjunit.builders.ConcurrentBuilderTest.class,
	de.fzi.cjunit.runners.ConcurrentRunnerTest.class,
	de.fzi.cjunit.jpf.util.ArgumentCreatorTest.class,
	de.fzi.cjunit.jpf.util.StackFrameConverterTest.class,
	de.fzi.cjunit.jpf.util.ExceptionFactoryTest.class,
	de.fzi.cjunit.jpf.inside.TestWrapperTest.class,
	de.fzi.cjunit.jpf.outside.JPFInvokerTest.class
})
public class BaseTests {
}