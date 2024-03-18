

// User function Template for Java

/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        if(root==null)
            return 0;
        return Math.max((1+height(root.left)+height(root.right)),Math.max(diameter(root.left),diameter(root.right)));
        
    }
    public int height(Node root)
    {
        if(root==null)
            return 0;
        return (1+Math.max(height(root.left),height(root.right)));
    }
}
