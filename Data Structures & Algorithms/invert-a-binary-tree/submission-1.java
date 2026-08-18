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
    public TreeNode invertTree(TreeNode root) {
        // stops the recursion once it has reached the child (null) and to go back up
        if (root == null) {
            return null;
        }
        
        // Performing the swap before the recursive call
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Performing the recursion
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
