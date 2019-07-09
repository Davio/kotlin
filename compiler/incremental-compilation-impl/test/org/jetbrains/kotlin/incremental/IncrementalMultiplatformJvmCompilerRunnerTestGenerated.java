/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("jps-plugin/testData/incremental/singleModule/common")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalMultiplatformJvmCompilerRunnerTestGenerated extends AbstractIncrementalMultiplatformJvmCompilerRunnerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInCommon() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/singleModule/common"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
    }

    @TestMetadata("touchActual")
    public void testTouchActual() throws Exception {
        runTest("jps-plugin/testData/incremental/singleModule/common/touchActual/");
    }

    @TestMetadata("touchExpect")
    public void testTouchExpect() throws Exception {
        runTest("jps-plugin/testData/incremental/singleModule/common/touchExpect/");
    }

    @TestMetadata("jps-plugin/testData/incremental/singleModule/common/touchActual")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TouchActual extends AbstractIncrementalMultiplatformJvmCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInTouchActual() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/singleModule/common/touchActual"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/singleModule/common/touchExpect")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TouchExpect extends AbstractIncrementalMultiplatformJvmCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInTouchExpect() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/singleModule/common/touchExpect"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }
    }
}
