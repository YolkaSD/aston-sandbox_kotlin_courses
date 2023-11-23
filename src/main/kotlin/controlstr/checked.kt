package controlstr

fun main() {
    println(isLetter('c'))
    println(isLetter('1'))
    println(isNotDigit('1'))
    println(isNotDigit('*'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z' // 'a' <= c && c  'z'

fun isNotDigit(c: Char) = c !in '0'..'9'