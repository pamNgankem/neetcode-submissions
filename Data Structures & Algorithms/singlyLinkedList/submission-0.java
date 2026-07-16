class Node<Integer>
{
    private int data;
    private Node<Integer> next;

    public Node(int data)
    {
        setData(data);
        this.next = null;
    }

    public int getData()
    {
        return this.data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public Node<Integer> getNext()
    {
        return this.next;
    }

    public void setNext(Node<Integer> next)
    {
        this.next = next;
    }

    public boolean hasNext()
    {
        return this.next != null;
    }

    public String toString() 
    {
        return "Node{" + "data=" + data + "}";
    }

}


class LinkedList 
{
    Node<Integer> head;
    Node<Integer> tail;
    int size;

    public LinkedList() 
    {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) 
    {
        if(index < 0 || index >= size)
        {
            return -1;
        }
        else
        {
            Node<Integer> curr = head;
            
            for(int i = 0; i < index; i++)
            {
                curr = curr.getNext();
            }
            return curr.getData();
        }
    }

    public void insertHead(int val) 
    {
        Node<Integer> newNode = new Node<Integer>(val);
        if(head == null || tail == null || size == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.setNext(head);
            head = newNode;
        }

        size++;
    }

    public void insertTail(int val) 
    {
        Node<Integer> newNode = new Node<Integer>(val);
        if(head == null || tail == null || size == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.setNext(newNode);
            tail = newNode;
        }

        size++;
    }

    public boolean remove(int index) 
    {
        if(index < 0 || index >= size)
        {
            return false;
        }
        else
        {
            if(index == 0)
            {
                head = head.getNext();
            }
            else
            {
                Node<Integer> curr = head;
                Node<Integer> prev = null;
            
                for(int i = 0; i < index; i++)
                {
                    prev = curr;
                    curr = curr.getNext();
                }
                
                if(curr == tail)
                {
                    tail = prev;
                }

                prev.setNext(curr.getNext());
                curr = null;

            }

            size--;

            if(size == 0)
            {
                head = null;
                tail = null;
            }

            return true;
        }
    }

    public ArrayList<Integer> getValues() 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node<Integer> curr = head;
            
        for(int i = 0; i < size; i++)
        {
            list.add(curr.getData());
            curr = curr.getNext();
        } 

        return list;     
    }
}
