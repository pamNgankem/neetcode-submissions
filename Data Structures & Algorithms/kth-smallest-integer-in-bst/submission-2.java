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
    public int kthSmallest(TreeNode root, int k) 
    {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        visit(root, ls);

        return ls.get(k - 1);
    }

    public void visit(TreeNode node, ArrayList<Integer> list)
    {
        if(node == null)
        {
            return;
        }
        
        visit(node.left, list);
        list.add(node.val);
        visit(node.right, list);
    }
}
