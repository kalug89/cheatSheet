// CollectionLiterals //
    // fun main
fun main() {

    // List<int>

    listOf(1, 2, 3, 4)

    // MutableList<int>

    mutableListOf(1, 2, 3, 4)


    // Array<Char>

    arrayOf('a', 'b', 'c')

    // Map<Int, String>

    mapOf(1 to "A", 2 to "B")

    // MutableMap<Int, String>

    mutableMapOf(1 to "A", 2 to "B")

    // Sequence<Int>

    sequenceOf(4, 3, 2, 1)

    // Pair<Int, String>

    1 to "A"

    // generateSequence<Int>

    List(4) { it * 2 }
    generateSequence(4) { it + 2 }

}
