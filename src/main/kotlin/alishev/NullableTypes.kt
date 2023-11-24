package alishev

fun main() {
    var a: String = "Hello"
//    a = null - NPE - исключение
    a.length

    var b: String? = "Test"
    b = null
//    b.length

//    Вернет b, если null -> null (никаких NPE!)
    b?.length

//    Elvis оператор
    val l = b?.length ?: -1
    b = if((0..10).random() > 5) "asdf" else null
//    !! - выбрасывает NPE если в переменной null
    val t = b!!.length

}