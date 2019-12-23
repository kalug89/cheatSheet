fun main(args: Array<String>) {

    // If as an expression

    fun bigger(a: Int, b: Int) = if (a > b) b else b

    // For loop with list

    val list = listOf("A", "B", "C")
    for (element in list) {
        println(element)
    }

    // When expresion

    fun numberTypeName(x: Number) = when (x) {

        0 -> "Zero"
        in 1..4 -> "Four or less"
        5, 6, 7 -> "Five to seven"
        is Byte -> "Byte"
        else -> "Some number"
    }

    // When expression with predicates

    fun signAsString(x: Int) = when {
        x < 0 -> "Negative"
        x == 0 -> "Zero"
        else -> "Positive"
    }
}