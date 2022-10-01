class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1,mid,p=-1;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                p=mid;
                break;
            }
            else if(nums[mid]>target){
                 end=mid-1;
                
            }
            else
               start=mid+1;
        }
        if(p!=-1)
            return p;
        return -1;
    }
}