package controlstr

val numbers = listOf(1, 2, 3, 4)

val map = mapOf(
    1 to "one",
    2 to "two",
    3 to "three"
)

fun main() {
    for (i in numbers) {
        println(i)
    }

    for ((key, value) in map) {
        println("$key = $value")
    }

    for ((index, element) in numbers.withIndex()) {
        println("$index: $element")
    }

    for (i in 1..10) {
        print(i)
    }
    println()

    for (i in 1 until 10) {
        print(i)
    }
    println()

    for (i in 9 downTo 1 step 2) {
        print(i)
    }
}