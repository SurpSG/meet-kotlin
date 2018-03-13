package com.sgnatiuk

fun main(args: Array<String>) {
    val voidFunctionResult: Unit = voidFunction()

    val returnValueResult = returnValueFunction()
    println("implicitReturnValueResult=$returnValueResult ${returnValueResult.javaClass.simpleName} \n")

    val implicitReturnValueResult = implicitReturnValueFunction()
    println("implicitReturnValueResult=$implicitReturnValueResult ${implicitReturnValueResult.javaClass.simpleName} \n")

    lambdaArgFunction(
            "Kotlin",
            { name -> // explicit single argument
                println("\t I'm a function as argument. '$name' argument was passed to me \n")
            }
    )

    //if lambda is the last argument in function u can move it outside of round brackets
    lambdaArgFunction("I am 'it'") {
        println("\t I'm a function passed without round brackets. I consumed arg: $it \n")
    }

    lambdaArgFunction(
            "\t I was printed by System.out.println",
            System.out::println //we can pass any other function that satisfies: (String) -> Unit
    )
}

/**
 * void function analogue.
 * Implicitly returns Unit
 */
fun voidFunction(){ //
    println("I'm a void function \n")
}

/**
 * @return String value
 */
fun returnValueFunction() : String {
    return "returnValueFunction"
}

/**
 * Single expression function.
 * Return type can be declared explicitly otherwise it will be inferred automatically
 *
 * @return String value
 */
fun implicitReturnValueFunction() = "implicitReturnValueFunction"

/**
 * The function consumes other function as the argument
 */
fun lambdaArgFunction(
        name: String,
        functionArg: (String) -> Unit
){
    println("[lambdaArgFunction] calling 'functionArg': ")
    functionArg(name) //call function 'functionArg'
}