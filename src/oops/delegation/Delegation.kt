package oops.delegation

import kotlin.properties.Delegates

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { println(x) }
    fun displayName(){
        println(this.javaClass.name)
    }
}

class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    val d = Derived(b)
    b.print()
    b.displayName()
    d.print()
}