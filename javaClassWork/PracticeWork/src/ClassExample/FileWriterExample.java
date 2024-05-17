package ClassExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args)  {
        File outputFile = new File("output.txt");

        try {
            FileWriter fileWriter = new FileWriter(outputFile,false);
            for(int counter = 0; counter < 15; counter++) {
                fileWriter.write("This is a first sentence to a file ("+(counter+1)+")"+"\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
           e.printStackTrace();
        }
        finally {

        }

    }
}
