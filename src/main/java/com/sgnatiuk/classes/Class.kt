package com.sgnatiuk.classes

fun main(args: Array<String>) {
    listOf(
            Square(2),
            Rectangle(1, 2)
    ).forEach {
        println("$it perimeter=${it.perimeter()}")
    }
}

interface Shape{
    fun perimeter(): Int
}

open class Square(val a: Int) : Shape {

    override fun perimeter() = 4 * a
    override fun toString() = "Square(a=$a)"
}

class Rectangle(a: Int, val b : Int) : Square(a) {

    override fun perimeter() = 2 * (a + b)
    override fun toString() = "Rectangle(a=$a, b=$b)"
}

