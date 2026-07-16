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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ArrayList<ListNode> list = new ArrayList<ListNode>();

        ListNode curr = head;

        while(curr != null)
        {
            list.add(curr);
            curr = curr.next;
        }

        for(int i = 0; i <= list.size() - k; i += k)
        {
            int start = i;
            int end = i+ k - 1;

            while(start < end)
            {
                ListNode temp = list.get(start);
                list.set(start,list.get(end));
                list.set(end, temp);
                start++;
                end--;
            }
        }

        for(int i = 0; i < list.size() - 1; i++)
        {
            list.get(i).next = list.get(i+1);
        }

        list.get(list.size() - 1).next = null;

        return list.get(0);
    }
}
