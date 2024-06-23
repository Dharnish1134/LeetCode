class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int t = 0,ans = 0;
        int n = nums.length;
        int[] count = new int[n+1];
        count[0] = 1;
        for(int i =0;i<n;i++)
        {
            t += nums[i] & 1;

            if(t-k >= 0)
            { 
               ans += count[t-k];
            } 

            count[t]++;
        }

        return ans;
    }

    
}