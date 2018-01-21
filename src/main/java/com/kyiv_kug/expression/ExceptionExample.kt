package com.kyiv_kug.expression

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4)
    val index = 6
    val msg = try {
        "$index element is: ${list[index]}"
    } catch (e: Exception) {
       "${ e.message}"
    } finally {
        "no content"
    }.trim()

    println(msg)
}