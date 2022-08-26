class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k)
            return nums;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        Queue<Integer> q = new PriorityQueue<>(
            (n1, n2) -> map.get(n2) - map.get(n1)
        );
        for (int key : map.keySet()) {
            q.add(key);
        }
        
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = q.poll();
        }
        return res;
    }
}