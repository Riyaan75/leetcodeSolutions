class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     int low =0,high=letters.length-1;
        while(low<= high){
            // find the middle element 
            // int mid =(low+high)/2; might be possible that (low + high) exceeds
            int mid = low + (high - low)/2;
            if(target<letters[mid]){
                high = mid - 1;
            }
            else 
                low = mid+ 1;
        }
        return letters[low%letters.length];
    }
    
}