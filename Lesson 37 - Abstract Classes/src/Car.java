public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Starting Car.");
    }

    @Override
    public void work() {
        System.out.println("Car Working.");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped.");
    }
}
