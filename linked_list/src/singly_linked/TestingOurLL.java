package singly_linked;

public class TestingOurLL
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        System.out.println("Size: " + list.size());

        list.add('A');
        list.add('B');
        list.add('C');

        System.out.println("Size: " + list.size());

        list.add('D');
        list.add('E');
        list.add('F');

        list.printList();

        System.out.println();
        System.out.println("Size: " + list.size());

        System.out.println(list.contains('E')); //true!
        System.out.println(list.contains('G')); //false!

        //try removing different elements
        System.out.println();
        System.out.println("remove(A): " + list.remove('A'));
        System.out.println("remove(D): " + list.remove('D'));
        System.out.println("remove(F): " + list.remove('F'));

        System.out.println();
        list.printList();

        System.out.println();
        System.out.println("remove(G): " + list.remove('G'));
    }
}
