package introduction.interfaces;

import java.awt.geom.Point2D;

public interface Moveable
{
    Point2D getPosition();
    void moveTo(double x, double y);
}
