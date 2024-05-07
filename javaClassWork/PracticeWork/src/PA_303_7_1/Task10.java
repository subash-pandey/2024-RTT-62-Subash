package PA_303_7_1;

/*
Task 11: Write some Java code that asks the user how many favorite things they have.
Based on their answer, you should create a String array of the correct size.
Then ask the user to enter the things and store them in the array you created.
Finally, print out the contents of the array.

 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many favorite things do you have? Please input a number.");
        int n = sc.nextInt();
        String[] things = new String[n];
        for (int pos = 0; pos < n; pos++) {
            System.out.print("Enter your thing: ");
            things[pos] = sc.next();
        }
        System.out.println("Your favorite things are: ");
        for(String thing : things) {
            System.out.print(thing+" ");
        }


    }
}
