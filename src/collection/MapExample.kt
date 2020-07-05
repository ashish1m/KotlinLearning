package collection

fun main(args: Array<String>) {
    //Immutable
    val map = mapOf<Int, String>(1 to "Ashish", 2 to "Mathur", 3 to "Shana")
    println(map.toString())

    //Mutable
    val mutableMap = mutableMapOf<Int, String>(1 to "Ashish", 2 to "Mathur", 3 to "Shana")
    mutableMap[5] = "Sunny"
    println(mutableMap.toString())
}