package dp

fun solveSudoku(board: Array<CharArray>) {
    solve(board)

    board.forEach {
        println(it.joinToString(" "))
    }
}

private fun isSafePlace(
    board: Array<CharArray>,
    row: Int,
    col: Int,
    num: Char
): Boolean {

    // Row check
    for (c in 0..<9) {
        if (board[row][c] == num) {
            return false
        }
    }

    // Column check
    for (r in 0..<9) {
        if (board[r][col] == num) {
            return false
        }
    }

    // 3x3 box check
    val startRow = (row / 3) * 3
    val startCol = (col / 3) * 3

    for (r in startRow..<startRow + 3) {
        for (c in startCol..<startCol + 3) {

            if (board[r][c] == num) {
                return false
            }
        }
    }

    return true
}

private fun solve(board: Array<CharArray>): Boolean {

    for (row in 0..<9) {

        for (col in 0..<9) {

            if (board[row][col] == '.') {

                for (num in '1'..'9') {

                    if (isSafePlace(board, row, col, num)) {

                        board[row][col] = num

                        if (solve(board)) {
                            return true
                        }

                        board[row][col] = '.'
                    }
                }

                return false
            }
        }
    }

    return true
}