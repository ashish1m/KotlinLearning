package collection

fun main(args: Array<String>) {
    val list = listOf<Int>(2, 3, 4, 5, 20, 90, 110)
    println(list.toString())

    val check1 = list.all { it > 10 }
    println(check1)

    val check2 = list.any { it > 10 }
    println(check2)

    val count = list.count { it > 10 }
    println(count)

    val num = list.find { it > 10 }
    println(num)
}