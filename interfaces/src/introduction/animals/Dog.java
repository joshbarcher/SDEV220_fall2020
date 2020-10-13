package introduction.animals;

import introduction.interfaces.Nameable;

public class Dog implements Nameable
{
    private String fName;
    private String lName;
    private String nName;

    public Dog(String fName, String lName, String nName)
    {
        this.fName = fName;
        this.lName = lName;
        this.nName = nName;
    }

    @Override
    public String getFirstName()
    {
        return fName;
    }

    @Override
    public String getLastName()
    {
        return lName;
    }

    @Override
    public String getNickName()
    {
        return nName;
    }
}
