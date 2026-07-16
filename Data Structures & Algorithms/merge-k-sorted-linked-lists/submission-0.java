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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < lists.length; i++)
        {
            ListNode curr = lists[i];
            
            while(curr != null)
            {
                list.add(curr.val);
                curr = curr.next;
            }
        }

        Object[] arr = list.toArray();

        Arrays.sort(arr);

        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        for(Object obj : arr)
        {
            node.next = new ListNode(Integer.parseInt(obj.toString()));
            node = node.next;
        }

        return dummy.next;

    }
}
