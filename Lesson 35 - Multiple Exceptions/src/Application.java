import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {
    public static void main(String args[]) {
        Test test1 = new Test();

        // Although there's a single try block, there can be multiple catch blocks.
        /*try {
            test1.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse file.");
        }*/

        // This is a try multi catch, which will catch multiple exceptions.
        /*try {
            test1.run();
        } catch (IOException | ParseException e) {
            //Multiple exceptions can be handled here.
            e.printStackTrace();
        }*/

        try {
            test1.run();
        } catch (Exception e) { // Exception is a parent of all exceptions, so can catch any exception.

        }

        try {
            test1.input();
        } catch (FileNotFoundException e) { // This must come first as IOException would catch FileNotFoundException first. So the other way round the exception will never be reached.
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            test1.input();
        } catch (FileNotFoundException | IOException e) {
            // This block won't work as again, the first parameter is a child of the second.
        }
    }
}
