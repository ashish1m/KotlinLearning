package oops.classes

fun main(args: Array<String>) {

    var user1 = User(10, "Ashish")
    var user2 = User(10, "Ashish")

    println(if (user1 == user2) "Equal" else "NotEqual")

    var user3 = user1.copy(name = "Shana")

    println(user3)
}

data class User(var id:Int, var name:String)