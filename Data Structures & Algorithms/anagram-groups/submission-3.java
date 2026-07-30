class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();

        for (String s : strs){
            char[] unsorted = s.toCharArray();
            Arrays.sort(unsorted);
            if(!map.containsKey(String.valueOf(unsorted))){
                map.put(String.valueOf(unsorted), new ArrayList<String>());
            }

            map.get(String.valueOf(unsorted)).add(s);
        }
         
        return new ArrayList(map.values());
        
    }
}