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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode list = new ListNode(0);
        ListNode curr = list;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0)
        {
            int digit1 = 0;
            int digit2 = 0;

            if(l1 != null)
            {
                digit1 = l1.val;
            }

            if(l2 != null)
            {
                digit2 = l2.val;
            }

            int sum = digit1 + digit2 + carry;

            curr.next = new ListNode(sum % 10);
            carry = sum / 10;

            curr = curr.next;

            if(l1 != null)
            {
                l1 = l1.next;
            }

            if(l2 != null)
            {
                l2 = l2.next;
            }
        }

        return list.next;
    }
}
