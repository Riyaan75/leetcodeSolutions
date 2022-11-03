class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)
            return 1;
        int n=s.length(),ans=0,odd=0;
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i:m.values()){
            if(i%2==0)
                ans+=i;
            else{
                ans+=i-1;
                odd=1;
            }
        }
        ans=ans+odd;
        return ans;
    }
}