package oops.classes

fun main() {
    val constructorTest = ConstructorTest("a", "b")
}

class ConstructorTest {

    constructor(first: String) {
        println(first)
    }

    constructor(first: String, second: String) {
        println(first + second)
    }

    init {
        println("init")
    }

}