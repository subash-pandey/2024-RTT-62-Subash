package PA_303_7_1;

/*
Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
The numbers can be any integers.
Print out the value at the first index and the last index using length - 1 as the index.
 Now try printing the value at index = length (e.g., myArray[myArray.length] ).
Notice the type of exception which is produced. Now try to assign a value to the array index 5.
You should get the same type of exception.


 */

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = new Random().nextInt(100);
        }
        System.out.println("The first element is: " + intArray[0]);
        System.out.println("The last element is: " + intArray[intArray.length - 1]);
         //System.out.println( intArray[intArray.length]);  // ArrayIndexOutOfBoundsException
         // System.out.println( intArray[5]);  // ArrayIndexOutOfBoundsException
    }
}
