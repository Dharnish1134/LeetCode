class Solution {
    int getLucky(String s, int k) {
        int curr =0;
        int n = s.length();
        for(int i =0;i<n;i++)
        {
            int position = s.charAt(i) - 96;
            while(position>0)
            {
                curr += position%10;
                position /= 10;
            }
        }

        for(int i =1;i<k;i++)
        {
            int digitsum = 0;
            while(curr > 0)
            {
                digitsum += curr%10;
                curr /= 10;
            }
            curr = digitsum;
        }

        return curr;
    }
};
