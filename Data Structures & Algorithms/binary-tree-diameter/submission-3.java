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

class Solution 
{
    public int diameterOfBinaryTree(TreeNode root) 
    {

        int[] maxDiameter = new int[1];
        height(root, maxDiameter);
        return maxDiameter[0];
    }

    public int height(TreeNode root, int[] maxDiameter) 
    {
        if(root == null)
        {
            return 0;
        }

        int leftHeight = height(root.left, maxDiameter);
        int rightHeight = height(root.right, maxDiameter);

        maxDiameter[0] = Math.max(maxDiameter[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
        
    }
}
