package glab_303_5_2;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        int sum = 0;
        boolean  flag = true;
        while(flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the sentinel value");
            int sentinel = sc.nextInt();
            if(sentinel == 0){
               flag = false;
               System.out.println("The sentinel value is zero time to end the summation");
                System.out.println("The summation is " + sum);
               break;

            }
            sum =sum + sentinel;
            System.out.println("The sum  till now is: " + sum);

        }


    }
}
