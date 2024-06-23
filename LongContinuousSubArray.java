class Solution {
    public int longestSubarray(int[] nums, int limit) {
         int i = 0,maxLength = 0;
         Deque<Integer> maxdq = new LinkedList<>();
         Deque<Integer> mindq = new LinkedList<>();

         for(int j =0;j<nums.length;j++)
         {
            while(!maxdq.isEmpty() && maxdq.peekLast() < nums[j])
            {
                maxdq.pollLast();
            }
            maxdq.offerLast(nums[j]);

            while(!mindq.isEmpty() && mindq.peekLast() > nums[j])
            {
                mindq.pollLast();
            }
            mindq.offerLast(nums[j]);

            while(maxdq.peekFirst() - mindq.peekFirst() > limit)
            {
                if(maxdq.peekFirst() == nums[i])
                {
                    maxdq.pollFirst();
                }
                if(mindq.peekFirst() == nums[i])
                {
                    mindq.pollFirst();
                }
                i++;
            }
            maxLength = Math.max(maxLength,(j-i)+1);

         }

         return maxLength;
    }
}