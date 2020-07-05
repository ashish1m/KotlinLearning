package collection

fun main(args: Array<String>) {
    //Immutable
    val set = setOf<Int>(2, 3, 4, 5, 6, 7, 7, 8, 8, 5, 9)
    println(set.toString())

    //Mutable set
    val mutableSet = mutableSetOf<Int>(2, 3, 4, 5, 6, 7, 4, 5, 6, 6, 3, 4)
    println(mutableSet.toString())
    mutableSet.add(19)
    println(mutableSet.toString())

    val hashSet = hashSetOf<Int>(2, 4, 5, 6, 7, 4, 5, 6, 6, 3, 4)
    println(hashSet.toString())
}