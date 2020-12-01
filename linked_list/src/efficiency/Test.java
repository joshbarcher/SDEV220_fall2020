package efficiency;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        List<Integer> listOfNums = new LinkedList<>();

        System.out.println("Created list");

        //add a bunch of numbers
        for (int i = 1; i <= 1000000; i++)
        {
            listOfNums.add(i);
        }

        System.out.println("Added one million numbers");

        long sum = 0;
        for (int i = 0; i < listOfNums.size(); i++)
        {
            int num = listOfNums.get(i);

            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}
