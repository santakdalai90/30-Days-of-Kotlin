fun main(args: Array<String>) {
    val car1 = Car("Tesla", "Marsh Green", 5)
    println("Car Name = ${car1.name}")
    car1.move()
    car1.stop()
    println("----------------------------")

    val car2 = Car("Tata", "Blue", 5)

    println("Car Name = ${car2.name}")
    car2.move()
    car2.stop()
    println("----------------------------")

    val plane1 = Plane("Boeing", "Blue", 4)

    println("Plane Name = ${plane1.name}")
    plane1.move()
    plane1.stop()
    println("----------------------------")

    val plane2 = Plane("AirBus", "Pink", 2)

    println("Plane Name = ${plane2.name}")
    plane2.move()
    plane2.stop()
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

    var dog2 = Dog(name = "Kaalu", breed = "Indian Pariah", age = 3)
    dog2.describe()
    println("----------------------------")

    var emp1 = Employee("Pamela", "HR", 7000)
    emp1.describe()

    var emp2 = Employee("Jane", "Operations", 700)
    emp2.salary = 700       // setter would be called when we explicitly set the value
    emp2.describe()
    println("----------------------------")

    var flower = Flower("Marrigold", "Yellow", 200)
    flower.season = "Winter"    // a lateinit property must be initialized else you'd get an exception
    println(flower)
    println("----------------------------")

    var calc = Calculator()
    println("Result of sum = ${calc.sum(54646, 156189)}")

    // function from companion object
    println("Result of multiplication = ${Calculator.mul(5645, 132)}")
    // variable from companion object
    println("Value of Pi = ${Calculator.Pi}")
    println("----------------------------")

    var dbInstance = Database.getInstance()
    println(dbInstance)
    var dbInstance2 = Database.getInstance()
    println(dbInstance2)

    println(Config)
    println(Config)
    println("----------------------------")

    var c1 = Cat("Tom", "British", 1)
    var c2 = Cat("Oscar", "Persian", 2)

    val c3 by lazy {    // Lazy initialization. Only vals can be created, not vars.
        Cat("Leo", "Ragdoll", 3)
    }

    println("Initializing c3")
    println(c3.name)    // Object is initalized only when the object is used
    println("----------------------------")

    println(Direction.NORTH)
    println(Direction.WEST)

    for (p in PropertyType.values()) {
        println("${p.name} - ${p.maxPeople}")
    }

    PropertyType.PALACE.printData()

    val pp = PropertyType.LAND

    when (pp) {
        PropertyType.LAND -> println("Nice you can do farming on the land")
        else -> println("You can stay at your property")
    }

    val pp2 = PropertyType.valueOf("LAND")

    when (pp) {
        PropertyType.LAND -> println("Nice you can do farming on the land")
        else -> println("You can stay at your property")
    }
    println("----------------------------")

    var sl = ShoppingList(arrayOf("Potato", "Apple", "Detergent", "Oil"))
    sl.ListItems().displayItems(2)
    println("----------------------------")

    var harryAccount = BankAccount("Harry")
    harryAccount.deposit(1000.23)
    harryAccount.deposit(235.23)
    harryAccount.deposit(-32.23)
    harryAccount.withdraw(50.00)
    harryAccount.withdraw(70.00)
    harryAccount.withdraw(-95.63)
    harryAccount.withdraw(5000.35)
    println("Final balance: $${harryAccount.calcBalance()}")
    println("----------------------------")

    val view = View()
    view.draw()

    val button = Button("Login", "Center")
    button.draw()

    val roundButton = RoundButton("Sign Up", "Top-Left", 5)
    roundButton.draw()
}
