import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
    public void run() throws IOException, ParseException { // Comma separated list of exceptions.
        //throw new IOException();

        throw new ParseException("Error in list.", 2);
    }

    public void input() throws IOException, FileNotFoundException {

    }
}
