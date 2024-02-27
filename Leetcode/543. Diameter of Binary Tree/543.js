/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var diameterOfBinaryTree = function(root) {
    if(root == null)
        return 0;
    return Math.max(height(root.left)+height(root.right), Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
};
let height = (root) => {
    if(root == null)
        return 0;
    return 1+ Math.max(height(root.left), height(root.right));
}
