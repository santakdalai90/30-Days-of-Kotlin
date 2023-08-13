fun main(args: Array<String>) {
    // mapping
    val numbers = setOf(53, 65, 35, 98, 564, 231, 98)
    println(numbers.map { it * 10 })
    println(numbers.map { if (it % 2 == 0) it * 2 else it * 3 })
    println(numbers.mapIndexedNotNull { index, value -> if (index % 2 == 0) null else index * value })

    val numMap = mapOf("Archie" to 23, "Frank" to 32, "Sumi" to 30, "Ranu" to 28)
    println(numMap.mapKeys { it.key.uppercase() })
    println(numMap.mapValues { it.value + 2 })

    // zipping
    val colors = listOf("red", "brown", "blue")
    val animals = listOf("fox", "lion", "cat")
    println(colors.zip(animals))
    println(colors zip animals)
    println(colors.zip(animals) { color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is of $color color" })

    val numPairs = listOf("one" to 1, "thirty" to 30, "Ninety Nine" to 99)
    println(numPairs)
    println(numPairs.unzip())

    // association
    val fruits = listOf("Kiwi", "Dragon Fruit", "Pineapple", "Guava")
    println(fruits.associateWith { it.length })
    println(fruits.associateBy { it.first().uppercase() })
    println(fruits.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.uppercase()}))
}