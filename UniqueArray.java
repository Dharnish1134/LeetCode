class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length,moves = 0;
        int max = 0;
        for(int c:nums)
        {
           max = Math.max(max,c);
        }
        int[] frequency = new int[n+max];
        for(int c:nums)
        {
            frequency[c]++;
        }
        
        for(int i=0;i<frequency.length-1;i++)
        {
            if(frequency[i]<=1)
            {
                continue;
            }
            int duplicates = frequency[i]-1;
            frequency[i+1] += duplicates;
            frequency[i] = 1;
            moves += duplicates;
        }
        
        return moves;
    }
}