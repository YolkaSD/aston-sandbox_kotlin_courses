package controlstr

import java.lang.IllegalArgumentException

fun main() {
    val number = 101

    val percentage =
        if (number in 0..100)
            number
        else
            throw IllegalArgumentException()
}