package basic

/**
 * This is multiline comment
 */
fun main(args: Array<String>) {
    var num = 10   // mutable variable.
    val pi = 3.14  // immutable variable.

    println("Num is $num")
    println("PI is $pi")

    // this is inline comment
    var myString = "Ashish Mathur"
    println(myString)

    val sum = sum(10, 20)
    display(sum.toString())
}

fun sum(a: Int, b: Int): Int {
    // this is function
    return a + b
}

//Unit is same as void in java. It can be omitted
fun display(str: String): Unit {
    print(str)
}