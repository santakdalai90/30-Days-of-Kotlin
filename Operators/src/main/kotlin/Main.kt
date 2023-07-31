fun main() {
    var x = 5
    val y = 3.0

    val res = x+y      // vals can be result of an expression as well
    println("result = $res")
    println("x + y = ${x+y}")   // way to have expression in a placeholder
    println("x - y = ${x-y}")   // operation with double implicitly promotes the result to double
    println("x * y = ${x*y}")
    println("x / y = ${x/y}")
    println("x % y = ${x%y}")

    x += 2
    println("result = $x")

    var age = 23
    if (age > 18) {
        println("Eligible to cast vote")
    } else if (age > 12){
        println("You are a teenager")
    } else {
        println("Go and play with toys")
    }
}