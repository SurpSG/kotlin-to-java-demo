package com.kyiv_kug.stream.kt


fun main(args: Array<String>) {
    val ints = List(5){ it + 1 }

    val strings = ints.asSequence()
            .filter { it > 0 }
            .map { "$it " }
            .toList()

    strings.forEach (::print)
}