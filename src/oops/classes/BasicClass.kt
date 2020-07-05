package oops.classes

//class with not constructor and parameter
class Shape {
}

//class with parameters
class Area(l:Int, b:Int) {
}

class Square(edge:Int) {
    //edge is property of class
    var edge:Int = 0
    init {
        this.edge = edge
    }
}

//if parameter is defined with var then it will be treated as property of class
class Cube(var edge: Int){

}

