package classes;

import java.util.Random;

/**
 * This class represents a tasty donut.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Donut
{
    private boolean tasty;
    private String flavor;
    private boolean filled;
    private Random random;

    /**
     * Creates a new not-tasty bismark donut.
     */
    public Donut()
    {
        tasty = false;
        flavor = "Bismark";
        filled = true;
    }

    /**
     * This creates a new donut with the input attributes.
     *
     * @param tasty true if the donut is tasty, otherwise false
     * @param flavor the flavor of the donut
     * @param filled true if the donut is filled, otherwise false
     */
    public Donut(boolean tasty, String flavor, boolean filled)
    {
        this.tasty = tasty;
        this.flavor = flavor;
        this.filled = filled;
    }

    //getters (accessors)

    /**
     * Determines if the donut is tasty
     * @return true if tasty, otherwise false
     */
    public boolean isTasty()
    {
        return tasty;
    }

    /**
     * Returns the flavor of the donut
     * @return the flavor of the donut
     */
    public String getFlavor()
    {
        return flavor;
    }

    /**
     * Determines if the donut is filled
     * @return true if filled, or otherwise false
     */
    public boolean isFilled()
    {
        return filled;
    }

    //setters (mutators)

    /**
     * Changes whether the donut is tasty or not
     * @param tasty the new tasty status
     */
    public void setTasty(boolean tasty)
    {
        this.tasty = tasty;
    }

    /**
     * Changes the flavor of the donut
     * @param flavor the new flavor
     */
    public void setFlavor(String flavor)
    {
        //ignore bad flavors...
        if (!flavor.equals(""))
        {
            this.flavor = flavor;
        }
    }

    /**
     * Changes whether the donut is filled or not
     * @param filled the new filled status
     */
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    /**
     * Generates a string representation of a donut.
     *
     * @return a string representation of a donut
     */
    @Override
    public String toString()
    {
        //the ?: operator (ternary operator)
        String tastyString = tasty ? "tasty " : "";

        String output = "A " + tastyString + flavor + " donut";
        return output;
    }
}










