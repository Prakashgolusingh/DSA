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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr =new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        if(root == null)
            return arr;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            
            TreeNode temp = q.remove();
            System.out.print(temp+" "+ q.size());
            if(temp == null)
            {
                arr.add(level);
                if(q.isEmpty())
                    return arr;
                level = new ArrayList<>();
                q.add(null);
            }
            else
            {
                level.add(temp.val);
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
        return arr;
    }
}
