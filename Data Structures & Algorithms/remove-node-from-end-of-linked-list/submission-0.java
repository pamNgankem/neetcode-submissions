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
        ListNode temp = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode cell = new ListNode(curr.val, temp);
            temp = cell;
            curr = curr.next;
        }

        if(n > 1)
        {
            ListNode curr2 = temp;
            ListNode prev = null;
            int count = 1;
            while(curr2 != null)
            {
                if(count == n && prev != null)
                {
                    prev.next = curr2.next;
                    curr2.next = null;
                    break;
                }

                prev = curr2;
                curr2 = curr2.next;
                count++;
            }
        }
        else
        {
            temp = temp.next;
        }
        
        ListNode temp1 = null;
        ListNode curr3 = temp;

        while(curr3 != null)
        {
            ListNode cell = new ListNode(curr3.val, temp1);
            temp1 = cell;
            curr3 = curr3.next;
        }

        return temp1;

    }
}
