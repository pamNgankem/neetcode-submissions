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
        //both lists are empty
        if(list1 == null && list2 == null)
        {
            return null;
        }
        else if (list2 == null)
        {
            return list1;
        }
        else if(list1 == null)
        {
            return list2;
        }
        else
        {
            // final merged list
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;

            //traversing both lists
            while(list1 != null && list2 != null)
            {
                //compare nodes'values
                if(list1.val < list2.val)
                {
                    curr.next = list1;
                    list1 = list1.next;
                }
                else
                {
                    curr.next = list2;
                    list2 = list2.next;
                }

                curr = curr.next;
            }

            //list 1 still has elements
            if(list1 != null)
            {
                curr.next = list1;
            }

            // list 2 still has ellements
            if(list2 != null)
            {
                curr.next = list2;
            }

            return dummy.next;
        }

    }
}