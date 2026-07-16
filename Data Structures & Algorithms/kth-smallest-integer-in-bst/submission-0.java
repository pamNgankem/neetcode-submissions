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

        Collections.sort(ls);

        return ls.get(k - 1);
    }

    public void visit(TreeNode node, ArrayList<Integer> list)
    {
        if(node == null)
        {
            return;
        }

        list.add(node.val);
        visit(node.left, list);
        visit(node.right, list);
    }
}
