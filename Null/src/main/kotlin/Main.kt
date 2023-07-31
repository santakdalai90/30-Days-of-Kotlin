fun main() {
    // you cannot assign null to a variable
    // val text: String = null      // doesn't compile
    // but if for some reason you want to assign null then you can do something like this
    var text: String? = null
    println(text)
    // text = "John"
    if (text != null) {
        // for nullable types the compiler will force to have a null check if a member is called directly
        println(text.length)
    } else {
        println("text is null")
    }

    // or you can make a safe call like this and this would print null if the input is null
    println(text?.length)

    // in case you want to make a safe call where for nulls you should raise exception then you can do this
    // println(text!!.length)

    // assigning nullable items
    var text2: String = text ?: "The variable is null"
    println(text2)
}