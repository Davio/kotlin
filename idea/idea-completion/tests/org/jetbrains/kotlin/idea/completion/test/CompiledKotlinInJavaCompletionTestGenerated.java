/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

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
@TestMetadata("idea/idea-completion/testData/injava")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CompiledKotlinInJavaCompletionTestGenerated extends AbstractCompiledKotlinInJavaCompletionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInInjava() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/injava"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, false);
    }

    @TestMetadata("AnnotationParameter.java")
    public void testAnnotationParameter() throws Exception {
        runTest("idea/idea-completion/testData/injava/AnnotationParameter.java");
    }

    @TestMetadata("Class.java")
    public void testClass() throws Exception {
        runTest("idea/idea-completion/testData/injava/Class.java");
    }

    @TestMetadata("ClassMembers.java")
    public void testClassMembers() throws Exception {
        runTest("idea/idea-completion/testData/injava/ClassMembers.java");
    }

    @TestMetadata("ClassObject.java")
    public void testClassObject() throws Exception {
        runTest("idea/idea-completion/testData/injava/ClassObject.java");
    }

    @TestMetadata("ClassObjectField.java")
    public void testClassObjectField() throws Exception {
        runTest("idea/idea-completion/testData/injava/ClassObjectField.java");
    }

    @TestMetadata("ClassesFromNamespace.java")
    public void testClassesFromNamespace() throws Exception {
        runTest("idea/idea-completion/testData/injava/ClassesFromNamespace.java");
    }

    @TestMetadata("EnumConstants.java")
    public void testEnumConstants() throws Exception {
        runTest("idea/idea-completion/testData/injava/EnumConstants.java");
    }

    @TestMetadata("InterfaceDefaultImpl.java")
    public void testInterfaceDefaultImpl() throws Exception {
        runTest("idea/idea-completion/testData/injava/InterfaceDefaultImpl.java");
    }

    @TestMetadata("InterfaceDefaultImplImportedMembers.java")
    public void testInterfaceDefaultImplImportedMembers() throws Exception {
        runTest("idea/idea-completion/testData/injava/InterfaceDefaultImplImportedMembers.java");
    }

    @TestMetadata("InterfaceDefaultImplMembers.java")
    public void testInterfaceDefaultImplMembers() throws Exception {
        runTest("idea/idea-completion/testData/injava/InterfaceDefaultImplMembers.java");
    }

    @TestMetadata("InterfaceDefaultImplStaticImportedMembers.java")
    public void testInterfaceDefaultImplStaticImportedMembers() throws Exception {
        runTest("idea/idea-completion/testData/injava/InterfaceDefaultImplStaticImportedMembers.java");
    }

    @TestMetadata("InterfaceDefaultImplsNonImported.java")
    public void testInterfaceDefaultImplsNonImported() throws Exception {
        runTest("idea/idea-completion/testData/injava/InterfaceDefaultImplsNonImported.java");
    }

    @TestMetadata("MultiFileFacade.java")
    public void testMultiFileFacade() throws Exception {
        runTest("idea/idea-completion/testData/injava/MultiFileFacade.java");
    }

    @TestMetadata("MultiFileFacadeMembers.java")
    public void testMultiFileFacadeMembers() throws Exception {
        runTest("idea/idea-completion/testData/injava/MultiFileFacadeMembers.java");
    }

    @TestMetadata("MultiFileFacadeNoImport.java")
    public void testMultiFileFacadeNoImport() throws Exception {
        runTest("idea/idea-completion/testData/injava/MultiFileFacadeNoImport.java");
    }

    @TestMetadata("Nested.java")
    public void testNested() throws Exception {
        runTest("idea/idea-completion/testData/injava/Nested.java");
    }

    @TestMetadata("NestedClassMembers.java")
    public void testNestedClassMembers() throws Exception {
        runTest("idea/idea-completion/testData/injava/NestedClassMembers.java");
    }

    @TestMetadata("NestedClassMembers2.java")
    public void testNestedClassMembers2() throws Exception {
        runTest("idea/idea-completion/testData/injava/NestedClassMembers2.java");
    }

    @TestMetadata("NestedNoImport.java")
    public void testNestedNoImport() throws Exception {
        runTest("idea/idea-completion/testData/injava/NestedNoImport.java");
    }

    @TestMetadata("NestedObjectInstance.java")
    public void testNestedObjectInstance() throws Exception {
        runTest("idea/idea-completion/testData/injava/NestedObjectInstance.java");
    }

    @TestMetadata("ObjectInClassObjects.java")
    public void testObjectInClassObjects() throws Exception {
        runTest("idea/idea-completion/testData/injava/ObjectInClassObjects.java");
    }

    @TestMetadata("ObjectInstance.java")
    public void testObjectInstance() throws Exception {
        runTest("idea/idea-completion/testData/injava/ObjectInstance.java");
    }

    @TestMetadata("RenamedFacade.java")
    public void testRenamedFacade() throws Exception {
        runTest("idea/idea-completion/testData/injava/RenamedFacade.java");
    }

    @TestMetadata("SingleFileFacade.java")
    public void testSingleFileFacade() throws Exception {
        runTest("idea/idea-completion/testData/injava/SingleFileFacade.java");
    }

    @TestMetadata("SingleFileFacadeMembers.java")
    public void testSingleFileFacadeMembers() throws Exception {
        runTest("idea/idea-completion/testData/injava/SingleFileFacadeMembers.java");
    }

    @TestMetadata("SingleFileFacadeNoImport.java")
    public void testSingleFileFacadeNoImport() throws Exception {
        runTest("idea/idea-completion/testData/injava/SingleFileFacadeNoImport.java");
    }

    @TestMetadata("Subpackage.java")
    public void testSubpackage() throws Exception {
        runTest("idea/idea-completion/testData/injava/Subpackage.java");
    }

    @TestMetadata("TopLevelMembers.java")
    public void testTopLevelMembers() throws Exception {
        runTest("idea/idea-completion/testData/injava/TopLevelMembers.java");
    }

    @TestMetadata("TraitMember.java")
    public void testTraitMember() throws Exception {
        runTest("idea/idea-completion/testData/injava/TraitMember.java");
    }
}
