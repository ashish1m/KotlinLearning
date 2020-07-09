package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runAsyncFlow()
}

fun runAsyncFlow() = runBlocking<Unit> {
    launch {
        for (k in 1..5) {
            println("I'm not blocked $k")
            delay(100)
        }
    }
    // Collect the flow
    foo().collect { println(it) }
}

fun foo(): Flow<Int> = flow { // flow builder
    for (i in 1..5) {
        delay(100) // pretend we are doing something useful here
        emit(i) // emit next value
    }
}