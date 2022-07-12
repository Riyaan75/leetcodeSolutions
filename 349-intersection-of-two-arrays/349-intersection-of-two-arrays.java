class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int i,j;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
            }
 
        }
        int a[]=new int[l1];
        int c=0;
        for(i=0;i<l2;i++){
            if(map.containsKey(nums2[i])&&map.get(nums2[i])>0){
                a[c++]=nums2[i];
                map.put(nums2[i],map.get(nums2[i])-1);
                
            }
        }
        return Arrays.copyOf(a,c);
        
    }
}