class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Create a hashset
        Set set = new HashSet();

        //Begin iterating through the board
        for(int i = 0; i < 9; i++) {        // Iterate through the row
            for(int j = 0; j < 9; j++) {    // Iterate through the column
                char num = board[i][j];     // get the current value
                if(num != '.') {
                    if(!set.add(num + " at row  " + i) ||
                        !set.add(num + " at column " + j) ||
                        !set.add(num + " at block " + i/3 + "-" + j/3)) {
                            return false;
                        }
                }
            }
        }
        return true;
    }
}
