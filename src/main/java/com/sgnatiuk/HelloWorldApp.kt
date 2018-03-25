package com.sgnatiuk

fun main(args: Array<String>) {

    val nameOrEmpty = getSystemProp("name")
    val nameOrDefaultValue = getSystemProp("name", "default value")
    val nameOrComputableValue = getSystemProp("name") { propertyName ->
        "$propertyName ${propertyName.length}"
    }
}

fun getSystemProp(propertyName: String, defaultValue: String = "") = System.getProperty(propertyName) ?: defaultValue

fun getSystemProp(propertyName: String, default: (String) -> String) : String {
    return System.getProperty(propertyName) ?: default(propertyName)
}
