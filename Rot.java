import java.util.*;
public class Rot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[7];
        int k=sc.nextInt();
            int i;
            for(i=0;i<nums.length;i++)
            nums[i]=sc.nextInt();
            int l=nums.length;
            int b[]=new int[nums.length];
            for(i=0;i<l;i++)
                b[(i+k)%l]=nums[i];
            for(int e:b)
                System.out.print(e+" ");
        
    }
}
