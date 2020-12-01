package singly_linked;

public class LinkedList
{
    //fields
    private Node head;
    /*private Node tail;*/
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
            head = tail = new Node(newElement);
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

            /*tail.next = new Node(newElement);
            tail = tail.next;*/
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
        return size == 0;
    }

    //will return true if element is found in a node in the LL,
    //otherwise it returns false
    public boolean contains(Object element)
    {
        Node current = head;
        while (current != null)
        {
            //is the current element equal to my search value?
            if (current.data.equals(element))
            {
                return true;
            }

            //move on and check the next node
            current = current.next;
        }

        return false;
    }

    //removes the first occurrence of the parameter element
    public boolean remove(Object element)
    {
        //is the list empty?
        if (head == null)
        {
            return false; //not found!
        }
        //are we removing the first element?
        else if (head.data.equals(element))
        {
            //move our head "pointer" to the next node in the list
            head = head.next;
            return true; //found it!
        }
        else
        {
            //we need to loop over the linked list to find the element to remove
            Node current = head;

            //loop while the next node's data is NOT the element to remove
            while (current.next != null && !current.next.data.equals(element))
            {
                current = current.next; //keep moving until we find it!
            }

            //did we find the element?
            if (current.next != null)
            {
                //the next node is the one to remove
                current.next = current.next.next;
                return true;
            }
            else
            {
                //we didn't find the element
                return false;
            }
        }
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
