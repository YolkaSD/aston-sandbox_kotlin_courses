package alishev.yandex

fun main() {
    val nums1 = listOf(1, 2, 3, 2, 0)
    val nums2 = listOf(5, 1, 2, 7, 3, 2)

    println(getRepeatedIntersection(intArrayOf(1, 2, 3, 2, 0), intArrayOf(5, 1, 2, 7, 3, 2)))
}

fun getRepeatedIntersection(nums1: IntArray, nums2: IntArray): List<Int> {
    val s1 = nums1.toHashSet() // 1, 2, 3, 0
    val s2 = nums2.toHashSet() // 5, 1, 2, 7, 3

    val result = mutableListOf<Int>()

    for (el in s1) {
        if (s2.contains(el)) {
            val numOfRepeats = minOf(nums1.count { it == el }, nums2.count { it == el })
            repeat(numOfRepeats) { result.add(el) }
        }
    }

    return result;
}