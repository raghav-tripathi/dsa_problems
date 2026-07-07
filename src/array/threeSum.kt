package array

fun threeSum(nums: IntArray): List<List<Int>> {
    nums.sort()
    val result = mutableListOf<List<Int>>()
    for (num in 0..<(nums.size - 2)) {
        if (num > 0 && nums[num] == nums[num - 1]) {
            continue
        }


        var left = num + 1
        var right = nums.size - 1


        while (left < right) {
            val sum = nums[num] + nums[left] + nums[right]

            when {
                sum == 0 -> {
                    result.add(listOf(nums[num], nums[left], nums[right]))
                    left++
                    right--


                    while (left < right && nums[left] == nums[left - 1]) {
                        left++
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--
                    }
                }

                sum < 0 -> {
                    left++
                }

                else -> {
                    right--
                }
            }
        }
    }
    return result
}