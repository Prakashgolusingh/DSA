/*
Get Maze Path With Jumps
Easy  Prev   Next
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Input Format
A number n
A number m

Output Format
Contents of the arraylist containing paths as shown in sample output

  COMMENTConstraints
0 <= n <= 10
0 <= m <= 10

Sample Input
1
1

Sample Output
[h1v1, d1, v1h1]
*/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int m = scn.nextInt();
		System.out.print(maze(n, m));
	}
	public static ArrayList<String> maze(int n, int m)
	{
	      if( m < 0 || n < 0)
	            return new ArrayList<String>();
	      if(m == 0 && n == 0)
	      {
	            ArrayList<String> arr = new ArrayList<>();
	            arr.add("");
	            return arr;
	      }
	      ArrayList<String> result = new ArrayList<>();
	      for(int i = 1; i<= 3; i++)
	      {
	            ArrayList<String> arr1 = maze(n-i, m);
	            for(String s1 : arr1)
	            {
	                  result.add(("h"+i+s1));
	            }
	      }
	      for(int i = 1; i<= 3; i++)
	      {
	            ArrayList<String> arr2 = maze(n-i, m-i);
	            for(String s1 : arr2)
	            {
	                  result.add(("d"+i+s1));
	            }
	      }
	      for(int i = 1; i<= 3; i++)
	      {
	            ArrayList<String> arr3 = maze(n, m-i);
	            for(String s1 : arr3)
	            {
	                  result.add(("v"+i+s1));
	            }
	      }
	      return result;
	}
}
