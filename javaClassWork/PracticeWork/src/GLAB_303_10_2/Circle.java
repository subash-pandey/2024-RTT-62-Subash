package GLAB_303_10_2;

public class Circle extends Shape{
    double radius;
    protected final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }

    public Circle(double v, int i, int i1) {
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {

        return "Circle[ radius = " + radius + super.toString() + "]";
    }

    @Override
    public void displayName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }
}
