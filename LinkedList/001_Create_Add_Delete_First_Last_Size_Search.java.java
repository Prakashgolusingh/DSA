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
      private int size = 0;
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
            size++;
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
            size++;
      }
      public void search(int d)
      {
            if(head==null)
            {
                  System.out.println("Empty list");
            }
            else
            {
                  Node temp = head;
                  int flag = 0;
                  while(temp.next != null)
                  {
                        if(temp.data == d)
                        {
                             System.out.println("Found data");
                             flag = 1;
                             break;
                        }
                        temp = temp.next;
                  }
                  if(flag == 0)
                  System.out.println(" Data Not Found");
            }
      }
      public void deleteFirst()
      {
            if(head==null)
            {
                  System.out.println("Empty list");
            }
            else
            {
                  System.out.println(head.data+" Deleted");
                  head = head.next;
                  size--;
            }
      }
      public void deleteLast()
      {
            if(head==null)
            {
                  System.out.println("Empty list");
            }
            else if(head.next == null)
            {
                  System.out.println(head.data+" Deleted");
                  head = head.next;
                  size--;
            }
                  
            else
            {
                  Node temp = head;
                  while(temp.next.next!=null)
                  {
                        temp = temp.next;
                  }
                  System.out.println(temp.next.data+" Deleted");
                  temp.next = null;
                  size--;
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
      public void size()
      {
            System.out.println("Size of list is : " + size);
      }
}
public class Main
{
      public static void main(String[] args) 
	{
	      Scanner scn = new Scanner(System.in);
	      System.out.println("This is a integer type linkedList");
	      System.out.println("press 1 to and a no.with space \"To add at last\":");
	      System.out.println("press 2 to and a no. with space \"To add at first\":");
	      System.out.println("press 3 and a no. with space to \"Search\":");
	      System.out.println("Press 4 To\"Deletion\" from first:");
	      System.out.println("Press 5 To\"Deletion\" from last:");
	      System.out.println("press 6 to \"Print\":");
	      System.out.println("press 7 to \"Size\":");
	      System.out.println("press 0 to  \"Exit\":");
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
	                        int data2 = scn.nextInt();
	                        list.addLast(data2);
	                        break;
	                  case 3:
	                        int find = scn.nextInt();
	                        list.search(find);
	                        break;
	                  case 4:
	                        list.deleteFirst();
	                        break;
	                  case 5:
	                        list.deleteLast();
	                        break;
	                  case 6:
	                        list.output();
	                        break;
	                 case 7:
	                       list.size();
	                       break;
	                 default:
	                        System.out.println("Invalid operation");
	            }
	            System.out.println("Next Operation:");
	    }
    }
}
