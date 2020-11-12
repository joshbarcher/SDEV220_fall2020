package exercise;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MoviesLists
{
    public static void main(String[] args)
    {
        Set<String> charlesSet = new TreeSet<>(Set.of(
            "The Seven Samurai", "Reservoir Dogs", "Airplane!",
            "Pan's Labyrinth", "The Deer Hunter", "Up",
            "Rocky", "Memento", "Braveheart", "Seven"
        ));

        Set<String> beatriceSet = new TreeSet<>(Set.of(
            "Inception", "Die Hard", "Amadeus",
            "The Lord of the Rings: The Return of the King",
            "Up", "The Deer Hunter", "Rocky",
            "Wall-E", "Ghostbusters", "Angry Men"
        ));

        Set<String> collinSet = new TreeSet<>(Set.of(
            "Up", "Blazing Saddles", "Avatar",
            "Young Frankenstein", "The Deer Hunter",
            "The Lion King", "Wall-E", "Vertigo",
            "Ghostbusters", "Gladiator"
        ));

        //answer the questions here...
        beatriceSet.retainAll(collinSet);
        System.out.printf("Beatrice and Collin share %d movies", beatriceSet.size());

        beatriceSet.retainAll(charlesSet);
        System.out.println("Movies liked by everyone!");
        for (String movie : beatriceSet)
        {
            System.out.println(movie);
        }
    }
}





