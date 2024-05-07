package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInsert {


    public static void main(String[] args) {

        // original array
        // pos   01234
        // value 12345

        int[] array = {1, 2, 3, 4, 5};
        int[] insertedArray = insert(array,0,5);
        System.out.println("Array inserted: " + Arrays.toString(insertedArray));
        int[]  deletedArray =delete(insertedArray,2);
        System.out.println("Array with deleted element: " + Arrays.toString(deletedArray));



        // array after inserting
        // pos   012345
        // value 129345

        // lets write some code to insert a 9 into the array at position 2
        // 1) create a new array of size + 1int[] insert = new int[array.length + 1];


        // this is an example of abstraction because we dont care how the array list manages the array and memory
        // we only care that we can insert an item at position 0 after the list has been filled.

    }
    
    public static int[] insert(int[] array,int insertPosition, int value) {
        // let's write some code to insert a 9 into the array at position 2
        // 1) create a new array of size + 1
        int[] result = new int[array.length + 1];

        // 2) copy the first part of the array (before position 2) from the old to the new
      
        for (int pos = 0; pos <insertPosition; pos++) {
            result[pos] = array[pos];
        }

        // 3) actually insert the value we want in position 2
        result[insertPosition] = value;

        // 4) copy over the rest of the array
        for (int pos = insertPosition; pos < array.length; pos++) {
            result[pos + 1] = array[pos];
        }
        return result;

    }
    public static int[] delete(int[] sourceArray, int deletePosition) {
        int[] result = new int[sourceArray.length - 1];
        for(int pos = 0; pos < deletePosition; pos++) {
            result[pos] = sourceArray[pos];
        }
        for (int pos = deletePosition + 1; pos < sourceArray.length; pos++) {
            result[pos-1] = sourceArray[pos];
        }
        return result;

    }

}
