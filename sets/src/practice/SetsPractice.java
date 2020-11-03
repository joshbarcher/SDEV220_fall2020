package practice;

import java.util.*;

public class SetsPractice
{
    public static void main(String[] args)
    {
        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();

        //A = {t, r, u, i}
        setA.add('t');
        setA.add('r');
        setA.add('u');
        setA.add('i');

        //B = {v, t, b, r, a, e, o}
        setB.add('v');
        setB.add('t');
        setB.add('b');
        setB.add('r');
        setB.add('a');
        setB.add('e');
        setB.add('o');

        //is set A a subset of set B?
        System.out.println(setB.containsAll(setA));

        //the union of sets A and B
        //setA.addAll(setB);

        //the intersection of A and B
        //setA.retainAll(setB);

        //the difference of A and B (i.e. A - B)
        setA.removeAll(setB);

        System.out.println("What's in set A?");
        for (char letter : setA)
        {
            System.out.println(letter);
        }
    }

    private static void anotherTest()
    {
        //HashSets and TreeSets are both quick (HashSet is quicker)
        //use TreeSets when you want elements ordered
        Set<Integer> nums = new TreeSet<>();

        System.out.println("Started");
        for (int i = 1; i <= 1000000; i++)
        {
            nums.add(i);
        }
        System.out.println("Done");
    }

    private static void setTest()
    {
        //program against our List interface when using lists
        List<String> listOfStrings = new ArrayList<>();
        List<String> listOfStrings2 = new LinkedList<>();

        //program against our Set interface when using sets
        Set<String> moviesThisYear = new TreeSet<>();
        //Set<String> moviesLastYear = new TreeSet<>();

        moviesThisYear.add("Mulan");
        moviesThisYear.add("Borat");
        moviesThisYear.add("Onward");
        moviesThisYear.add("Tennet");
        moviesThisYear.add("Over the Moon");
        moviesThisYear.add("Bill & Teds Excellent Adventure");

        //if this was a list what order would these be in?
        //Mulan, Borat, Onward, Tennet, Over the Moon

        //cannot access elements by index
        /*for (int i = 0; i < moviesThisYear.size(); i++)
        {
            System.out.println(moviesThisYear.get(i));
        }*/

        for (String movie : moviesThisYear)
        {
            System.out.println(movie);
        }
        System.out.println();

        //can we interact with sets in other ways?
        moviesThisYear.remove("Tennet");
        for (String movie : moviesThisYear)
        {
            System.out.println(movie);
        }
        System.out.println();

        System.out.println(moviesThisYear.contains("Tennet"));
    }
}
