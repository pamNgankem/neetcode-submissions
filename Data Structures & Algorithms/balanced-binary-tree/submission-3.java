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
    public boolean isBalanced(TreeNode root) 
    {
        if(root == null)
        {
            return true;
        }

        boolean[] check = new boolean[]{true};

        height(root, check);
        return check[0];
    }

    public int height(TreeNode root, boolean[] check)
    {
        if(root == null)
        {
            return 0;
        }

        int leftH = height(root.left, check);
        int rightH = height(root.right, check);

        int diff = Math.abs(leftH - rightH);

        if( diff > 1)
        {
            check[0] = false;
        }

        return 1 + Math.max(leftH, rightH);
    }
}
