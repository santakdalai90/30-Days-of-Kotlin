fun main(args: Array<String>) {
    val car1 = Car()
    car1.name = "Tesla"
    car1.model = "CyberTruck"
    car1.color = "Marsh Green"
    car1.doors = 5

    println("Car Name = ${car1.name}")
    car1.move()
    car1.stop()

    println("----------------------------")

    val car2 = Car()
    car2.name =  "Tata"
    car2.model = "Nexon"
    car2.color = "Blue"
    car2.doors = 5

    println("Car Name = ${car2.name}")
    car2.move()
    car2.stop()
}

class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("The car $name has stopped")
    }
}