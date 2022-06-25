// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends



class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int currentSum=0,start=0,end=-1;
        int i;
        ArrayList<Integer> l=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(i=0;i<n;i++){
            currentSum+=arr[i];
            if(currentSum-s==0){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(currentSum-s)){
                start=map.get(currentSum-s)+1;
                end=i;
                break;
            }
            map.put(currentSum,i);
            
        }if(end==-1)
        l.add(end);
        else{
        l.add(start+1);
        l.add(end+1);
        }return l;
        
        
    }
}