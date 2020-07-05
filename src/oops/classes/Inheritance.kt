package oops.classes

fun main(args: Array<String>) {
    var cat = Cat()
    var dog = Dog()
    var animal = Animal()

    cat.color = "Brown"
    dog.color = "Black"

    cat.age = 2
    dog.breed = "labra"

    println("Animal color is ${animal.color}")
    animal.eat()

    println("Dog color is ${dog.color} and breed is ${dog.breed}")
    dog.bark()
    dog.eat()

    println("Cat color is ${cat.color} and age is ${cat.age}")
    cat.meow()
    cat.eat()
}

open class Animal {
    open var color: String = "White"
    open fun eat() {
        println("Animal eating.")
    }

}

class Cat : Animal() {
    var age: Int = 1
    override var color:String = "Black"
    fun meow() {
        println("Meow")
    }

    override fun eat() {
        println("Cat is eating")
    }
}

class Dog : Animal() {
    var breed: String = ""
    fun bark() {
        println("Bark")
    }
}