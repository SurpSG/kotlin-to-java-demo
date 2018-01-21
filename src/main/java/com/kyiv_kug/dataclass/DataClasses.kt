package com.kyiv_kug.dataclass

data class Parent(val child: Child, val about: String) {
    fun deepCopy(child: Child = this.child.copy(), about: String = this.about) = Parent(child, about)
}

data class Child(var name: String)

fun main(args: Array<String>) {
    val child = Child("John")
    val parent = Parent(child, "about 1")
    val parentCopy = parent.deepCopy()

    child.name = "Bob"
    println(parentCopy) //1

    parent.child.name = "Alice"
    println(parentCopy)  //2

    println(parent.child === parentCopy.child) //1
}

