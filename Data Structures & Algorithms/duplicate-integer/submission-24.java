class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> newNum = new HashSet<>();

        for (int a : nums){
         if(!newNum.add(a)){
            return true;
         }
    }
    return false;
    }
}