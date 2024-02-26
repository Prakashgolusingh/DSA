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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(0);
        ListNode ans1=ans;
        int rem=0;
        while(l1!=null || l2!=null)
        {
            int temp=0;
            if(l1!=null)
            {
                temp=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                temp+=l2.val;
                l2=l2.next;
            }
            temp+=rem;
            if(temp>9)
                rem=1;
            else
                rem=0;
            temp%=10;
            ans1.next=new ListNode(temp);
            ans1=ans1.next;
        }
        if(rem!=0)
            ans1.next=new ListNode(1);
        return ans.next;
    }
}
