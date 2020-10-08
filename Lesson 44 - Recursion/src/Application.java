public class Application {
    public static void main(String[] main) {
        calculate(4);

        // Example - Factorial 4 - 4! = 4 * 3 * 2 * 1. Factorial will multiply by all numbers preceding it.
        System.out.println(factorial(6));
    }

    private static void calculate(int intValue) {
        System.out.println(intValue);

        if (intValue == 1) {
            return;
        }

        // Without the if, the function is called infinitely, causing a Stack Overflow.
        calculate(intValue -1);
    }

    private static int factorial(int intValue) {
        System.out.println(intValue);
        if (intValue == 1) {
            return 1;
        }

        return factorial(intValue - 1) * intValue;
    }
}
