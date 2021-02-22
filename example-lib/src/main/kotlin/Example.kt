package com.github.shwaka.example.lib

class Example {
    companion object {
        fun hello() {
            println("Hello world from example-lib!")
        }

        inline fun run(func: () -> Unit) {
            func()
        }

        @Suppress("UNUSED_PARAMETER")
        inline fun ignore(func: () -> Unit) {}
    }
}
