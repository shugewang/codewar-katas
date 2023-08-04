import java.util.Arrays

fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
    var array3 = mutableListOf<String>()
    for (substring in array1) {
        for (string in array2) {
            if (string.contains(substring)) {
                array3.add(substring)
            }
        }
    }
    return array3.toSortedSet().toTypedArray()
}

fun main() {
    val a2 = arrayOf<String>("lively", "alive", "harp", "sharp", "armstrong")
    println(Arrays.toString(inArray(arrayOf<String>("live", "strong", "arp"), a2)))
}