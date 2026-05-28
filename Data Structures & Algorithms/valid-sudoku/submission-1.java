class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                char current = board[row][col];
                if (current == '.') {
                    continue;
                }

                int numIndex = current - '1'; // Convert char '1'-'9' to index 0-8
                int boxIndex = (row / 3) * 3 + (col / 3);

                // Check if the current number has already been seen in the current row, column, or box
                if (rows[row][numIndex]
                        || cols[col][numIndex]
                        || boxes[boxIndex][numIndex]) {
                    return false;
                }

                // Mark the current number as seen in the current row, column, and box
                rows[row][numIndex] = true;
                cols[col][numIndex] = true;
                boxes[boxIndex][numIndex] = true;
            }
        }
        return true;
    }
}
