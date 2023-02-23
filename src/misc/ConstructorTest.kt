package misc

class A(input: String) {

    init {
        printResult(input)
    }

    private val result = "Hello"

    private fun printResult(input: String) {
        println("$result $input")
    }
}

class B(input: String) {

    private val result = "Hello"

    init {
        printResult(input)
    }

    private fun printResult(input: String) {
        println("$result $input")
    }
}

fun main() {
    A("A")
    B("B")
}