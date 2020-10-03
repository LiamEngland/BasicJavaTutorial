public class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera Starting.");
    }

    @Override
    public void work() {
        System.out.println("Camera Working.");
    }

    @Override
    public void stop() {
        System.out.println("Camera Stopped.");
    }
}
