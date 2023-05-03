// In java, we genreally have three way to store edges and vertices 
// 1. using Adjacency matrix e.g ---> G[][];
// 2. using ArrayList of matrix e.g --> ArrayList<Intger> G[];
// 3. ArrayList of ArrayList e.g --> ArrayList<ArrayList<Intger>> G;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      System.out.print("enter no of vertices and edges with space");
	      int v =scn.nextInt();
	      int mtx[][]=new int[v][v];
		for(int i=0;i<v;i++)
		{
		      for(int j =0;j<v;j++)
		      {
		            mtx[i][j]=scn.nextInt();
		      }
		}
		ArrayList<Integer> adj1[] = new ArrayList[v]; //Adjacency List usng matrix
		ArrayList<ArrayList<Integer>> adj2 = new ArrayList<ArrayList<Integer>>(v); // Adjacency list using ArrayList.
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
		      System.out.print(i);
		      for ( int j:adj1[i])
		      {
		            System.out.print(" "+j);
		      }
		      System.out.println();
		}
		// printing through adj. matrix of ArrayList
		/*for(int i=0;i<v;i++)
		{
		      System.out.print(i);
		      for( int j:adj2.get(i))
		      {
		            System.out.print(" "+j);
		      }
		      System.out.println();
		}*/
	}
}
