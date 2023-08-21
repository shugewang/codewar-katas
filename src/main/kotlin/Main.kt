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

fun findFirstAndLastOddNumber(numbers: List<Int>): Map<String, Int?> {
    val numbers = numbers.sorted()
    val firstOdd = numbers.find { it % 2 != 0 }
    val lastOdd = numbers.findLast {it % 2 != 0 }
    val count = numbers.count()
    var mutableMap =  mutableMapOf("first odd number" to firstOdd, "last odd number" to lastOdd, "count" to count)
    mutableMap.putAll(setOf("minimum" to numbers.minOrNull(), "maximum" to numbers.maxOrNull()))
    return mutableMap
}

fun sortWordsByCharLength(words: List<String>): List<String> {
    return words.sortedBy { it.length }
}



fun main() {
    val a2 = arrayOf("lively", "alive", "harp", "sharp", "armstrong")
    println(Arrays.toString(inArray(arrayOf<String>("live", "strong", "arp"), a2)))
    println(inArrayRefactor(arrayOf("live", "strong", "arp"), a2).contentToString())
    println("are all numbers multiples of five?: " + isAllMultipleOfFive(listOf(5,10)))
    var groceries = mutableListOf("pizza", "broccoli", "bread")
    groceries.add("milk")
    println("here is my shopping list:" + groceries)
    println("here is the first item on my list: " + groceries[0])
    println("do I need to add pizza on my list?: " + isNonePizza(groceries))
    println(prefixWith("Room", listOf("101", "199")))
    println(findFirstAndLastOddNumber(listOf(2,3,4,1,5,6,7)))
    println("the first odd number in the array is: " + findFirstAndLastOddNumber(listOf(1,2,3,4,5,6,7))["first odd number"]) // get also use .get()
    println(sortWordsByCharLength(listOf("one", "two", "three", "four", "five")))
}