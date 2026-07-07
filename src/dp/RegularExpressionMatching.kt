package dp

//'.' Matches any single character.
//'*' Matches zero or more of the preceding element.

//Input: s = "aa", p = "a"
//Output: false

fun isMatch(s: String, p: String): Boolean {

    val memo = HashMap<Pair<Int, Int>, Boolean>()

    fun dp(i: Int, j: Int): Boolean {

        val key = Pair(i, j)

        if (memo.containsKey(key)) {
            return memo[key]!!
        }

        if (j == p.length) {
            return i == s.length
        }

        val firstMatch =
            i < s.length &&
                    (s[i] == p[j] || p[j] == '.')

        val ans = if (
            j + 1 < p.length &&
            p[j + 1] == '*'
        ) {

            dp(i, j + 2) ||
                    (firstMatch && dp(i + 1, j))

        } else {

            firstMatch &&
                    dp(i + 1, j + 1)
        }

        memo[key] = ans
        return ans
    }

    return dp(0, 0)
}
