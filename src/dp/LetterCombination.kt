package dp

fun letterCombinations(digits: String): List<String> {

    if (digits.isEmpty()) {
        return emptyList()
    }

    val map = mapOf(

        '2' to listOf('a', 'b', 'c'),
        '3' to listOf('d', 'e', 'f'),
        '4' to listOf('g', 'h', 'i'),
        '5' to listOf('j', 'k', 'l'),
        '6' to listOf('m', 'n', 'o'),
        '7' to listOf('p', 'q', 'r', 's'),
        '8' to listOf('t', 'u', 'v'),
        '9' to listOf('w', 'x', 'y', 'z')
    )

    val result = mutableListOf<String>()

    fun backtrack(
        index: Int,
        current: StringBuilder
    ) {

        if (index == digits.length) {

            result.add(current.toString())

            return
        }

        val digit = digits[index]

        val letters = map[digit]!!

        println("Current letter: $letters, $current")

        for (char in letters) {

            current.append(char)

            println("Char: $current $index")

            backtrack(index + 1, current)
            println("Called Backtracking: ${current.length}")

            current.deleteCharAt(current.length - 1)
        }
    }

    backtrack(0, StringBuilder())

    return result
}