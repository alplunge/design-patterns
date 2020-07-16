package decorator.io;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream stream = new FileInputStream("test.txt");
            stream = new BufferedInputStream(stream);
            stream = new LowerCaseInputStream(stream);

            while ((c = stream.read()) > 0) {
                System.out.println((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
