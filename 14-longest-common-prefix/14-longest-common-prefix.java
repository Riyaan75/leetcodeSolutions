class Solution {
    public String longestCommonPrefix(String[] strs) {
         if(strs.length==1)
             return strs[0];
        String minWord=strs[0];
        int i,j;
        for(i=1;i<strs.length;i++){
            if(minWord.length()>strs[i].length())
                minWord=strs[i];
}
      
        StringBuilder prefix = new StringBuilder("");
        for(i=0;i<minWord.length();i++){
            char first=minWord.charAt(i);
            
            for(j=0;j<strs.length;j++){
                if(first!=strs[j].charAt(i))
                {
                    return prefix.toString();
                }
            }
            prefix.append(first);
        }
        return prefix.toString();
    }
}