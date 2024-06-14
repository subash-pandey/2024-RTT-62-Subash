package PA_303_4_1;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your marks: ");
        int marks = sc.nextInt();
        if(marks<0 || marks>100) {
            System.out.println("Invalid range of marks");
        } else if (marks<=100 && marks>=90) {
            System.out.println("Your grade is A");
        }  else if (marks<90 && marks>=80) {
            System.out.println("Your grade is B");
        } else if (marks<80 && marks>=70) {
            System.out.println("Your grade is C");
        }else if (marks<70 && marks>=60) {
            System.out.println("Your grade is D");
        }  else if (marks<60 ) {
            System.out.println("Your grade is F");
        }


    }
}

