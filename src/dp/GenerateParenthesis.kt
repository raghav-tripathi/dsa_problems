package dp

fun generateParenthesis(n:Int):List<String>{
    val ans = mutableListOf<String>()
    val str = StringBuilder()

    fun backTracking(open:Int,close:Int){
        if (str.length == n*2){
            ans.add(str.toString())
            return
        }

        if (open<n){
            str.append("(")
            backTracking(open+1,close)
            str.deleteCharAt(str.length-1)
        }
        if (close<open){
            str.append(")")
            backTracking(open,close+1)
            str.deleteCharAt(str.length-1)
        }
    }


    backTracking(0,0)
    return ans




}