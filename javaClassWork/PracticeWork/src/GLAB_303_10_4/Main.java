package GLAB_303_10_4;



public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0,0,0);
        System.out.println(circle.toString());
        System.out.println("Area of the circle is "+circle.getArea());
        System.out.println("Coordinates of the circle is "+circle.getCoordinates());
        circle.moveUP();
        circle.moveUP();
        circle.moveRIGHT();
        circle.moveRIGHT();
        circle.moveRIGHT();
        circle.moveLEFT();
        circle.moveLEFT();
        circle.moveDOWN();
        System.out.println("The coordinates of the circle is "+circle.getCoordinates());
    }
}
