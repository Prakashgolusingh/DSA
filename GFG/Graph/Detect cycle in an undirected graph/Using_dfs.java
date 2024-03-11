class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean ans = false;
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++)
        {
            if(!vis[i])
            {
                ans = ans || dfs(adj, vis, -1, i);
                
            }
        }
        // for(int i: p)
        // System.out.println(i);
        return ans;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean vis[], int p, int temp)
    {
        vis[temp] = true;
        boolean ans = false;
        for(int i: adj.get(temp))
        {
            
            if(!vis[i])
            {
                ans = ans || dfs(adj, vis, temp, i);
            }
            else if(p != i)
                return true;
            
        }
        return ans;
    }
}
