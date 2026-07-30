package arrayshashing;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudokuSolution {
    public boolean isValidSudoku(char[][] board) {
        // rows
        for (int i = 0; i < 9; i++) {
            Set<Character> existingNums = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!existingNums.add(board[i][j])) {
                        return false;
                    }
                }
            }
        }
        // columns
        for (int i = 0; i < 9; i++) {
            Set<Character> existingNums = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (!existingNums.add(board[j][i])) {
                        return false;
                    }
                }
            }
        }

        // subboard
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isSubBoardValid(i, j, board))
                    return false;

            }
        }
        return true;

    }
    private boolean isSubBoardValid(int startRow, int startColumn, char[][] board){
        Set<Character> existingNums = new HashSet<>();
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startColumn; j < startColumn + 3; j++) {
                if (board[i][j] != '.') {
                    if (!existingNums.add(board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
