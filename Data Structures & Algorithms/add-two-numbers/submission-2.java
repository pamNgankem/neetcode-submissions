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

        Stack<Integer> stack = new Stack<Integer>();

        while(curr!= null && curr1 != null)
        {
            int sum = curr.val + curr1.val;

            if(!stack.isEmpty())
            {
                sum += stack.pop();
            }

            int digit = 0;

            if(sum / 10 >= 1)
            {
                digit = sum % 10;
                stack.push(sum / 10);
            }
            else
            {
                digit = sum;
            }
            ListNode cell = new ListNode(digit, list);
            list = cell;
            curr = curr.next;
            curr1 = curr1.next;
        }

        if(curr != null)
        {
            while(curr != null)
            {
                int res = 0;
                if(!stack.isEmpty())
                {
                    res = stack.pop();
                }
                
                int sum = res + curr.val;

                int digit = 0;

                if(sum / 10 >= 1)
                {
                    digit = sum % 10;
                    stack.push(sum / 10);
                }
                else
                {
                    digit = sum;
                }

                ListNode cell = new ListNode(digit, list);
                list = cell;

                curr = curr.next;
            }
        }

        if(curr1 != null)
        {
            while(curr1 != null)
            {
                int res = 0;
                if(!stack.isEmpty())
                {
                    res = stack.pop();
                }
                
                int sum = res + curr1.val;

                int digit = 0;

                if(sum / 10 >= 1)
                {
                    digit = sum % 10;
                    stack.push(sum / 10);
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

        if(!stack.isEmpty())
        {
            ListNode cell = new ListNode(stack.pop(), list);
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
