public class Robot {
    private int id;

    // Non-static classes are used when you need to group together some functionality, and need access to instance variables.
    // This class will now have access to instance data within the Robot Class.
    private class Brain {
        // These are used for grouping.
        public void think() {
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    /* Static inner classes are used to group classes together, and won't be associated with the instances
        of the enclosing outer class.
     */
    static class Battery {
        public void charge() {
            System.out.println("Battery Charging.");
        }
    }



    public Robot(int id) {
        this.id = id;
    }

    // Classes can also be declared within methods.
    public void start() {
        System.out.println("Starting Robot No " + id);
        Brain brain = new Brain();
        brain.think();
        final String strModel = "AE-12";

        // This will have access to id. This is only accessible within the scope of start.
        class Temp {
            public void doTask() {
                System.out.println("ID: " + id);
                System.out.println("Model: " + strModel);
            }
        }

        Temp temp = new Temp();
        temp.doTask();
    }
}
