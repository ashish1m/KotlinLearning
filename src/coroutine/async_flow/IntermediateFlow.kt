package coroutine.async_flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runIntermediateFlow()
}

fun runIntermediateFlow() = runBlocking {
    (1..5).asFlow()
            .map { performRequest(it) }
            .collect { println(it) }
}