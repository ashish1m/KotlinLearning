package oops.classes

fun main(args: Array<String>) {
    var parent = Parent("Parent")
    var child = Child("Child", 1)

    println(parent.name)
    println(child.name)
}

open class Parent {
    var name: String = ""

    constructor(name: String) {
        this.name = name
    }
}

class Child : Parent {
    var id: Int = -1

    constructor(name: String, id: Int) : super(name) {
        this.id = id
    }
}