/*
Climb Stairs With Variable Jumps

1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
     could jump to in a single move.  
     You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.

Input Format
A number n
.. n more elements

Output Format
A number representing the number of ways to climb the stairs from 0 to top.
Question Video

  COMMENTConstraints
0 <= n <= 20
0 <= n1, n2, .. <= 20

Sample Input
10
3
3
0
2
1
2
4
2
0
0

Sample Output
5

*/

import java.io.*;
import java.util.*;

// ======================================== Memoization ====================================

public class Main 
{
      public static void main(String[] args) throws Exception 
      {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int arr[] = new int[n];
            for(int i =0; i < n; i++)
            {
                  arr[i] = scn.nextInt();
            }
            int dp[] = new int[n+1];
            System.out.println(climb(0, dp, arr));
      }
      public static int climb(int n, int dp[], int arr[])
      {
            if(n> arr.length)
                  return 0;
            else if(n == arr.length)
                  return 1;
            else
            {
                  if(dp[n]>0)
                        return dp[n];
                  for(int i =n+1; i<= n+arr[n]; i++ )
                  {
                        dp[n] += climb(i, dp, arr);
                  }
            }
            return dp[n];
      }
}
/*
// ======================================== Tabulation ========================================

public class Main 
{
      public static void main(String[] args) throws Exception 
      {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int arr[] = new int[n];
            for(int i =0; i < n; i++)
            {
                  arr[i] = scn.nextInt();
            }
            int dp[] = new int[n+1];
            dp[n] = 1;
            for(int i = n-1; i >-1; i--)
            {
                  int sum =0;
                  for(int j = i+1; j<=i+arr[i];j++)
                  {
                        if(j<=n)
                              sum+=dp[j];
                  }
                  dp[i] = sum;
            }
            for(int i: dp)
            System.out.print(i+" ");
      }
}
*/
