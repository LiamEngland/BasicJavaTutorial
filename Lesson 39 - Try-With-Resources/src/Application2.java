import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        File file1 = new File("test.txt");

        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1))) {
            String strLine;

            while ((strLine = bufferedReader1.readLine()) != null) {
                System.out.println(strLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file '" + file1.toString() + "'.");
        } catch (IOException e) {
            System.out.println("Could not read file '" + file1.toString() + "'.");
        }
    }
}
