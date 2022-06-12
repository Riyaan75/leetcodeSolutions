import java.util.*;
public class SortColor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
          nums[i]=sc.nextInt();
          int i,j;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(nums[i]>nums[j])
                {
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        for (int e : nums) {
            System.out.print(e+" ");
        }
    }
}