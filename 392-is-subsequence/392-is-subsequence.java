class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        int i=0,p=0,p1=0;
        boolean result=false;
        if(l1==0)
            return true;
        if(l2==0)
            return false;
        while(i<l1  &&p<l2){
            if(s.charAt(i)==t.charAt(p)){
                i++;
                result=true;
            }
            else{
                result=false;
            }
            p++;
        }
        if(i!=l1)
            result=false;
        return result;
    }
}