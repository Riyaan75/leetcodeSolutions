//Two-Pointer Approach :
class Solution {
    
    //  Time Complexity = O(N)
    //  Space Complexity = O(1)
    
    public int[] twoSum(int[] numbers, int target) {
        
        //  Left and right pointer
        int left = 0, right = numbers.length-1;
        
        while(numbers[left] + numbers[right] != target && left < right){
            
            if (numbers[left] + numbers[right] > target) 
                right--;
            else 
                left++;
        }
        
        return new int[]{++left, ++right};
    }
}
/* HashMap approach
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                ans[0]=map.get(target-numbers[i])+1;
                ans[1]=i+1;
            }
            else 
                map.put(numbers[i],i);
        }
        return ans;
    }
}
*/