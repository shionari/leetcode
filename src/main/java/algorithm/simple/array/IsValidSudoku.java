package algorithm.simple.array;

/**
 * Created by shionari on 2018/5/11
 */
public class IsValidSudoku {
    public boolean solution(char[][] board) {
        return checkLines(board) && checkRows(board) && checkBlocks(board);
    }

    private boolean checkLines(char[][] board) {
        for (int line = 0; line < 9; line++) {
            boolean[] exist = new boolean[10];
            for (int i = 0; i < board[line].length; i++) {
                char num = board[line][i];
                if ('.' != num && isExist(exist, num)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkRows(char[][] board) {
        for (int row = 0; row < 9; row++) {
            boolean[] exist = new boolean[10];
            for (int i = 0; i < board.length; i++) {
                char num = board[i][row];
                if ('.' != num && isExist(exist, num)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkBlocks(char[][] board) {
        for (int line = 0; line < 3; line++) {
            for (int row = 0; row < 3; row++) {
                boolean[] exist = new boolean[10];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char num = board[line * 3 + i][row * 3 + j];
                        if ('.' != num && isExist(exist, num)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean isExist(boolean[] exist, char num) {
        boolean res = exist[num - 48];
        exist[num - 48] = true;
        return res;
    }
}
