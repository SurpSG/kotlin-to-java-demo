package com.kyiv_kug.statics.usage.jv;

import com.kyiv_kug.statics.declaration.StaticsClass;

public class Usage {
    static void javaCode() {
        int CONST = StaticsClass.CONST;
        Object CONST_OBJ = StaticsClass.CONST_OBJ;

        StaticsClass.staticInt = 0;
        StaticsClass.staticObj = new Object();

        StaticsClass.staticMethod();
    }

    static void convertedToKotlin() {
        int CONST = StaticsClass.CONST;
        Object CONST_OBJ = StaticsClass.CONST_OBJ;

        StaticsClass.staticInt = 0;
        StaticsClass.staticObj = new Object();

        StaticsClass.staticMethod();
    }

    static void convertedToKotlinWithFixes() {

    }

    static void kotlinCode() {

    }
}