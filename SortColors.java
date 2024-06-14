class sortColors {
    public void sortColors(int[] nums) {
        
    int f = 0,l = nums.length-1;
    for(int i =0;i<nums.length;)
    {
        if(nums[i] == 0 && i!=f)
        {
         int temp = nums[f];
         nums[f] = nums[i];
         nums[i] = temp;
         f++;
        }
        else if(l>i && nums[i]==2 )
        {
         int temp = nums[l];
         nums[l] = nums[i];
         nums[i] = temp;
         l--; 
        }
        else
        {
            i++;
        }
    }

    }
}