
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] arr = new int[nums1.length];
        int k = 0;
        
        HashSet<Integer> hSet = new HashSet<>();
        
        for(int i = 0; i < len1; i++){
            if(!hSet.contains(nums1[i]))
                hSet.add(nums1[i]);
        }
        
        for(int j = 0; j < len2; j++){
            if(hSet.contains(nums2[j])){
                hSet.remove(nums2[j]);
                arr[k++] = nums2[j];
            }
        }
        
        return Arrays.copyOf(arr, k);
    }
}