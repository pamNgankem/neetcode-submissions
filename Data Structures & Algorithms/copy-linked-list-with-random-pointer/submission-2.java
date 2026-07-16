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
        // the list empty
        if(head == null)
        {
            return null;
        }

        //store linkedlist's nodees and new nodes with the nodes' values
        HashMap<Node,Node> nodes = new HashMap<Node,Node>();

        // current position in the linked list
        Node curr = head;

        //traversing linkedlist and storing its node in the map
        while(curr != null)
        {
            //store the node as the key, and the value a new node containing the node's value
            nodes.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        //current position in the linkedlist
        curr = head;

        //traverse the linkedlist and extend my copy list with the new nodes
        while(curr != null)
        {
            Node node = nodes.get(curr);
            node.next = nodes.get(curr.next);
            node.random = nodes.get(curr.random);
            curr = curr.next;

        }

        return nodes.get(head);


    }
}
