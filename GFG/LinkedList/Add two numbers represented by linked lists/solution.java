/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list
        Node one = new Node(0);
        Node temp_one = one;
        Node two = new Node(0);
        Node temp_two = two;
        Node temp_num1 = num1;
        while(temp_num1 != null && temp_num1.data == 0)
            temp_num1 = temp_num1.next;
        Node temp_num2 = num2;
        while(temp_num2 != null && temp_num2.data == 0)
            temp_num2 = temp_num2.next;
        while(temp_num1 != null || temp_num2 != null)
        {
            if(temp_num1 != null)
            {
                temp_one.next = new Node(temp_num1.data);
                temp_one = temp_one.next;
                temp_num1 = temp_num1.next;
            }
            if(temp_num2 != null)
            {
                temp_two.next = new Node(temp_num2.data);
                temp_two = temp_two.next;
                temp_num2 = temp_num2.next;
            }
        }
        one = one.next;
        two = two.next;
        Node reverse_one = reverse(one);
        Node reverse_two = reverse(two);
        Node ans = new Node(0);
        Node temp_ans = ans;
        int rem = 0;
        while(reverse_one != null || reverse_two != null)
        {
            int num = 0;
            if(reverse_one != null)
            {
                num += reverse_one.data;
                reverse_one = reverse_one.next;
            }
            if(reverse_two != null)
            {
                num += reverse_two.data;
                reverse_two = reverse_two.next;
            }
            num += rem;
            rem = num/10;
            num = num%10;
            temp_ans.next = new Node(num);
            temp_ans = temp_ans.next;
        }
        if(rem != 0)
            temp_ans.next = new Node(rem);
        ans = reverse(ans.next);
        if(ans == null)
            return new Node(0);
        return ans;
    }
    static Node reverse(Node head)
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
}
