package coroutine

import kotlinx.coroutines.*

fun main(args: Array<String>) {
    GlobalScope.launch {
        delay(1000L)
        println("World.")
    }
    print("Hello, ")
    runBlocking {
        delay(2000L)
    }

//    structuredCoroutine()
    scopeBuilder()
}

//Or
fun main() = runBlocking<Unit> {
    val job = GlobalScope.launch {
        delay(1000L)
        println("World.")
    }
    print("Hello, ")
    job.join()
}

fun structuredCoroutine() = runBlocking {
    launch {
        delay(1000L)
        println("Coroutine.")
    }
    print("Structured, ")
}

fun scopeBuilder() = runBlocking {
    launch {
        delay(200L)
        println("Task from runBlocking")
    }

    coroutineScope { // Creates a coroutine scope
        launch {
            delay(500L)
            println("Task from nested launch")
        }

        delay(100L)
        println("Task from coroutine scope") // This line will be printed before the nested launch
    }

    println("Coroutine scope is over") // This line is not printed until the nested launch completes
}

suspend fun suspendingFun() {
    delay(1000L)
    println("This is a suspending function. " +
            "Also, it can be used with any other suspending functions and can be called from coroutine scope. ")
}
