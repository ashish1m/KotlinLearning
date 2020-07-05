package oops.enum

enum class Direction {
    NORTH, EAST, WEST, SOUTH
}

//with initialization
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}