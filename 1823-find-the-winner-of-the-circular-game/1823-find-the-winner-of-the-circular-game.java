class Solution {
    public int findTheWinner(int n, int k) {
        int result=joshephus(n,k);
        return result+1;
    }
    public static int joshephus(int n,int k){
        if(n==1)
            return 0;
        int x=joshephus(n-1,k);
        int y=(x+k)%n;
        return y;
    }
}