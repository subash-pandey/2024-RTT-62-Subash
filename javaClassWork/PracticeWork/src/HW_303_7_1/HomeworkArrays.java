package HW_303_7_1;

import java.util.Arrays;
import java.util.Random;

public class HomeworkArrays {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int[] arr = new int[10];
        // Used only one for loop.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            sum = sum + arr[i];
        }
        System.out.println("Array generated is: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("The smallest element is: " + arr[0]);
        System.out.println("The largest element is: " + arr[arr.length - 1]);
        double avg = (double) sum / arr.length;
        System.out.println("The average is: " + avg);
    }
}
