class Solution {
    public int maxSubArray(int[] nums) {
     int maxsum=Integer.MIN_VALUE,arrsum=0;
        for(int i=0;i<nums.length;i++){
            int firstOp=nums[i];
            int secondOp=nums[i]+arrsum;
            arrsum=Math.max(firstOp,secondOp);
            maxsum=Math.max(maxsum,arrsum);
            // if(arrsum>maxsum)
            //     maxsum=arrsum;
            // if(arrsum<0)
            //     arrsum=0;
        }
        return maxsum;
    }
}