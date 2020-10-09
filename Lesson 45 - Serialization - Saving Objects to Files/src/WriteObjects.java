import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing Objects");

        Person dave = new Person(0, "Dave");
        Person amy = new Person(1, "Amy");

        System.out.println(dave);
        System.out.println(amy);

        try (FileOutputStream fos = new FileOutputStream("people.bin")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(dave);
            oos.writeObject(amy);

            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Issue 1");
        } catch (IOException e) {
            System.out.println("Issue 2");
        }
    }
}
