class Animal(val name: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Animal

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}

fun Animal.getBestAnimal() {
    println("the best animal is always a dog!")
}

class AnimalCollection : Iterable<Animal> {
    private val animals = mutableListOf<Animal>()

    fun add(animal: Animal) {
        animals.add(animal)
    }

    override fun iterator(): Iterator<Animal> {
        return AnimalIterator()
    }

    private inner class AnimalIterator : Iterator<Animal> {
        private var currentIndex = 0

        override fun hasNext(): Boolean {
            return currentIndex < animals.size
        }

        override fun next(): Animal {
            if (!hasNext()) {
                throw NoSuchElementException()
            }
            return animals[currentIndex++]
        }
    }
}

fun main() {
    val animalCollection = AnimalCollection()
    animalCollection.add(Animal("Lion"))
    animalCollection.add(Animal("Elephant"))
    animalCollection.add(Animal("Giraffe"))

    for (animal in animalCollection) {
        println(animal.name)
    }
    val cat = Animal("cat")
    cat.getBestAnimal()
}
