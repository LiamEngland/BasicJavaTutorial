import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {
    public static void main(String args[]) throws FileNotFoundException {
        // An exception is part of an error handling mechanism.

        File file1 = new File("test.txt");
        FileReader reader1 = new FileReader(file1);
    }
}
