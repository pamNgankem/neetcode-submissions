/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution 
{
    public Node copyRandomList(Node head) 
    {
        // list is empty
        if(head == null)
        {
            return null;
        }

        // stores linkedlist's nodes and new nodes made from them
        HashMap<Node,Node> nodes = new HashMap<Node,Node>();

        //current in the linkelist
        Node curr = head;

        //storing nodes
        while(curr != null)
        {
            nodes.put(curr, new Node(curr.val));

            curr = curr.next;
        }

        curr = head;

        while(curr != null)
        {
            //first the new node
            Node node = nodes.get(curr);
            
            //point my node to its corresponding copy of the nodes from the original list that comes after it
            node.next = nodes.get(curr.next);

            // same thing for random
            node.random = nodes.get(curr.random);

            curr = curr.next;
        }

        //copy of the linkedlist
        return nodes.get(head);
    }
}
