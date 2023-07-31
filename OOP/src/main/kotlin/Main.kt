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
    println("----------------------------")

    val user = User("Lisa", 16)
    println("User name: ${user.name} has group: ${user.group}")

    val user2 = User("Steve", 23)
    println("User name: ${user2.name} has group: ${user2.group}")

    val user3 = User("Veronica")        // using secondary constructor
    println("User name: ${user3.name} has group: ${user3.group}")

    val user4 = User()        // using secondary constructor
    println("User name: ${user4.name} has group: ${user4.group}")
    println("----------------------------")

    var dog1 = Dog(breed = "labrador")
    dog1.describe()

    var dog2 = Dog(name = "Kaalu", breed = "Indian Pariah", age=3)
    dog2.describe()
    println("----------------------------")

    var emp1 = Employee("Pamela", "HR", 7000)
    emp1.describe()

    var emp2 = Employee("Jane", "Operations", 700)
    emp2.salary = 700       // setter would be called when we explicitly set the value
    emp2.describe()
}
