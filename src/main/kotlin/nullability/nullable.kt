package nullability

fun main() {
    val s1: String = "Some text"
    s1.length
    val s2: String? = null
//    s2.length - Error

    if (s2 != null) {
        s2.length
    }

    println(s2?.length)

    val s3: String? = null
    s3!!
    s3.length
}