class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,p=0;
        int a[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                a[0]=map.get(target-nums[i]);
                a[1]=i;
            }
            else{
                map.put(nums[i],i);
            }   
        }      
        return a;
    }
}