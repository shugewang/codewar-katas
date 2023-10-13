enum class Colour {
    RED, GREEN, BLUE
}

fun main() {
    // convert enum to string
    val colourEnum = Colour.RED
    val colourString = colourEnum.name
    println("Enum to String: $colourString")

    // convert string to enum
    val inputString = "PURPLE"
    try {
        val parsedColour = Colour.valueOf(inputString)
        println("String to Enum: $parsedColour")
    } catch (e: IllegalArgumentException) {
        println("Invalid colour: $inputString")
    }
}
