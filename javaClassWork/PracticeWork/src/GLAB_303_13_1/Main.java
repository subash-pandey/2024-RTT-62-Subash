package GLAB_303_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File csvFile = new File("/Users/rojinabhurtel/Downloads/CourseData.csv");
        ArrayList<Course> courses = new ArrayList<>();
        Scanner scanner = new Scanner(csvFile);
        String input = scanner.nextLine();
        while (scanner.hasNextLine()) {
            input = scanner.nextLine();
            String[] data = input.split(",");
            Course course = new Course(data[0], data[1], data[2]);
            courses.add(course);
        }
        scanner.close();
        for (Course course : courses) {
            System.out.println(course);
        }


    }
}
