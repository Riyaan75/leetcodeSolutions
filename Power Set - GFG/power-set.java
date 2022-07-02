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


class Solution
{   
   
       List<String> res = new ArrayList<>();
       public void subsequence(String s, String str, int indx)
       {   
           if(indx > s.length()) return;
           if(indx == s.length())
           {
               
                   res.add(str);
                   return;
               
           }
           subsequence(s, str + s.charAt(indx), indx+1);
           subsequence(s, str, indx+1);
           return;
       }
   public List<String> AllPossibleStrings(String s)
   {
       // Code here
       subsequence(s, new String(), 0);
       res.remove(res.size()-1);
       Collections.sort(res);
       return res;
   }

}