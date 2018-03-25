package com.sgnatiuk.classes

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

class Square(val a: Int) {

    override fun toString() = "Square(a=$a)"
}

class Rectangle(val a: Int, val b : Int) {

    override fun toString() = "Rectangle(a=$a, b=$b)"
}

