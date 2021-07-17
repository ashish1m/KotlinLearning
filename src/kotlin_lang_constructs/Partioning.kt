package kotlin_lang_constructs

fun main(args: Array<String>) {
    val numList = listOf<Int>(3, 4, 5, 6, 7)
    val numListNullable = listOf<Int?>(3, null, 4, 5, 6, 7)

    val (first, second) = numList.partition { it > 5 }
    println(first)
    println(second)

    val (firstNullable, secondNullable) = numListNullable.partition { it != null && it > 5 }
    println(firstNullable)
    println(secondNullable)
}