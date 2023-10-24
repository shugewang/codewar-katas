fun main() {
    var person1Age: Int = 25
    val person2Age: Int = person1Age
    person1Age = 26
    println("Person1 Age: $person1Age")
    println("Person2 Age: $person2Age")

    // Custom Reference Type (Class)
    class Person(val name: String, var age: Int)

    var person1 = Person("Bob", 25)
    var person2 = person1 // Reference to the same object

    person1.age = 26 // modifies the object

    println("Person 1: ${person1.name}, ${person1.age}")
    println("Person 2: ${person2.name}, ${person2.age}")
}
