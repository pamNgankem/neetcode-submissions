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

        ListNode curr = head;
        ListNode newL = null;

        while(curr != null)
        {
            ListNode newl = new ListNode(curr.val, newL);
            newL = newl;
            curr = curr.next;

        }

        return newL;
    }
}
