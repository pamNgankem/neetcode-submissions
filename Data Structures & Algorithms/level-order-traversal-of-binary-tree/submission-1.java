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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> outer = new ArrayList<>();
        visit(root, 0, outer);
        
        return outer;
    }

    public void visit(TreeNode node, int level, List<List<Integer>> list)
    {
        if(node == null)
        {
            return;
        }

        if(list.size() <= level)
        {
            list.add(new ArrayList<Integer>());
        }

        list.get(level).add(node.val);

        visit(node.left, level+1, list);
        visit(node.right, level+1, list);
    }
}
