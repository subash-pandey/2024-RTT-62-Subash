package PA_303_7_1;

/*
Task 8: Write a program that creates a String array of 5 elements and
swaps the first element with the middle element without creating a new array.
 */

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String[] strArray ={"red","green","blue","yellow","orange"};
        System.out.println("The array before swapping is "+ Arrays.toString(strArray));
        String temp ="";
        temp = strArray[0];
        strArray[0] = strArray[2];
        strArray[2] = temp;
        System.out.println("The array after swapping is "+ Arrays.toString(strArray));

    }
}
