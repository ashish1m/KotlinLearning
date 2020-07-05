package oops.classes

fun main(args: Array<String>) {
    println(Main.name)
    Main.method()
}

class Main {

    companion object {
        var name:String = "Single"

        fun method() {
            println("Method")
        }
    }
}