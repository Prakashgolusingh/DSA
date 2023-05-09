/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - to get 
the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that 
is what the spirit of question is. Write recursive and not iterative logic. 
The purpose of the question is to aid learning recursion and not test you.

Input Format

A number n
A number m

Output Format

Contents of the arraylist containing paths as shown in sample output

Sample Input
2
2

Sample Output
[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]

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
	      ArrayList<String> arr1 = maze(n-1, m);
	      for(String s1 : arr1)
	      {
	            result.add(("h"+s1));
	      }
	      ArrayList<String> arr2 = maze(n, m-1);
	      for(String s2 : arr2)
	      {
	            result.add(("v"+s2));
	      }
	      return result;
	}
}
