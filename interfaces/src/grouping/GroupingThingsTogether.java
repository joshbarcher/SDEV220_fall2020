package grouping;

import introduction.animals.Dog;

import java.awt.*;

public class GroupingThingsTogether
{
    public static void main(String[] args)
    {
        Randomizable[] randomizables = {
            new Coin(true, 1),
            new Coin(false, 5),
            new Coin(true, 25),
            new Dice(6, Color.RED),
            new Dice(10, Color.WHITE)
        };


    }

    public static void groupingByInterface()
    {
        Randomizable[] randomizables = {
                new Coin(true, 1),
                new Coin(false, 5),
                new Coin(true, 25),
                new Dice(6, Color.RED),
                new Dice(10, Color.WHITE)
        };

        //print out randomizables
        for (int i = 0; i < randomizables.length; i++)
        {
            System.out.println(randomizables[i]);
        }
        System.out.println();

        //change the randomizables
        for (int i = 0; i < randomizables.length; i++)
        {
            randomizables[i].change();
        }
        System.out.println();

        //print out randomizables
        for (int i = 0; i < randomizables.length; i++)
        {
            System.out.println(randomizables[i]);
        }
    }

    public static void groupingByParent()
    {
        int[] nums = {1, 2, 3, 4, 5};

        //upcasting
        Object coin = new Coin(true, 50);

        //upcasting with an array
        Object[] things = {
                new Coin(true, 1),
                new Coin(false, 5),
                new Coin(true, 25),
                new Dice(6, Color.RED),
                "Hello world",
                new Dog("Mr", "Fuzzy", "Wuzzy", Color.BLACK)
        };

        for (int i = 0; i < things.length; i++)
        {
            System.out.println(things[i].toString());
        }
        System.out.println();
    }
}











