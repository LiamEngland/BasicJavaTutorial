import java.io.*;

public class Application {
    public static void main(String[] args) {
        File file1 = new File("test2.txt");
        BufferedReader bufferedReader1 = null;
        try {
            FileReader fileReader1 = new FileReader(file1);
            bufferedReader1 = new BufferedReader(fileReader1);

            String strLine;

            while ((strLine = bufferedReader1.readLine()) != null) {
                System.out.println(strLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File '" + file1.toString() + "' not found.");
        } catch (IOException e) {
            System.out.println("Unable to read file '" + file1.toString() + "'.");
        } finally { // Finally is guaranteed to run. Regardless of any exceptions code within will execute.
            try {
                bufferedReader1.close();
            } catch (IOException e) {
                System.out.println("Unable close file '" + file1.toString() + "'.");
            } catch (NullPointerException e) {
                // Thrown because file was never opened. No need for error message.
            }
        }
    }
}
