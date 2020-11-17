import java.util.*;

class Person implements Comparable <Person> {
    private String strName;

    public Person(String strName) {
        this.strName = strName;
    }

    @Override
    public String toString() {
        return strName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return strName.equals(person.strName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strName);
    }

    @Override
    public int compareTo(Person person) {
        int length1 = strName.length();
        int length2 = person.strName.length();

        if (length1 > length2) {
            return 1;
        } else if (length1 < length2) {
            return -1;
        } else {
            // Will return 0 if both names are equal. Which will remove a name from the treeset.
            return strName.compareTo(person.strName);
        }
    }
}

public class Application {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<Person>();
        Set<Person> set1 = new TreeSet<Person>();

        addElements(list1);
        addElements(set1);

        // Sorting in alphabetical order.
        Collections.sort(list1);
        showElements(list1);

        System.out.print("\n");
        showElements(set1);
    }

    private static void addElements(Collection<Person> collection) {
        collection.add(new Person("Edward"));
        collection.add(new Person("Nicholas"));
        collection.add(new Person("Andrea"));
        collection.add(new Person("Harriet"));
    }

    private static void showElements(Collection<Person> collection) {
        for (Person element: collection) {
            System.out.println(element);
        }
    }
}
