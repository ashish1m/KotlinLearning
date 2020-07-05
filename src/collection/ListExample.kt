package collection

fun main(args: Array<String>) {
    //Immutable list
    val list = listOf<Int>(2, 3, 4, 5, 6)

    for (item in list){
        print("$item ")
    }
    println()

    //Mutable list
    val mutableList = mutableListOf<Int>(10, 20, 30)
    val arrayList = arrayListOf<String>("Apple", "Ball", "Cat")

    mutableList.add(40)
    arrayList.add("Dog")

    for (item in mutableList){
        print("$item ")
    }
    println()

    for (item in arrayList){
        print("$item ")
    }
}
