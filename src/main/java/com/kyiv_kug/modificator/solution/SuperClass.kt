package com.kyiv_kug.modificator.solution

open class SuperClass {
    /**
     * cannot be protected in the example
     * https://youtrack.jetbrains.com/issue/KT-21048
     */
    internal open fun protectedMethod() {
        println("SuperClass#protectedMethod")
    }
}

class ChildClass(
        private val superClass: SuperClass
) : SuperClass() {

    override fun protectedMethod() {
        super.protectedMethod()
        superClass.protectedMethod()
    }
}

fun main(args: Array<String>) {
    ChildClass(
            SuperClass()
    ).protectedMethod()
}