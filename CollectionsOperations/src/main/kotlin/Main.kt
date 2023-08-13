fun main(args: Array<String>) {
    val numbers = setOf(53, 65, 35, 98, 564, 231, 98)
    println(numbers.map { it * 10 })
    println(numbers.map { if (it % 2 == 0) it * 2 else it * 3 })
    println(numbers.mapIndexedNotNull { index, value -> if (index % 2 == 0) null else index * value })

    val numMap = mapOf("Archie" to 23, "Frank" to 32, "Sumi" to 30, "Ranu" to 28)
    println(numMap.mapKeys { it.key.uppercase() })
    println(numMap.mapValues { it.value + 2 })
}