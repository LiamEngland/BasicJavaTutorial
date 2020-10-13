public class Application {
    public static void main(String[] args) {
        Application application = new Application();

        int intValue = 10;

        System.out.println("1. Value: " + intValue);

        // This is passing by value, by passing the value of intValue into the method 'show'.
        application.show(intValue);

        System.out.println("4. Value: " + intValue);

        // --

        Person person = new Person("Jerry");
        System.out.println("\n1. " + person);
        application.show(person);
        System.out.println("4. " + person);
    }

    public void show(int intValue) {
        System.out.println("2. Value: " + intValue);

        intValue = 8;

        System.out.println("3. Value: " + intValue);
    }

    // Method overloading - having methods with the same name, but different parameters.
    public void show(Person person) {
        System.out.println("2. " + person);

        // As the person object is the object address, modifications to the object here will affect wherever it's being used, so will be set in the main method too.
        person.setStrName("Harold");

        person = new Person("Mike");
        System.out.println("3. " + person);
    }
}
