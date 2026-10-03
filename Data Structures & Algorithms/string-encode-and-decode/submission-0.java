class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs){
           int length =  s.length();

           sb.append(length)
           .append("#")
           .append(s);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
        while(i < str.length()){
            int j = str.indexOf("#",i);
            int length = Integer.parseInt(str.substring(i,j));

            i=j+1;

            String s = str.substring(i,i+length);
            list.add(s);

            i=i+length;

        }

        return list;
        
    }
}
