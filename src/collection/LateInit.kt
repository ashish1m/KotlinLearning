package collection

fun main(args: Array<String>) {
    var country = Country()

    //Throw exception
    //println(country.name)

    country.name = "India"
    println(country.name)

}

class Country{
    lateinit var name:String
}