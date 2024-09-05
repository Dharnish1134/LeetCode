class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        //Map to store Node value and a list of its neighboring node and its probability
        Map<Integer,List<Pair<Integer,Double>>> graph = new HashMap<>();

        //insert the path of values back and forth
        for(int i =0;i<edges.length;i++)
        {
            int u = edges[i][0],v = edges[i][1];
            double pathProb = succProb[i];
            graph.computeIfAbsent(u,k -> new ArrayList<>()).add(new Pair<>(v,pathProb));
            graph.computeIfAbsent(v,k -> new ArrayList<>()).add(new Pair<>(u,pathProb));
        }
        
        //store the probability of each node traversal starting with the propability of start -> start as 1(100%).
        double[] maxProb = new double[n];
        maxProb[start_node] = 1d;

        //create a priority queue to store the probability of travel and use it as a max heap.

        PriorityQueue<Pair<Double,Integer>> pq = new PriorityQueue<>((a,b) -> -Double.compare(a.getKey(),b.getKey()));
        pq.add(new Pair<>(1.0,start_node));

        //loop unless the queue is empty.
        while(!pq.isEmpty())
        {
            Pair<Double,Integer> cur = pq.poll();
            double curProb = cur.getKey();
            int curNode = cur.getValue();
            if(curNode == end_node)
            {
                return curProb;
            }
            for(Pair<Integer,Double> nxt:graph.getOrDefault(curNode,new ArrayList<>()))
            {
                int nxtNode = nxt.getKey();
                double pathProb = nxt.getValue();
                if(curProb*pathProb > maxProb[nxtNode])
                {
                    maxProb[nxtNode] = curProb*pathProb;
                    pq.add(new Pair<>(maxProb[nxtNode],nxtNode));
                }
            }
        }

        return 0d;
    }
}