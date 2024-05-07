package ArrayPractice;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        double[] dArray = new double[10];
        dArray[0] = 1;
        dArray[1] = 2;
        System.out.println(Arrays.toString(dArray));

        String[] strArray = {"Aarush", "Rojina", "Subash"};
        for (String s : strArray) {
            System.out.println(s);
        }

        int intArray[] = new int[10];
        char[] charArray = new char[10];
        System.out.println(Arrays.toString(charArray));

        int[] intArray2 = {1, 2, 3, 4, 5};

        //intArray2[2] = 6;

        int[] intArray3 = new int[intArray2.length + 1];
        for (int i = 0; i < 2; i++) {
            intArray3[i] = intArray2[i];
        }
        intArray3[2] = 9;
        for (int i = 2; i < intArray2.length; i++) {
            intArray3[i + 1] = intArray2[i];
        }
        System.out.println(Arrays.toString(intArray3));

    }


}
