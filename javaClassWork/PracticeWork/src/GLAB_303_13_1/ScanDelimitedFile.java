package GLAB_303_13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimitedFile {
    public static void main(String[] args) {
        File csvFile = new File("/Users/rojinabhurtel/Downloads/cars.csv");
        File output=new File("/Users/rojinabhurtel/Downloads/output.txt");

        try {
            FileWriter fw = new FileWriter(output);
            Scanner scanner = new Scanner(csvFile);
            String input = scanner.nextLine();
            ArrayList<String[]> lines = new ArrayList<String[]>();
            while (scanner.hasNextLine()) {
                input=scanner.nextLine();
                lines.add(input.split(","));
            }
            for(String[] line : lines) {
                System.out.println("Car Name :" + line[0] );
                fw.write("Car Name :" + line[0] + "\n");
                System.out.println("MPG :" + line[1] );
                fw.write("MPG :" + line[1] + "\n");
                System.out.println("Cylinder :" + line[2] );
                fw.write("Cylinder :" + line[2] + "\n");
                System.out.println("Displacement :" + line[3]);
                fw.write("Displacement :" + line[3] + "\n");
                System.out.println("Horsepower :" + line[4]);
                fw.write("Horsepower :" + line[4] + "\n");
                System.out.println("Weight :" + line[5]);
                fw.write("Weight :" + line[5] + "\n");
                System.out.println("Acceleration :" + line[6]);
                fw.write("Acceleration :" + line[6] + "\n");
                System.out.println("Model :" + line[7]);
                fw.write("Model :" + line[7] + "\n");
                System.out.println("Origin :" + line[8]);
                fw.write("Origin :" + line[8] + "\n");
                System.out.println("===============================");
                fw.write("+++++++__++++++++++ \n");
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
