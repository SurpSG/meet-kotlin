package com.sgnatiuk

fun main(args: Array<String>) {
    val name = System.getProperty("name") ?: "Kotlin"
    println("Hello $name")
}

