class Machine {
    public void start() {
        System.out.println("Starting Machine.");
    }
}

interface Plant {
    public void grow();
}

public class Application {
    public static void main(String[] args) {
        // Anonymous classes are a way to extend an existing class, or implementing an interface.

        Machine machine1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Overridden Start.");
            }
        };

        machine1.start(); // The type of class this is executing from, is a child class of Machine, which is anonymous.

        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant Growing");
            }
        };

        plant1.grow();
    }
}