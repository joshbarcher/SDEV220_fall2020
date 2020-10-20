package messages;

import wrapper_classes.Car;

public class TestMessages
{
    public static void main(String[] args)
    {
        Message<String> stringMessage = new Message<String>("bob", "josh", "hello, world!");

        //this line of code will be changed by the compiler to...
        //Message<Integer> numberMessage = new Message<Integer>("sally", "josh", new Integer(42));
        Message<Integer> numberMessage = new Message<Integer>("sally", "josh", 42);
        Message<Double> doubleMessage = new Message<Double>("tim", "josh", 17.11111);

        Message<Character> charMessage = new Message<>("billie", "josh", 'b');

        //this line of code will be changed by the compiler to...
        //int number = numberMessage.getValue().intValue();
        int number = numberMessage.getValue();

        System.out.println(stringMessage.getValue().toUpperCase());
        System.out.println(numberMessage.getValue().intValue());
        System.out.println(doubleMessage.getValue().doubleValue());

        //will this work?
        //Object myObject = true;
        Object myObject = new Boolean(true);

        awesomeMethod("hello");
        Car car = new Car();
        awesomeMethod(car);

        //is this possible?
        awesomeMethod(10);
    }

    //this method can accept any type of value in a Java program,
    //both primitives and objects...
    public static void awesomeMethod(Object object)
    {
        System.out.println(object.toString());
    }
}














