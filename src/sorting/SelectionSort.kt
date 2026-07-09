package sorting

fun selectionSort(arr: IntArray) {

    for (i in arr.indices) {

        var min = i

        for (j in i + 1 until arr.size) {
            if (arr[j] < arr[min])
                min = j
        }

        val temp = arr[i]
        arr[i] = arr[min]
        arr[min] = temp
    }
}


//Time:O(n²)
//Space:(1)