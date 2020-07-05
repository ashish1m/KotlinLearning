package oops.interfaces

fun main(args: Array<String>) {

    var impl = InterfaceImpl()
    impl.doSomething()
    impl.normalMethod()
}

class InterfaceImpl : MyInterface {

    override var name: String = "Ashish"

    override fun doSomething() {
        println("Do something:")
    }

}

interface MyInterface {
    var name: String

    fun doSomething()

    fun normalMethod() {
        println("Normal method.")
    }
}

