class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> map = new HashMap<>();

        for (int x : nums){
             map.put(x,map.getOrDefault(x,0)+1);
            }

            PriorityQueue<Map.Entry<Integer,Integer>>
            q = new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());

            for (Map.Entry<Integer,Integer> entry :map.entrySet()){
                q.offer(entry);

                if(q.size() > k){
                    q.poll();
                }
            }

            int[] f = new int[k];

for (int i = k - 1; i >= 0; i--) {

            f[i] = q.poll().getKey();

        }



        return f;
    }
}
