package control_statement

fun main(args: Array<String>) {
    var a = 5
    var b = 10

    //Traditional
    if (a > b){
        //do something
    } else {
        //do something
    }

    //If as expression
    var maxVal = if (a > b) a else b

    //If as expression with multiline block
    var min = if (a < b) {
        println("a is min")
        a
    } else {
        println("a is min")
        b
    }

    println("Max is $maxVal")
    println("Min is $min")
}