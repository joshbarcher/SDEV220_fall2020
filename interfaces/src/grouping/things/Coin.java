package grouping.things;

import grouping.shared_types.Randomizable;
import grouping.shared_types.Valuable;

import java.util.Random;

public class Coin implements Randomizable, Valuable
{
    //true = heads up, false = tails up
    private boolean orientation;
    private double value;

    public Coin(boolean orientation, double value)
    {
        this.orientation = orientation;
        this.value = value;
    }

    @Override
    public void change()
    {
        Random random = new Random();
        orientation = random.nextBoolean(); //set a pseudorandom true or false
    }

    @Override
    public double calculateValue()
    {
        return value;
    }

    @Override
    public String toString() {
        String orient = orientation ? "heads" : "tails";
        return "Coin (" + value  + ") - " + orient;
    }
}

