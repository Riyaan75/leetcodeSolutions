class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean board[][]=new boolean[n][n];
        List<List<String>> ans=new ArrayList<List<String>>();
        Nqueen(board,0,n,ans);
        return ans;
    }
    
    public static void save(boolean board[][],List<List<String>> ans,int n){
        List<String> alist=new ArrayList<String>();
        for(int i=0;i<n;i++){
            String res="";
            for(int j=0;j<n;j++){
                if(board[i][j]==false){
                    res+=".";
                    
                }
                else{
                    res+="Q";
                }
            }
            alist.add(res);
        }
        ans.add(alist);
    }
    static void Nqueen(boolean board[][], int currentRow,int n,List<List<String>> ans) {
        if(currentRow==n){
            //sending current board with queen placed to be in list
            save(board,ans,n);
            return;
        }
        for(int i=0;i<n;i++){
            if(board[currentRow][i]==false){
                if(canIPlaceAQueen(board,currentRow,i)){
                    board[currentRow][i]=true;
                    Nqueen(board,currentRow+1,n,ans);
                    //backtracking
                    board[currentRow][i]=false;
                }
            }
        }
        return ;
    }
    
     static boolean canIPlaceAQueen(boolean board[][], int currentRow, int col) {
        // Constraint Check
        // 1. Check in Same Row (Above Row and Same Col)
        for (int i = currentRow; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }

        // 2.Checking Upper Left Diagonal
        for (int i = currentRow, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // 3. Check in Upper Right Diagonal
        for (int i = currentRow, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }
}