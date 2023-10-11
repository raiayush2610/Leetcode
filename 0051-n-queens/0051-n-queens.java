class Solution {
    public boolean isSafe(char[][] board, int row , int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j= col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    static List<String> construct(char[][] board) {

        List<String> internal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            internal.add(row);
        }
        return internal;
    }
    public void Queen(char [][] board, int row,List<List<String>> al){
        if(row== board.length){
            al.add(construct(board));
            return;
        }
        for (int j=0; j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                Queen(board,row+1,al);
                board[row][j]= '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> al = new ArrayList<>();
            char [][] board = new char[n][n];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
         Queen(board,0,al);
         return al;


    }
}