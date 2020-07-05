package oops.classes

fun main(args: Array<String>) {
    var student = Student("Ashish", 25)
    println("Student name is ${student.name}")
    println("Student id is ${student.id}")
}

class Student(var name: String) {

    var id: Int = -1

    init {
    }

    constructor(name: String, id: Int) : this(name) {
        this.id = id
    }
}