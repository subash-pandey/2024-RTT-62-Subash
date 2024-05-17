import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        File file = new File("/Users/rojinabhurtel/Desktop/PerScholas/coursework/file1.txt");
        File file1 = new File("/Users/rojinabhurtel/Desktop/PerScholas/coursework/javaClassWork/PracticeWork/src/test.txt");
        File f = new File("./test1.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        }

}
