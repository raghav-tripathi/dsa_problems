package dp

fun permute(nums: IntArray): List<List<Int>> {
    val ans = mutableListOf<List<Int>>()

    backTrackPer(nums, mutableListOf(), BooleanArray(nums.size), ans)

    return ans
}

fun backTrackPer(
    nums: IntArray,
    current: MutableList<Int>,
    booleanArray: BooleanArray,
    ans: MutableList<List<Int>>
) {

    if (current.size == nums.size) {
        ans.add(current.toList())
        return
    }

    for (i in nums.indices) {
        if (booleanArray[nums[i]]) {
            continue
        }


        current.add(nums[i])
        booleanArray[nums[i]] = true

        backTrackPer(nums, current, booleanArray, ans)
        current.removeAt(current.size - 1)
        booleanArray[nums[i]] = false
    }

}


