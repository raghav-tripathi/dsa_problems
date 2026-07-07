package dp
//Input: nums = [2,3,1,1,4]
//Output: true

fun canJump(nums: IntArray): Boolean {
    var reachable = 0
    for (i in nums.indices) {
        if (i > reachable) return false
        reachable = maxOf(reachable, i + nums[i])
    }

    return true
}
