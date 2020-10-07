public enum Animal {
    // These are objects of the type animal.
    CAT("Steve"), DOG("Lightning"), MOUSE("Reginald");

    private String strName;

    public String getStrName() {
        return "This animal is called " + strName;
    }

    Animal(String strName) {
        this.strName = strName;
    }
}
