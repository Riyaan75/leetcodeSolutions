class Solution {
    public int divisorSubstrings(int num, int k) {
        int temp=num,c=0;
      String s=num+"";
        for(int i=0;i+k<=s.length();i++){
            int n=Integer.parseInt(s.substring(i,i+k));
            if(n==0)
                continue;
            if(num%n==0)
                c++;
        }
        return c;
}
}