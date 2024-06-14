package PA_303_7_1;
/*
Task 1: Write a program that creates an array of integers with a length of 3.
 Assign the values 1, 2, and 3 to the indexes. Print out each array element.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        for(int num : intArray) {
            System.out.println(num);
        }

    }
}
