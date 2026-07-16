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
        ListNode curr = l1;
        ListNode curr1 = l2;

        ListNode list = null;

        int sum = 0;
        int remainder = 0;

        while(curr != null)
        {
            if(curr1 != null)
            {
                sum = curr.val + curr1.val;
                curr1 = curr1.next;
            }
            else
            {
                sum = curr.val;
            }

            if(remainder != 0)
            {
                sum += remainder;
                remainder = 0;
            }

            int digit = 0;

            if(sum / 10 >= 1)
            {
                digit = sum % 10;
                remainder = sum / 10;
            }
            else
            {
                digit = sum;
            }

            ListNode cell = new ListNode(digit, list);
            list = cell;
            curr = curr.next;

        }

        if(curr1 != null)
        {
            while(curr1 != null)
            {
                //int res = 0;
                if(remainder != 0)
                {
                    sum = remainder + curr1.val;
                    remainder = 0;
                }
                else
                {
                    sum = curr1.val;
                }

                int digit = 0;

                if(sum / 10 >= 1)
                {
                    digit = sum % 10;
                    remainder = sum / 10;
                }
                else
                {
                    digit = sum;
                }
                
                ListNode cell = new ListNode(digit, list);
                list = cell;
                curr1 = curr1.next;
            }
        }

        if(remainder != 0)
        {
            ListNode cell = new ListNode(remainder, list);
            list = cell;
        }

        ListNode curr3 = list;
        ListNode newList = null;

        while(curr3!= null)
        {
            ListNode cell = new ListNode(curr3.val, newList);
            newList = cell;
            curr3 = curr3.next;
        }

        return newList;
    }
}
