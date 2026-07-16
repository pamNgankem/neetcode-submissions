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
        // linkedlist with the result of addition
        ListNode addition = new ListNode();
        ListNode curr = addition;

        // keep track of the carry on from addition
        int carry = 0;
        // add digits at a time
        while(l1 != null || l2 != null || carry != 0)
        {
            // get b0th digits
            int digit1 = 0;
            int digit2 = 0;

            //only get the first digit if the list is not empty
            if(l1 != null)
            {
                digit1 = l1.val;
            }

            //only get the second digit if the list is not empty
            if(l2 != null)
            {
                digit2 = l2.val;
            }

            // sum of digits
            int sum = digit1 + digit2 + carry;

            carry = sum / 10;
            sum = sum % 10;
            //create a node with the sum to extend the likedlist
            ListNode node = new ListNode(sum);

            //extend liskedlist
            curr.next = node;
            curr = curr.next;

            //list still has element
            if(l1 != null)
            {
                l1 = l1.next;// move to next node
            }

            //list still has element
            if(l2 != null)
            {
                l2 = l2.next;// move to next node
            }
        }

        return addition.next;

    }
}
