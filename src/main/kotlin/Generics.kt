class Box<T>(val value: T)
fun <T> printGeneric(input: T) {
    println("Input: $input")
}
fun main() {
    val intVar = 1
    val stringVar = "Generic"
    val boxOfInt = Box(intVar)
    val boxOfString = Box(stringVar)

    println(boxOfInt.value)
    println(boxOfString.value)

    printGeneric(intVar)
    printGeneric(stringVar)
}

// are generic functions type safe?