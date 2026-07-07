package dp

fun getAllPossibleCombinations(arr: IntArray, target: Int, index:Int,current: MutableList<Int>, ans: MutableList<List<Int>>) {

    if (target == 0){
        ans.add(current.toList())
        return
    }

    if (index >= arr.size || target < 0){
        return
    }

    current.add(arr[index])
    getAllPossibleCombinations(
        arr,
        target - arr[index],
        index+1,
        current,
        ans

    )
    current.removeAt(current.lastIndex)

    getAllPossibleCombinations(arr,target,index+1,current,ans)


}