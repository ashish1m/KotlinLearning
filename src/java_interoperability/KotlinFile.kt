package java_interoperability

fun main(args: Array<String>) {
    var prod = JavaFile.prod(3, 4)
    println("3 * 4 is $prod")
    println("Volume is: ${volume(2, 3)}")

    //function call with named params
    println("Sum of 3, 4 is ${add(a = 3, b = 4)}")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

@JvmOverloads
fun volume(l: Int, b: Int, h: Int = 10): Int {
    return l * b * h
}