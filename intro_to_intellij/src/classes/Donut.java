package classes;

public class Donut
{
    private boolean tasty;
    private String flavor;
    private boolean filled;

    //default constructor...
    public Donut()
    {
        tasty = true;
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
}
