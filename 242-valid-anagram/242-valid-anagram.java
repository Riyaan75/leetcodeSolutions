class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> map=new HashMap<>();
        int i;
        for(i=0;i<s.length();i++){
            int x=map.get(s.charAt(i))==null?0:map.get(s.charAt(i));
            map.put(s.charAt(i),x+1);
        }
        for(i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }
            int x = map.get(t.charAt(i));
            map.remove(t.charAt(i));
            if(x>1)
                map.put(t.charAt(i),x-1);
        }
         return map.isEmpty();
    }
}