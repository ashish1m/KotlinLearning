package basic

fun main(args: Array<String>) {
    var name = "Ashish"
    var str = "Hello $name"

    println("This is statement $str")
    println("The string length is ${str.length}")

    var a = 10
    var b = 5
    println("The sum of $a and $b is ${a + b}.")
}