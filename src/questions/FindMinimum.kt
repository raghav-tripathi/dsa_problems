package questions

fun findMin(arr: IntArray): Int {
    if (arr.size in 1..<2) return arr[0]

    var start = 0
    var end = arr.size - 1
    while (start < end) {
        val mid = start + (end - start) / 2
        if (arr[mid] > arr[end]) {
            start = mid+1
        } else {
            end = mid
        }
    }
    return arr[start]
}