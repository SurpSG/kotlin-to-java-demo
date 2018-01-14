package com.kyiv_kug.stream.kt

import java.util.*


fun main(args: Array<String>) {
    val strings = ArrayList<String>()
    strings.add("A")
    strings.add("B")
    strings.add("C")
    strings.add("D")
    List(4){it+1}
    strings.map { it + " " }.forEach { print(it) }

    "1".let{  }.apply {  }
}