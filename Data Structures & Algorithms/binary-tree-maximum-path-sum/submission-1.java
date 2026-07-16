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
    public int maxPathSum(TreeNode root) 
    {
        int[] res = new int[]{root.val};

        dfs(root, res);

        return res[0];
    }

    private int dfs(TreeNode node, int[] arr)
    {
        if(node == null)
        {
            return 0;
        }

        int leftMax = dfs(node.left, arr);
        int rightMax = dfs(node.right, arr);

        leftMax = Math.max(leftMax, 0);
        rightMax = Math.max(rightMax, 0);

        arr[0] = Math.max(arr[0], node.val + leftMax + rightMax);

        return node.val + Math.max(leftMax, rightMax);

    }
}
