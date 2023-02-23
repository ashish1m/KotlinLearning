package basic

fun main() {

    performLet()
    performRun()
    performApply()
    performAlso()
    performWith()
}

//provides "it" as context
//return last statement of let block
fun performLet() {
    val person = Person().let { person ->
        person.name = "Asdf"
        person.contactNumber = "0987654321"
        "The name of the Person is: ${person.name}"
    }
    println(person)
}

fun performRun() {
    val person = Person().run {
        name = "Asdf"
        contactNumber = "0987654321"
        "The details of the Person is: ${toString()}"
    }
    println(person)
}

fun performApply() {
    val person = Person().apply {
        name = "Asdf"
        contactNumber = "0987654321"
    }
    println(person)
}

fun performAlso() {
    val person = Person().also { person ->
        person.name = "Asdf"
        person.contactNumber = "0987654321"
    }
    println(person)
}

fun performWith() {
    val person = with(Person()) {
        name = "Asdf"
        contactNumber = "0987654321"
        "The details of the Person is: ${toString()}"
    }
    println(person)
}


class Person() {
    var name: String = "Abcd"
    var contactNumber: String = "1234567890"
    var address: String = "xyz"

    override fun toString(): String {
        return "\n Name: $name\n " +
                "Contact Number: $contactNumber\n " +
                "Address: $address"
    }

    fun displayInfo() = print(
        "\n Name: $name\n " +
                "Contact Number: $contactNumber\n " +
                "Address: $address"
    )
}