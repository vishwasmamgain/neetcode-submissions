class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()){
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        char[] c = s.toCharArray();
        char[] d = t.toCharArray();

        for (int i=0 ; i<c.length; i++) {
            map1.put(c[i],map1.getOrDefault(c[i],0)+1);
            map2.put(d[i],map2.getOrDefault(d[i],0)+1);
        }
        return map1.equals(map2);

    }
}
