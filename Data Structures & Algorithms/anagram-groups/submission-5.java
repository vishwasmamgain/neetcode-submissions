class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

     Map<String,List<String>> map= new HashMap<>();

     for (String s : strs){

        char[] sorted = s.toCharArray();

        Arrays.sort(sorted);

        if(!map.containsKey(sorted)){
            map.computeIfAbsent(String.valueOf(sorted),k->new ArrayList<>()).add(s);
        }
     }

        return new ArrayList(map.values());


    }
}