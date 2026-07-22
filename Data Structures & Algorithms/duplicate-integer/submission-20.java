class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> newNum = new HashSet<>();

        for (int a : nums){
        newNum.add(a);
    }
    if (nums.length!=newNum.size()){
    return true;
    }

    else {return false;}
}
}