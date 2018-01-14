package com.kyiv_kug.statics.usage.kt

import com.kyiv_kug.statics.declaration.FixedStaticClass
import com.kyiv_kug.statics.declaration.StaticsClass
import com.kyiv_kug.statics.declaration.StaticsClassKotlin

fun staticClass() {
    val CONST = StaticsClass.CONST
    val CONST_OBJ = StaticsClass.CONST_OBJ

    StaticsClass.staticInt = 0
    StaticsClass.staticObj = Any()

    StaticsClass.staticMethod()
    StaticsClass().method()
}

fun staticClassKotlin() {
    val CONST = StaticsClassKotlin.CONST
    val CONST_OBJ = StaticsClassKotlin.CONST_OBJ

    StaticsClassKotlin.staticInt = 0
    StaticsClassKotlin.staticObj = Any()

    StaticsClassKotlin.staticMethod()
    StaticsClassKotlin().method()
}

fun staticClassRefactored() {
    val CONST = FixedStaticClass.CONST
    val CONST_OBJ = FixedStaticClass.CONST_OBJ

    FixedStaticClass.staticInt = 0
    FixedStaticClass.staticObj = Any()

    FixedStaticClass.staticMethod()
    FixedStaticClass().method()
}