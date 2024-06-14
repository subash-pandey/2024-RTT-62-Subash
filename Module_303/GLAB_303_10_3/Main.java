package GLAB_303_10_3;

import GLAB_303_10_2.Cylinder;

public class Main {
    public static void main(String[] args) {



        System.out.println("+".repeat(20));
        Shape shapeCircle = new Circle(100);  // UpCasting
        shapeCircle.displayName();
        System.out.println("Area of Circle " + shapeCircle.getArea());
        System.out.println(shapeCircle);  // Run circle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeCircle instanceof Circle); // true


        System.out.println("--------------------");
        Shape shapeRectangle = new Rectangle("Red"); //UpCasting
        shapeRectangle.displayName();
        shapeRectangle.setHeight(2);
        shapeRectangle.setWidth(2);
        System.out.println("Area of Rectangle is " + shapeRectangle.getArea());
        System.out.println(shapeRectangle);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeRectangle instanceof Rectangle); // true









    }
}
