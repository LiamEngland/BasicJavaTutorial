import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private int intId;
    private String strName;

    public Person(int intId, String strName) {
        this.intId = intId;
        this.strName = strName;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String toString() {
        return intId + ": " + strName;
    }
}

class StringLengthComparitor implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        }

        return 0;
    }
}

class AlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}

public class Application {
    public static void main(String[] args) {

        // Sorting Strings.

        List<String> strAnimals = new ArrayList<String>();

        strAnimals.add("Hippopotamus");
        strAnimals.add("Cat");
        strAnimals.add("Dog");
        strAnimals.add("Rabbit");
        strAnimals.add("Horse");

        // Sorts by String Length.
        //Collections.sort(strAnimals, new StringLengthComparitor());

        // Sorts alphabetically.
        //Collections.sort(strAnimals, new AlphabeticalComparator());

        // Sorts reverse alphabetically (z-a).
        Collections.sort(strAnimals, new ReverseAlphabeticalComparator());

        for (String animal: strAnimals) {
            System.out.println(animal);
        }

        // Sorting Numbers.

        List<Integer> intNumbers = new ArrayList<Integer>();

        intNumbers.add(10);
        intNumbers.add(5);
        intNumbers.add(461);
        intNumbers.add(89);

        Collections.sort(intNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                return -int1.compareTo(int2);
            }
        });

        // This is sorting in natural order.
        for (Integer number: intNumbers) {
            System.out.println(number);
        }

        // Sorting Arbitrary Objects

        List<Person> people = new ArrayList<Person>();

        people.add(new Person(0, "Roger"));
        people.add(new Person(2, "Alison"));
        people.add(new Person(6, "Mark"));
        people.add(new Person(3, "Denise"));

        // Sorting by ID.
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getIntId() > p2.getIntId()) {
                    return 1;
                } else if (p1.getIntId() < p1.getIntId()) {
                    return -1;
                }

                return 0;
            }
        });

        for (Person person: people) {
            System.out.println(person);
        }

        System.out.println("\n");

        // Sorting by name.
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getStrName().compareTo(p2.getStrName());
            }
        });

        for (Person person: people) {
            System.out.println(person);
        }
    }
}
