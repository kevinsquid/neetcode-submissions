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
    public int maxDepth(TreeNode root) {
        return maxDepthH(root, 0);
    }
    private int maxDepthH( TreeNode root, int count) {
        if (root == null) {
            return count;
        }
        count++; 
        return Math.max(maxDepthH(root.left, count),
        maxDepthH(root.right, count));
    }
}
