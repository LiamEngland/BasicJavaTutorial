class Plant {
    // Usually instance variables will be private - but if they're public they'll usually be constants.
    private String name;
    public static final String cons = "Test";

    public void getData() {
        String strData = "Final targets: " + calculateGrowth();
    }

    private int calculateGrowth() {
        return 15;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
        The overall consensus is that if possible make any methods/variables private,
        otherwise if any child classes need access, set them to protected.

        As well as this, it's best not to make any data public, with the exception
        of constants.

        What encapsulation achieves is that any implementation details can be hidden.
     */
}

public class Application {
    public static void main(String[] args) {

    }
}
