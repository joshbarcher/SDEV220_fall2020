package cars;

public class Registration
{
    private String[] fields;
    private Object[] values;

    //constructors

    public void validate()
    {
        for (int i = 0; i < fields.length; i++)
        {
            if (empty(fields[i], values[i]))
            {
                //do something...
            }
        }
    }

    private boolean empty(String field, Object value)
    {
        //do something...
        return true;
    }
}

