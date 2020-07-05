package collection

fun main(args: Array<String>) {
    val list = listOf<Int>(2, 3, 4, 5, 6, 7, 8, 10, 20, 30, 50)
    println(list.toString())

    val listOfSmallNum = list.filter { it < 10 }
    println(listOfSmallNum.toString())

    val listSqrNum = list.map { it * it }
    println(listSqrNum.toString())

    val smallSqrdNumList = list.filter { it < 10 }.map { it * it }
    println(smallSqrdNumList.toString())

    val personList = listOf<Person>(Person("Shana", 28),
            Person("Ashish", 30),
            Person("Sunny", 34))
    println(personList.filter { it.age <= 30 }.map { it.name }.toString())
}

class Person(var name:String, var age:Int)