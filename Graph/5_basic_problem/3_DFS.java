import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int v = scn.nextInt();
	      scn.nextLine();
	      ArrayList<Integer> mtx[] = new ArrayList[v];
	      for(int i = 0; i < v; i++)
	      {
	            
	            String edgeStr = scn.nextLine();
	            String edgeInt[] = edgeStr.split(" ");
	            mtx[Integer.parseInt(edgeInt[0])] = new ArrayList<Integer>();
	            for(int j = 1; j < edgeInt.length; j++)
	            {
	                  mtx[i].add(Integer.parseInt(edgeInt[j]));
	            }
	      }
	      int visited[] = new int[v];
	      dfs(0, mtx, visited);
	}
	public static void dfs(int start, ArrayList<Integer> mtx[], int visited[])
	{
	      System.out.print(start+" ");
	      visited[start] = 1;
	      for(int i : mtx[start] )
	      {
	            if(visited[i] == 0)
	            {
	                  dfs(i,mtx,visited);
	                  
	            }
	      }
	}
}
