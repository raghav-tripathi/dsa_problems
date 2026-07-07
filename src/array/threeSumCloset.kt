package array

import kotlin.math.abs

fun threeSumClosest(nums: IntArray, target: Int): Int {
    nums.sort()
    var closest = nums[0] + nums[1] + nums[2]

    for (i in 0..<nums.size -2) {
        var left = i + 1
        var right = nums.size - 1

        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]

            if(abs(target - sum) <= abs(target - closest)) {
                closest =  sum
            }

            if (sum == target){
                return sum
            }else if (sum < target){
                left++
            }else{
                right--
            }

        }

    }

    return closest
}