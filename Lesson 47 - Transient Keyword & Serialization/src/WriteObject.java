import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObject {
    public static void main(String[] args) {
        System.out.println("Writing Objects");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.ser"))) {
            Person person = new Person(0, "Harry");
            Person.setIntCount(10);

            oos.writeObject(person);
        } catch (FileNotFoundException e) {
            System.out.println("Issue 1");
        } catch (IOException e) {
            System.out.println("Issue 2");
        }
    }
}
