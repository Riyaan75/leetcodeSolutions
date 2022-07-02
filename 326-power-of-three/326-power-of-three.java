class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        return check(n,3);
    }
    public static boolean check(int n,long prod){
        if(prod==n)
            return true;
        prod=3*prod;
        if(prod>n)
            return false;
        return check(n,prod);
    }
}