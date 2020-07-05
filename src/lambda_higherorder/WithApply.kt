package lambda_higherorder

fun main(args: Array<String>) {
    var person=Person()

    person.name = "Ashish"
    person.age = 30

    //Or
    with(person) {
        name = "Mathur"
        age = 31
    }

    //Or
    person.apply {
        name = "Ashish"
        age = 29
    }.display()

}

class Person {
    var name:String = ""
    var age:Int = -1

    fun display(){
        println("My name is $name and my age $age.")
    }
}