
/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        Node l = head;
        Node r = head.next;
        Node tl = head;
        Node tr = r;
        while(tl != null && tl.next != null)
        {
            if(tr != null && tr.next != null)
            {
                tl.next = tr.next;
                tl = tl.next;
            }
            if((tl != null && tl.next != null)&& tr.next != null)
            {
                tr.next = tl.next;
                tr = tr.next;
            }
            if(tl.next == null)
                tr.next = null;
            if(tr != null && tr.next == null)
                tl.next =null;
        }
        tr =  reverse(r);
        tl = l;
        Node t = new Node(0);
        l = t;
        while(tr != null && tl != null)
        {
            if(tr.data <tl.data)
            {
                t.next = tr;
                tr = tr.next;
            }
            else
            {
                t.next = tl;
                tl = tl.next;
            }
            t = t.next;
        }
        while(tr != null)
        {
            t.next = tr;
            t = t.next;
            tr = tr.next;
        }
        while(tl != null)
        {
            t.next = tl;
            t = t.next;
            tl = tl.next;
        }
        return l.next;
   }
   
   public Node reverse(Node head)
   {
       Node pre = null;
       Node cur = head;
       while(cur != null)
       {
           Node nex = cur.next;
           cur.next = pre;
           pre = cur;
           cur = nex;
       }
       return pre;
   }
