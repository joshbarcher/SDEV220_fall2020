package recursion;

import java.util.Random;

public class RecursionPractice
{
    private static int methodCount = 0;

    public static void main(String[] args)
    {
        //call the recursive method
        //foo();

        //test our print method
        //printDownToOne(4);

        //text our sum method
        int result = sum(3); //6
        System.out.println(result);
    }

    public static int sum(int num)
    {
        //base case
        if (num == 1)
        {
            return 1;
        }
        else
        {
            int sumSoFar = sum(num - 1) + num;
            return sumSoFar;
        }
    }

    public static void printDownToOne(int num)
    {
        //base case!
        if (num == 1)
        {
            System.out.println(num);
            //then exit...
        }
        else
        {
            //then recurse
            printDownToOne(num - 1);

            //print the number
            System.out.println(num);
        }
    }

    //a recursive method!
    public static void foo()
    {
        methodCount++;
        System.out.println(methodCount);

        //invoke the method within itself
        foo();
    }
}
