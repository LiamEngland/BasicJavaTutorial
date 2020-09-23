import java.util.concurrent.CancellationException;

class Machine {
    public void start() {
        System.out.println("Machine Started.");
    }
}

class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera Started.");
    }

    public void capture() {
        System.out.println("Photo Taken");
    }
}

public class Application {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.capture();

        // Up-casting

        // This example shows that the camera reference has been upcasted to the machine variable - it's called upcasting as the casting has gone up the class hierarchy.
        Machine machine2 = new Camera();
        machine2 = camera1;

        // Calling the start method will call Camera's start, as machine2 references the Camera class assigned to camera1.
        machine2.start();

        /* This won't work, as the variable is what decides on which methods can be called.
            Because machine2 has the Machine class assigned to it, capture() can't be called due
            to Machine not having a capture method.
         */
        // machine2.capture();


        // Down-casting

        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;

        camera2.start();
        camera2.capture();

        /* This cannot be done, as the actual object is a Machine, which cannot be a Camera, so when
            camera3 (which has been casted to a Machine) calls Camera methods, this will cause an issue
            due to Machine not having Camera methods like capture.
         */
        Machine machine4 = new Machine();
        Camera camera3 = (Camera)machine4;

        camera3.start();

        // Up-casting is guaranteed to be safe due to polymorphism and don't need a cast.
        // Down-casting in unsafe as you need to ensure the variable down-casting does refer to an object that's being referred to.
        // As well as this, you can't downcast to unrelated types.
    }
}
