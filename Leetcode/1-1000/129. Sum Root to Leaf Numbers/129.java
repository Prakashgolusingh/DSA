/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int sumNumbers(TreeNode root) {
        int result[] = new int[1];
        traverse(root, 0, result);
        return result[0];
    }
    public void traverse(TreeNode root, int cur_sum, int result[])
    {
        cur_sum = cur_sum*10 + root.val;
        if(root.left != null)
            traverse(root.left, cur_sum, result);
        if(root.right != null)
            traverse(root.right, cur_sum, result);
        if(root.left == null && root.right == null)
            result[0] += cur_sum;
    }
}
