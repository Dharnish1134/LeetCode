class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int r = (int) Math.ceil(position[position.length-1]/(m-1.0));
        int ans = 0;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(binCheck(mid,position,m))
            {
                 ans = mid;
                 l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        return ans;
    }

    public boolean binCheck(int mid,int[] position,int m)
    {
        int ballCount = 1,prevPos = 0;
        for(int i = 1;i<position.length && ballCount<m;i++)
        {
          if(position[i]-position[prevPos] >= mid)
          {
             ballCount++;
             prevPos = i;
          }
        }

        return ballCount == m;

    }
}