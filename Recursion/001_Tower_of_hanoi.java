import java.io.*;
import java.util.*;
public class Main 
{
      static long a;
      public static void main(String[] args) 
      {
            Scanner sc = new Scanner(System.in);
            int N;      // no of disc in tower 1.
            N = sc.nextInt();       //taking input N

            //calling toh() method 
            // moving all disk from rod 1 to rod 2 using rod 3.
            System.out.println(toh(N, 1, 2, 3));  //this will return steps.
        
      }
      public static long toh(int N, int from, int to, int aux) 
      {
            if(N == 0)
                  return 0;
            toh(N-1, from, aux, to);  // moving all disk except largest one to aux rod
            a++;
            System.out.println("move disk "+ N + " from rod "+ from + " to rod "+ to);  // moving largest disk to rod 2
            toh(N-1, aux, to, from);    // moving all n-1 disk from aux rod(3) to rod 2.
            return a;
      }
}
