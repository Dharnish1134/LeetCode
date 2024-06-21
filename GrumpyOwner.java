class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int currWin = 0,maxWin = 0;
        int n = grumpy.length;
        int i=0;
        for(int j =0;j<n;j++)
        {
            currWin += customers[j] * grumpy[j];
            maxWin = Math.max(currWin,maxWin);
            if(j >= minutes-1)
            {
               currWin -= customers[i] * grumpy[i++];
            }
        }
        int zeroSum = maxWin;
        for(int j =0;j<n;j++)
        {
            zeroSum += customers[j] * (1-grumpy[j]);
        }
        return zeroSum;

    }
}