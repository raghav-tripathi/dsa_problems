package sorting

fun bubbleSort(arr: IntArray) {
    for (i in 0..<arr.size - 1) {
        for (j in 0..<arr.size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}



//Best: O(n)
//Average: O(n²)
//Worst: O(n²)
//Space: O(1)