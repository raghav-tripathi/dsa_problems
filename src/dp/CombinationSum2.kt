package dp

fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()
    candidates.sort()

    backtrackingSum2(candidates, target, 0, mutableListOf(), ans)

    return ans

}

fun backtrackingSum2(
    candidates: IntArray,
    target: Int,
    index: Int,
    current: MutableList<Int>,
    ans: MutableList<List<Int>>
) {
    if (target == 0) {
        ans.add(current.toList())
        return
    }


    for (i in index..<candidates.size) {
        if (i > index && candidates[i] == candidates[i - 1]) {
            continue
        }

        if (candidates[i] > target) {
            break
        }

        current.add(candidates[i])
        backtrackingSum2(candidates, target - candidates[i], i + 1, current, ans)
        current.removeAt(current.size - 1)
    }

}