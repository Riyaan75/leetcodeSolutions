class Solution {
    public int[][] transpose(int[][] matrix) {
        int i,j,temp;
        int result[][]=new int[matrix[0].length][matrix.length];
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                   if(i!=j){
                    result[j][i]=matrix[i][j];
               }
               else{
                   result[i][j]=matrix[i][j];
               }
            }
        }
        return result;
    }
}