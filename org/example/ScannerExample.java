package org.example;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter a string to show on the screen");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(input);
    }
}
