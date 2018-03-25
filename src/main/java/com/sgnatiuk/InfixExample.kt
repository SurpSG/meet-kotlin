package com.sgnatiuk

import com.sgnatiuk.Radix.*

fun main(args: Array<String>) {
    val arg = 10
    println(arg to Bin)
    println(arg.to(Hex))
    println(arg to Oct)
}

infix fun Int.to(radix: Radix) : String = Integer.toString(this, radix.value)

enum class Radix(val value: Int){
    Bin(2),
    Oct(8),
    Hex(16)
}