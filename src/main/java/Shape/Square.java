package Shape;

import Turtle.Turtle;

import java.awt.*;

public class Square extends Shape {

    private int sideLength;

    public Square(Turtle turtle, Point location, Color color, int border, int sideLength) {
        super(turtle, location, color, border);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public void paint() {

        //setting turtle properties
        getTurtle().setColor(getColor());
        getTurtle().setPenWidth(getBorder());

        //making sure to move to start and not draw
        getTurtle().penUp();
        getTurtle().goTo(getLocation().x, getLocation().y);

        //Turtle starts here
        getTurtle().penDown();

    }
}
