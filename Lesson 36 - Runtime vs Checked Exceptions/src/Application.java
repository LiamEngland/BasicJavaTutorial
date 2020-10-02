public class Application {
    public static void main(String args[]) {
        // Checked exceptions are ones forced to be handled before running.
        // Runtime exceptions are ones that only get thrown at runtime.

        String[] strTexts = {"one", "two", "three"};
        try {
            System.out.println(strTexts[3]); // Trying to call array item that doesn't exist.
        } catch (Exception e) {
            System.out.println("Exception");
        }

        String strText = null;
        System.out.println(strText.toLowerCase()); // Flags up a NullPointerException.

        int intValue = 7;
        intValue = intValue/0; // Arithmetic exception - division by zero.


    }
}
