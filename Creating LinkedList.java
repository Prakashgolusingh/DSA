import java.util.*;
class linkedList
{
	class node
      	{
            int data;
            node next;
            node(int data)
            {
                  this.data=data;
                  next=null;
            }
      }
      node head;
      node tail;
}
public class Main
{
      public static void main(String[] args) 
	{
	      Scanner scn = new Scanner(System.in);
	      System.out.println("This is a integer type linkedList");
	      System.out.println("press 0 to  \"Exit\":");
	      System.out.println("press 1 to and a no.with space \"To add at last\":");
	      System.out.println("press 2 to and a no. with space \"To add at first\":");
	      System.out.println("press 3 and a no. with space to \"Search\":");
	      System.out.println("press 5 to \"Print\":");
	      System.out.println("Press 6 and no. with space for \"Deletion\":");
	      while(true)
	      {
	            int a=scn.nextInt();
	            switch(a)
	            {
	                  case 0:
	                        System.out.print("Program terminated");
	                        System.exit(0);
	                  case 1:
	                        
	                  case 2:
	                        
	                  case 3:
	                        
	                  case 4:
	                        
	                  case 5:
	                        
	                  case 6:
	                        
	                        
	                 default:
	                        System.out.println("Invalid operation");
	            }
	            System.out.println("Next Operation:");
	    }
    }
}

