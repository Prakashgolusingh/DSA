import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      System.out.println("enter no of vertices and edges with space");
	      int v =scn.nextInt(); 	// Taking input as number  of vetices.
	      scn.nextLine();		// This help to take string just after integer problem
	      ArrayList<Integer> mtx[] = new ArrayList[v];	// Adjacency matrix using ArrayList
		for(int i=0;i<v;i++)
		{
		      String str = scn.nextLine();		// each line have all neighbour of that vertex index.
		      String arr_str[] = str.split(" ");	// split using space so we take read vertex in integer datatype
		      int vertex = Integer.parseInt(arr_str[0]);	// converting strig to int datatype
		      mtx[vertex] = new ArrayList<Integer>();	//for each idx we initialize arraylist in mtx.
		      for(int j = 1; j < arr_str.length; j++)	//loop to add neighbour of each vertex in arrlist of that idx.
		      {
		            mtx[vertex].add(Integer.parseInt(arr_str[j]));
		      }
		}
		int visited[] = new int[v];		// array to track either vertex has visited or not
		Queue<Integer> q = new LinkedList<>();	// we traverse graph using queue
		q.add(0);				// starting of queue
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
