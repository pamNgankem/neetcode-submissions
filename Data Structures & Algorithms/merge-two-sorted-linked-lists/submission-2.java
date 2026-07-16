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
        else if (list1 == null)
        {
            return list1;
        }
        else
        {
            ArrayList<Integer> list = new ArrayList<Integer>();

            ListNode cur = list1;
            ListNode cur1 = list2;

            while(cur != null)
            {
                list.add(cur.val);
                cur = cur.next;
            }

            while(cur1 != null)
            {
                list.add(cur1.val);
                cur1 = cur1.next;
            }

            int[] arr = new int[list.size()];

            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = list.get(i);
            }

            Arrays.sort(arr);

            ListNode newL = null;

            for(int i = arr.length -1; i >= 0; i--)
            {
                ListNode node = new ListNode(arr[i], newL);
                newL = node;
            }

            return newL;
        }
    }
}