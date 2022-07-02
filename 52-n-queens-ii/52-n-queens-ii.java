class Solution {
    public int totalNQueens(int n) {
    boolean board[][]=new boolean[n][n];
    int ways=countNoOfWays(board,0,n);
        return ways;
    }
    
    public static int countNoOfWays(boolean board[][],int row,int n){
        int count=0;
        if(row==n)
            return 1;
        for(int col=0;col<board[row].length;col++){
            if(canWePut(board,row,col)){
                board[row][col]=true;
                count+=countNoOfWays(board,row+1,n);
                //backtracking
                board[row][col]=false;
            }
        }
        return count;
    }
    public static boolean canWePut(boolean board[][],int row,int col){
        //check above column
        int i,j;
        for(i=row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }
        //check left diagnal
        for(i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j])
                return false;
        }
        //check right diagnal
        for(i=row,j=col;i>=0&&j<board[i].length;i--,j++){
            if(board[i][j])
                return false;
        }
        return true;
    }
    
}