import java.util.*;
class LinkedList
{
      class Node
      {
            int data;
            Node next;
            Node(int data)
            {
                  this.data = data;
                  next = null;
            }
      }
      Node head;
      public void add(int value)
      {
            Node temp =new Node(value);
            if(head == null)
                  head = temp;
            else
            {
                  Node temp2 = head ;
                  while(temp2.next != null)
                  {
                        temp2 = temp2.next;
                  }
                  temp2.next = temp;
            }
      }
      
      public void reverse(Node temp,Node temp2)
      {
            if(temp2.next == null)
            {
                  head = temp2;
                  head.next = temp;
                  return;
            }
            else
            {
                  Node x = temp2.next;
                  temp2.next = temp;
                  reverse(temp2,x);
            }
      }
      
      public void print()
      {
            if(head == null)
            {
                  System.out.println("list is Empty");
            }
            else
            {
                  Node temp = head;
                  while(temp != null)
                  {
                        System.out.print(temp.data +" ");
                        temp = temp.next;
                  }
                  System.out.println();
            }
      }
      
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Press 1 space no. to add last in LinkedList");
		System.out.println("Press 2 to reverse LinkedList");
		System.out.println("Press 3 to print LinkedList");
		System.out.println("Press 0 to Terminate program.");
		Scanner scn = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		while(true)
		{
		      int option =scn.nextInt();
		      switch(option)
		      {
		            case 0:
		                  System.exit(0);
		                  break;
		            case 1:
		                  int data = scn.nextInt();
		                  ll.add(data);
		                  break;
		                  case 2:
		                  ll.reverse(null,ll.head);
		                  break;
		            case 3:
		                  ll.print();
		                  break;
		            default:
		                  System.out.println("Invalid operation");
		}
		      System.out.println("Next operation");
		}
		
	}
}
