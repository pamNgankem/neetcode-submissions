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
    int count = 0;
    public int goodNodes(TreeNode root) 
    {
        return compute(root, root.val);
        
    }

    public int compute(TreeNode node, int val) 
    {
        if(node == null)
        {
            return 0;
        }

        int res = 0;
        if(node.val >= val)
        {
            res = 1;
        }

        val = Math.max(val, node.val);

        res += compute(node.left, val);
        res += compute(node.right, val);

        return res;
    }
}
