package introduction.animals;

import introduction.interfaces.Colorable;
import introduction.interfaces.Moveable;
import introduction.interfaces.Nameable;

import java.awt.*;
import java.awt.geom.Point2D;

public class Dog implements Nameable, Colorable, Moveable
{
    private String fName;
    private String lName;
    private String nName;
    private Color color;
    private double x, y;

    public Dog(String fName, String lName, String nName, Color color)
    {
        this.fName = fName;
        this.lName = lName;
        this.nName = nName;
        this.color = color;
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

    @Override
    public Color getColor()
    {
        return color;
    }

    @Override
    public Point2D getPosition()
    {
        return new Point2D.Double(x, y);
    }

    @Override
    public void moveTo(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
}
