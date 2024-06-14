package PA_303_2_3;

/*
Write a program that declares an integer a variable x, assigns the value 2 to it,
 and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
  Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
   Before printing the results, write a comment with the predicted decimal value and binary string.
   Now, print out x in decimal form and in binary notation.

 */

/*
Write a program that declares a variable x, and assigns 150 to it,
 and prints out the binary string version of the number. Now use the right shift operator (>>) to shift by 2
 and assign the result to x. Write a comment indicating what you anticipate the decimal and binary values to be.
 Now print the value of x and the binary string.
 */

/*
Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
 Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
 Again repeat with Or operator.

 */

public class BitOperatorExample {
    public static void main(String[] args) {
        shiftOperatorLeft();
        System.out.println("-".repeat(45));
        shiftOperatorRight();
        System.out.println("-".repeat(45));
        andOperator();
        System.out.println("-".repeat(45));
        orOperator();

    }

    public static void shiftOperatorLeft(){
        Integer x = 2;
        System.out.println(Integer.toBinaryString(x));
        x=x<<1; // x =100 in binary or 4;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }

    public static void shiftOperatorRight(){
        Integer x = 57;
        System.out.println(Integer.toBinaryString(x));
        x=x>>2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }

    public static void andOperator(){
        int x = 7;
        System.out.println(Integer.toBinaryString(x));
        int y= 17;
        System.out.println(Integer.toBinaryString(y));
        int z= x&y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
    }

    public static void orOperator(){
        int x = 7;
        System.out.println(Integer.toBinaryString(x));
        int y= 17;
        System.out.println(Integer.toBinaryString(y));
        int z= x|y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
    }

}
