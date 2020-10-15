package introduction.animals;

import introduction.interfaces.Colorable;
import introduction.interfaces.Moveable;
import introduction.interfaces.Nameable;

import java.awt.*;

public class TestAnimals
{
    public static void main(String[] args)
    {
        Dog fluffy = new Dog("Mr.", "Fluffy", "Fluffers", Color.GRAY);
        System.out.println(fluffy.getNickName());
    }
}
