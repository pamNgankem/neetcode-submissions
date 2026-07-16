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
        /*
        if(head == null);
        {
            return false;
        }
        */

        HashSet<ListNode> set = new HashSet<ListNode>();
        //<ListNode> list = new ArrayList<ListNode>();

        //ListNode tail = null;
        ListNode curr = head;
        boolean hasCycle = false;

        //map.put(head, true);

        while(!hasCycle && curr != null)
        {
            //tail = curr;
            if(!set.contains(curr))
            {
                set.add(curr);
                curr = curr.next;
            }
            else
            {
                hasCycle = true;
            }
        }

        //boolean hasCycle = false;

        /*
        ListNode curr1 = head;

        while(curr1 != null)
        {
            if((tail.next).val == curr1.val)
            {
                return true;
            }
            curr1 = curr1.next;
        }
        */

        return hasCycle;
        
    }
}
