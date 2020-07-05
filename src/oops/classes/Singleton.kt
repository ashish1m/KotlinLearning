package oops.classes

fun main(args: Array<String>) {
    var name = Singleton.name
    println(name)
    Singleton.someMethod()
}

object Singleton {
    var name: String = ""

    init {
        name = "Ashish"
    }

    fun someMethod() {
        println("Some method")
    }
}