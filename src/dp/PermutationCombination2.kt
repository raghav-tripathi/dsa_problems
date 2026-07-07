
package dp

fun permuteCombination2(nums: IntArray): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()
    nums.sort()

    backTrackPer2(nums, mutableListOf(), BooleanArray(nums.size), ans)
    return ans
}

fun backTrackPer2(
    nums: IntArray,
    current: MutableList<Int>,
    used: BooleanArray,
    ans: MutableList<List<Int>>
) {
    if (current.size == nums.size) {
        ans.add(current.toList())
        return
    }
    for (i in nums.indices) {
        if (used[i]){
            continue
        }

        if (i > 0  && nums[i] == nums[i-1] && !used[i-1]) {
            continue
        }

        current.add(nums[i])
        used[i] = true
        backTrackPer2(nums, current, used, ans)
        current.removeAt(current.size - 1)
        used[i] = false

    }
}
