package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FavoriteLanguages
{
    public static void main(String[] args)
    {
        //a map of languages and five star ratings
        Map<String, Integer> languages = new TreeMap<>();

        //add some languages
        languages.put("C#", 5);
        languages.put("PHP", 1);
        languages.put("Java", 5);
        languages.put("Javascript", 4);
        languages.put("Ruby", 2);


    }
}
