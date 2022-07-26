class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
        int count =0;
        for(int i=0;i<s.length()-2;i++){
            char ch_i = s.charAt(i);
            char ch_i_next = s.charAt(i+1);
            char ch_i_next_next = s.charAt(i+2);
            if(ch_i != ch_i_next  && 
               ch_i != ch_i_next_next &&
               ch_i_next!= ch_i_next_next){
               count++; 
            }
            
        }
        return count;
    }
}