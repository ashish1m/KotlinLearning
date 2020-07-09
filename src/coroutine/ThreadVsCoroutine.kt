package coroutine

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    threadTest()
    coroutineTest()
}

fun threadTest() {
    var counter = 0
    val numOfThreads = 1_000_000

    val time = measureTimeMillis {
        repeat(numOfThreads) {
            thread {
                counter++
            }
        }
    }
    println("Created ${numOfThreads} threads in ${time}ms.")
}

fun coroutineTest() = runBlocking {
    var counter = 0
    val numOfCoroutines = 1_000_000

    val time = measureTimeMillis {
        repeat(numOfCoroutines) {
            launch {
                counter++
            }
        }
    }
    println("Created ${numOfCoroutines} coroutines in ${time}ms.")
}