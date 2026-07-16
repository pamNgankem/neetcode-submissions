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
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        ListNode curr = l1;
        ListNode curr1 = l2;

        while(curr != null)
        {
            sb.append(curr.val);
            curr = curr.next;
        }

        while(curr1 != null)
        {
            sb1.append(curr1.val);
            curr1 = curr1.next;
        }

        sb1.reverse();
        sb.reverse();

        int sum  = Integer.parseInt(sb1.toString().trim()) + Integer.parseInt(sb.toString().trim());

        StringBuilder sb2 = new StringBuilder();
        sb2.append(sum);

        String s = sb2.toString();

        ListNode newList = null;
        
        for(int i = 0; i < s.length(); i++)
        {
            ListNode cell = new ListNode(Integer.parseInt(String.valueOf(s.charAt(i))), newList);
            newList = cell;
        }

        return newList;

    }
}
