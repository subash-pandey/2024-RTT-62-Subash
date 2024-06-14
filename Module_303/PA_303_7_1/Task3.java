package PA_303_7_1;
/*
Task 3: Write a program that creates an array of String type and
initializes it with the strings “red,” “green,” “blue,” and “yellow.”
Print out the array length. Make a copy using the clone( ) method.
Use the Arrays.toString( ) method on the new array to verify that the original array was copied.

 */


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] strArray = {"red", "green", "blue", "yellow"};
        System.out.println("The length of the array is: " + strArray.length);
        String[] copyArray = Arrays.copyOf(strArray, strArray.length);
        System.out.println("Copied Array is :"+Arrays.toString(copyArray));

    }
}
