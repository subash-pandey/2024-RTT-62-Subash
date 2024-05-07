package org.example_Loops_conditions;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {


        System.out.print("Enter the number: ");
        int x= 9;
        if (x<10) {
            System.out.println("x is less than 10");
        } else if (x<20) {
            System.out.println("x is greater than 20");
        } else if (x<30) {
           System.out.println("x is less than 30");
        } else {
            System.out.println("x is greater than 30");
        }

    }
}
