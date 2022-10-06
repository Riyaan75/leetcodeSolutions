class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0,r=arr.length,mid;
        while(l<r){
            mid=l+(r-l)/2;
            if(arr[mid]>arr[mid+1]){
                r=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }
        }
        return r;
    }
}