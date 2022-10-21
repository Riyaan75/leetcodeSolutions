class Solution {
    public void setZeroes(int[][] matrix) {
        int i,j;
        int ans[][]=new int[matrix.length][matrix[0].length];
        for(i=0;i<matrix.length;i++)
        ans[i]=Arrays.copyOf(matrix[i],matrix[i].length);
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                {
                      for(int k=0;k<matrix[0].length;k++)
                        ans[i][k]=0;

                    for(int k=0;k<matrix.length;k++)
                        ans[k][j]=0;
                }
            }
        }
        for(i=0;i<matrix.length;i++)
        matrix[i]=Arrays.copyOf(ans[i],ans[i].length);
    }
  
}