package oops.classes

fun main(args: Array<String>) {
    var a = A("A")
    var b = B("B", "Class")

    println(a.name)
    println(b.name)

}

open class A(var name: String) {

}

class B(name: String, var type: String) : A(name) {

}