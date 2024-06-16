class Solution {
    public int minPatches(int[] nums, int n) {
        int k = nums.length;
        long maxPossible = 0;
        int minPatch = 0,i = 0;
        
        while(maxPossible < n)
        {
            if(i<k && maxPossible+1 >= nums[i])
            {
               maxPossible += nums[i];
               i++;
            }
            else
            {
                minPatch++;
                maxPossible += (maxPossible+1);
            }
        }
        
        return minPatch;
    }
}