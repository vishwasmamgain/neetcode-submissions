class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nonDup = new HashSet<>();

    for (int num : nums){
        if(!nonDup.add(num)){
          return true;
        }
    }
     return false;   
    }
}