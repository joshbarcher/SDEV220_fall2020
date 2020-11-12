package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FavoriteLanguages
{
    public static void main(String[] args)
    {
        //a map of languages and five star ratings
        Map<String, Integer> favLanguages = new TreeMap<>();

        //a person votes for C#!
        vote(favLanguages, "C#"); //Josh
        vote(favLanguages, "C++"); //Raju
        vote(favLanguages, "Java"); //Laura
        vote(favLanguages, "SQL"); //Renee
        vote(favLanguages, "Java"); //Mark
        vote(favLanguages, "Java"); //Adam
        vote(favLanguages, "Java"); //Regina
        vote(favLanguages, "Python"); //Allen
        vote(favLanguages, "Python"); //Jada

        for (String language : favLanguages.keySet())
        {
            System.out.println("Number of times " + language + " was voted for: " +
                    favLanguages.get(language));
        }
        System.out.println();

        for (String language : favLanguages.keySet())
        {
            System.out.println(language);
        }
        System.out.println();

        for (int votes : favLanguages.values())
        {
            System.out.println(votes);
        }
    }

    public static void vote(Map<String, Integer> histogram, String language)
    {
        if (!histogram.containsKey(language))
        {
            histogram.put(language, 1);
        }
        else
        {
            //if already present, then just increment
            int count = histogram.get(language);
            count++;
            histogram.put(language, count);
        }
    }
}
