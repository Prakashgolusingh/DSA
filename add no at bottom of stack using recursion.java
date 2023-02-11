import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer> stk =new Stack<>();
		stk.add(1);
		stk.add(2);
		stk.add(3);
		System.out.print(stk);
		bottom(stk,5);
		stk.add(4);
		System.out.print(stk);
	}
	public static void bottom(Stack<Integer>stk,int n)
	{
	      if(stk.isEmpty())
	      {
	            stk.add(n);
	            System.out.print(stk+"a");
	            return ;
	      }
	      else
	      {
	            int a=stk.pop();
	            System.out.println(stk);
	            bottom(stk,n);
	            stk.add(a);
	            
	            System.out.println(stk);
	            return ;
	      }
	}
	
}
