package com.kyiv_kug.boxing

fun main(args: Array<String>) {
    print(0)
    val arg = 1
    print(arg)
    print(2)
    val argNull: Int? = null
    print(argNull)
}

private fun print(a: Int) {
    println(a.toString() + " int")
}

private fun print(a: Int?) {
    println(a?.toString() + " Integer")
}



