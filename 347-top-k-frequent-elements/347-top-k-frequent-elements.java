class Solution {
    //bro's approach
     public int[] topKFrequent(int[] nums, int k) {
        
        HashSet<Integer> count[]=new HashSet [nums.length+1];
        for(int i=0; i<count.length; i++) count[i]=new HashSet<Integer>();
        for(int n: nums) count[0].add(n);
        
        HashMap <Integer, Integer> f=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int prevf=f.getOrDefault(nums[i], 0);
            f.put(nums[i], prevf+1);
            count[prevf+1].add(nums[i]);
            count[prevf].remove(nums[i]);
        }
        
        int res[]=new int[k];
        int j=0;
        for(int i=count.length-1; i>=0; i--)
        {
            HashSet<Integer> set=count[i];
            if(set.size()==0) continue;
            for(int e: set)
            {
                if(j==k) return res;
                res[j++]=e;
            }
        }
        return res;
    }
    //approach 1
//     public int[] topKFrequent(int[] nums, int k) {
//         if (nums.length == k)
//             return nums;
        
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int n : nums) {
//             map.put(n, map.getOrDefault(n, 0)+1);
//         }
        
//         Queue<Integer> q = new PriorityQueue<>(
//             (n1, n2) -> map.get(n2) - map.get(n1)
//         );
//         for (int key : map.keySet()) {
//             q.add(key);
//         }
        
//         int[] res = new int[k];
//         for (int i = 0; i < k; i++) {
//             res[i] = q.poll();
//         }
//         return res;
//     }
    // approach 2
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer,Integer>numFreqMap=new HashMap<>();
//         List<List<Integer>>freq=new ArrayList<>();
//         int[]res=new int[k];
//         for(int id=0;id<=nums.length;id++){
//             freq.add(new ArrayList<>());
//         }
//         for(int num:nums){
//             numFreqMap.put(num,numFreqMap.getOrDefault(num,0)+1);
//         }
//         for(Map.Entry<Integer,Integer> entry:numFreqMap.entrySet()){
//             int key=entry.getKey();
//             int v=entry.getValue();
//             List<Integer>elList=freq.get(v);
//             elList.add(key);
//             freq.set(v,elList);
//         }
//         int j=0;
//         for(int i=freq.size()-1;i>0;i--){
//             List<Integer>elList=freq.get(i);
//             for(int el:elList){
//                 if(j==k)
//                     break;
//                 res[j]=el;
//                 j++;

//             }
//         }
//         return res;
//     }
}
