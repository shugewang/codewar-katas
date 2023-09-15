import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun getAnimalSounds(animal: String) {
    val animal = animal.lowercase(Locale.getDefault())
    when (animal) {
        "dog" -> println("bark")
        "cat" -> println("meow")
        else -> println("?")
    }
}
fun getGreeting(): String {
    val formatter = DateTimeFormatter.ofPattern(" HH:mm")
    val currentTime = LocalDateTime.now().format(formatter)
    return when (currentTime) {
        in "06:00...12:00" -> "Good morning"
        in "12:00...18:00" -> "Good afternoon"
        in "18:00...20:00" -> "Good evening"
        else -> "Good night"
    }
}

fun getAllMultiplesOfFiveInc(from: Int, end: Int) {
    var list: MutableList<Int> = mutableListOf()
    for (i in from..end) {
        if (i%5 == 0) {
            list.add(i)
        }
    }
    println(list)
}

fun getAllMultiplesOfFiveExc(from: Int, end: Int) {
    var list: MutableList<Int> = mutableListOf()
    for (i in from until end) {
        if (i%5 == 0) {
            list.add(i)
        }
    }
    println(list)
}

fun getFactorial(input: Int) {
    var num = input
    var result = input
    while (num > 1) {
        result *= (num - 1)
        num--
    }
    println(result)
}

fun getFactorialDoWhile(input: Int) {
    var num = input
    var result = input
    do {
        result *= (num - 1)
        num--
    } while (num > 1)
    println(result)
}

fun justPrintEverythingInTheRange(min: Int, max: Int) {
    var list: MutableList<Int> = mutableListOf()
    for (i in min.rangeTo(max)) {
        list.add(i)
    }
    println(list)
}

fun justPrintEverythingInTheRangeButInReverse(min: Int, max: Int) {
    var list: MutableList<Int> = mutableListOf()
    for (i in max.downTo(min)) {
        list.add(i)
    }
    println(list)
}

fun justPrintEveryOtherNumberInTheRange(min: Int, max: Int) {
    var list: MutableList<Int> = mutableListOf()
    for (i in min..max step 2) {
        list.add(i)
    }
    println(list)
}

fun getAnimalSoundsWithIfs(animal: String) {
    val animal = animal.lowercase(Locale.getDefault())
    val sound = if (animal == "dog") "bark" else if (animal == "cat") "meow" else "?"
    println(sound)
}

fun main() {
    getAnimalSounds("fox") // when expression value matching
    println(getGreeting()) // when expression pattern matching?
    getAllMultiplesOfFiveInc(10,20) // for loops, inclusive range
    getAllMultiplesOfFiveExc(10,20) // for loops, exclusive range
    getFactorial(4) // while loop
    getFactorialDoWhile(4) // do while loop
    justPrintEverythingInTheRange(1,10) // upto
    justPrintEverythingInTheRangeButInReverse(1,10) // downto
    justPrintEveryOtherNumberInTheRange(1,10) // step
    getAnimalSoundsWithIfs("cat") // if expressions return a value
}