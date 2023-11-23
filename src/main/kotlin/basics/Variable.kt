package basics

fun main() {
    val question = "some Text"
    // question = "123"; ошибка

//    var answer = 0
//    answer = 42
//
//    println(answer)
//
//    val m = max(10, 20)
//    println(m);
//    displayMax(15, 10)

//    println(listOf('a', 'b', 'c').joinToString (
//        "", "(", ")"))
//
//    println(listOf('a', 'b', 'c').joinToString (
//        postfix = "."))

    displaySeparator(size = 15)

}


fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun displayMax(a: Int, b: Int): Unit {
    println(max(a, b))
}
