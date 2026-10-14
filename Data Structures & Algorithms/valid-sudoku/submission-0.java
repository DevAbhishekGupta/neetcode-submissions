class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];

        boolean[][] boxes = new boolean[9][9];

        for (int i =0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char c = board[i][j];

                if (c == '.') {
                    continue;
                }

                int k = c - '0' - 1;

                if (rows[i][k] || cols[j][k])
                    return false;

                rows[i][k] = cols[j][k] = true;

                int bi = i/3 * 3 + j/3;
                if (boxes[bi][k])
                    return false;
                
                boxes[bi][k] = true;

            }
        }

        return true;
    }
}
