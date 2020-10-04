class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing.");
    }
}

public class Application {
    public static void main(String[] args) {
        try (Temp temp1 = new Temp()) {
            // The Try with resources feature here using an AutoClosable class means close will always be called.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
