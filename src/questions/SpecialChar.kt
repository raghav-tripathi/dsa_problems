package questions

fun numberOfSpecialChars(word: String): Int {

    val lastLower = mutableMapOf<Char, Int>()
    val firstUpper = mutableMapOf<Char, Int>()

    for (i in word.indices) {

        val ch = word[i]

        if (ch.isLowerCase()) {
            lastLower[ch] = i
        } else {
            val lowerChar = ch.lowercaseChar()

            if (!firstUpper.containsKey(lowerChar)) {
                firstUpper[lowerChar] = i
            }
        }
    }

    var count = 0

    for (ch in lastLower.keys) {

        if (firstUpper.containsKey(ch)) {

            if (lastLower[ch]!! < firstUpper[ch]!!) {
                count++
            }
        }
    }

    return count
}