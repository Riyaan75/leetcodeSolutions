class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int [] ans = new int[nums1.length];
            
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        st.push(nums2[nums2.length-1]);
        map.put(nums2[nums2.length-1],-1);
        int i,key;
        for(i=nums2.length-2;i>=0;i--){
            key=nums2[i];
            while(st.size()>0&&st.peek()<key){
                st.pop();
            }
            if(st.size()==0){
                map.put(key,-1);
                
            }
            else{
                map.put(key,st.peek());
            }
            st.push(key);
        }
        for( i =0; i<nums1.length; i++){
                ans[i] = map.get(nums1[i]);
            }
        return ans;
    }
}