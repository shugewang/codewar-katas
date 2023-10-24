open class Pet constructor(val name: String, val species: String) {
    init {
        println("Creating an $species named $name")
    }

    open fun makeSound() {
        println("$name makes a sound")
    }
}

class Dog(name: String) : Pet(name, "Dog") {
    var breed: String = ""

    constructor(name: String, breed: String) : this(name) {
        this.breed = breed
        println("$name is a $breed")
    }

    override fun makeSound() {
        println("$name barks!")
    }
}

class Cat(name: String) : Pet(name, "Cat") {
    var color: String = ""

    constructor(name: String, color: String) : this(name) {
        this.color = color
        println("$name is a $color cat")
    }

    override fun makeSound() {
        println("$name meows!")
    }
}

fun main() {
    val goldenRetriever = Dog("Sir Dog", "Labrador")
    val siameseCat = Cat("Lady Cat", "Tabby")

    goldenRetriever.makeSound()
    siameseCat.makeSound()

    val pet1: Pet = Dog("Rufus")
    val pet2: Pet = Cat("Fluffy")
    pet1.makeSound()
    pet2.makeSound()
}
