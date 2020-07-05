package collection

fun main(args: Array<String>) {
    val name: String? = null
    val name2: String? = "Ashish"

    //1. Safe call operator ?.
    println("The length of name is ${name?.length}")
    println("The length of name is ${name2?.length}")
    println()

    //2. Safe call with let operator ?.let
    name?.let {
        println("The length of name is ${name.length}")
    }

    name2?.let {
        println("The length of name is ${name2.length}")
    }
    println()

    //3. Elvis operator ?:
    println("The length of name is ${name?.length ?: -1}")
    println("The length of name is ${name2?.length ?: -1}")
    println()

    //4. Null assertion operator !!
    println("The length of name is ${name!!.length}")
    println("The length of name is ${name2!!.length}")
    println()
}