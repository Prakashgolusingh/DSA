// your task is to complete this function

/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,int x) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i: head1)
            set.add(i);
        for(int i: head2)
        {
            int y = x-i;
            if(set.contains(y))
                count++;
        }
        return count;
    }
}
