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
        // the list empty
        if(head == null)
        {
            return null;
        }

        // keeps track of current location in the linked list
        ListNode curr = head;

        // reversed Linkedlist 
        ListNode reversed = null;

        //traversing the linkedlist
        while(curr != null)
        {
            //create a new node with current node's value and insert it at the beginning of the reversed likedlist
            ListNode newl = new ListNode(curr.val, reversed);
            reversed = newl;
            curr = curr.next;
        }

        return reversed;

    }
}
