package com.kyiv_kug.expression

fun apply(operation: String, a: Int, b: Int): Int {
    return when (operation) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> throw UnsupportedOperationException("Unknown operation: " + operation)
    }
}

fun apply2(operation: String, a: Int, b: Int) = when (operation) {
    "+" -> a + b
    "-" -> a - b
    "*" -> a * b
    "/" -> a / b
    else -> throw UnsupportedOperationException("Unknown operation: " + operation)
}