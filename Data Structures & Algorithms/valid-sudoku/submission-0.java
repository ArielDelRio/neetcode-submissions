class Solution {
    public boolean isValidSudoku(char[][] board) {
    Set<Character>[] rows = new Set[9];
        Set<Character>[] cols = new Set[9];
        Set<Character>[] boxes = new Set[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                char current = board[row][col];
                if (current == '.') {
                    continue;
                }

                if (rows[row].contains(current)
                        || cols[col].contains(current)
                        || boxes[(row / 3) * 3 + (col / 3)].contains(current)) {
                    return false;
                }

                rows[row].add(current);
                cols[col].add(current);
                boxes[(row / 3) * 3 + (col / 3)].add(current);
            }
        }
        return true;
    }
}
