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
        
        ArrayList<Integer> nodes = new ArrayList<Integer>();

        ListNode cur = head;

        while(cur != null)
        {
            nodes.add(cur.val);
            cur = cur.next;
        }

        for(int i = 0; i < nodes.size(); i+=k)
        {
            int start = i;
            int end = i + k - 1;

            while( end < nodes.size() && start < end)
            {
                int temp = nodes.get(start);
                nodes.set(start, nodes.get(end));
                nodes.set(end, temp);
                start++;
                end--;
            }
        }

        ListNode fin = new ListNode(0);
        cur = fin;

        for(int i = 0; i < nodes.size(); i++)
        {
            cur.next = new ListNode(nodes.get(i));
            cur = cur.next;
        }

        return fin.next;

    }
}
