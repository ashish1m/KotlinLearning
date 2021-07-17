package coroutine

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
//    usingAtomicVars()
//    threadConfinedFine()
//    threadConfinedCoarse()
    withMutex()
}

fun withMutex() = runBlocking{
    var counter = 0
    val mutex = Mutex()
    withContext(Dispatchers.Default) {
        massiveRun {
            mutex.withLock {
                counter++
            }
        }
        println("Counter = $counter")
    }
}

fun threadConfinedCoarse() = runBlocking {
    val counterContext = newSingleThreadContext("CounterContext")
    var counter = 0
    withContext(counterContext) {
        massiveRun {
            counter++
        }
        println("Counter = $counter")
    }
}

fun threadConfinedFine() = runBlocking {
    val counterContext = newSingleThreadContext("CounterContext")
    var counter = 0
    withContext(Dispatchers.Default) {
        massiveRun {
            withContext(counterContext) {
                counter++
            }
        }
        println("Counter = $counter")
    }
}

fun usingAtomicVars() = runBlocking {
    var counter = AtomicInteger()
    withContext(Dispatchers.Default) {
        massiveRun {
            counter.incrementAndGet()
        }
        println("Counter = $counter")
    }
}

suspend fun massiveRun(action: suspend () -> Unit) {
    val n = 100  // number of coroutines to launch
    val k = 1000 // times an action is repeated by each coroutine
    val time = measureTimeMillis {
        coroutineScope { // scope for coroutines
            repeat(n) {
                launch {
                    repeat(k) { action() }
                }
            }
        }
    }
    println("Completed ${n * k} actions in $time ms")
}