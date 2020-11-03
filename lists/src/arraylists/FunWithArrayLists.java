package arraylists;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FunWithArrayLists
{
    public static void main(String[] args)
    {
        List<Integer> numsList = new LinkedList<>();

        //put the numbers 1, 2, 3, ... , 10 into the list
        for (int i = 1; i <= 1000000; i++)
        {
            numsList.add(i);
        }

        for (int i = numsList.size() - 1; i >= 0; i--)
        {
            numsList.remove(i);
        }

        System.out.println(numsList.size());
        System.out.println(numsList.isEmpty());
    }

    private static void removing()
    {
        ArrayList<String> listOfBooks = new ArrayList<>();

        //add books to our list
        listOfBooks.add("The Hunger Games");
        listOfBooks.add("A Song of Ice and Fire");
        listOfBooks.add("Wheel of Time");
        listOfBooks.add("Percy Jackson");
        listOfBooks.add("Azure Bonds");

        System.out.println(listOfBooks.remove("A Song of Ice and Fire"));
        System.out.println(listOfBooks.remove("A Song of Ice and Fire"));

        System.out.println(listOfBooks.remove(2)); //what element will be removed here?
        System.out.println();

        //loop over and see if the element was removed
        for (String book : listOfBooks)
        {
            System.out.println(book);
        }
        System.out.println();

        listOfBooks.clear();
        System.out.println(listOfBooks.size());
    }

    private static void searching()
    {
        ArrayList<String> listOfBooks = new ArrayList<>();

        //add books to our list
        listOfBooks.add("The Hunger Games");
        listOfBooks.add("A Song of Ice and Fire");
        listOfBooks.add("Wheel of Time");
        listOfBooks.add("Percy Jackson");
        listOfBooks.add("Azure Bonds");

        System.out.println(listOfBooks.contains("A Song of Ice and Fire"));
        System.out.println(listOfBooks.indexOf("A Song of Ice and Fire"));
        System.out.println();

        System.out.println(listOfBooks.contains("Wheel of Time"));
        System.out.println(listOfBooks.indexOf("Wheel of Time"));
    }

    private static void addingLotsOfValues()
    {
        ArrayList<Integer> nums = new ArrayList<>();

        //add 1,000,000 numbers
        System.out.println("Starting to add...");
        for (int i = 1; i <= 10000000; i++)
        {
            nums.add(0, i);
        }
        System.out.println("All done!");

        System.out.println("Size: " + nums.size());

        /*for (int i = 0; i < nums.size(); i++)
        {
            System.out.println(nums.get(i));
        }*/
    }

    private static void exampleWithComplexObject()
    {
        ArrayList<Color> colors = new ArrayList<>();

        //add a few colors
        colors.add(Color.BLUE);
        colors.add(Color.PINK);
        colors.add(Color.GREEN);
        colors.add(Color.GRAY);
        colors.add(new Color(50, 0, 50));

        for (int i = 0; i < colors.size(); i++)
        {
            Color darker = colors.get(i).darker();
            System.out.println(darker);
        }
    }

    private static void exampleWithStrings()
    {
        ArrayList<String> listOfBooks = new ArrayList<>();

        System.out.println(listOfBooks.size());
        System.out.println(listOfBooks.isEmpty());
        System.out.println();

        //add books to our list
        listOfBooks.add("The Hunger Games");
        listOfBooks.add("A Song of Ice and Fire");
        listOfBooks.add("Wheel of Time");
        listOfBooks.add("Percy Jackson");
        listOfBooks.add("Azure Bonds");

        System.out.println(listOfBooks.size());
        System.out.println(listOfBooks.isEmpty());
        System.out.println();

        listOfBooks.add("Malazan Tale of the Fallen");
        listOfBooks.add("Educated");
        listOfBooks.add("Artemis Fowl");

        System.out.println(listOfBooks.size());
        System.out.println(listOfBooks.isEmpty());
        System.out.println();

        //loop over an ArrayList (slightly different from array)
        for (int i = 0; i < listOfBooks.size(); i++)
        {
            System.out.println(listOfBooks.get(i));
        }
    }
}












