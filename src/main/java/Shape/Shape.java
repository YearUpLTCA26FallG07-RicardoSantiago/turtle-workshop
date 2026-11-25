package Shape;

import Turtle.Turtle;

import java.awt.*;

public abstract class Shape {

    //importing the turtle paint
    private Turtle turtle;
    private Point location;
    private Color color;
    private int border;

    public Shape (Turtle turtle, Point location, Color color, int border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public Point getLocation() {
        return location;
    }

    public Color getColor() {
        return color;
    }

    public int getBorder() {
        return border;
    }
    //Parent method to pass to child classes to draw
    public abstract void paint();
}
