class Car (var name: String, var model: String, var color: String, var doors: Int){
    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}

class User(var name: String, age: Int){
    var group: String
    // initializer block - runs after the primary constructor
    init {
        when (age) {
            in 0..12 -> this.group = "baby"
            in 13..19 -> this.group = "teenager"
            in 20..40 -> this.group = "adult"
            in 40 .. 60 -> this.group = "middle-aged"
            in 60 .. 100 -> this.group = "senior"
            else -> this.group = "alien"
        }
    }

    init {
        // you can define multiple initializer blocks and the order of execution
        // is the order in which they are defined
    }

}