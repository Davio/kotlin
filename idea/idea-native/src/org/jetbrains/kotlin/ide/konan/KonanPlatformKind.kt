/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ide.konan

import org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments
import org.jetbrains.kotlin.cli.common.arguments.konan.K2NativeCompilerArguments
import org.jetbrains.kotlin.config.TargetPlatformVersion
import org.jetbrains.kotlin.platform.IdePlatform
import org.jetbrains.kotlin.platform.IdePlatformKind
import org.jetbrains.kotlin.resolve.konan.platform.KonanPlatform

object KonanPlatformKind : IdePlatformKind<KonanPlatformKind>() {

    override fun platformByCompilerArguments(arguments: CommonCompilerArguments): IdePlatform<KonanPlatformKind, CommonCompilerArguments>? {
        return if (arguments is K2NativeCompilerArguments) Platform
        else null
    }

    override val compilerPlatform get() = KonanPlatform

    override val platforms get() = listOf(Platform)
    override val defaultPlatform get() = Platform

    override val argumentsClass get() = K2NativeCompilerArguments::class.java

    override val name get() = "Native"

    object Platform : IdePlatform<KonanPlatformKind, K2NativeCompilerArguments>() {
        override val kind get() = KonanPlatformKind
        override val version get() = TargetPlatformVersion.NoVersion
        override fun createArguments(init: K2NativeCompilerArguments.() -> Unit) = K2NativeCompilerArguments().apply(init)
    }

    override fun equals(other: Any?): Boolean = other === KonanPlatformKind
    override fun hashCode(): Int = javaClass.hashCode()
}

val IdePlatformKind<*>?.isKonan
    get() = this === KonanPlatformKind

val IdePlatform<*, *>?.isKonan
    get() = this === KonanPlatformKind.Platform