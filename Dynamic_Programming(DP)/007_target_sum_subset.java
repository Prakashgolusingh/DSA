/*
Target Sum Subsets - Dp

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number "tar".
4. You are required to calculate and print true or false, if there is a subset the elements of which add 
     up to "tar" or not.
     
Input Format
A number n
n1
n2
.. n number of elements
A number tar

Output Format
true or false as required

  COMMENTConstraints
1 <= n <= 30
0 <= n1, n2, .. n elements <= 20
0 <= tar <= 50
Sample Input
5
4
2
7
1
3
10

Sample Output
true

*/
// =================================== recursion ======================================
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int arr[] = new int[n];
            for(int i =0; i < n; i++)
                  arr[i] = scn.nextInt();
		int target = scn.nextInt();
		ArrayList<Integer> arr1 = subset(arr,0);
		int flag =0;
		for(int i: arr1)
		{
		      if(i == target)
		      {
		            flag=1;
		            System.out.println("True");
		            break;
		      }
		}
		if(flag == 0)
		      System.out.print("False");
	}
	public static ArrayList<Integer> subset(int arr[], int n)
	{
	      if(n>=arr.length)
	            return new ArrayList<Integer>();
	      if(n == arr.length-1)
	      {
	            ArrayList<Integer> arr1 = new ArrayList<>();
	            arr1.add(0);
	            arr1.add(arr[n]);
	            return arr1;
	      }
	      ArrayList<Integer> arr1 = subset(arr, n+1);
	      ArrayList<Integer> arr2 = new ArrayList<>();
	      for(int i: arr1)
	      {
	            arr2.add(i);
	            arr2.add(i+arr[n]);
	      }
	      return arr2;
	}
}
