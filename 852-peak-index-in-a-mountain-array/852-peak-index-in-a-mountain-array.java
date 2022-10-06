class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i,ans=0,max=0;
        for(i=0;i<arr.length;i++){
            if(max<arr[i])
            {
                max=arr[i];
                ans=i;
            }
        }
        return ans;
        
    }
}