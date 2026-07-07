package dp

fun longestPalindrome(s: String): String {

    val t = "#" + s.toCharArray().joinToString("#") + "#"

    val p = IntArray(t.length)

    var center = 0
    var right = 0

    var maxLen = 0
    var maxCenter = 0

    for (i in t.indices) {

        val mirror = 2 * center - i

        if (i < right) {
            p[i] = minOf(right - i, p[mirror])
        }

        while (
            i + p[i] + 1 < t.length &&
            i - p[i] - 1 >= 0 &&
            t[i + p[i] + 1] == t[i - p[i] - 1]
        ) {
            p[i]++
        }

        if (i + p[i] > right) {
            center = i
            right = i + p[i]
        }

        if (p[i] > maxLen) {
            maxLen = p[i]
            maxCenter = i
        }
    }

    val start = (maxCenter - maxLen) / 2
    return s.substring(start, start + maxLen)
}
