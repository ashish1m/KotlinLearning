package coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    println("Program started.")
    var job = GlobalScope.launch {
        delay(200)
        println("Welcome to coroutine.")
    }
    runBlocking {
       job.join()
    }
    println("Program ended.")
}
