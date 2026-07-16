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
        // list is null
        if(head == null)
        {
            return false;
        }

        //node locations
        HashSet<ListNode> locations = new HashSet<ListNode>();

        // current location in the list
        ListNode curr = head;

        // is there a cylce?
        boolean hasCycle = false;

        //looking for a cycle
        while(!hasCycle && curr != null)
        {
            // a node points to a previous one
            if(locations.contains(curr.next))
            {
                hasCycle = true; // there is a cycle
                break; // stop looking
            }

            locations.add(curr);
            curr = curr.next;
        }

        return hasCycle;
        
    }
}
