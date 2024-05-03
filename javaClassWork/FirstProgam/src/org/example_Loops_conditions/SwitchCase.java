package org.example_Loops_conditions;

public class SwitchCase {
    public static void main(String args[]) {
        String output;
        // grade is a value 0 - 100
        int grade = 90;
        output = switch (grade / 10) {
            case 10 -> "Wow!; ";
            case 9 -> "Excellent!";
            case 8 -> "Very Good!";
            case 7 -> "Good!";
            default -> "Keep trying!";
        };
        System.out.println(output);
    }

}
