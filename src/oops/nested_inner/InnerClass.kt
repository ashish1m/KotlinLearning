package oops.nested_inner

class OuterClass {
    private val bar: Int = 1

    inner class Inner {
        fun foo() = bar
    }
}

fun main(args: Array<String>) {
    val demo = OuterClass().Inner().foo()
    println(demo)
}