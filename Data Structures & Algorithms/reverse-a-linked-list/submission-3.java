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
        //list storing the node values
        ArrayList<Integer> list = new ArrayList<Integer>();

        // current node int he linkedlist
        ListNode current = head;

        //add node values to the list
        while(current != null)
        {
            list.add(current.val);
            current = current.next;
        }

        ListNode newL = null;
        //reverse the list and create a linkedlist with these values inr everse order
        for(int i = 0; i < list.size(); i++)
        {
            ListNode node = new ListNode(list.get(i), newL);
            newL = node;
        }

        return newL;
         
    }
}
