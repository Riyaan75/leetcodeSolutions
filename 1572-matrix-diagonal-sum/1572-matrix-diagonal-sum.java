class Solution {
    public int diagonalSum(int[][] mat) {
        int i,j,sum=0;
        for(i=0;i<mat.length;i++){
            for(j=0;j<mat.length;j++){
                if(i==j||(i!=j&&(i+j)==mat.length-1))
                    sum+=mat[i][j];
            }
        }
        //   for(i=0;i<mat.length;i++){
        //     for(j=0;j<mat.length;j++){
        //         if(i!=j&&(i+j)==mat.length-1)
        //             sum+=mat[i][j];
        //     }
        // }
        return sum;
    }
}