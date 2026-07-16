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
    public boolean hasCycle(ListNode head) 
    {
        if(head == null)
        {
            return false;
        }

        HashSet<ListNode> set = new HashSet<ListNode>();
        ListNode curr = head;

        boolean hasCycle = false;

        while(!hasCycle && curr != null)
        {
            if(set.contains(curr.next))
            {
                hasCycle = true;
                break;
            }
            set.add(curr);
            curr = curr.next;
        }

        return hasCycle;
    }
}
