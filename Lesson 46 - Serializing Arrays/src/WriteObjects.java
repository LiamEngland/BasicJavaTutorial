import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing Objects");

        Person[] people = {
                new Person(0, "David"),
                new Person(1, "Sarah"),
                new Person(2, "James")
        };

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        try (FileOutputStream fos = new FileOutputStream("test.ser"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(people);
            oos.writeObject(peopleList);
            oos.writeInt(peopleList.size());

            for (Person person: people) {
                oos.writeObject(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Issue 1");
        } catch (IOException e) {
            System.out.println("Issue 2");
        }
    }
}
