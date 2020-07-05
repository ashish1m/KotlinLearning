package oops.nested_inner

import oops.interfaces.MyInterface

class Outer {
    private val value = 10
    class Nested {
        fun foo() = 2
    }
}

fun main(args: Array<String>) {
    val demo = Outer.Nested().foo() // == 2
    println(demo)

    //Anonymous inner class
    val t = Thread(object :Runnable{

        override fun run() {
            val name = Thread.currentThread().name
            println("${name} started")
            Thread.sleep(2000)
            println("${name} finished")
        }
    })
    t.start()

    //If an interface contains only one method then it can be replaced by lambda
    val t2 = Thread {
        val name = Thread.currentThread().name
        println("${name} started")
        Thread.sleep(2000)
        println("${name} finished")
    }

    t2.start()
}