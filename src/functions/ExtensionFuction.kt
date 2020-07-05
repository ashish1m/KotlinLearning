package functions

/**
 * Extension function can be used to add the functionality to an existing class
 * without modifying or extending it.
 */
fun main(args: Array<String>) {
    var str1 = "Hello"
    var str2 = "World"
    var str3 = "Ashish"
    println(str1.concat(str2, str3))
}

fun String.concat(vararg strArgs: String): String {
    var res: String = this
    for (str in strArgs) res += str

    return res
}