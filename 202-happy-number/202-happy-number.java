class Solution {
    public boolean isHappy(int n) {
         if (n == 1 || n == -1) {
            return true;
        }
        Set<Integer> visit = new HashSet<Integer>();

        // compute square until getting duplicate value
        while (!visit.contains(n)) {
            visit.add(n);
            // using helper function to compute the sum of squares
            n = square(n);

            if (n == 1) return true;
        }

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