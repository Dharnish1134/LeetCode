class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length)
        {
            return -1;
        }
        int l=1,r=Arrays.stream(bloomDay).max().getAsInt();
        int ans =0;
        while(l<=r)
        {
            int mid = (l+r)/2;
            
            if(isOkay(mid,bloomDay,m,k))
            {
                ans = mid;
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        
        return ans;
    }
    
    public boolean isOkay(int mid,int[] bloomDay,int m,int k)
    {
        int consecFlower=0,numberOfBoquets = 0;
        
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=mid)
            {
                consecFlower++;
            }
            else
            {
                consecFlower = 0;
            }
            
            if(consecFlower == k)
            {
                numberOfBoquets++;
                consecFlower = 0;
            }
        }
        
        return (numberOfBoquets >= m);
    }
}