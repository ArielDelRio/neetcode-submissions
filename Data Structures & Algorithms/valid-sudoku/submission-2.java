class Solution {
    public boolean isValidSudoku(char[][] board) {
         Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        // for(int i = 0; i < board.length; i++) {
        //     System.out.println(board[i]);
        // }

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                char value = board[col][row];
                if(value == '.') continue;

                 String squareKey = (row / 3) + "," + (col / 3);
                     
                 if (rows.computeIfAbsent(row, k -> new HashSet<>()).contains(value) ||
                    cols.computeIfAbsent(col, k -> new HashSet<>()).contains(value) ||
                    squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(value)) {
                    return false;
                }

                rows.get(row).add(value);
                cols.get(col).add(value);
                squares.get(squareKey).add(value);
            }
        }


        return true;
        
    }
}
