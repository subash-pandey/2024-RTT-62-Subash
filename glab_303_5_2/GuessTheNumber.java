package glab_303_5_2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    static Random random = new Random();
    public static void main(String[] args) {
        int theChosenNumber =random.nextInt(1,101);
        boolean flag = false;

        while(!flag) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 100: ");
            int num = input.nextInt();
            if(theChosenNumber == num) {
                flag = true;
                System.out.println("You guessed the number " + theChosenNumber + ".");
            }else{
                if(theChosenNumber > num) {
                    System.out.println("Go Higher");
                } else if(theChosenNumber < num) {
                    System.out.println("Go Lower");
                }
            }
        }

    }
}
