package ArrayPractice;

public class ArrayInsert {
    public static void main(String[] args) {

    }

    public int[] insert(int[] arr,int pos, int val) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = val;
        for (int i = pos ; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }
        return newArr;
    }



}
