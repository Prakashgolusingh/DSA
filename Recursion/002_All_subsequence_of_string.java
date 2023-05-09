import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      String str = scn.nextLine();  // taking string as input
	      
	      // fn return a ArrayList of string containg all subsequence.
		System.out.println(subsequence(str));     // calling fn
	}
	public static ArrayList<String> subsequence(String str)
	{
	      if(str.length() == 0)   // limiting condition.
	      {
	            ArrayList<String> arr = new ArrayList<>();
	            arr.add("");
	            return arr;
	      }
	      // fath- this arr contain all subsequence from index 1 to all.
	      // i only needed to add first char. to the all other subsequence.
	      ArrayList<String> arr = subsequence(str.substring(1));
	     
	      ArrayList<String> result = new ArrayList<>();
	      
	      result.addAll(arr);     // when first char. is not included.
	      for(String s : arr)     // when first char is included.
	      {
	            result.add(str.charAt(0)+s);
	      }
	      return result;
	}
}
