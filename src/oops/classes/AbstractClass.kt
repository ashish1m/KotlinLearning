package oops.classes

/**
 * Abstract class cannot be instantiated directly. They can only be extended.
 * An abstract class must have atleast one abstract property or abstract method.
 *
 * All abstract fields, methods should be overridden in derived class.
 */
abstract class Person {
    abstract var name: String
    open var age: Int = -1

    open fun eat(){}

    open fun age(): Int {
        return age
    }

    fun name(): String {
        return name
    }
}

class Teacher: Person() {
    override var name: String = "Ashish"

    override fun eat() {
        println("Eating")
    }

}