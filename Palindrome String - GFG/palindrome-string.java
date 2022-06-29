// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String w) {
        // code here
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
            return 1;
        else 
            return 0;
    }
};