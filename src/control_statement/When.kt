package control_statement

fun main(args: Array<String>) {
    val x = 3

    when (x) {
        in 0..2 -> println(x)
        4 -> println(x)
        5 -> println(x)
        else -> {
            println("Unknown")
        }
    }

    //when as expression
    var str = when(x) {
        1 -> "1"
        3 -> "3"
        5 -> "5"
        else -> "Unknown"
    }

    println(str)
}