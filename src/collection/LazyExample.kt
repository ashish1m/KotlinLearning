package collection

val pi: Float by lazy {
    3.14F
}

fun main(args: Array<String>) {
    println("Pi is not initialized until this point")
    val area = 4 * 4 * pi  // since we need pi here. then only pi is initialized.
    println("Area is $area")
}