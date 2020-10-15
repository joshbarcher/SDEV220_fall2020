package grouping.things;

import grouping.shared_types.Randomizable;

import java.awt.*;
import java.util.Random;

public class Dice implements Randomizable
{
    private int sides;
    private Color color;
    private int sideUp;

    public Dice(int sides, Color color)
    {
        this.sides = sides;
        this.color = color;
        sideUp = 1;
    }

    @Override
    public void change()
    {
        Random random = new Random();
        sideUp = random.nextInt(sides) + 1; //numbers in [1, sides]
    }

    @Override
    public String toString()
    {
        return sides + " sided dice - " + sideUp;
    }
}

