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
        
        ListNode curr = list1;
        ListNode curr2 = list2;

        ListNode finalList = null;

        while(curr != null && curr2 != null)
        {
            if(curr.val <= curr2.val)
            {
                ListNode cell = new ListNode(curr.val, finalList);
                finalList = cell;
                curr = curr.next;
            }
            else
            {
                ListNode cell = new ListNode(curr2.val, finalList);
                finalList = cell;
                curr2 = curr2.next;
            }
            
        }

        if(curr != null)
        {
            while(curr != null)
            {
                ListNode cell = new ListNode(curr.val, finalList);
                finalList = cell;
                curr = curr.next;
                
            }
        }

        if(curr2 != null)
        {
            while(curr2 != null)
            {
                ListNode cell = new ListNode(curr2.val, finalList);
                finalList = cell;
                curr2 = curr2.next;
                
            }
        }


        ListNode newList = null;
        ListNode cur = finalList;

        while(cur != null)
        {
          ListNode cell = new ListNode(cur.val, newList);
          newList = cell;
          cur = cur.next;
        }

        return newList;
    }
}