class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid,low=0,high=nums.length-1,index;
        mid = (low+high)/2;
        while(low<=high){
            // int mid =(low+high)/2;might be possible that low+high exists
            mid = low + (high -low)/2;
            if(target<nums[mid]){
                high = mid-1;
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
            else{
                return mid;
            }
        }
        return low;
    }
}