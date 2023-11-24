package alishev

fun main() {
//    val child = Person("Child", "Child", 1)
//    val p1 = Person("Alice", "Uows", 12, child)
//    println(p1.firstName)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("P is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)

    println(rectangle1.equals(rectangle2))

}

// Primary Constructor - первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("Person is created $firstName")
    }

    // Вторичный конструктор
    constructor(firstName: String, lastName: String, age: Int, child: Person) : this(firstName, lastName, age) {
        children.add(child)
    }

    //Конструктор без аргументов
    constructor() : this("", "", -1)
}

data class Rectangle(var height: Double, var length: Double) {

    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 // field = this.поле
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length


}