import java.util.*;
class Linkedlist
{
	class Node
      {
            int data;
            Node next;
            Node(int data)
            {
                  this.data=data;
                  next=null;
            }
      }
      Node head;
      public void addFirst(int data)
      {
            Node newNode = new Node(data);
            if(head == null)
            {
                  head = newNode;
            }
            else
            {
                  newNode.next=head;
                  head=newNode;
            }
      }
      public void addLast(int data)
      {
            Node newNode = new Node(data);
            if(head == null)
            {
                  head = newNode;
            }
            else
            {
                  Node temp = head;
                  while(temp.next != null)
                  {
                        temp=temp.next;
                  }
                  temp.next = newNode;
            }
      }
      public void output()
      {
            if(head == null)
            {
                  System.out.println("List is Empty");
            }
            else
            {
                  Node temp = head;
                  System.out.print("Starting of list->");
                  while(temp !=null)
                  {
                        System.out.print(temp.data+" ");
                        temp=temp.next;
                  }
                  System.out.println("null");
            }
            
      }
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
	      Linkedlist list = new Linkedlist();
	      while(true)
	      {
	            int a=scn.nextInt();
	            switch(a)
	            {
	                  case 0:
	                        System.out.print("Program terminated");
	                        System.exit(0);
	                        break;
	                  case 1:
	                        int data1= scn.nextInt();
	                        list.addFirst(data1);
	                        break;
	                  case 2:
	                        int data2= scn.nextInt();
	                        list.addLast(data2);
	                        break;
	                  case 3:
	                        list.output();
	                        break;
	                  case 4:
	                        break;
	                  case 5:
	                        break;
	                  case 6:
	                        break;
	                        
	                 default:
	                        System.out.println("Invalid operation");
	            }
	            System.out.println("Next Operation:");
	    }
    }
}

