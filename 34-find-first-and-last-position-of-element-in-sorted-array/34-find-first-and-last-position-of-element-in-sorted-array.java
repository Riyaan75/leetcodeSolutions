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
        int ans =-1;
         int l = 0, h = nums.length-1;
        while(l<=h){
            int mid = l +(h-l)/2;
            if(target < nums[mid])
                h = mid-1;
            else if(target> nums[mid])
                l = mid+1;
            else{
                //potential ans found
                ans = mid;
                if(findStartIndex){
                    h = mid -1;   
                }
                else
                    l = mid+1;
            }
        }
        return ans;
    }
}