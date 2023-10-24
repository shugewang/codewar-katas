import java.util.*

fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
    var array3 = mutableListOf<String>()
    for (substring in array1) {
        for (string in array2) {
            if (string.contains(substring)) {
                array3.add(substring)
            }
        }
    }
    val uniqueAndSortedSet: SortedSet<String> = array3.toSortedSet()
    val firstItem = uniqueAndSortedSet.first()
    val lastItem = uniqueAndSortedSet.last()
    val secondItem = uniqueAndSortedSet.elementAt(1)
    val fourthItem = uniqueAndSortedSet.elementAtOrNull(4)
    val fifthItem = uniqueAndSortedSet.elementAtOrElse(5) { index -> "There are only ${uniqueAndSortedSet.size} items in the set"}
    val lotteryNumber = setOf(24, 1, 9, 5, 7)
    val firstNumber = lotteryNumber.elementAt(0)
    var magicalMutableLotteryNumber = mutableSetOf(24, 1, 9, 5, 7)
    magicalMutableLotteryNumber.add(8)
    return uniqueAndSortedSet.toTypedArray()
}

fun inArrayRefactor(array1: Array<String>, array2: Array<String>): Array<String> {
    return array1.filter{ substring -> array2.any { it.contains(substring) }}.sorted().toSet().toTypedArray()
}

fun isAllMultipleOfFive(inputList: List<Int>): Boolean {
    return inputList.isNotEmpty() && inputList.all { it%5 == 0 }
}

fun isNonePizza(groceries: MutableList<String>): Boolean {
    return groceries.none { it == "pizza"}
}

fun prefixWith(prefix: String, inputList: List<String>): List<String> {
    return inputList.map { "$prefix $it"}
}

fun summariseNumbers(numbers: List<Int>): Map<String, Int?> {
    val numbers = numbers.sorted()
    val firstOdd = numbers.find { it % 2 != 0 }
    val lastOdd = numbers.findLast {it % 2 != 0 }
    val count = numbers.count()
    var mutableMap =  mutableMapOf("first odd number" to firstOdd, "last odd number" to lastOdd, "count" to count)
    mutableMap.putAll(setOf("minimum" to numbers.minOrNull(), "maximum" to numbers.maxOrNull()))
    return mutableMap
}

fun getEvensAndOdds(numbers: List<Int>): Map<String, List<Int>> {
    val (even, odd) = numbers.partition { it % 2 == 0}
    return mapOf("evens" to even, "odds" to odd)
}

fun sortByCharLength(words: List<String>): List<String> {
    return words.sortedBy { it.length }
}

fun combineStrings(list1: List<String>, list2: List<String>): List<String> {
    return list1.zip(list2) { a, b -> "$a is a $b"}
}

fun flatten(inputList: List<String>): List<Char> {
    return inputList.flatMap { it.toList() }
}

fun mapWithoutFlattening(inputList: List<String>): List<List<Char>> {
    return inputList.map { it.toList() }
}

fun groupByCharLength(inputList: List<String>): Map<Int, List<String>> {
    return inputList.groupBy { it -> it.length}
}

fun groupByCharLengthRemoveDupes(inputList: List<String>): Map<Int, String> {
    return inputList.associateBy { it -> it.length}
}

fun nestedDemo(inputList: List<List<Int>>): List<Int> {
    var combine: MutableList<Int> = mutableListOf()
    for (x in inputList) {
        for (y in x) {
            combine.add(y)
        }
    }
    return combine
}

data class User(val id: String) {
}

fun main() {
    val user1 = User("1")
    println(user1.toString())
    val a2 = arrayOf("lively", "alive", "harp", "sharp", "armstrong")
    println("first and last: " + Arrays.toString(inArray(arrayOf<String>("live", "strong", "arp"), a2)))
    println("filter, any: " + inArrayRefactor(arrayOf("live", "strong", "arp"), a2).contentToString())
    println("all: " + "are all numbers multiples of five?: " + isAllMultipleOfFive(listOf(5,10)))
    var groceries = mutableListOf("pizza", "broccoli", "bread")
    groceries.add("milk")
    println("List: " + "here is my shopping list:" + groceries)
    println("List: " + "here is the first item on my list: " + groceries[0])
    println("getOrElse: " + groceries.getOrElse(6, {"not found. there're only ${groceries.size} items on the list"}))
    println("none: " + "do I need to add pizza on my list?: " + isNonePizza(groceries))
    println("map: " + prefixWith("Room", listOf("101", "199")))
    val listNumbers = listOf(2,3,4,1,5,6,7)
    println("sorted, find, findLast, count, Map, minOrNull, maxOrNull: " + summariseNumbers(listNumbers))
    println("Map" + "the first odd number in the list is: " + summariseNumbers(listOf(1,2,3,4,5,6,7))["first odd number"]) // get also use .get()
    val listStrings = listOf("one", "two", "three", "four", "five")
    println("sortedBy: " + sortByCharLength(listStrings))
    println("groupBy: " + groupByCharLength(listStrings))
    println("associateBy: " + groupByCharLengthRemoveDupes(listStrings))
    println("zip: " + combineStrings(listOf("tiger", "lion", "penguin", "frog"), listOf("mammal", "mammal", "bird", "amphibian")))
    println("flatMap: " + flatten(listOf("abcdefg", "hijklmn")))
    println("flatMap: " + mapWithoutFlattening(listOf("abcdefg", "hijklmn")))
    println("partition: " + getEvensAndOdds(listNumbers))
    val nested = listOf(listOf(1,2,3,4,5,6,7), listOf(7,6,5,4,3,2,1))
    println("nestedCollection: " + nestedDemo(nested))
}