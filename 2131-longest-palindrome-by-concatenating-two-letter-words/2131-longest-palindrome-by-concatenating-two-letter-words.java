class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        int pair=0,ans=0;
        for(String word:words){
            if(!map.containsKey(word)){
                map.put(word,0);
            }
            //checking for pair
            if(word.charAt(0)==word.charAt(1)){
                if(map.get(word)>0){
                    pair--;
                    map.put(word,map.get(word)-1);
                    ans+=4;
                }
                else{
                    pair++;
                    map.put(word,map.get(word)+1);
                }
                
            }
            else{
                String rev=Character.toString(word.charAt(1))+Character.toString(word.charAt(0));
                if(map.containsKey(rev)&&map.get(rev)>0){
                    ans+=4;
                    map.put(rev,map.get(rev)-1);
                }
                else{
                    map.put(word,map.get(word)+1);
                }
            }
        }
        if(pair>0)
            ans+=2;
        return ans;
    }
}