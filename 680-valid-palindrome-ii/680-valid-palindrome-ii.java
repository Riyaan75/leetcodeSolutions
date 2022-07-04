class Solution {
    public boolean validPalindrome(String s) {
        int c1=0,c2=0,i=0,j=s.length()-1;
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1==ch2){
            i++;
            j--;
            }
            else{
                i++;
                c1++;
            }
        }
        i=0;
        j=s.length()-1;
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1==ch2){
            i++;
            j--;
            }
            else{
                j--;
                c2++;
            }
        }
        if(c1<=1||c2<=1)
        return true;
        else
            return false;
    }
}