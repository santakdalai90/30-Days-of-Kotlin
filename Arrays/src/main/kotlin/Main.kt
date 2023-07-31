fun main() {
    var names = arrayOf("John", "Stephen", "Megan")
    println("Size of the array: ${names.size}")
    // this won't print the contents of the array
    println(names.toString())
    // this would
    println(names.contentToString())

    // printing an element
    println("First element: ${names[0]}")

    // loops with arrays
    for (name in names) {
        println(name)
    }

    names.forEach {
        println(it)
    }

    // array with multiple types
    var group = arrayOf("Apple", "Banana", 123, 89654.32264, 975, 890, true, false, "Scooter")
    group.forEach {
        if (it is Int) {    // you can check the type this way
            println(it)
        }
    }

    println("max = ${foo(arrayOf(34,67,12,9,123, 90))}")
    println("min = ${foo(arrayOf(34,67,12,9,123, 90), false)}")
}

fun foo(nums: Array<Int>, getMax: Boolean = true): Int {
    if (getMax){
        return largest(nums)
    }
    return smallest(nums)
}

fun largest(nums: Array<Int>): Int{
    var max = Int.MIN_VALUE
    nums.forEach {
        if (it > max) {
            max = it
        }
    }
    return max
}

fun smallest(nums: Array<Int>): Int{
    var min = Int.MAX_VALUE
    nums.forEach {
        if (it < min) {
            min = it
        }
    }
    return min
}