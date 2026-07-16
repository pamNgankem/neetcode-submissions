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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
        ArrayList<String> res = new ArrayList<String>();
        dfsSerialize(root, res);
        return String.join(",", res);
    }

    private void dfsSerialize(TreeNode node, ArrayList<String> list)
    {
        if(node == null)
        {
            list.add("#");
            return;
        }

        list.add(""+node.val);
        dfsSerialize(node.left, list);
        dfsSerialize(node.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
        String[] arr = data.split(",");
        int[] i = {0};
        return dfsDeserialize(arr, i);
    }

    private TreeNode dfsDeserialize(String[] vals, int[] i)
    {
        if(vals[i[0]].equals("#"))
        {
            i[0]++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(vals[i[0]]));
        i[0]++;
        node.left = dfsDeserialize(vals, i);
        node.right = dfsDeserialize(vals,i);

        return node;
    }
}
