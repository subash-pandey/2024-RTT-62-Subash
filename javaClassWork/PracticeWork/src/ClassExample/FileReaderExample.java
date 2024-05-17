package ClassExample;

import java.io.*;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        File input = new File("output.txt");
        FileReader reader = new FileReader(input);
        Scanner sc = new Scanner(reader);
        String line = sc.nextLine();
        while(sc.hasNextLine()){
            System.out.println(line);
            line =sc.nextLine();

        }
    }
}
