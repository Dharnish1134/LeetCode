class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum_m = 0,ind = 0;
        int[] nArray = new int[n];
        for(int i =0;i<rolls.length;i++)
        {
           sum_m += rolls[i];
        }
        int sum_n = (mean * (rolls.length+n))-sum_m;
        if(sum_n > n*6 || sum_n<=0)
        {
            return new int[]{};
        }
        
        int exp = sum_n/n;
        int rem = sum_n%n;

        for(int i =0;i<rem;i++)
        {
            nArray[i] = exp+1;
        }
        for(int i =rem;i<n;i++)
        {
            nArray[i] = exp;
        }

        return nArray;
    }
}