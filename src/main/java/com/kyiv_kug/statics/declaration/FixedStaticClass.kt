package com.kyiv_kug.statics.declaration

class FixedStaticClass {

    fun method() {
    }

    companion object{
        const val CONST = 1
        @JvmField
        val CONST_OBJ = Any()

        @JvmField
        var staticInt = 2
        @JvmField
        var staticObj = Any()

        @JvmStatic
        fun staticMethod(): Int = 1
    }
}

