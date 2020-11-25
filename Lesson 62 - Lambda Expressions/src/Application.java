// This is known as a functional interface, which is an interface with a single function.
interface Executable {
    int execute(int a, int b);
}

interface StringExecutable {
    int execute(String a);
}

class Runner {
    public void run(Executable executable) {
        System.out.println("Executing code block.");
        int intValue = executable.execute(5, 190);
        System.out.println("Return value is " + intValue);
    }

    public void run(StringExecutable executable) {
        System.out.println("Executing code block.");
        int intValue = executable.execute("Big String");
        System.out.println("Return value is " + intValue);
    }
 }

public class Application {
    public static void main(String[] args) {

        int c = 10;
        // Can't alter value - should be final. c = 11.

        int d = 10;

        // Lambda expressions are a way of passing code to a method.

        // Old way using Java 6/7 method.
        Runner r1 = new Runner();
        r1.run(new Executable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello");
                return c + a + b + 2;
            }
        });

        System.out.println("=====");

        // Using lambda expressions.
        r1.run((int a, int b) -> {
            System.out.println("Hello");
            System.out.println("Again");
            System.out.println("More prints for lambda.");
            // int d = 11; Can't define new variables within same scope.
            return a + b + c;
        });

        System.out.println("=====");

        // Single return value - all that's needed is to provide a return value.
        r1.run((int a, int b) -> 10);

        System.out.println("=====");

        r1.run((int a, int b) -> 6);

        System.out.println("=====");

        Executable ex1 = (a, b) -> {
            System.out.println("Hello.");
            return a + b + c;
        };

        r1.run(ex1);

        Object codeBlock = (Executable)(a, b) -> {
            System.out.println("Hello.");
            return a + b + c;
        };
    }
}