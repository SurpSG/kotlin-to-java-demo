package com.kyiv_kug.statics.declaration;

import com.kyiv_kug.statics.usage.kt.UsageKt;

public class StaticsClassKotlin {

    public static final int CONST = 1;
    public static final Object CONST_OBJ = new Object();

    public static int staticInt = 2;
    public static Object staticObj = new Object();

    public void method(){
    }

    public static int staticMethod(){
        return 1;
    }
}
