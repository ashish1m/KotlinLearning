package coroutine.channel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    var curr = numbersFrom(2)
    repeat(10) {
        var prime = curr.receive()
        println(prime)
        curr = filter(curr, prime)
    }
    coroutineContext.cancelChildren()
}

fun CoroutineScope.numbersFrom(start:Int)= produce {
    var num = start
    while (true) send(num++)
}

fun CoroutineScope.filter(nums: ReceiveChannel<Int>, prime:Int) = produce {
    for (num in nums) {
        if (num % prime != 0){
            send(num)
        }
    }
}