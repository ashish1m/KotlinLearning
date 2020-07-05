package functions

import java.math.BigInteger

fun main(args: Array<String>) {
    var sum = getSum(2, 4)
    println(sum)
    printSum(2, 4)
    println("3 pow 3 is ${pow(3, 3)}")
}

fun printSum(a: Int, b: Int) {
    println("Sum is ${a + b}")
}

fun getSum(a: Int, b: Int): Int {
    return a + b
}

//function as expression
fun pow(base: Int, exp: Int): BigInteger = base.toBigInteger().pow(exp)