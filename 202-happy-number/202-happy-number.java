class Solution {
    public boolean isHappy(int n) {
         if (n == 1 || n == -1) {
            return true;
        }
        int sum=n;
        while(sum>=7){
            sum=square(sum);
            
        }
        if(sum==1)
            return true;
        return false;
    }
    public static int square(int n){
        int r,t=n,sum=0;
        while(t!=0){
            r=t%10;
            sum=sum+(r*r);
            t=t/10;
        }
        return sum;
    }
}