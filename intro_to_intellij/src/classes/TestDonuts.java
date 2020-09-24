package classes;

public class TestDonuts
{
    public static void main(String[] args)
    {
        //instantiate some donuts
        Donut donut = new Donut();
        System.out.println(donut);

        Donut anotherDonut = new Donut(true, "Custard Filled", true);
        System.out.println(anotherDonut);

        Donut oneLastDonut = new Donut(true, "Maple", false);
        System.out.println(oneLastDonut);
    }
}
