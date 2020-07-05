package oops.classes

fun main(args: Array<String>) {
    var test = Test()
}

class Test {

    //if a property needs to be initialized later
    lateinit var lastName: String

    var name: String = "defaultValue"
        get() = field
        set(value) {
            field = value
        }

    var setterVisibility: String = "abc"
        private set // the setter is private and has the default implementation

    var setterWithAnnotation: Any? = null
        @Synchronized set // annotate the setter with Synchronized
}