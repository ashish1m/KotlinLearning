package loops

fun main(args: Array<String>) {
    //for loop
    for(i in 1..10){
        println(i)
    }

    //print even in 1 to 10
    for (i in 1..10){
        if (i % 2 == 0) println(i)
    }

    for (i in 1..5){
        println(i)
        if (i == 3){
            break
        }
    }

    //labeled for loop
    outer@for (i in 1..4){
        for (j in 1..4){
            println("$i $j")
            if (i == 2 && j == 2){
                break@outer
            }
        }
    }

    for (i in 1..5){
        for (j in 1..5){
            if (i == j){
                continue
            }
            println("$i $j")
        }
    }

    for (i in 0 until 10){
        print("$i ")
    }

    for (ch in "abc") {
        print(ch + 1)
    }
    println()
    println(isValidIdentifier("1Ashish_123"))
}

fun isValidIdentifier(s: String): Boolean {
    if (!s[0].isLetter() && s[0] != '_') {
        return false
    }

    for (ch in s) {
        if (!ch.isLetter() && !ch.isDigit() && ch != '_'){
            return false
        }
    }
    return true
}