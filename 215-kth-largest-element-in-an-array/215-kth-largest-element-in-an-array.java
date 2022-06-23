class Solution {
    public int findKthLargest(int[] nums, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int e:nums)
            l.add(e);
        Collections.sort(l, Collections.reverseOrder());
        int ans=l.get(k-1);
        return ans;
        
    }
}