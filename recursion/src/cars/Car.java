package cars;

public class Car
{
    private String type;
    private int year;

    public Car(String type, int year)
    {
        this.type = type;
        this.year = year;

        register();
    }

    private void register()
    {
        Registration reg = new Registration();
        reg.validate();
        Registry.submit(reg);
    }

    public void drive()
    {
        //do something...
    }
}

