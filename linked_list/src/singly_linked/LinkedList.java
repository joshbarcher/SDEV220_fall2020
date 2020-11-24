package singly_linked;

public class LinkedList
{
    //fields
    private Node head;
    private int size;

    //constructors

    public LinkedList()
    {
        //do nothing...
    }

    //methods

    public void add(Object newElement)
    {
        //is the list empty?
        if (head == null)
        {
            head = new Node(newElement);
            size = 1;
        }
        else
        {
            //we have elements (how many?), we need to
            //traverse to the last Node in the list
            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }

            //add the new Node to the end of the list
            current.next = new Node(newElement);
            size++;
        }
    }

    public void printList()
    {
        //print out elements with the format A, B, C, D using a loop
        Node current = head;
        while (current != null)
        {
            //print out the current element
            System.out.println(current.data);

            //move to the next node
            current = current.next;
        }
    }

    public int size()
    {
        return size;
    }

    //returns true if there are no nodes in the LL, otherwise false
    public boolean isEmpty()
    {
        return false;
    }

    //will return true if element is found in a node in the LL,
    //otherwise it returns false
    public boolean contains(Object element)
    {
        return false;
    }

    private static class Node
    {
        private Object data;
        private Node next;

        public Node(Object data)
        {
            this.data = data;
        }

        public Node(Object data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString()
        {
            return data.toString();
        }
    }
}
