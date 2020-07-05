package collection

fun main(args: Array<String>) {
    val arr = Array<Int>(10) { 0 }
    for (index in arr.indices){
        arr[index] = index
    }
    printArr(arr)
}

fun <T> printArr(arr: Array<T>) {
    for (element in arr){
        print("$element ")
    }
}