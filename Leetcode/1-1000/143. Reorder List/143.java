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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            if(fast == null)
                break;
            slow = slow.next;
        }
        fast = reverse(slow.next);
        if(slow != null)
            slow.next = null;
       
        slow = head.next;
        while(fast != null && slow != null)
        {
            head.next = fast;
            fast = fast.next;
            head = head.next;

            head.next = slow;
            slow = slow.next;
            head = head.next;   
        }
        if(fast != null)
            head.next = fast;
        if(slow != null)
            head.next = slow;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null)
        {
            ListNode nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }
}
