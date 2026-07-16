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
        if(head == null)
        {
            return head;
        }

        ListNode curr = head;
        ListNode newHead = null;

        while(curr != null)
        {
            ListNode cell = new ListNode(curr.val, newHead);
            newHead = cell;

            /*
            if(newHead == null)
            {
                newHead = cell;
            }
            else
            {
                newHead.next = head;
                head = newHead;
            }
            */

            curr = curr.next;
        }

        return newHead;
    }
}
