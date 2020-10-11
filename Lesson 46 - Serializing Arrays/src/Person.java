import java.io.Serializable;

public class Person implements Serializable {
    private int intId;
    private String strName;

    public Person(int intId, String strName) {
        this.intId = intId;
        this.strName = strName;
    }

    @Override
    public String toString() {
        return "Person [id" + intId + ", name = " + strName +"]";
    }
}
