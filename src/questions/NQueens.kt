package questions


fun solveNQueens(n: Int): List<List<String>> {
    val board = MutableList(n) {
        MutableList(n) { '.' }
    }

    val ans = mutableListOf<List<String>>()

    nQueens(board, 0, n, ans)

    return ans

}

fun nQueens(
    board: MutableList<MutableList<Char>>,
    row: Int,
    n: Int,
    ans: MutableList<List<String>>
) {
    if (row == n) {
        val temp = mutableListOf<String>()

        for (r in board) {
            temp.add(r.joinToString(""))
        }

        ans.add(temp)

        return
    }


    for (col in 0..<n) {
        if (isSafe(board, row, col, n)) {
            board[row][col] = 'Q'
            nQueens(board, row + 1, n, ans)
            board[row][col] = '.'
        }

    }

}

fun isSafe(board: MutableList<MutableList<Char>>, row: Int, col: Int, n: Int): Boolean {
    // check upper column

    var r = row - 1
    while (r >= 0) {
        if (board[r][col] == 'Q') {
            return false
        }

        r--
    }

    // check upper leftDiagonal

    r = row - 1
    var c = col - 1
    while (r >= 0 && c >= 0) {
        if (board[r][c] == 'Q') {
            return false
        }
        r--
        c--
    }

    // check upper column
    r = row - 1
    c = col + 1
    while (r >= 0 && c < n) {
        if (board[r][c] == 'Q') {
            return false
        }
        r--
        c++
    }

    return true
}
