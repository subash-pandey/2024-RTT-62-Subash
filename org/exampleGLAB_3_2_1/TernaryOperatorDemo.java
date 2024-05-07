package org.exampleGLAB_3_2_1;

import java.util.Scanner;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check if you are allowed to vote");
        int age = sc.nextInt();
        String result = age>=18?"Allowed to vote":"Not allowed to vote";
        System.out.println(result);
    }
}
