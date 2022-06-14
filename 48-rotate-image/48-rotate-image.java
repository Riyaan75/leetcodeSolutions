class Solution {
    public void rotate(int[][] matrix) {
       // 1st you have to transpose matrix
        for(int i=0 ; i<matrix.length;i++){
            for(int j=i+1; j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //Reverse each Row
        
        for(int row[]: matrix){
            for(int i=0,j =matrix.length-1; i<matrix.length/2;i++,j--){
                int temp =row[i];
                row[i] =row[j];
                row[j] = temp;
            }
        }
    }
}