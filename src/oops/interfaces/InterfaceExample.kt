package oops.interfaces

fun main(args: Array<String>) {

    var impl = InterfaceImpl()
    val iface = object : MyInterface {
        override var name: String = "Ashish"

        override fun doSomething() {
            TODO("Not yet implemented")
        }

        override fun returnSomething(): String {
            return "Mathur"
        }

    }
    println(iface.returnSomething())
    impl.doSomething()
    impl.normalMethod()
}

class InterfaceImpl : MyInterface {

    override var name: String = "Ashish"

    override fun doSomething() {
        println("Do something:")
    }

    override fun returnSomething(): String {
        return "Mathur"
    }

}

interface MyInterface {
    var name: String

    fun doSomething()

    fun returnSomething(): String

    fun normalMethod() {
        println("Normal method.")
    }
}

