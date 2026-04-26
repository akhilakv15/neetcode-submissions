class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> set=new HashSet();

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j]=='.') continue;
                if(!set.add(board[i][j]+"at row"+i) || !set.add(board[i][j]+"at column"+j)
                || !set.add(board[i][j]+"at row"+i/3+"column"+j/3)) {
                    return false;
                }
            }
        }

        return true;

        
    }
}
