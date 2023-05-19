/*
Fibonacci-dp

1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.

Note -> Notice precisely how we have defined the fibonnaci sequence
0th element -> 0
1st element -> 1
2nd element -> 1
3rd element -> 2
4th element -> 3
5th element -> 5
6th element -> 8

Input Format
A number n

Output Format
A number representing the nth element of fibonnaci sequence

  COMMENTConstraints
0 <= n <= 45

Sample Input
10
Sample Output
55
*/
import java.util.*;
import java.io.*;
//============================= Recursion ========================================

/*
public class Main
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int Mem[] = new int[n+1];
		for(int i=0;i<=n;i++)
		System.out.println(fib(i));
	}
	public static int fib(int n)
	{
	      if(n<2)
	            return n;
	      return fib(n-1)+fib(n-2);
	}
}
*/

//========================================== Memoization ===================================

/*
public class Main
{
      public static void main(String[] args)
      {
            Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int Mem[] = new int[n+1];
		for(int i=0;i<=n;i++)
		System.out.println(fib(i, Mem));
      }
      public static int fib(int n, int Mem[])
      {
            if(n<2)
                  return n;
            if(Mem[n]>0)
                  return Mem[n];
            Mem[n] = fib(n-1, Mem)+ fib(n-2, Mem);
            return Mem[n];
      }
}
*/
// =================================== Tabulation ===================================

public class Main
{
      public static void main(String[] args)
      {
            Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a=0,b=1;
		for(int i =0;i<=n;i++)
		{
		      System.out.print(a+ " ");
		      int next = a+b;
		      a=b;
		      b=next;
		}
		System.out.print(b);
      }
}
