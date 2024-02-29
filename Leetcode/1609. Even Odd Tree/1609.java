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
    public boolean isEvenOddTree(TreeNode root) {
        int l = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode temp = q.remove();
            if(temp == null)
            {
                if(l%2 == 0)
                {
                    for(int i=1; i<arr.size(); i++)
                    {
                        if(arr.get(i-1)>=arr.get(i))
                            return false;
                    }
                }
                if(l%2 != 0)
                {
                    for(int i=1; i<arr.size(); i++)
                    {
                        if(arr.get(i-1)<=arr.get(i))
                            return false;
                    }
                }
                //System.out.println(arr.toString());
                if(q.isEmpty())
                    return true;
                arr = new ArrayList<>();
                q.add(null);
                l++;
                
            }
            else
            {
                if(l%2==0 && temp.val%2 == 0)
                    return false;
                if(l%2 == 1 && temp.val%2 == 1)
                    return false;
                arr.add(temp.val);
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
        return true;
    }
}
