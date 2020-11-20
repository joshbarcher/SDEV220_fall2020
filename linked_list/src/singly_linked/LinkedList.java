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
        while (current.next != null)
        {
            //print out the current element
            System.out.println(current.data);

            //move to the next node
            current = current.next;
        }
    }

    public int size()
    {
        return 0;
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
    }
}
