package introduction.animals;

import introduction.interfaces.Nameable;

public class TestAnimals
{
    public static void main(String[] args)
    {
        Nameable fluffy = new Dog("Mr.", "Fluffy", "Fluffers");
        System.out.println(fluffy.getNickName());
    }
}
