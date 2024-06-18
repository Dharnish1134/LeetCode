class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        int max = Arrays.stream(worker).max().getAsInt();
        int[] jobs = new int[max+1];
        
        for(int i =0;i<difficulty.length;i++)
        {
            if(difficulty[i]<=max)
            {
                jobs[difficulty[i]] = Math.max(jobs[difficulty[i]], profit[i]);
            }
        }
        
        for(int i =1;i<=max;i++)
        {
            jobs[i] = Math.max(jobs[i],jobs[i-1]);
        }
        int maxProfit = 0;
        for(int ability:worker)
        {
            maxProfit += jobs[ability];
        }
        
        return maxProfit;
     }
}