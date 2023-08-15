fun main(args: Array<String>) {
    // Mapping
    val numbers = setOf(53, 65, 35, 98, 564, 231, 98)
    println(numbers.map { it * 10 })
    println(numbers.map { if (it % 2 == 0) it * 2 else it * 3 })
    println(numbers.mapIndexedNotNull { index, value -> if (index % 2 == 0) null else index * value })

    val numMap = mapOf("Archie" to 23, "Frank" to 32, "Sumi" to 30, "Ranu" to 28)
    println(numMap.mapKeys { it.key.uppercase() })
    println(numMap.mapValues { it.value + 2 })

    // Zipping
    val colors = listOf("red", "brown", "blue")
    val animals = listOf("fox", "lion", "cat")
    println(colors.zip(animals))
    println(colors zip animals)
    println(colors.zip(animals) { color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is of $color color" })

    val numPairs = listOf("one" to 1, "thirty" to 30, "Ninety Nine" to 99)
    println(numPairs)
    println(numPairs.unzip())

    // Association
    val fruits = listOf("Kiwi", "Dragon Fruit", "Pineapple", "Guava", "Apple")
    println(fruits.associateWith { it.length })
    println(fruits.associateBy { it.first().uppercase() })
    println(fruits.associateBy(keySelector = { it.first().uppercase() }, valueTransform = { it.uppercase() }))

    // Flatten
    var non = listOf(setOf(2, 3, 5), setOf(7, 11, 13), setOf(17, 19, 23))
    println(non[0].elementAt(2))
    for (nums in non) {
        for (n in nums) {
            print("$n\t")
        }
        println()
    }
    val numFlat = non.flatten()
    println(numFlat)

    // string representations
    println(fruits)                 // prints with square brackets
    println(fruits.joinToString())  // prints simple comma separated list as string
    val sb = StringBuffer("The list of fruits: ")
    println(fruits.joinTo(sb))
    println(fruits.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
    println(
        (1..100).joinToString(
            separator = " | ",
            prefix = "start: ",
            postfix = ": end",
            limit = 30,
            truncated = "more..."
        )
    )
    println(fruits.joinToString { "Fruit: ${it.uppercase()}" })

    // Filtering
    println(fruits.filter { it.length < 7 })
    println(numMap.filter { it.key.length < 5 && it.value < 31 })
    println(fruits.filterIndexed { index, s -> (index != 0) && (s.length < 6) })
    println(fruits.filterNot { it.length < 6 })
    val mixed = listOf(1, 2, 3, 'a', 'b', 'c', "Hello", "World", false, true)
    mixed.filterIsInstance<Int>().forEach {
        println(it)
    }
    mixed.filterIsInstance<Boolean>().forEach {
        println(it)
    }

    // Partition
    val (match, rest) = fruits.partition { it.length > 6 }
    println("Match: $match")
    println("Rest: $rest")

    println(fruits.any { it.endsWith("e") })
    println(fruits.none { it.endsWith("w") })
    println(fruits.all { it.length > 4 })
}