package questions

fun rotatedOrSorted(arr: IntArray): Boolean {
    val size = arr.size
    var count = 0

    for(i in arr.indices) {
        if (arr[i] > arr[(i + 1)%size]) {
            count++
        }
    }
    return count <=1
}