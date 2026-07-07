import dp.combinationSum2
import dp.getAllPossibleCombinations
import dp.letterCombinations
import linklist.ListNode
import questions.numberOfSpecialChars
import questions.productExceptSelf
import questions.searchRange

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
//    println(searchRange(intArrayOf(1,2,2,2,2,3,3,4),4))

//    numberOfSpecialChars("AbBCab")
    val ans = mutableListOf<List<Int>>()

    val answer = combinationSum2(intArrayOf(10,1,2,7,6,1,5),8)
    println(answer.toString())
}

