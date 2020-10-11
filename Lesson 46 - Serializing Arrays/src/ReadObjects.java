import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects.");

        try (FileInputStream fis = new FileInputStream("test.ser"); ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person[] people = (Person[])ois.readObject();

            ArrayList<Person> peopleList = (ArrayList<Person>)ois.readObject();

            for (Person person: people) {
                System.out.println(person);
            }

            for (Person person: peopleList) {
                System.out.println(person);
            }

            int intNum = ois.readInt();

            for (int i = 0; i < intNum; i++) {
                Person person = (Person)ois.readObject();
                System.out.println(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Could not read file.");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find class.");
        }
    }
}
