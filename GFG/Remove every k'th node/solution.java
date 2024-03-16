
/* Link list Node
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	    Node temp = head;
	    head = new Node(0);
	    head.next = temp;
	    temp = head;
	    while(temp != null && temp.next != null)
	    {
	        int step = 1;
	        while(step<k && temp!= null)
	        {
	            temp = temp.next;
	            step++;
	        }
	        if(temp != null && temp.next != null)
	            temp.next = temp.next.next;
	    }
        return head.next;
    }
}
