package dp

fun jump(nums: IntArray): Int {
    var current = 0
    var steps = 0
    var howfar = 0

    for (i in 0..<nums.size - 1) {
        howfar = maxOf(howfar, i + nums[i])
        if (i == current) {
            steps++
            current = howfar
        }
    }

    return steps
}
