package dp

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()

    backtrackingSum(candidates, target, 0,mutableListOf(),ans)

    return ans

}

fun backtrackingSum(
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

    if (index >= candidates.size || target < 0){
        return
    }
    current.add(candidates[index])
    backtrackingSum(candidates, target-candidates[index], index, current, ans)
    current.removeAt(current.size - 1)
    backtrackingSum(candidates, target, index+ 1, current, ans)
}
