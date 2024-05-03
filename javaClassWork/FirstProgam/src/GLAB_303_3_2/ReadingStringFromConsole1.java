package GLAB_303_3_2;


import java.util.Scanner;

public class ReadingStringFromConsole1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();

        System.out.println("The line entered is " + s);
    }
}

