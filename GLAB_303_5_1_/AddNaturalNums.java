package glab_303_5_1;

public class AddNaturalNums {
    public static void main(String[] args) {
        int sum = 0;
        int n = 999;
        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum =sum+i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }
}
