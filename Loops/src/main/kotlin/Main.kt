fun main() {

    // normal for loop for a range of numbers
    for (i in 1..10) {
        println(i * i)
    }

    println("==================================")

    for (i in 1 until 10) {
        println(i)
    }

    println("==================================")

    for (i in 1 until 10 step 2) {
        println(i)
    }


    println("==================================")

    for (i in 10 downTo 1) {
        println(i)
    }

    println("==================================")
    var num = 0
    while (num < 10) println(num++)

    println("==================================")
    num = 0
    while (num < 10) println(++num)

    println("==================================")
    num = 0
    while (num < 10) {
        if (++num == 7) {
            println("skipped")
            continue
        }
        println(num)
    }

    println("==================================")
    for (i in 1..10) {
        if (i in 4..6) {
            println("skipped")
            continue
        }
        println(i)
    }

    println("==================================")
    for (i in 10 downTo 1) {
        if (i == 3) {
            break
        }
        println(i)
    }

    println("==================================")
    num = 0
    do println(num++) while (num < 10)

    println("==================================")
    num = 0
    while (num++ < 10) {
        println(num)

        var i = 0
        while (i++ < 5) {
            println("***$i")
        }
    }

    println("==================================")
    num = 0
    // label to break outer loop
    outer@ while (num++ < 10) {
        println(num)

        var i = 0
        while (i++ < 5) {
            if (i == 3) break@outer
            println("***$i")
        }
    }

    println("==================================")
    var evenCount = 0
    for (i in 23..157) {
        if (i%2 == 0) evenCount++
    }
    println("Count of even numbers: $evenCount")
}