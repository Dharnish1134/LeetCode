class Solution {

    public String encode(List<String> strs) {
        StringBuilder en = new StringBuilder();
        for(String str:strs)
        {
            en.append(str.length()).append("#").append(str);
        }

        return en.toString();
    }

    public List<String> decode(String str) {
       
       List<String> de = new ArrayList<>();
       int i =0;
       while(i<str.length())
       {
          int j = i;
          while(str.charAt(j) != '#')j++;

          int length = Integer.valueOf(str.substring(i,j));

          i = j+length+1;

          de.add(str.substring(j+1,i));
       }

       return de;
    }
}
