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
        //store all the lists' values
        ArrayList<Integer> listsValues = new ArrayList<Integer>();

        // accessing evry lists of outer list, and adding its values to my new list of values
        for(int i = 0; i < lists.length; i++)
        {
            //cuurent list
            ListNode curr = lists[i];

            //add this list's values to my list of values
            while(curr != null)
            {
                listsValues.add(curr.val);

                curr = curr.next;
            }
        }

        // convert list of values to an array of values
        Object[] arrayValues = listsValues.toArray();

        //sorting
        Arrays.sort(arrayValues);

        //merged list
        ListNode mergedList = new ListNode((int)arrayValues[0]);
        //current position in my merged list
        ListNode curr = mergedList;

        // add remaining elements of the array to the merged list
        for(int i = 1; i < arrayValues.length; i++)
        {
            //construct a node containing the current array element and extend my merged list with that node
            ListNode node = new ListNode((int)arrayValues[i]);
            curr.next = node;
            curr = curr.next;
        }

        return mergedList;

    }
}
