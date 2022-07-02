// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static List<String> AllPossibleStrings(String s){
        List<String> res=subsequence(s);
        res.remove(0);
        return res;
    }
    public static List<String> subsequence(String s)
    {
        // Code here
         if(s.length()==0){
            List<String> list=new ArrayList<>();
            list.add("");
            return list;
        }
        //extracting first charachter 
        char singleChar=s.charAt(0);
        //decreasing the size of string
        String subString=s.substring(1);
        List<String> result=new ArrayList<>();
        result=subsequence(subString);
        List<String> finalResult=new ArrayList<>();
        for(String e: result){
            finalResult.add(e);
            finalResult.add(singleChar+e);
        }
         Collections.sort(finalResult);
         return finalResult;
    }
}