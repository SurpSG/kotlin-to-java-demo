package com.kyiv_kug.expression

fun main(args: Array<String>) {
    val msg = try {
        "arg successfully parsed: " + Integer.parseInt(args[0])
    } catch (e: Exception) {
        e.message ?: e::class.java.name
    } finally {
        "no content"
    }
    println(msg)
}