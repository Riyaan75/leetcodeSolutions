class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int i,j,c=0;
        int a[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            int key=nums[i];
            for(j=0;j<nums.length;j++){
                if(i!=j)
                {
                    if(nums[j]<key)
                        c++;
                }
            }
            a[i]=c;
            c=0;
        }
       System.arraycopy(a,0,nums,0,nums.length);
        return nums;
        
    }
}