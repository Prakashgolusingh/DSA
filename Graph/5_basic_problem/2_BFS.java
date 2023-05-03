import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      System.out.println("enter no of vertices and edges with space");
	      int v =scn.nextInt();
	      scn.nextLine();
	      ArrayList<Integer> mtx[] = new ArrayList[v];
		for(int i=0;i<v;i++)
		{
		      String str = scn.nextLine();
		      String arr_str[] = str.split(" ");
		      int vertex = Integer.parseInt(arr_str[0]);
		      mtx[vertex] = new ArrayList<Integer>();
		      for(int j = 1; j < arr_str.length; j++)
		      {
		            mtx[vertex].add(Integer.parseInt(arr_str[j]));
		      }
		}
		int visited[] = new int[v];
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		while(!q.isEmpty())
		{
		      int curr = q.remove();
		      if(visited[curr] == 0)
		      {
		            System.out.print(curr+" ");
		            visited[curr] = 1;
		            for( int i : mtx[curr])
		            {
		                  q.add(i);
		            }
		      }
		}
	}
}
