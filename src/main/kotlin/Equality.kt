fun checkStructuralEquality(): Boolean {
    val cat = Animal("cat")
    val cat2 = Animal("cat")
    return cat==cat2
}

fun checkReferentialEquality(): Boolean {
    val cat = Animal("cat")
    val cat2 = Animal("cat")

    return cat === cat2
}


fun main() {
    println(checkStructuralEquality())
    println(checkReferentialEquality())

}