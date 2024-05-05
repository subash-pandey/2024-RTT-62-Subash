package PA_303_5_1;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = sc.nextInt();
        int greatestCommonDivisor = 0;
        if (firstNum == secondNum) {
            greatestCommonDivisor = firstNum;
        } else if (firstNum < secondNum) {
            for (int i = 1; i <= firstNum; i++) {
                if (firstNum % i == 0 && secondNum % i == 0) {
                    greatestCommonDivisor = i;
                }

            }

        } else {
            for (int i = 1; i <= secondNum; i++) {
                if (firstNum % i == 0 && secondNum % i == 0) {
                    greatestCommonDivisor = i;
                }
            }
        }
        System.out.printf( "The greatest common divisor for %d and %d is %d.%n", firstNum, secondNum, greatestCommonDivisor );

    }
}
