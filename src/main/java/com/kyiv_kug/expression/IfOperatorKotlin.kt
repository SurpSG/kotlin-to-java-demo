package com.kyiv_kug.expression


fun divideAndPrint(a: Int, b: Int, alwaysRoundUp: Boolean) {
    val result = if (alwaysRoundUp)
        (a - 1) / b + 1
    else
        a / b
    println(result)
}

internal fun ternaryDivideAndPrint(a: Int, b: Int, alwaysRoundUp: Boolean) {
    val result = if (alwaysRoundUp)
        (a - 1) / b + 1
    else
        a / b
    println(result)
}


fun main(args: Array<String>) {
    divideAndPrint(1, 3, false)
    divideAndPrint(1, 3, true)
    ternaryDivideAndPrint(1, 3, true)
}
