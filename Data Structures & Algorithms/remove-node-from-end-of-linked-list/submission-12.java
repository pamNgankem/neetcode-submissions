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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode curr = head;
        int size = 0;

        while(curr != null)
        {
            size++;
            curr = curr.next;
        }

        int iterations = size - n;

        if(iterations == 0)
        {
            return head.next;
        }

        curr = head;
        ListNode prev = null;

        int i = 0;

        while(i < iterations && curr != null)
        {
            prev = curr;
            curr = curr.next;
            i++;
        }

        prev.next = curr.next;
        curr.next = null;

        return head;
    }
}
