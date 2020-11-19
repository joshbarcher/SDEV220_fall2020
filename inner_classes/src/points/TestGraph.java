package points;

public class TestGraph
{
    public static void main(String[] args)
    {
        CartesianPlane graph = new CartesianPlane();

        //practice adding some points
        graph.addOrigin();
        graph.add(10, 20);
        graph.add(-3, 10);
        graph.add(new CartesianPlane.Point());

        //print them out
        graph.printPoints();
    }
}
