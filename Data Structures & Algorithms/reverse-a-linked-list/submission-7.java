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
    public ListNode reverseList(ListNode head) 
    {
        //list is empty
        if(head == null)
        {
            return null;
        }

        // keeps track of current node
        ListNode curr = head;
        
        // node that comes before the current node
        ListNode prev = null;

        //traversing the linkedlist and pointing a node to the one that comes before it
        while(curr != null)
        {
            ListNode remaining = curr.next;
            curr.next = prev;
            prev = curr;
            curr = remaining;
        }

        return prev; 
    }
}
