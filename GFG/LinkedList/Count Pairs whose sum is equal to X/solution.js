//User function Template for javascript

/**
 * @param {Node} head1
 * @param {Node} head2
 * @param {number} x
 * @returns {number}
*/

/*
class Node{
    constructor(data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
    countPairs(head1, head2, x)
    {
        const s = new Set();
        while(head1 != null)
        {
            s.add(head1.data)
            head1 = head1.next;
        }
        let count = 0;
        while(head2 != null)
        {
            let y = x-head2.data;
            if(s.has(y))
                count++;
            head2 = head2.next;
        }
        return count;
    }
}
