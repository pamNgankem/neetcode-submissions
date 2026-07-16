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
        // llist is empty
        if(head == null)
        {
            return null;
        }

        // current position in the linkedlist
        ListNode curr = head;

        //size of the list
        int size = 0;

        // traversing the lust and incrementing size
        while(curr != null)
        {
            size++;
            curr = curr.next;
        }

        // position of the node to remove
        int posRem = size - n;

        if(posRem == 0)
        {
            return head.next;
        }
        // node to remove
        ListNode nodeRem = head;

        // node that precedes the node to remove
        ListNode prevNodeRem = null;

        //traversing and finding the node to remove
        for(int i = 0; i < posRem; i++)
        {
            prevNodeRem = nodeRem;
            nodeRem = nodeRem.next;
        }

        prevNodeRem.next = nodeRem.next;
        nodeRem.next = null;

        return head;

    }
}
