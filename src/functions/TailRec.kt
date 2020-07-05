package functions

import java.math.BigInteger

fun main(args: Array<String>) {
    println(powCalc(3, 1000, 1))
    println(fibonacci(9, BigInteger("0"), BigInteger("1")))
}

tailrec fun powCalc(base: Int, exp: Int, result: Int): Int {
    return if (exp == 1) result else powCalc(base, exp - 1, result * base)
}

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 1) a + b else fibonacci(n - 1, b, a + b)
}