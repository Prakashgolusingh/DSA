/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;
        int n = 0;
        ListNode temp = head;
        while(temp!= null)
        {
            temp = temp.next;
            n++;
        }
        
        k = k%n;
        if(k == 0)
            return head;
        k = n-k;
        n = 1;
        temp = head;
        while(n<k)
        {
            temp = temp.next;
            n++;
        }
        ListNode t = temp.next;
        temp.next = null;
        temp = t;
        while(temp != null && temp.next != null)
            temp = temp.next;
        if(temp != null)
            temp.next = head;
        return t;
    }
}
