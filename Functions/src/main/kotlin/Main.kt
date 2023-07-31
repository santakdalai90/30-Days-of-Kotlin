fun main() {
    sayHello("Jacob", 27)
    sayHello("Adam", 34)

    val hasConnection = false
    if (hasConnection) {
        getData("random data")
    } else {
        showMessage()
    }

    println(getMax(36, getMax(93, 45)))

    println(getMax(36, getMin(93, 45)))

    println(getMax(3.4, 9.2))

    println(getMax(24, 76, 17))

    sendMessage("Barbara", "Hi There!")
    sendMessage("Michelle")
    // you can give named parameters out of order as well
    sendMessage(message = "How are you?", name = "Marie")

    println(simpleInterest(10000.00, 5.5))

    println("Average = %.2f".format(average(56.89, 123.34, 90284098.234, 529057.209578)))
}

fun showMessage() {
    println("not connected to the Internet")
}

fun getData(data: String) {
    println("Your data is $data")
}

fun sayHello(name: String, age: Int) {      // parameters are vals and cannot be changed
    // age = 45     // doesn't compile as parameters are vals
    println("Hello $name, and your age is $age")
}

fun getMax(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// single expression function
fun getMin(a: Int, b: Int): Int = if (a < b) a else b

// overloaded function to use doubles with getMax()
fun getMax(a: Double, b: Double): Double = if (a > b) a else b

// overloaded function to use three parameters in getMax()
fun getMax(a: Int, b: Int, c: Int): Int = getMax(a, getMax(b, c))

// function with a default value
fun sendMessage(name: String = "John Doe", message: String = "Good Day!") {
    println("Name: $name, Message: $message")
}

// you may use an expression as well for the default value of a parameter
// Note: A parameter with default value cannot be followed by a parameter not having default value
fun simpleInterest(principal: Double, time: Double, rate: Double = getDefaultRate()): Double {
    return (principal*rate*time) / 100
}

fun getDefaultRate() = 7.5

// variadic functions or varargs
fun average(vararg numbers: Double): Double {
    var res = 0.0
    var count = 0
    numbers.forEach {
        res += it
        count++
    }

    return res / count
}