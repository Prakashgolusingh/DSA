import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      System.out.print("enter no of vertices and edges with space");
	      int v =scn.nextInt();
	      int e = scn.nextInt();
	      int mtx[][]=new int[v][v];
		for(int i=0;i<v;i++)
		{
		      for(int j =0;j<v;j++)
		      {
		            mtx[i][j]=scn.nextInt();
		      }
		}
		ArrayList<Integer> adj1[] = new ArrayList[v]; //Adjacency matrix
		ArrayList<ArrayList<Integer>> adj2 = new ArrayList<ArrayList<Integer>>(v); // Adjacency mtx using ArrayList.
		for(int i=0;i<v;i++)
		{
		      ArrayList<Integer> arr1 = new ArrayList<Integer>();
		    
		      for(int j =0;j<v;j++)
		      {
		            if(mtx[i][j]!=0)
		                  arr1.add(j);
		      }
		      adj1[i] = arr1;
		      adj2.add(arr1);
		}
		for(int i=0;i<v;i++)
		{
		      System.out.println(i+" "+adj1[i]);
		}
		for(int i=0;i<v;i++)
		{
		      System.out.println(i+" "+adj2.get(i));
		}
	}
}

