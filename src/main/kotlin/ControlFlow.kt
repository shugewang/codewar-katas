import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.*

fun getAnimalSounds(animal: String): String {
    val animal = animal.lowercase(Locale.getDefault())
    return when (animal) {
        "dog" -> "bark"
        "cat" -> "meow"
        else -> "?"
    }
}
fun getGreeting(): String {
    val currentTime = LocalTime.now()
    return when (currentTime) {
        in LocalTime.parse("06:00")..LocalTime.parse("12:00") -> "Good morning"
        in LocalTime.parse("12:00")..LocalTime.parse("18:00") -> "Good afternoon"
        in LocalTime.parse("18:00")..LocalTime.parse("20:00") -> "Good evening"
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
    for (i in min..max step 20) {
        list.add(i)
    }
    println(list)
}

fun getAnimalSoundsWithIfs(animal: String) {
    val animal = animal.lowercase(Locale.getDefault())
    val sound = if (animal == "dog") "bark" else if (animal == "cat") "meow" else listOf(1)
    println(sound)
}

fun main() {
    println(getAnimalSounds("dog")) // when expression value matching
    println(getGreeting()) // when expression pattern matching?
    getAllMultiplesOfFiveInc(10,20) // for loops, inclusive range
    getAllMultiplesOfFiveExc(10,20) // for loops, exclusive range
    getFactorial(4) // while loop
    getFactorialDoWhile(4) // do while loop
    justPrintEverythingInTheRange(1,10) // upto
    justPrintEverythingInTheRangeButInReverse(1,10) // downto
    justPrintEveryOtherNumberInTheRange(1,10) // step
    getAnimalSoundsWithIfs("fox") // if expressions return a value
}