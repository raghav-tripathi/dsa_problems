package dp

import java.util.Stack

fun longestValidParentheses(s: String): Int {
    val stack = Stack<Int>()
    stack.push(-1)
    var ans = 0

    for (i in s.indices) {
        if (s[i] == '(') {
            stack.push(i)
        }else{
            stack.pop()
            if (stack.isEmpty()){
                stack.push(i)
            }else{
                ans =  maxOf(ans, i-stack.peek())
            }
        }
    }



    return ans
}