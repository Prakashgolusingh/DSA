import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      String str = scn.nextLine(); // taking string as input
	      // fn return a ArrayList of string containg all combination.
		System.out.println(combination(str));     // calling fn
	}
      public static ArrayList<String>combination(String str)
      {
            // creating array of keypad of size 10(o-9)
            String keypad[] = {"?!", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz", ".;"};
            if(str.length() == 1)   // limiting condition
            {
                  ArrayList<String> arr = new ArrayList<>();
                  int n = Integer.parseInt(str);
                  for(int i = 0; i < keypad[n].length(); i++)
                  {
                        arr.add(Character.toString(keypad[n].charAt(i)));
                  }
                  return arr; // return the list of containg last no. char.
            }
            // faith - this fn give me combination from char.1 to last.
            // we just need to calcualte the combination for first char.
            ArrayList<String> arr = combination(str.substring(1));
            ArrayList<String> result = new ArrayList<>();
            int n =Integer.parseInt(str.substring(0,1));
            for(int i = 0; i < keypad[n].length(); i++)
            {
                  for(String s : arr)
                  {
                        result.add(keypad[n].charAt(i) + s);
                  }
            }
            return result;
      }
	
}
