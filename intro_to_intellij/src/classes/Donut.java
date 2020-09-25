package classes;

public class Donut
{
    private boolean tasty;
    private String flavor;
    private boolean filled;

    //default constructor...
    public Donut()
    {
        tasty = false;
        flavor = "Bismark";
        filled = true;
    }

    //parameterized constructor...
    public Donut(boolean tasty, String flavor, boolean filled)
    {
        this.tasty = tasty;
        this.flavor = flavor;
        this.filled = filled;
    }

    //getters (accessors)
    public boolean isTasty()
    {
        return tasty;
    }

    public String getFlavor()
    {
        return flavor;
    }

    public boolean isFilled()
    {
        return filled;
    }

    //setters (mutators)
    public void setTasty(boolean tasty)
    {
        this.tasty = tasty;
    }

    public void setFlavor(String flavor)
    {
        //ignore bad flavors...
        if (!flavor.equals(""))
        {
            this.flavor = flavor;
        }
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    @Override
    public String toString()
    {
        String tastyString = tasty ? "tasty " : "";

        String output = "A " + tastyString + flavor + " donut";
        return output;
    }
}










