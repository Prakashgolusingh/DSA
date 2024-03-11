/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        boolean cur[] = new boolean[V];
        boolean temp = false;
        for(int i=0; i<V; i++)
        {
            if(!vis[i])
                temp = temp || dfs(adj, vis, cur, i);
        }
        return temp;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean vis[], boolean cur[], int temp)
    {
        vis[temp] = true;
        cur[temp] = true;
        boolean val = false;
        for(int i: adj.get(temp))
        {
            if(vis[i] == true && cur[i] == true)
                return true;
            if(!vis[i])
                val = val || dfs(adj, vis, cur, i);
        }
        cur[temp] = false;
        return val;
    }
}
