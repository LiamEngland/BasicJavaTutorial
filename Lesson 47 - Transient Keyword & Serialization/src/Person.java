import java.io.Serializable;

public class Person implements Serializable {
    // The transient keyword will prevent the variable from being serialized.
    private transient int intId;
    private String strName;

    private static int intCount;

    public Person() {
        System.out.println("Default Constructor");
    }

    public Person(int intId, String strName) {
        System.out.println("Two-Parameter Constructor");
        this.intId = intId;
        this.strName = strName;
    }

    @Override
    public String toString() {
        return "Person [id" + intId + ", name = " + strName + ", count = " + intCount + "]";
    }

    public static int getIntCount() {
        return intCount;
    }

    public static void setIntCount(int intCount) {
        Person.intCount = intCount;
    }
}