//Sliding Window Approach - 1 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0,end =0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(end<s.length())
        {
            char c = s.charAt(end);

            while(set.contains(c))
            {
               set.remove(s.charAt(start));
               start++;
            }

            set.add(c);

            int windowSize = (end - start) + 1;
            if(max<windowSize)
            {
                max = windowSize;
            }
            end++;
        }

        return max;
    }
}

//Sliding Window Approach - 2 (Efficient)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastOccurence = new int[128];
        int max = 0;
        int left = 0;
        for(int right =0;right<s.length();right++)
        {
            char c = s.charAt(right);
            
            //check if c is withing the range of the window.
            //If so avoid it by incrementing left.            
            left = Math.max(left,lastOccurence[c]);
            
            //after removing update the characters last occurence.
            lastOccurence[c] = right+1;

            max = Math.max(max,(right-left)+1);
        }

        return max;
    }
}

