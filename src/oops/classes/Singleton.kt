package oops.classes

fun main(args: Array<String>) {
    val name = Singleton.name
    println(Singleton.isNameNull)
    println(name)
    Singleton.someMethod()
}

object Singleton {
    var name: String?

    val isNameNull: Boolean
        get() {
            return name != null
        }

    init {
        name = "Ashish"
    }

    fun someMethod() {
        println("Some method")
    }
}