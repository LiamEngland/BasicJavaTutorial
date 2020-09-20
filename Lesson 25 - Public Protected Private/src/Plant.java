public class Plant {

    // This is bad practice.
    public String strName;

    // This is acceptable practice, it's final.
    public final static int intId = 8;

    // Private opposite to public (can access anywhere), can only be accessed within class.
    private String strType;

    // Protected will allow access from sub-classes as well as the parent class.
    protected String strSize;

    // No access modifier, this has package level visibility.
    int intHeight;

    public Plant() {
        this.strName = "Rose";

        // This can only be accessed within the scope of the class.
        this.strType = "Plant";

        // This can be accessed within the scope of this class, as well as sub-arrays and within the same package.
        this.strSize = "Large";

        this.intHeight = 9;
    }
}