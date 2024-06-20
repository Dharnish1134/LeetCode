class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int min =nums[0];
        int max =nums[0];
        List<Integer> bucket[] = new ArrayList[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min){min = nums[i];}
            if(nums[i]>max){max = nums[i];}
        }

        int[] freq = new int[max-min+1];

        for(int n:nums)
        {
            freq[n-min]++;
        }

        for(int i =0;i<freq.length;i++)
        {
            if(bucket[freq[i]] == null)
            {
                bucket[freq[i]] = new ArrayList<>();
            }

            bucket[freq[i]].add(i+min);
        }

        int index =0;
        int[] res = new int[k];

        for(int i=bucket.length-1;i>0;i--)
        {
            if(bucket[i] != null)
            {
                for(int c:bucket[i])
                {
                    res[index++] = c;
                    if(index == k)
                    {
                        return res;
                    }

                }

            }
        }

        return res;
    }
}