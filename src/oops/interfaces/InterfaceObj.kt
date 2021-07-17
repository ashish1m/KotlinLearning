package oops.interfaces

fun main() {
    val sampleInterface = object : SampleInterface {
        override fun getName(name: String): String {
            return name
        }
    }

    val sampleInterface2 = object : SampleInterface {
        override fun getName(name: String): String {
            return name
        }
    }
}

interface SampleInterface {
    fun getName(name: String): String
}