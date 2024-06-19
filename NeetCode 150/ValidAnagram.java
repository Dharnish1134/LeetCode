class Solution {
    public boolean isAnagram(String s, String t) {
        
        
        int[] store = new int[26];
        
        for(char c : s.toCharArray())
        {
            store[c-'a']++;
        }
        
        for(char c : t.toCharArray())
        {
            store[c-'a']--;
        }
        
        for(int n:store)
        {
            if(n != 0)
            {
                return false;
            }
        }
        
        return true;
    }
}