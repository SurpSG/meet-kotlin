package com.sgnatiuk

fun main(args: Array<String>) {
    val shapes = listOf<Any>(
            Square(2),
            Rectangle(1, 2)
    )

    for (shape in shapes) {
        println(shape)
    }
}

interface Shape{
    fun perimeter(): Int
}

open class Square(val a: Int) {

    override fun toString(): String {
        return "Square(a=$a)"
    }
}

class Rectangle(val a: Int, val b : Int) {

    override fun toString(): String {
        return "Rectangle(a=$a, b=$b)"
    }
}

