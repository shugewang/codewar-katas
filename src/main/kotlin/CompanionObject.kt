class MyAnimal(val name: String, val species: String) {

    fun makeSound() {
        when (species.lowercase()) {
            "dog" -> println("$name barks!")
            "cat" -> println("$name meows!")
            else -> println("$name makes a sound!")
        }
    }

    companion object {
        fun createDefaultAnimal(): MyAnimal {
            return MyAnimal("Animal", "Unknown")
        }
    }
}

fun main() {
    // Using the instance method
    val dog = MyAnimal("Sir Dog", "Dog")
    val cat = MyAnimal("Lady Cat", "Cat")
    dog.makeSound()
    cat.makeSound()

    // Using the companion object function - associated with the class itself, can be used for utility functions, creating default instances
    val unknownAnimal = MyAnimal.createDefaultAnimal()
    unknownAnimal.makeSound()
}