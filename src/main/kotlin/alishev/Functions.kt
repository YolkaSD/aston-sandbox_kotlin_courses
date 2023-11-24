package alishev

fun main() {
    println(testSimple(3, 10))
    println(testString(10))
    println(testNamedArguments(3, 2, 5))
    println(testNamedArguments(y = 3, z = 2, x = 5))
    testDefaultArguments(1, 2)
    testDefaultArguments()
    testDefaultArguments(2)
    testDefaultArguments(y = 2)

    printEven(1, 4, 5, 2, 1, 6, 8, 10)
    printEven(*intArrayOf(1, 10, 5, 30, 20), 2, 1, 2, 5, 4)
}


//fun testSimple(): Int {
//    return 5 + 5
//}

//fun testSimple(x: Int, y: Int): Int = x + y

fun testSimple(x: Int, y: Int) = x + y

fun testString(x: Int) = "Some string is $x"

fun testNamedArguments(x: Int, y: Int, z: Int) = listOf(x, y, z)

fun testDefaultArguments(x: Int = 0, y: Int = 0) = println(x + y)

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.uppercase() else name) + number
}

// vararg

fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}



