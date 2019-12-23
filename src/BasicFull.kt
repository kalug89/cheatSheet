// main function

fun main(args: Array<String>) {

    // Hello world program
    println("Hello world")

    // Declaring function |sum a + b|

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // Single-expression function

    fun suma(a: Int, b: Int) = a + b

    //Declaring variables

    val surname = "Dawidek"
    var age = 5
    age++

    //Variables with nullable types

    val name: String? = null
    var length: Int

    //lenght, or 0 if name is null
    length = name?.length ?: 0

    //lenght, or return when name is null
    length = name?.length ?: return

    //length, or throw error when name is null
    length = name?.length ?: throw Error()
}