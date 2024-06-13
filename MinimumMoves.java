class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       int max = Math.max(findMax(seats),findMax(students));
       int res = 0;
       int[] difference = new int[max];
        
       for(int pos:seats)
       {
           difference[pos-1]++;
       }
        
       for(int pos:students){
           difference[pos-1]--;
       }
        
       int unmatched =0;
       for(int count:difference)
       {
           unmatched += count;
           res += Math.abs(unmatched);
       }
        
       return res;
   }
    
   public static int findMax(int[] arr)
   {
       int maximum = 0;
       for(int num:arr)
       {
           if(num>maximum)
           {
               maximum = num;
           }
       }
       
       return maximum;
   }
}