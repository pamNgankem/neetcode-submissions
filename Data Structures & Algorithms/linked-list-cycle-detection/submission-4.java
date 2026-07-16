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
    public boolean hasCycle(ListNode head) 
    {
        //listis empty
        if(head == null)
        {
            return false;
        }

        //slow pointer
        ListNode slow = head;

        //fast ppointer
        ListNode fast = head;

        // keep moving both pointers at different speeds and cheking whether or not they meet
        while(fast != null && fast.next != null)
        {
            //move fast pointer two steps ahead than slow pointer
            fast = fast.next.next;

            slow = slow.next;

            // do they meet?
            if(fast == slow)
            {
                //there is a cycle
                return true;
            }
        }

        return false;
    }
}
