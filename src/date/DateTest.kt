package date

import java.util.*

fun main() {
    val cal = Calendar.getInstance()
    println(cal.time)
    cal.add(Calendar.DATE, -5)
    println(cal.time)
}