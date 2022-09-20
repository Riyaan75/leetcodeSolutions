class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        // check for first occurence of target
        ans[0] = search(nums, target,true);
        if(ans[0]!=-1)
            ans[1] = search(nums,target , false);
        return ans;
    }
    
    //this will return the index value of the target
    int search(int[] nums , int target , boolean findStartIndex){
        int ans = -1;
        int low = 0,high = nums.length-1,mid;
        while(low<=high){
            mid = low + (high - low)/2;
            if(nums[mid]>target){
               high = mid -1;
            }
            else if(nums[mid]<target)
                low = mid +1;
                
            else{
                ans = mid;
                if(findStartIndex){
                  high = mid-1;
                }
                else 
                    low= mid+1;
            }
            
        }
        return ans;
}
}