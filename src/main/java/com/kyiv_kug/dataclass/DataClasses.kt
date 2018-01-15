package com.kyiv_kug.dataclass

data class Outer(val inner: Inner, val about: String) {
    fun deepCopy(inner: Inner = this.inner.copy(), about: String = this.about) = Outer(inner, about)
}

data class Inner(var name: String, var age: Int)

fun main(args: Array<String>) {
    val inner1 = Inner("inner 1", 1)
    val outer1 = Outer(inner1, "about 1")
    val outer2 = outer1.copy()

    inner1.age = 2

    println(outer2)

    outer1.inner.age = 3

    println(outer2)

    println(outer1.inner === outer2.inner)
}

