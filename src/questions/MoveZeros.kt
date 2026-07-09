package questions

fun moveZeroes(nums: IntArray){
    var  index = 0
    for (i in nums.indices){
        if (nums[i] != 0){
            nums[index] =  nums[i]
            index++
        }
    }

    while (index < nums.size){
        nums[index] = 0
        index++
    }
    println(nums.joinToString())

}


fun moveZeroesApproach2(nums: IntArray) {
    var index = 0

    for (i in nums.indices) {
        if (nums[i] != 0) {
            val temp = nums[index]
            nums[index] = nums[i]
            nums[i] = temp
            index++
        }
    }

    println(nums.joinToString())
}