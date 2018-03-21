package com.sgnatiuk

fun main(args: Array<String>) {

    //final NonNullable
    val name : String
    val property : String? = System.getProperty("name") //elvis operator
    if(property == null){
        name = "Kotlin"
    }else{
        name = property
    }

    // non final, NonNullable
    var result : String = "Hello "
    //result = null - Not allowed

    result += name // string template

    println(result)
}



//void function
//function return value
//single/last lambda arg. inline