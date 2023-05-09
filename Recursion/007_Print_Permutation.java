/*
1. You are given a string str.
2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
Use sample input and output to take idea about permutations.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Input Format
A string str

Output Format
Permutations of str in order hinted by Sample output

Constraints
0 <= str.length <= 7

Sample Input
abc

Sample Output
abc
acb
bac
bca
cab
cba
*/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner scn = new Scanner(System.in);
	      String str = scn.nextLine();
		System.out.println(combination(str));
	}
	public static ArrayList<String> combination(String str)
	{
	      if(str.length() == 0)
	      {
	            ArrayList<String> arr = new ArrayList<>();
	            arr.add("");
	            return arr;
	      }
	      ArrayList<String> result = new ArrayList<>();
	      for(int i = 0; i < str.length(); i++)
	      {
	            ArrayList<String> arr = combination(str.substring(0,i)+str.substring(i+1));
	            for(String s : arr)
	            {
	                  result.add(str.charAt(i)+s);
	            }
	      }
	      return result;
	}
}
