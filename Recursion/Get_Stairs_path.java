// allowed path = [1, 2, 3]
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      System.out.print(path(n));
	}
	public static ArrayList<String> path(int n)
	{
	      // limiting condition
	      if(n == 0)
	      {
	            ArrayList<String> arr = new ArrayList<>();
	            arr.add("");
	            return arr;
	      }
	      if(n < 0)
	      {
	            ArrayList<String> arr = new ArrayList<>();
	            return arr;
	      }
	      ArrayList<String> result = new ArrayList<>();
	      // faith - this fn return all possible path from n-1;
	      ArrayList<String> arr1 = path(n-1);
	      for(String s : arr1)
	      {
	            result.add("1"+s);      // we need to just add 1 to all path from n-1 to 0;
	      }
	      // faith - this fn return all possible path from n-2;
	      ArrayList<String> arr2 = path(n-2);
	      for(String s : arr2)
	      {
	            result.add("2"+s);
	      }
	      // This fn return all possible path from n-3;
	      ArrayList<String> arr3 = path(n-3);
	      for(String s : arr3)
	      {
	            result.add("3"+s);
	      }
	      return result;
	}
}
