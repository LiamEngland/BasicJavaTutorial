import java.io.*;
import java.util.ArrayList;

public class ReadObject {
    public static void main(String[] args) {
        System.out.println("Reading objects.");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.ser"))) {
            Person person = (Person)ois.readObject();
            System.out.println(person);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Could not read file.");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find class.");
        }
    }
}
