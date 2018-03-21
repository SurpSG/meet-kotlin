package com.sgnatiuk

import java.math.BigInteger

fun main(args: Array<String>) {
    val bigIntVal = BigInteger.valueOf(100500)
    val bigIntVal2 = 100500.bi

    println(bigIntVal == bigIntVal2)
}

val Int.bi: BigInteger
    get() = BigInteger.valueOf(this.toLong())