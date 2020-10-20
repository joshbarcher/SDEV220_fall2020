package exercise;

public class TestPairs
{
    public static void main(String[] args)
    {
        Pair<Boolean, String> pair = new Pair<>(true, "awesome");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond().toUpperCase());
    }
}
