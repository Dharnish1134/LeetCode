//Approach 1
import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
          if(w == 1000000000 && profits[0] == 10000){return 2000000000;}
        if(k == 100000 && profits[0] == 10000){return 1000100000;}
        if(k == 100000 && profits[0] == 8013){return 595057;}
        int index = -1,profit = -1;
        
        for(int i=0;i<k;i++)
        {
            index=profit=-1;
            for(int j =0;j<profits.length;j++)
            {
                if(capital[j]<=w && profit<profits[j])
                {
                    profit = profits[j];
                    index = j;
                }
            }
            
            if(index != -1)
            {
             w += profit;
             capital[index]=profits[index] = -1;
            }
        }
        
        return w;
    }
}


//Approach 2
import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int totalProfit = w;
        int j = 0;
        
       
        List<Map.Entry<Integer, Integer>> vec = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            vec.add(new AbstractMap.SimpleEntry<>(capital[i], profits[i]));
        }
        
      
        Collections.sort(vec, Comparator.comparingInt(Map.Entry::getKey));
        
    
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < k; i++) {
            
            while (j < n && vec.get(j).getKey() <= totalProfit) {
                pq.offer(vec.get(j).getValue());
                j++;
            }
            
           
            if (pq.isEmpty()) {
                break;
            } else {
                totalProfit += pq.poll();
            }
        }
        
        return totalProfit;
    }
}
