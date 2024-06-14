package PA_303_7_1;

/*
Task 9:
Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
 Print the array in ascending order, and print the smallest and the largest element of the array.
 The output will look like the following:
Array in ascending order: 0, 1, 2, 4, 9, 13
The smallest number is 0
The biggest number is 13

 */

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] intArray ={4,2,9,13,1,0};
        for (int i = 0; i < intArray.length-1; i++) {
            for (int j =0; j < intArray.length-1-i; j++) {
                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array is: "+ Arrays.toString(intArray));
        System.out.println("The smallest element in the array is: "+intArray[0]);
        System.out.println("The largest element in the array is: "+intArray[5]);

    }
}
