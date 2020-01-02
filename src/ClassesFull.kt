// Primary constructor

    // val declared a read-only property, var a mutable one
    class Persons(val name: String, var age: Int)

    // Inheritance
    open class Person(val name:String) {
        open fun hello() = "Hello, I'm $name"
    }

    class PolishPerson(name: String) : Person(name) {
        override fun hello() = "Dzień dobry, jestem $name"

    }

    // Property with assessors
    class SomePerson(var name:String, var surname:String) {
        var fullName: String
            get() = "$name $surname"
            set(value) {
            val(first, rest) = value.split(" ", limit = 2)
            name = first
            surname = rest
        }
    }

    // Data classes

    data class PersonTwo(val name:String, var age:Int)
    val mike = PersonTwo("Mike", 23)

    //Modifier data | add this in fun main
    fun main() {

        //toString | That display all primary constructor properties
        println(mike.toString())

        //equals | That compares all primary constructor properties
        println(mike == PersonTwo("Mike", 23))
        println(mike == PersonTwo("Mike", 21))

        //hashCode that is based on all primary constructor properties
        val hash = mike.hashCode()
        println(hash == PersonTwo("Mike", 23).hashCode())
        println(hash == PersonTwo("Mike", 21).hashCode())

        //component1, component2 etc. | that allows deconstruction
        val (name, age) = mike
        println("$name, $age")

        //copy | that returns copy of object with concrete properties changed
        val jake = mike.copy(name = "Jake")
    }