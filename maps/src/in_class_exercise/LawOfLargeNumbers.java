package in_class_exercise;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class LawOfLargeNumbers
{
    public static void main(String[] args)
    {
        //random object for dice rolls, frequency map
        //for types of roll results
        Random random = new Random();
        Map<Integer, Integer> rolls = new TreeMap<>();

        for (int i = 1; i <= 100000; i++)
        {
            //roll the dice
            int roll = random.nextInt(6) + 1; //number in [1, 6]

            //record the result
            if (!rolls.containsKey(roll))
            {
                rolls.put(roll, 1);
            }
            else
            {
                //get previous rolls
                int oldCount = rolls.get(roll);
                int newCount = oldCount + 1;
                rolls.put(roll, newCount);
            }
        }

        //print out my results
        for (int sides : rolls.keySet())
        {
            System.out.printf("%d came up %d times%n",
                              sides, rolls.get(sides));
        }
    }
}










