package questions


fun searchRange(nums: IntArray, target: Int): Int {

    val first = findFirst(nums, target)
    val last = findLast(nums, target)

    return (last-first)+1
}

private fun findFirst(nums: IntArray, target: Int): Int {

    var start = 0
    var end = nums.size - 1
    var ans = -1

    while (start <= end) {

        val mid = start + (end - start) / 2

        when {
            nums[mid] == target -> {
                ans = mid
                end = mid - 1
            }

            nums[mid] < target -> {
                start = mid + 1
            }

            else -> {
                end = mid - 1
            }
        }
    }

    return ans
}

private fun findLast(nums: IntArray, target: Int): Int {

    var start = 0
    var end = nums.size - 1
    var ans = -1

    while (start <= end) {

        val mid = start + (end - start) / 2

        when {
            nums[mid] == target -> {
                ans = mid
                start = mid + 1
            }

            nums[mid] < target -> {
                start = mid + 1
            }

            else -> {
                end = mid - 1
            }
        }
    }

    return ans
}
