import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects.");

        try (FileInputStream fis = new FileInputStream("people.bin")) {
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person)ois.readObject();
            Person person2 = (Person)ois.readObject();

            ois.close();

            System.out.println(person1);
            System.out.println(person2);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Could not read file.");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find class.");
        }
    }
}
