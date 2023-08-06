import java.awt.ComponentOrientation

open class Vehicle(var name: String, var color: String) {
    open fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name has stopped")
    }
}

class Car(name: String, color: String, var doors: Int) : Vehicle(name, color) {

}

class Plane(name: String, color: String, var wings: Int) : Vehicle(name, color) {
    override fun move() {
        println("$name is flying")
    }
}

open class View() {
    open fun draw() {
        println("Drawing the view")
    }
}

open class Button(private val text: String, private val orientation: String): View() {
    override fun draw() {
        println("Drawing the button with name $text and $orientation")
        super.draw()
    }
}

class RoundButton(text: String, orientation: String, private val radius: Int): Button(text, orientation) {
    override fun draw() {
        println("Drawing the round button with radius $radius")
        super.draw()
    }
}

class User(var name: String, var age: Int) {
    var group: String

    // initializer block - runs after the primary constructor
    init {
        when (age) {
            in 0..12 -> this.group = "baby"
            in 13..19 -> this.group = "teenager"
            in 20..40 -> this.group = "adult"
            in 40..60 -> this.group = "middle-aged"
            in 60..100 -> this.group = "senior"
            else -> this.group = "alien"
        }
    }

    init {
        // you can define multiple initializer blocks and the order of execution
        // is the order in which they are defined
    }

    constructor(name: String) : this(name, 40) {
        // secondary constructor
        // has to call the primary constructor
        // cannot declare parameters
    }

    constructor() : this("John Doe") {
        // this makes call to the above constructor, based on the number of parameters passed
    }
}

class Dog(var name: String = "Tommy", var breed: String, var age: Int = 1) { // primary constructors with defaults

    fun describe() {
        println("Dog name: $name, breed: $breed, age: $age")
    }
}

class Employee(var name: String, var dept: String, salary: Int) {
    var salary = salary
        get() = field       // use 'field' to avoid recursion and to back the property
        set(value) {
            if (value <= 1000) {
                println("Setting min salary as 1000")
                field = 1000
            } else {
                field = value
            }
        }

    fun describe() {
        println("Employee --> name: $name, department: $dept, salary: $salary")
    }
}

class Flower(var name: String, var color: String, var petals: Int) {
    // var season: String   // you cannot define a property like this here without initializing.
    // To have a property defined here which can be initialized later you must use lateinit keyword.
    // You can however have a parameter here without initializing, only if that parameter is of a primitive type,
    // but since most types in Kotlin are classes, like Int, String, etc, it's better that we use lateinit keyword
    // for such cases.
    lateinit var season: String

    override fun toString(): String =
        "Flower $name blooms in $season season. Its color is $color and it has $petals petals"
}

class Calculator() {
    // normal function and requires an instance of this class to be called
    fun sum(a: Int, b: Int): Int = a + b

    // functions in companion object doesn't need instance to be called. They can be called with class name.
    // similar to static functions/methods
    // you can store variables/parameters also there
    companion object {
        var Pi = 3.14
        fun mul(a: Int, b: Int) = a * b
    }
}

class Database private constructor() {
    // singleton class

    companion object {
        private var instance: Database? = null
        fun getInstance(): Database? {
            if (instance == null) {
                instance = Database()
            }
            return instance
        }
    }
}

object Config {
    // Singletons can also be created this way
    init {
        println("Configuration created")
    }
}

class Cat(var name: String, var breed: String, var age: Int) {
    init {
        println("Cat: $name is created")
    }
}

enum class Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST
}

enum class PropertyType(var pType: String, var maxPeople: Int) {
    LAND("land", 20),
    BHK("bhk", 2),
    VILLA("villa", 5),
    PALACE("palace", 100);      // last enum entry needs a semi-colon, if there are any functions following it.

    fun printData() {
        println("Property type is $pType and it can be occupied by max $maxPeople persons")
    }
}

class ShoppingList(val items: Array<String>) {
    inner class ListItems() {
        fun displayItems(pos: Int) {
            println(items[pos])
        }
    }
}

class BankAccount(var name: String) {
    private var balance: Double = 0.0
    private var transactions = mutableListOf<Double>()
    fun deposit(amount: Double) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited successfully. New Balance: $balance")
        } else {
            println("Invalid deposit amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount < 0) {
            println("Invalid deposit amount")
            return
        }
        if (balance - amount > 0) {
            transactions.add(-amount)
            balance -= amount
            println("$amount withdrawn successfully. New Balance: $balance")
        } else {
            println("Insufficient balance")
        }
    }

    fun calcBalance(): Double {
        this.balance = 0.0
        for (t in transactions) {
            balance += t
        }
        return balance
    }
}
