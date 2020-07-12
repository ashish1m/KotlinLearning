package coroutine.async_flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    numFlowUsingBuffer()
    numFlowUsingConflate()
}

fun numFlowUsingBuffer() = runBlocking {
    val time = measureTimeMillis {
        numFlow()
                .buffer()
                .collect {
                    delay(300)
                    println("Collected $it")
                }
    }
    println("Collected in $time ms")
}

fun numFlowUsingConflate() = runBlocking{
    val time = measureTimeMillis {
        numFlow()
                .conflate()
                .collect {
                    delay(300)
                    println("Collected $it")
                }
    }
    println("Collected in $time ms")
}

fun numFlow(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100) // pretend we are asynchronously waiting 100 ms
        emit(i) // emit next value
    }
}