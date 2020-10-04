import java.io.*;

public class Application {
    public static void main(String[] args) {
        File file1 = new File("test3.txt");

        // This only applies for text files.
        try (BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(file1))) {
            bufferedWriter1.write("This is line 1.\n"); // New line shorthand. Used universally.
            bufferedWriter1.write("This is line 2.");
            bufferedWriter1.newLine();
            bufferedWriter1.write("Last line.");
        } catch (IOException e) {
            System.out.println("Could not read file '" + file1.toString() + "'.");
        }
    }
}