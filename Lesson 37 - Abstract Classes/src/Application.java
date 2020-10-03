public class Application {
    public static void main(String[] args) {
        Camera camera1 = new Camera();
        camera1.setId(0);

        Car car1 = new Car();
        car1.setId(0);

        // Machine is abstract, so cannot be instantiated.
        // Machine machine1 = new Machine();
    }
}
