package sorting

fun mergeSort(arr: IntArray, left: Int, right: Int) {
    if (left >= right) return

    val mid = (left + right) / 2

    mergeSort(arr, left, mid)
    mergeSort(arr, mid + 1, right)

    merge(arr, left, mid, right)
}

fun merge(arr: IntArray, left: Int, mid: Int, right: Int) {
    val temp = mutableListOf<Int>()

    var i = left
    var j = mid + 1

    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j])
            temp.add(arr[i++])
        else
            temp.add(arr[j++])
    }

    while (i <= mid)
        temp.add(arr[i++])

    while (j <= right)
        temp.add(arr[j++])

    for (k in temp.indices)
        arr[left + k] = temp[k]
}


//Time:O(n log n)
//Space:O(n)