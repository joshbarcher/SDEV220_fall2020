package practice;

import java.util.Random;

public class NotSoRandom
{
    private static Random random = new Random();

    public static void main(String[] args)
    {
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(nextInt(3, 10));
        }
    }

    public static int nextInt(int low, int high)
    {
        return low + random.nextInt(high - low + 1);
    }

    private static void notRandom()
    {
        //create a new Random object with a certain seed
        int seed = 1997;
        Random random = new Random(seed);

        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(100));
    }
}
