class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=s.length();
        int i,j,c=0,p=0;
        for(i=0;i<l;i++){
            char ch1=s.charAt(i);
            for(j=p;j<t.length();j++){
                char ch2=t.charAt(j);
                if(ch1==ch2)
                {
                    c++;
                    p=j+1;
                    break;
                }
            }
        }
        if(c==l)
            return true;
        else 
            return false;
    }
}