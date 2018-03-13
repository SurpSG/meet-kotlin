package com.sgnatiuk

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths


interface WorkListener{
    fun onSuccess(result: String)
    fun onFailure(e : Exception)
}

class ConsolePrintListener() : WorkListener{

    override fun onSuccess(result: String) {
        println(result)
    }

    override fun onFailure(e: Exception) {
        System.err.println(e.message)
    }
}

class StoreToFileListener(
        private val workListener: WorkListener,
        filePath : String
) : WorkListener {

    private val path : Path by lazy {
        Paths.get(filePath)
    }

    override fun onSuccess(result: String) {
        workListener.onSuccess(result)
        Files.write(path, listOf(result))
    }

    override fun onFailure(e: Exception) {
        workListener.onFailure(e)
    }
}

fun main(args: Array<String>) {

    val listener = StoreToFileListener(
            ConsolePrintListener(),
            "output.txt"
    )

    listener.onSuccess("some result")

    listener.onFailure(
            Exception("something went wrong")
    )
}