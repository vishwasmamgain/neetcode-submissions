class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> com = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            boolean result = com.containsKey(target-nums[i]);

            if(!result){
            com.put(nums[i],i);
        }
        else {
            int found = target - nums[i];
            int j = com.get(found);
            return new int[]{j,i};
        }
    }
        return new int []{0,0};
   }
}