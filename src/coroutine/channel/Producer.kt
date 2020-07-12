package coroutine.channel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking{
    val produce = produceSquares()
    produce.consumeEach { println(it) }
    println("Done")
}

fun CoroutineScope.produceSquares():ReceiveChannel<Int> = produce {
    for (i in 1..5) send(i)
}