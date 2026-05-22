 package questions

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    var array = listOf<Int>()

    var index = 0

    while (index < nums.size) {
        val correct = nums[index] - 1
        if (nums[correct] != nums[index]) {
            swapValues(nums, index, correct)
        } else {
            index++
        }
    }
    for (index in nums.indices) {
        if (nums[index] != index + 1) {
            array = array + (index + 1)
        }
    }

    return array
}

private fun swapValues(array: IntArray, index: Int, correct: Int) {
    val temp = array[correct]
    array[correct] = array[index]
    array[index] = temp
}
