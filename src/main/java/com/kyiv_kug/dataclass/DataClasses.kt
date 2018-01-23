package com.kyiv_kug.dataclass

data class Parent(val child: Child)

data class Child(var name: String)

fun main(args: Array<String>) {
    val child = Child("John")
    val parent = Parent(child)
    val parentCopy = parent.copy()

    child.name = "Bob"
    println(parentCopy) //1

    println(parent.child === parentCopy.child) //2
}

