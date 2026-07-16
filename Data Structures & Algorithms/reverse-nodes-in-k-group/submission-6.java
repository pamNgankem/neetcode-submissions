/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution 
{
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();

        ListNode cur = head;

        while(cur != null)
        {
            nodes.add(cur);
            cur = cur.next;
        }

        for(int i = 0; i < nodes.size(); i+=k)
        {
            int start = i;
            int end = i + k - 1;

            while( end < nodes.size() && start < end)
            {
                ListNode temp = nodes.get(start);
                nodes.set(start, nodes.get(end));
                nodes.set(end, temp);
                start++;
                end--;
            }
        }

        for(int i = 0; i < nodes.size() - 1; i++)
        {
            nodes.get(i).next = nodes.get(i+1);
        }

        nodes.get(nodes.size() - 1).next = null;

        return nodes.get(0);
    }
}
