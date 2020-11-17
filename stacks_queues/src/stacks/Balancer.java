package stacks;

import java.util.List;
import java.util.Stack;

public class Balancer
{
    /**
     * This program balances the braces for mathematical expressions.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("Is valid? " + valid("[[2 + 7] - 9)]")); //false
        System.out.println("Is valid? " + valid("([13 + 1] - 2)")); //true
        System.out.println("Is valid? " + valid("(([13 + 1] - 2)")); //false
    }

    private static boolean valid(String expression)
    {
        List<Character> braces = List.of('[', ']', '(', ')', '{', '}');
        Stack<Character> balancer = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            //only consider brace characters
            char current = expression.charAt(i);
            if (braces.contains(current)) {
                //if an opening brace, add to stack
                if (current == '[' || current == '{' || current == '(') {
                    balancer.push(current);
                }
                //if a closing brace, find a match with the top of the stack
                else if (current == ']' && balancer.peek() == '[' ||
                        current == '}' && balancer.peek() == '{' ||
                        current == ')' && balancer.peek() == '(') {
                    balancer.pop();
                } else {
                    //something didn't match
                    return false;
                }
            }
        }

        /*if (balancer.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }*/

        return balancer.isEmpty();
    }
}










