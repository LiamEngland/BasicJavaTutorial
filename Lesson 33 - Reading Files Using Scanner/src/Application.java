import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        //String strFileName = "C:/Users/liam/Documents/todo.txt";

        String strFileName = "text.txt";
        File fileText = new File(strFileName);
        Scanner in = new Scanner(fileText);

        int intValue = in.nextInt();
        int intCount = 2;
        System.out.println("Read value: " + intValue);
        in.nextLine();

        while (in.hasNextLine()) {
            String line = in.nextLine();

            System.out.println(intCount + ": " + line);
            intCount++;
        }

        in.close(); // Closes underlying file in system.
    }
}