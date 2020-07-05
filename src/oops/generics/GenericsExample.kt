package oops.generics

fun main(args: Array<String>) {
    var box = Box<Int>(10)
    println(box.t)
}

class Box<T>(var t: T)

//Declaration site-variance
interface Source<out T> {
    fun nextT(): T
}

interface Comparable<in T> {
    fun compare(other: T): Boolean
}