import java.util.*;

class Person {
    private int intId;
    private String strName;

    public Person(int intId, String strName) {
        this.intId = intId;
        this.strName = strName;
    }

    public String toString() {
        return intId + ": " + strName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return intId == person.intId &&
                strName.equals(person.strName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intId, strName);
    }
}

public class Application {
    public static void main(String[] args) {

        Person person1 = new Person(0, "Daniel");
        Person person2 = new Person(1, "Henry");
        Person person3 = new Person(2, "Lucy");
        Person person4 = new Person(1, "Henry");

        // Map keys are unique.
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("one", 1);

        for (String key: map.keySet()) {
            System.out.println("ID: " +key + " - Name:" + map.get(key));
        }

        Set<String> set = new LinkedHashSet<String>();

        // Only one 'hamster' will exist.
        set.add("hamster");
        set.add("dog");
        set.add("cat");
        set.add("hamster");

        System.out.println(set + "\n");

        Map<Person, Integer> map1 = new LinkedHashMap<Person, Integer>();

        map1.put(person1, 0);
        map1.put(person2, 1);
        map1.put(person3, 2);
        map1.put(person4, 3);

        for (Person key: map1.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        Set<Person> set1 = new LinkedHashSet<Person>();

        set1.add(person1);
        set1.add(person2);
        set1.add(person3);
        set1.add(person4);
    }
}