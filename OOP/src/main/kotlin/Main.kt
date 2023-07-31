fun main(args: Array<String>) {
    val car1 = Car("Tesla" , "CyberTruck", "Marsh Green",5)
    println("Car Name = ${car1.name}")
    car1.move()
    car1.stop()

    println("----------------------------")

    val car2 = Car("Tata", "Nexon","Blue",5)

    println("Car Name = ${car2.name}")
    car2.move()
    car2.stop()
}

class Car (var name: String, var model: String, var color: String, var doors: Int){
    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}