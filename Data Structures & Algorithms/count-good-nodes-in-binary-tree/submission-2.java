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
    public int goodNodes(TreeNode root) 
    {
        return visit(root, root.val);
    }

    public int visit(TreeNode node, int val)
    {
        if(node == null)
        {
            return 0;
        }

        int res = 0;

        if(node.val >= val)
        {
            res++;
        }

        val = Math.max(val, node.val);
        res+= visit(node.right, val);
        res+= visit(node.left, val);

        return res;
    }
}
