package oops

fun main(args: Array<String>) {
    val sum = object {
        var a: Int = 0
        var b: Int = 0
    }

    println(sum.a + sum.b)
}