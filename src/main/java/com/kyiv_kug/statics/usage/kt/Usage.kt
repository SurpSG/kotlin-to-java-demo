package com.kyiv_kug.statics.usage.kt

import com.kyiv_kug.statics.declaration.StaticsClassJava
import com.kyiv_kug.statics.declaration.StaticsClassKotlin

fun staticClass() {
    val CONST = StaticsClassJava.CONST
    val CONST_OBJ = StaticsClassJava.CONST_OBJ

    StaticsClassJava.staticMethod()
}

fun staticClassKotlin() {
    val CONST = StaticsClassKotlin.CONST
    val CONST_OBJ = StaticsClassKotlin.CONST_OBJ

    StaticsClassKotlin.staticMethod()
}