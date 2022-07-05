class Solution {
     public List<String> letterCombinations(String digits) {
     if(digits.length()==0)
     {
         List<String> list=new ArrayList<>();
         return list;
     }
         else
             return letterCombinations2(digits);
     }
    private static List<String> letterCombinations2(String digits) {
        String keys[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //termination CAse
        if(digits.length()==0)
        {
            List<String> list=new ArrayList<>();
            list.add("");
            return list;
        }
        //small problem 
        //get a single character or digit
        char singleChar=digits.charAt(0);
        
        int digit=singleChar-'0';
        String currentKeys=keys[digit];
        String remString=digits.substring(1);
        //adjoing sequences of digits
        List<String> finalResult=new ArrayList<>();
        for(int i=0;i<currentKeys.length();i++){
            List<String> result=letterCombinations2(remString);
            for(String s:result){
                finalResult.add(currentKeys.charAt(i)+s);
            }
        }
        return finalResult;
    }
}