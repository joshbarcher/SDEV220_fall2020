package grouping.things;

import grouping.shared_types.Burnable;

public class Ladder implements Burnable
{
    private int rungs;
    private boolean burnt = false;

    public Ladder(int rungs)
    {
        this.rungs = rungs;
    }

    @Override
    public void burn()
    {
        burnt = true;
    }

    @Override
    public String toString()
    {
        String burned = burnt ? "(burned)" : "safe";
        return "A " + burned + " ladder with " + rungs + " rungs";
    }
}
