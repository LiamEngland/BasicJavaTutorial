public abstract class Machine {
    // Abstract classes can have abstract methods.

    // Extending an abstract class is a much stronger statement than simply implementing an interface.

    // A class can implement multiple interfaces, but can only have 1 parent class.

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Force all child classes to implements this method, without machine being able to use it.
    public abstract void start();
    public abstract void work();
    public abstract void stop();

    public void run() {
        start();
        work();
        stop();
    }
}
