package PA_303_4_1;

import java.util.Scanner;

/*
6. Write a program that accepts an integer between 1 and 7 from the user.
Use a switch statement to print out the corresponding weekday.
Print “Out of range” if the number is less than 1 or greater than 7.
 Do not forget to include “break” statements in each of your cases.
 */
public class SwitchCasePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  between 1 and 7: ");
        int number = sc.nextInt();
        switch (number) {
            case 1 -> System.out.println(number + "= Sunday");
            case 2 -> System.out.println(number + "= Monday");
            case 3 -> System.out.println(number + "= Tuesday");
            case 4 -> System.out.println(number + "= Wednesday");
            case 5 -> System.out.println(number + "= Thursday");
            case 6 -> System.out.println(number + "= Friday");
            case 7 -> System.out.println(number + "= Saturday");
            default -> System.out.println(number + " is not a valid number.");
        }


    }
}
