class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int a : nums){
            set.add(a);
        }
        return set.size()==nums.length?
        false:true;
    }
}