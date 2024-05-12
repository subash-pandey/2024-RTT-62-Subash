package GLAB_303_10_2;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area = "+c.getArea());

        Shape shape = new Shape();
        shape.displayName();
        System.out.println("shape instance of Shape? "+(shape instanceof Shape));

        System.out.println("+".repeat(20));
        Shape shapeCircle = new Circle(100);  // UpCasting
        shapeCircle.displayName();
        System.out.println("Area of Circle " + shapeCircle.getArea());
        System.out.println(shapeCircle);  // Run circle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeCircle instanceof Circle); // true
        System.out.println(shape instanceof Circle); // false because Shape is not a Circle

        System.out.println("--------------------");
        Shape shapeRectangle = new Rectangle("Red"); //UpCasting
        shapeRectangle.displayName();
        shapeRectangle.setHeight(2);
        shapeRectangle.setWidth(2);
        System.out.println("Area of Rectangle is " + shapeRectangle.getArea());
        System.out.println(shapeRectangle);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeRectangle instanceof Rectangle); // true
        System.out.println(shape instanceof Rectangle);// false because Shape is not a Rectangle

        Circle circle = new Cylinder(10,34);// Upcasting
        Cylinder cylinder = (Cylinder) circle; //Downcasting
        System.out.println("Volume of Cylinder " + cylinder.getVolume());







    }
}
