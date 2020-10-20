package wrapper_classes;

public class TestWrappers
{
    public static void main(String[] args)
    {
        //primitive type
        int num = 10;

        //reference type
        Integer myInt = new Integer(10);
        System.out.println(myInt.intValue());

        Double myDouble = new Double(19.7444);
        System.out.println(myDouble.doubleValue());

        char letter = 'a';
        Character myLetterWrapper = new Character(letter);
    }
}
