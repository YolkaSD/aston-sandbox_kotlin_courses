package alishev

fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(true)
}

fun testWhen(input: Any) {
    when(input) {
        1 -> println(1)
        2 -> println(2)
        in 10..20 -> println(10..20)
        is String -> println("Была введена строка")
        else -> println("Что-то еще")
    }
}