package introduction;

public class MyProgram
{
    public static final int NUM_GREETINGS = 10;

    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
        System.out.println("How are you?");

        for (int i = 1; i <= NUM_GREETINGS; i++)
        {
            System.out.println("Good to meet you!");
        }
    }
}
