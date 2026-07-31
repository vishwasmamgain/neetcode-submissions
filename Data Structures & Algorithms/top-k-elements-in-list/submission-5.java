class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> map = new HashMap<>();

    

        for (int x : nums){
             map.put(x,map.getOrDefault(x,0)+1);
            }

        
        return map.entrySet().stream()
        .sorted((a,b)-> b.getValue().compareTo(a.getValue()))
        .limit(k)
        .map(a->a.getKey())
        .mapToInt(a->a)
        .toArray();
    }
}
