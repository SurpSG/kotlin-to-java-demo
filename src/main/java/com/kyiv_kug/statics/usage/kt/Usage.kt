package com.kyiv_kug.statics.usage.kt

import com.kyiv_kug.statics.declaration.StaticsClass
import com.kyiv_kug.statics.declaration.StaticsClassKotlin

fun javaCode() {
    val CONST = StaticsClass.CONST
    val CONST_OBJ = StaticsClass.CONST_OBJ

    StaticsClass.staticInt = 0
    StaticsClass.staticObj = Any()

    StaticsClass.staticMethod()
}

fun convertedToKotlin() {
    val CONST = StaticsClassKotlin.CONST
    val CONST_OBJ = StaticsClassKotlin.CONST_OBJ

    StaticsClassKotlin.staticInt = 0
    StaticsClassKotlin.staticObj = Any()

    StaticsClassKotlin.staticMethod()
}

fun convertedToKotlinWithFixes() {

}

fun kotlinCode() {

}