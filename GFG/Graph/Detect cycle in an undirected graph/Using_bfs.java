
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean ans = false;
        boolean vis[] = new boolean[V];
        int parrent[] = new int[V];
        for(int i=0; i<V; i++)
        {
            if(!vis[i])
            {
                parrent[i] = -1;
                ans = ans || bfs(adj, vis, parrent, i);
            }
        }
        return ans;
    }
    public boolean bfs(ArrayList<ArrayList<Integer>> adj, boolean vis[], int parrent[], int cur)
    {
        vis[cur] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(cur);
        while(!q.isEmpty())
        {
            int x = q.remove();
            for(int i: adj.get(x))
            {
                if(!vis[i])
                {
                    q.add(i);
                    parrent[i] = x;
                    vis[i] = true;
                }
                else if(parrent[x] != i)
                    return true;
            }
        }
        return false;
    }
}
