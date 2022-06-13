class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //Brute Force
       //   int i,j,c=0;
       //  int a[]=new int[nums.length];
       //  for(i=0;i<nums.length;i++){
       //      int key=nums[i];
       //      for(j=0;j<nums.length;j++){
       //          if(i!=j)
       //          {
       //              if(nums[j]<key)
       //                  c++;
       //          }
       //      }
       //      a[i]=c;
       //      c=0;
       //  }
       // System.arraycopy(a,0,nums,0,nums.length);
       //  return nums;
        
        
         int[] count = new int[101];
        int res[]=new int[nums.length];
        for(int i : nums){
            count[i]++;
        }
        int p = 0;
        int[] prefix = new int[101];
        for(int i=0;i<count.length;i++){
            prefix[i]=p;
            p+=count[i];
        }
         for(int i = 0; i<nums.length; i++){
            res[i] = prefix[nums[i]];
        }
        
        
        return res;
    }
}