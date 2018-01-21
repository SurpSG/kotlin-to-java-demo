package com.kyiv_kug.stream.kt

import java.util.*


fun main(args: Array<String>) {
    val ints = List(5){ it + 1 }

    val strings: List<String> = ints
            .filter { it > 0 }
            .map { "$it " }

    strings.forEach (::print)
}