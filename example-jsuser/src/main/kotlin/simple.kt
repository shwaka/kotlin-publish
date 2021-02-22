import com.github.shwaka.example.mplib.MPExample

fun main() {
    MPExample.hello()
    MPExample.run {
        println("This should be run! (mplib)")
    }
    MPExample.ignore {
        println("This should be ignored!!! (mplib)")
    }
}
