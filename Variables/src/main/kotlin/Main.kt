fun main() {
    // declaring a variable using var
    var name: String = "Ramesh"
    println("Hello $name!")
    name = "John"
    println("Hello $name!")

    // implicit variable declaration
    var age = 25
    println("Hello $name! You age is $age years")

    // declaring a value/const
    val pi: Double = 3.14
    // pi = 22.0/7.0        // gives error that val cannot be reassigned
    var area = pi * 5 * 5
    println("Area: $area")
}