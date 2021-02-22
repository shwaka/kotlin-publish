package com.github.shwaka.example.mplib

class MPExample {
    companion object {
        fun hello() {
            println("Hello world from mplib!")
        }

        inline fun run(func: () -> Unit) {
            func()
        }

        @Suppress("UNUSED_PARAMETER")
        inline fun ignore(func: () -> Unit) {}
    }

}
