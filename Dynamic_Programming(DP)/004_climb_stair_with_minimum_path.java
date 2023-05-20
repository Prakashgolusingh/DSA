/*
Climb Stairs With Minimum Moves

1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
     could jump to in a single move.  You can of-course fewer number of steps in the move.
4. You are required to print the number of minimum moves in which you can reach the top of 
     staircase.
Note -> If there is no path through the staircase print null.

Input Format
A number n
.. n more elements

Output Format
A number representing the number of ways to climb the stairs from 0 to top.

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
4

*/

import java.io.*;
import java.util.*;

// =================================== Tabulation ========================================
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
            dp[n] = 0;
            for(int i = n-1; i >-1; i--)
            {
                  if(arr[i] == 0)
                        dp[i] = 0;
                  else if(i+arr[i]>=n)
                        dp[i] = 1;
                  else
                  {
                        int min =Integer.MAX_VALUE;
                        int flag =0;
                        for(int j = i+1; j<=i+arr[i];j++)
                        {
                              if(dp[j] != 0 && dp[j]<min)
                              {
                                    min = dp[j];
                                    flag =1;
                              }
                        }
                        if(flag==1)
                        dp[i] = min+1;
                        else
                        dp[i] =0;
                  }
                  
            }
            for(int i: dp)
            System.out.print(i+" ");
      }
}
