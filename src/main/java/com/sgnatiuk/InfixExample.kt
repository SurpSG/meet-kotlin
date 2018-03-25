package com.sgnatiuk

import com.sgnatiuk.Radix.*

fun main(args: Array<String>) {
    val arg = 10
    println(arg to Bin)
    println(arg.to(Oct))
}

// implement infix function:
infix fun Int.to(radix: Radix) : String = TODO()

enum class Radix(val value: Int){
    Bin(2),
    Oct(8),
    Hex(16)
}