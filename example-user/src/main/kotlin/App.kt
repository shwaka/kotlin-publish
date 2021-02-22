package com.github.shwaka.example.user

import com.github.shwaka.example.lib.Example
import com.github.shwaka.example.mplib.MPExample

fun main() {
    println("This is main")
    Example.hello()
    Example.run {
        println("This should be run!")
    }
    Example.ignore {
        println("This should be ignored!!!")
    }
    MPExample.hello()
    MPExample.run {
        println("This should be run! (mplib)")
    }
    MPExample.ignore {
        println("This should be ignored!!! (mplib)")
    }
}
