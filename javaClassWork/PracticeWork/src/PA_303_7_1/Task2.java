package PA_303_7_1;

/*
Task 2: Write a program that returns the middle element in an array.
Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
 */

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {13, 5, 7, 68, 2};
        System.out.println("The middle element is " + intArray[(intArray.length / 2)]);
    }
}
