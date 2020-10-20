package messages;

//T is a placeholder for the type of value
//that will be stored in a Message object
//(this type will change)
public class Message<T>
{
    private String recipient;
    private String sender;
    private T value;

    public Message(String recipient, String sender, T value)
    {
        this.recipient = recipient;
        this.sender = sender;
        this.value = value;
    }

    public String getRecipient()
    {
        return recipient;
    }

    public String getSender()
    {
        return sender;
    }

    public T getValue()
    {
        return value;
    }
}










