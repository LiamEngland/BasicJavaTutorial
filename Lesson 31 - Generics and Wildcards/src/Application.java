import java.util.ArrayList;

class Machine {
    public String toString() {
        return "I am a machine";
    }

    public void start() {
        System.out.println("Machine Started.");
    }
}

class Camera extends Machine {
    public String toString() {
        return "I am a Camera";
    }

    @Override
    public void start() {
        System.out.println("Camera Started.");
    }

    public void snap() {
        System.out.println("Snap.");
    }
}

public class Application {
    public static void main(String[] args) {
        ArrayList<Machine> list1 = new ArrayList<Machine>();

        list1.add(new Machine());
        list1.add(new Machine());

        showlist(list1);

        ArrayList<Camera> list2 = new ArrayList<Camera>();

        list2.add(new Camera());
        list2.add(new Camera());

        showlist(list2);

        showlist2(list1);
    }

    // The '?' wildcard allows an ArrayList with any type of parameter to be used in showList.
    // With this, the list must be treated as an Object, as that's the parent of all classes.
    public static void showlist(ArrayList<? extends  Machine> list) {
        for (Machine value: list) {
            System.out.println(value);
            value.start();

            // snap won't execute, as snap isn't a method in Machine.
            // value.snap();
        }
    }

    // The super keyword allows the setting of a class, or any superclasses - this case Camera & Machine.
    public static void showlist2(ArrayList<? super Camera> list) {
        for (Object value: list) {
            System.out.println(value);


            // snap won't execute, as snap isn't a method in Machine.
            // value.snap();
        }
    }

    public static void showlist3(ArrayList<?> list) {
        for (Object value: list) {
            System.out.println(value);
        }
    }
}