package com.kyiv_kug.expression

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4)
    val index = 0
    val msg = try {
        "$index element is: ${list[0]}"
    } catch (e: Exception) {
        e.message ?: e::class.java.name
    } finally {
        "no content"
    }
    println(msg)
}