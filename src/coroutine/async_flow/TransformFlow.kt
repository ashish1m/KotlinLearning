package coroutine.async_flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runTransformFlow()
}

fun runTransformFlow() = runBlocking {
    (1..5).asFlow()
            .transform {
                emit("Making request $it")
                emit(performRequest(it))
            }.collect { println(it) }
}