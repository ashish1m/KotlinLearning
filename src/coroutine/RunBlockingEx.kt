package coroutine

import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    runBlocking {
        suspendFunCall()
    }
    print("Run blocking ends")
}

suspend fun suspendFunCall() {
    println("This is a suspended function.")
}

