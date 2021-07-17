package basic

fun main() {
    val lateInit = LateInit()
    lateInit.name = "Ashish"
    lateInit.display()

}

class LateInit {
    lateinit var name:String

    fun display(){
        println(name)
    }
}