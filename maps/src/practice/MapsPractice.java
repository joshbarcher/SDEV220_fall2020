package practice;

import java.util.*;

public class MapsPractice
{
    public static void main(String[] args)
    {
        //we have to provide generics for both key & value
        Map<String, String> favFoods = new HashMap<>();

        //add the favorite food for everyone in class
        favFoods.put("josh", "Pizza");
        favFoods.put("laura", "Pizza");
        favFoods.put("cameron", "Pizza");
        favFoods.put("allen", "Short Ribs");
        favFoods.put("mark", "Yema");
        favFoods.put("patrick", "Pho");
        favFoods.put("renee", "Ribeye Steak");
        favFoods.put("aubrey", "Sushi");

        //print out keys
        Set<String> names = favFoods.keySet();
        for (String name : names)
        {
            System.out.println(name);
        }
        System.out.println();

        //print out values
        Collection<String> foods = favFoods.values();
        for (String food : foods)
        {
            System.out.println(food);
        }
        System.out.println();

        //print out unique food values
        Set<String> uniqueFoods = new TreeSet<>();
        for (String food : foods)
        {
            uniqueFoods.add(food);
        }

        for (String unique : uniqueFoods)
        {
            System.out.println(unique);
        }
    }

    private static void searching()
    {
        //we have to provide generics for both key & value
        Map<String, String> favFoods = new HashMap<>();

        //add the favorite food for everyone in class
        favFoods.put("josh", "Carne Asada");
        favFoods.put("laura", "Spaghetti");
        favFoods.put("cameron", "Pizza");
        favFoods.put("allen", "Short Ribs");
        favFoods.put("mark", "Yema");
        favFoods.put("patrick", "Pho");
        favFoods.put("renee", "Ribeye Steak");
        favFoods.put("aubrey", "Sushi");

        favFoods.put("josh", "Chicken Alfredo");
        favFoods.put("josh", "Pizza");

        //write a program that allows a user to look up people's fav foods
        boolean done = false;
        while (!done)
        {
            String name = Console.readString("Enter a name: ");
            name = name.toLowerCase(); //make the search case-insensitive

            //print out the user's favorite food if they are in the map,
            //otherwise print an error message
            if (favFoods.containsKey(name))
            {
                System.out.printf("Favorite food for %s is %s%n", name,
                        favFoods.get(name));
            }
            else
            {
                System.out.println("Name not found in favorite food table...");
            }

            done = Console.readBoolean("Done?");
        }
    }

    private static void intro()
    {
        //we have to provide generics for both key & value
        Map<String, String> favFoods = new HashMap<>();

        //add the favorite food for everyone in class
        favFoods.put("Josh", "Carne Asada");
        favFoods.put("Laura", "Spaghetti");
        favFoods.put("Cameron", "Pizza");
        favFoods.put("Allen", "Short Ribs");
        favFoods.put("Mark", "Yema");
        favFoods.put("Patrick", "Pho");
        favFoods.put("Renee", "Ribeye Steak");
        favFoods.put("Aubrey", "Sushi");

        //getting a VALUE in the map using a KEY
        String food = favFoods.get("Mark");
        System.out.printf("Mark's fav food is %s%n", food);

        food = favFoods.get("Patrick");
        System.out.printf("Patrick's fav food is %s%n", food);

        food = favFoods.get("Ibby");
        System.out.printf("Ibby's fav food is %s%n", food);
    }
}










