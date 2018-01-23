package com.kyiv_kug.statics.usage.jv;

import com.kyiv_kug.statics.declaration.StaticsClassJava;
import com.kyiv_kug.statics.declaration.StaticsClassKotlin;

public class Usage {
    static void staticJava() {
        int CONST = StaticsClassJava.CONST;
        Object CONST_OBJ = StaticsClassJava.CONST_OBJ;

        StaticsClassJava.staticMethod();
    }

    static void staticKotlin() {
        int CONST = StaticsClassKotlin.CONST;
        Object CONST_OBJ = StaticsClassKotlin.CONST_OBJ;

        StaticsClassKotlin.staticMethod();
    }
}