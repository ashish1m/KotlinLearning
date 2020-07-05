package functions

fun main(args: Array<String>) {
    var str1 = "Shana"
    var str2 = "Arora"

    //One way of using infix func
    println(str1 concat str2)
    //Other way of using infix func
    println(str1.concat(str2))
}

infix fun String.concat(str: String) = "$this $str"