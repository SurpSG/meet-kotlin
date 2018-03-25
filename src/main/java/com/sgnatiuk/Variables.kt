package com.sgnatiuk

fun main(args: Array<String>) {

    // final non Nullable variable.
    // Cannot be initialized with null.
    // Cannot be rewritten
    val finalNonNullable : String = ""

    // final Nullable variable
    // Cannot be rewritten
    val finalNullable : String? = null
    val finalNullableLength: Int = finalNullable?.length ?: 0 // get length via safe call '?.' or 0

    // Cannot contains null.
    var nonNullable : String = ""
    nonNullable = "new value"

    // Can be rewritten
    // May contains null
    var nullable : String? = null
    nullable = "new value"
    // no need safe call. Compiler smart enough to understand that it was reinitialized with non null
    val lengthSafeCall: Int = nullable.length
}

