import java.util.Objects;

class Person {
    private int id;
    private String strName;

    public Person(int id, String strName) {
        this.id = id;
        this.strName = strName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", strName='" + strName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                strName.equals(person.strName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, strName);
    }
}

public class Application {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Harold");
        Person person2 = new Person(2, "Harold");

        // Comparing 2 objects using '==', which will output true or false.
        System.out.println(person1 == person2); // This compares whether the two references are pointing at the same object.

        // Comparing with the equals method, inherited from the object super class.
        System.out.println(person1.equals(person2)); // The equals method has been overwritten in the Person class.

        // Doubles with the same value still point at different objects.
        Double value1 = 5.5;
        Double value2 = 5.5;

        // The result of this is the '==' operator will return false. The equals method will return true.
        System.out.println(value1 == value2);
        System.out.println(value1.equals(value2));

        // Java will set the references to point at the same object for Integers if they have the same value.
        Integer intValue1 = 10;
        Integer intValue2 = 10;

        // Because of this, the following statement will return true.
        System.out.println(intValue1 == intValue2);

        // In this case, Java will point the two references to the same object.
        String strText1 = "Hello";
        String strText2 = "Hello";

        // This will not always be the case for either strings or non-primitive values, so it's safest to use the equals method.
        System.out.println(strText1 == strText2);

        // Both values contain "Hello", but are different objects.
        String strText3 = "Hello";
        String strText4 = "Hello12345".substring(0,5);

        // This will return false, as the objects are not the same.
        System.out.println(strText3 == strText4);

        // This will return true, as the values are the same and being compared to each other.
        System.out.println(strText3.equals(strText4));

        // This will output the Object's unique hashcode.
        System.out.println(new Object());
    }
}