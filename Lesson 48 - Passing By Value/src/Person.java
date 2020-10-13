public class Person {
    private String strName;

    public Person(String strName) {
        this.strName = strName;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    @Override
    public String toString() {
        return "Person [name=" + strName + "]";
    }
}
