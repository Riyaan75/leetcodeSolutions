class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        return check(n,2);
    }
    
    public static boolean check(int n,long product){
        if(product==n) 
            return true;
        product*=2;
        if(product>n)
            return false;
        return check(n,product);
    }
}