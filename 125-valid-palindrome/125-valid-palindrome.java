class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String w="";
        char ch;
        int i;
        for(i=0;i<s.length();i++){
            ch=s.charAt(i);
            if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57)){
                w+=ch;
            }
        }
        
            int start=0,end=w.length()-1;
            while(start<=end){
                if(w.charAt(start)==w.charAt(end))
                {
                    start++;
                    end--;
                }
                else
                    break;
            }
        if(start>end)
            return true;
        else 
            return false;

}
}