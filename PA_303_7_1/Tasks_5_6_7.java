package PA_303_7_1;

/*
Task 5: Write a program where you create an integer array with a length of 5.
Loop through the array and assign the value of the loop control variable (e.g., i)
to the corresponding index in the array.

Task 6: Write a program where you create an integer array of 5 numbers.
Loop through the array and assign the value of the loop control variable multiplied by 2
to the corresponding index in the array.

Task 7: Write a program where you create an array of 5 elements.
Loop through the array and print the value of each element, except for the middle (index 2) element.
 */

import java.util.Arrays;
import java.util.Random;

public class Tasks_5_6_7 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        for (int pos = 0; pos < intArray.length; pos++) {
            intArray[pos] = pos;
        }
        System.out.println("The array is: "+ Arrays.toString(intArray));
         int[] intArray2 = new int[5];
         for (int pos = 0; pos < intArray2.length; pos++) {
             intArray2[pos] = 2*pos;
         }
        System.out.println("The array is: "+ Arrays.toString(intArray2));
        System.out.println();
        System.out.println();

         int[] intArray3 = new int[5];
        for (int pos = 0; pos < intArray3.length; pos++) {
            intArray3[pos] = new Random().nextInt(100);
            if(pos==2){
                continue;
            }else{
                System.out.printf("%d is the %d element of the array %n", intArray3[pos],pos);
            }
        }

    }
}
