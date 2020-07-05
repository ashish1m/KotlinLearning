package lambda_higherorder

fun main(args: Array<String>) {
    val myLambda: (Int, Int) -> Int = { x, y -> x + y }


    // 3 ways of using or passing lambda func
    higherOrderFun(2, 6, myLambda)           // 1st
    higherOrderFun(2, 8, { x, y -> x + y })  // 2nd
    higherOrderFun(2, 3) { x, y -> x + y }   // 3rd


    val revFunc: (String) -> String = { it.reversed() }
    println(revFunc("Ashish"))
}

fun higherOrderFun(a: Int, b: Int, func: (Int, Int) -> Int) {
    val result = func(a, b)
    println(result)
}