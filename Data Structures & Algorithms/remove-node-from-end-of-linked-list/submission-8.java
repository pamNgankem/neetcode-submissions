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
        // list is empty
        if(head == null)
        {
            return null;
        }

        // storoing the list's nodes in an arraylist
        ArrayList<ListNode> list = new ArrayList<ListNode>();

        // current location in head
        ListNode curr = head;

        // traverse the linked lists, add  its nodes to the arraylist
        while(curr != null)
        {
            list.add(curr);
            curr = curr.next;
        }

        // location of the node to remove in the list
        int nodeToRemPos = list.size();

        // get that node position
        for(int i = 0; i < n; i++)
        {
            nodeToRemPos--;
        }

        //remove the node from the arrayList
        list.remove(list.get(nodeToRemPos));

        //my list is empty after removal
        if(list.size() == 0)
        {
            return null;
        }

        // Linkedlist containing the remaining elements
        ListNode remainList = new ListNode(list.get(0).val);
        ListNode curr1 = remainList;

        for(int i = 1; i < list.size(); i++)
        {
            ListNode node = new ListNode(list.get(i).val);
            curr1.next = node;
            curr1 = curr1.next;
        }

        return remainList;

    }
}
