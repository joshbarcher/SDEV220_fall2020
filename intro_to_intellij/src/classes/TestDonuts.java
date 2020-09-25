package classes;

public class TestDonuts
{
    public static void main(String[] args)
    {
        //instantiate some donuts
        Donut donut = new Donut();
        System.out.println(donut.toString());

        Donut anotherDonut = new Donut(true, "Custard Filled", true);
        System.out.println(anotherDonut.toString());

        Donut oneLastDonut = new Donut(true, "Maple", false);
        System.out.println(oneLastDonut.toString());

        //test our getters
        System.out.println(anotherDonut.isFilled());

        if (!anotherDonut.isFilled())
        {
            System.out.println("No, the donut is not filled!");
        }

        System.out.println(anotherDonut.getFlavor());
        anotherDonut.setFlavor("");
        System.out.println(anotherDonut.getFlavor());
        anotherDonut.setFlavor("Sprinkled");
        System.out.println(anotherDonut.getFlavor());
    }
}
