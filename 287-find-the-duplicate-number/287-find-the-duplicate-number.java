class Solution {
    // Approach 1 hash map
    // public int findDuplicate(int[] nums) {
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         if(map.containsKey(nums[i])){
    //             return nums[i];
    //         }
    //         map.put(nums[i],1);
    //     }
    //     return -1;
    // }
    
    //Appraoch 2 floyd algo of fast and slow
       public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}