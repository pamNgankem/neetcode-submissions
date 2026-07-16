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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1 == null && list2 == null)
        {
            return null;
        }
        else if (list1 == null)
        {
            return list2;
        }
        else if(list2 == null)
        {
            return list1;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        ListNode curr = list1;

        while(curr != null)
        {
            list.add(curr.val);
            curr = curr.next;
        }

        ListNode curr1 = list2;

        while(curr1 != null)
        {
            list.add(curr1.val);
            curr1 = curr1.next;
        }

        int[] listt = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            listt[i] = list.get(i);
        }

        Arrays.sort(listt);

        ListNode finalList = null;
        //ListNode prev = null;

        for(int i = 0; i < listt.length; i++)
        {
          //prev = finalList;
          ListNode cell = new ListNode(listt[i], finalList);
          finalList = cell; 
        }

        ListNode newList = null;
        ListNode curr2 = finalList;

        while(curr2 != null)
        {
          ListNode cell = new ListNode(curr2.val, newList);
          newList = cell;
          curr2 = curr2.next;
        }

        return newList;

    }
}