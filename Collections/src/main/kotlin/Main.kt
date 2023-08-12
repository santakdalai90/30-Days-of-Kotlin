fun main(args: Array<String>) {
    // Lists
    println("-------------| Lists |-------------")
    val names = listOf<String>("Ramesh", "Suresh", "Prakash", "Ram")
    println(names[0])
    // names.add("Prabhu") It won't compile as the listof generates immutable lists


    val cars = mutableListOf<String>("Maruti Suzuki Alto 800", "Renault Duster")
    cars.add("Ford Figo")   // works as the list is mutable
    cars.forEach { println(it) }
    //////////////////////////////

    // Sets
    println("-------------| Sets |-------------")
    val colors = setOf<String>("Blue", "Orange", "Red", "Blue")
    colors.forEach { println(it) }

    val cows = mutableSetOf<Cow>(Cow("Nandini"), Cow("Dhenu"), Cow("Harschika"))
    cows.add(Cow("Dhenu"))
    cows.forEach{ println(it) }

    // Maps
    println("-------------| Maps |-------------")
    val userAvailability = mapOf<String, Boolean>("Alexa" to true, "Stewart" to false, "Jenna" to true)
    println(userAvailability["Stewart"])
    
    val userFruits = mutableMapOf<String, String>("Alexa" to "Blueberry", "Stewart" to "Strawberry", "Jenna" to "Mango")
    userFruits["Barbara"] = "Apple"
    userFruits.forEach { (t, u) -> println("$t likes $u as fruit") }
}

data class Cow(val name: String)