package practice;

import java.util.Random;

public class DiceGame
{
    private static Random random = new Random();
    private static int num;

    public static void main(String[] args)
    {
        System.out.println("Rolling fair die 10 times");
        System.out.println("*************************");
        for (int i = 1; i <= 10; i++)
        {
            if (random.nextBoolean())
            {
                System.out.println("Rolled a 1");
            }
            else
            {
                System.out.println("Rolled a " + nextInt(2, 6));
            }
        }
    }

    public static int nextInt(int low, int high)
    {
        return low + random.nextInt(high - low + 1);
    }
}
