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
        if(head == null)
        {
            return null;
        }
        
        ArrayList<ListNode> list = new ArrayList<ListNode>();

        ListNode curr = head;

        while(curr != null)
        {
            list.add(curr);
            curr = curr.next;
        }

        int end = list.size();

        for(int i = 0; i < n; i++)
        {
            end--;
        }

        list.remove(list.get(end));
        if(list.size() == 0)
        {
            return null;
        }
        ListNode newL = new ListNode(list.get(0).val);
        ListNode curr1 = newL;

        for(int i = 1; i < list.size(); i++)
        {
            ListNode node = new ListNode(list.get(i).val);
            curr1.next = node;
            curr1 = curr1.next;
        }

        return newL;

    }
}
