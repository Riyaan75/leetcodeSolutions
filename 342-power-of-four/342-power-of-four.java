class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        return check(n,4);
    }
    public static boolean check(int n,long prod){
         if(prod==n)
            return true;
      
        prod=prod*4;
         if(prod>n)
            return false;
        return check(n,prod);
    }
}