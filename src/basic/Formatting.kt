package basic

fun main() {
    val nums = listOf<Long>(9990000000, 1000, 1049, 1050, 1100, 5432, 19999, 654321, 7000000, 7654321, 80010000, 88888888, 9999999)
    for (num in nums) {
        val numPairMill = formatNumberToMillion(num)
        val numPairCr = formatNumber(num)
        print("%.2f%s ==  %.2f%s".format(numPairMill.first, numPairMill.second, numPairCr.first, numPairCr.second))
        println()
    }
}

val numberSymbolROW = listOf("", "K", "M", "B")
val numberSymbolIndia = listOf("", "K", "L", "CR")

fun formatNumberToMillion(num: Long): Pair<Double, String> {
    if (num < 1000)
        return Pair(num.toDouble(), "")

    val len = num.toString().length

    return when {
        len <= 6 -> Pair(num / Math.pow(10.0, 3.0), numberSymbolROW[1])
        len <= 9 -> Pair(num / Math.pow(10.0, 6.0), numberSymbolROW[2])
        else -> Pair(num / Math.pow(10.0, 9.0), numberSymbolROW[3])
    }
}

fun formatNumber(num: Long): Pair<Double, String> {
    if (num < 1000)
        return Pair(num.toDouble(), "")

    val len = num.toString().length

    return when {
        len <= 5 -> Pair(num / Math.pow(10.0, 3.0), numberSymbolIndia[1])
        len <= 7 -> Pair(num / Math.pow(10.0, 5.0), numberSymbolIndia[2])
        else -> Pair(num / Math.pow(10.0, 7.0), numberSymbolIndia[3])
    }
}