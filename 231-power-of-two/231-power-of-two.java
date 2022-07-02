class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<31;i++){
            int r=(int)Math.pow(2,i);
            if(n==r)
                return true;
        }
        return false;
    }
}