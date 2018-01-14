package com.kyiv_kug.statics.usage.jv;

import com.kyiv_kug.statics.declaration.StaticsClass;
import com.kyiv_kug.statics.declaration.StaticsClassKotlin;

public class Usage {

    static void staticClass() {
        int CONST = StaticsClass.CONST;
        Object CONST_OBJ = StaticsClass.CONST_OBJ;

        StaticsClass.staticInt = 0;
        StaticsClass.staticObj = new Object();

        StaticsClass.staticMethod();
        new StaticsClass().method();
    }

    static void staticClassKotlin() {
        int CONST = StaticsClassKotlin.CONST;
        Object CONST_OBJ = StaticsClassKotlin.CONST_OBJ;

        StaticsClassKotlin.staticInt = 0;
        StaticsClassKotlin.staticObj = new Object();

        StaticsClassKotlin.staticMethod();
        new StaticsClassKotlin().method();
    }

    static void staticClassRefactoredKt() {

    }
}