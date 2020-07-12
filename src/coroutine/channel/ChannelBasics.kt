package coroutine.channel

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    channelOfSqrdVal()
}

fun channelOfSqrdVal() = runBlocking {
    val channel = Channel<Int>()

    launch {
        for (i in 1..5) {
            channel.send(i*i)
        }
        channel.close()
    }
    for(i in channel){
        println(i)
    }
    println("Done")
}