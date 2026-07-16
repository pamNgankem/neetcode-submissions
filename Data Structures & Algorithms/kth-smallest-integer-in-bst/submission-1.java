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
    int res = 0;
    public int kthSmallest(TreeNode root, int k) 
    {
        int[] count = new int[1];
        visit(root, count, k);

        return res;    
    }

    public void visit(TreeNode node, int[] c, int val)
    {
        if(node == null)
        {
            return;
        }

        visit(node.left, c, val);
        if(c[0] == val)
        {
            return;
        }

        c[0]++;

        if(c[0] == val)
        {
            res = node.val;
            return;
        }
        visit(node.right, c, val);
    }
}
