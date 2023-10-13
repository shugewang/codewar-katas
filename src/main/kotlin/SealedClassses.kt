// fixed number of subclasses
// useful fore creating known and fixed hierarchies
sealed class Shape {
    class Circle(val radius: Double) : Shape()
    class Square(val length: Double) : Shape()
    class Triangle(val width: Double, val height: Double) : Shape()
}

fun calculateArea(shape: Shape): Double {
    return when (shape) {
        is Shape.Circle -> Math.PI * shape.radius * shape.radius
        is Shape.Square -> shape.length * shape.length
        is Shape.Triangle -> 0.5 * shape.width * shape.height
    }
}

fun main() {
    val circle = Shape.Circle(10.00)
    println(calculateArea(circle))
}