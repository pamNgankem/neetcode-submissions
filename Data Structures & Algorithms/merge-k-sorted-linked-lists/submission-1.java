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
        if(lists.length == 0)
        {
            return null;
        }

        //store all the lits'values
        ArrayList<Integer> listsValues = new ArrayList<Integer>();

        //checking evry list
        for(int i = 0; i < lists.length; i++)
        {
            //current list in my list
            ListNode curr = lists[i];

            //as lon as I still have elements in the list
            while(curr != null)
            {
                //add the current value in list curr to list listsvalues
                listsValues.add(curr.val);
                curr = curr.next; // move on to next element
            }
        }

        //sort our list of values
        Object[] listValue = listsValues.toArray();
        Arrays.sort(listValue);

        // final lisnked list containin the lists merged in sorted order
        ListNode mergedList = new ListNode((int)listValue[0]);
        ListNode curr = mergedList;

        //add all the listsValues elememnts in the merged list
        for(int i = 1; i < listValue.length; i++)
        {
            //construct a node that hold the current element in listsValues
            ListNode node = new ListNode((int)listValue[i]);
            curr.next = node;
            curr = curr.next;
        }

        return mergedList;


    }
}
