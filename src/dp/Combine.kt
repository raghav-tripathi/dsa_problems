package dp

fun combine(n: Int, k: Int): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()

    combineBacktracking(n, k, 1, ans, mutableListOf())

    return ans

}

fun combineBacktracking(
    n: Int,
    k: Int,
    index: Int,
    ans: MutableList<List<Int>>,
    current: MutableList<Int>
) {
    if (current.size == k) {
        ans.add(current.toList())
        return
    }

    for (i in index..<(n - (k - current.size) + 1))  {
        current.add(i)

        combineBacktracking(
            n = n,
            k = k,
            index = index + 1,
            ans = ans,
            current = current
        )

        current.removeAt(current.size - 1)
    }


}
