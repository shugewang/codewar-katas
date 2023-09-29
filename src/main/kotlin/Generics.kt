class Box<T,A>(val value: T, val strValue: A) {
    fun returnValue(): Pair<T, A> {
        return Pair(value, strValue)
    }
}
fun <T> printGeneric(input: T) {
    println("Input: $input")
    return
}
fun main() {
    val intVar = 1
    val stringVar = "Generic"
    val boxOfInt = Box(intVar, stringVar)
//    val boxOfString = Box(stringVar)

    println(boxOfInt.value)
//    println(boxOfString.value)

    printGeneric(intVar)
    printGeneric(stringVar)
    println(boxOfInt.returnValue())
}

// are generic functions type safe?