class Solution {
    public int removeDuplicates(int[] nums) {
        int currentElement=nums[0];
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=currentElement){
                nums[k++]=nums[i];
                currentElement=nums[i];
            }
        }
        return k;
    }
}