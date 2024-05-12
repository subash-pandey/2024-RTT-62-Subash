package GLAB_303_10_4;

public class Circle extends Shape implements Movable {

    protected double radius;
    private int x,y;
    public final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUP() {
        y++;

    }

    @Override
    public void moveDOWN() {
        y--;

    }

    @Override
    public void moveLEFT() {
        x--;

    }

    @Override
    public void moveRIGHT() {
        x++;

    }

    @Override
    public String getCoordinates() {
        return " (" + x + ", " + y + ")";
    }

    @Override
    public double getArea() {
       return PI * radius * radius;
    }
}
