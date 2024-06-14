package PA_303_2_3;

/*
Write a program that declares an integer variable, assigns a number,
and uses a postfix increment operator to increase the value.
Print the value before and after the increment operator.

 */


public class Increment {
    public static void main(String[] args) {
        int x = 25;
        System.out.println("Value before increment = "+x);
        x++;
        System.out.println("Value after increment = "+x);

    }
}
