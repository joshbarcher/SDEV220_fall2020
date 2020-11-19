package points;

import java.util.ArrayList;
import java.util.List;

public class CartesianPlane
{
    private List<Point> points;

    public CartesianPlane()
    {
        points = new ArrayList<>();
    }

    public void addOrigin()
    {
        //add the origin to the list of points
        points.add(new Point());
    }

    public void add(double x, double y)
    {
        Point addedPoint = new Point(x, y);
        points.add(addedPoint);
    }

    public void add(Point point)
    {
        points.add(point);
    }

    public void addAndAdjust(Point point, double dx, double dy)
    {
        //you can access the private fields and methods of the inner class
        point.adjust(dx, dy);
        /*point.x = 0;
        point.y = 0;*/

        points.add(point);
    }

    public void printPoints()
    {
        for (Point point : points)
        {
            System.out.println(point);
        }
    }

    public static class Point
    {
        private double x, y;

        public Point()
        {
            //set to the origin
            x = 0;
            y = 0;
        }

        public Point(double x, double y)
        {
            this.x = x;
            this.y = y;
        }

        private void adjust(double dx, double dy)
        {
            x += dx;
            y += dy;
        }

        public double getX()
        {
            return x;
        }

        public double getY()
        {
            return y;
        }

        @Override
        public String toString()
        {
            return "(" + x + ", " + y + ')';
        }
    }
}
