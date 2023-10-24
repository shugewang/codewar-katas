fun factorial(n: Int): Int {
    return if (n == 0) {
        1
    } else {
        n * factorial(n - 1)
    }
}

fun main() {
    val result = factorial(5)
    println("factorial of 5 is: $result")
}
