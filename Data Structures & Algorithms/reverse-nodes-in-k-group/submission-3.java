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
        //store the list's nodes
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();

        //keeps track of current location in the list
        ListNode curr = head;

        //traverse the list and store its node in the arraylist
        while(curr != null)
        {
            nodes.add(curr); // add current node to the list
            curr = curr.next;
        }

        //iterate trough the list and reverse the k nodes one by one
        for(int i = 0; i <= nodes.size() - k; i+=k)
        {
            // start of the first group of k nodes
            int start = i;

            // end of the first group of k nodes
            int end = i + k - 1;

            // reversing the nodes
            while(start < end)
            {
                ListNode temp = nodes.get(start);
                nodes.set(start, nodes.get(end));
                nodes.set(end, temp);

                start++;
                end--;
                
            }
        }

        // tie evrythoing back together
        for(int i = 0; i < nodes.size() - 1; i++)
        {
            nodes.get(i).next = nodes.get(i+1);
        }

        // remove the cycle
        nodes.get(nodes.size() - 1).next = null;

        return nodes.get(0);

        
    }
}
