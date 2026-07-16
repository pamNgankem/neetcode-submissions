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
    public void reorderList(ListNode head) 
    {

        //list storing the nodes' locations/memory addresses
        ArrayList<ListNode> locations = new ArrayList<ListNode>();

        //current position in the linkedlist
        ListNode curr = head;

        // adding the nodes' locations to the list
        while(curr != null)
        {
            locations.add(curr);
            curr = curr.next;
        }

        // start pointer
        int start = 0;

        //end pointer
        int end = locations.size() - 1;

        // reording nodes
        while(start < end)
        {
            // point the starting node to the ending node
            locations.get(start).next = locations.get(end);
            start++;

            // did I get out of bounds
            if(start >= end)
            {
                break;
            } 

            locations.get(end).next = locations.get(start);
            end--;
        }

        // there is a cycle, break the cycle by pointing the last node to null
        locations.get(start).next = null;

        
    }
}
