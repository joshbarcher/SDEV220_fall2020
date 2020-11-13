package stacks;

import java.util.Stack;

public class StacksPractice
{
    public static void main(String[] args)
    {
        Stack<String> todos = new Stack<>();

        //add some things that I want to do later
        todos.push("Install Smart Light Switch");
        todos.push("Install Smart Thermostat");
        todos.push("Install Smart Vents");

        //view my next item to do
        System.out.println("Next thing to do: " + todos.peek());

        //take care of a task
        System.out.println("Finished: " + todos.pop());

        //view my next item to do
        System.out.println("Next thing to do: " + todos.peek());
        System.out.println();

        todos.push("Install Smart Magic Mirror");
        todos.push("Install Smart Camera");
        todos.push("Install Smart Security Sensors");

        //how many tasks do I have left?
        System.out.println("Tasks left: " + todos.size());
        System.out.println("Am I done yet? " + todos.isEmpty());
        System.out.println();

        //complete the remainder of our tasks
        while (!todos.isEmpty())
        {
            System.out.println("Finished: " + todos.pop());
        }
        System.out.println("Am I done yet? " + todos.isEmpty());
    }
}
