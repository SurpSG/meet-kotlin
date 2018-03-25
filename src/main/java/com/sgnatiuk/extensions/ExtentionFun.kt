package com.sgnatiuk.extensions

fun main(args: Array<String>) {
    val binary: String = 15.toBin()
    println(binary)

    val map = mapOf(
            1 to "1",
            2 to "2"
    )

    println(map.getOrThrow(1))
    println(map.getOrThrow(3))
}

fun Int.toBin() : String = Integer.toString(this, 2)

fun <K,V> Map<K,V>.getOrThrow(key: K) : V {
    return this[key] ?: throw RuntimeException("Key '$key' not found")
}